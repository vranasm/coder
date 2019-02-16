/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cz.vrany.coder.Entities;

import java.util.HashMap;

/**
 * Trida implementuje koder zalozeny na abecede. Pro zpetne dekodovani
 * predpoklada pouziti oddelovace, ktery neni soucasti abecedy. Vychozi
 * implementace pracuje s " " a "/". Napred zjisti, zda retezec obsahuje znak "
 * " a v pripade, ze ano tak pouzije split podle znaku mezera, jinak se pokusi o
 * split podle alternativni metody
 *
 * @author michal
 */
public class AlphabetCoder implements Coder {

    private final String name;
    private final String desc;
    HashMap<String, String> direct;
    HashMap<String, String> reverse;
    HashMap<String, String> advice;

    public AlphabetCoder(String name, String desc, String[][] codePage) {
        this.name = name;
        this.desc = desc;
        direct = new HashMap<>();
        reverse = new HashMap<>();
        advice = new HashMap<>();
        if (codePage != null) {
            for (String[] alpha : codePage) {
                direct.put(alpha[0], alpha[1]);
                reverse.put(alpha[1], alpha[0]);
                advice.put(alpha[0], alpha[2]);
            }
        }
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getDesc() {
        return desc;
    }

    @Override
    public String encode(String input) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (sb.length() > 0) {
                sb.append(" ");
            }
            String repl = direct.get(Character.toString(c).toUpperCase());
            if (repl != null) {
                sb.append(repl);
            } else {
                sb.append("???");
            }
        }
        return sb.toString();
    }

    @Override
    public String decode(String input) {
        StringBuilder sb = new StringBuilder();
        String[] split;
        if (input.contains(" ")) {
            split = input.split(" ");
        } else {
            split = input.split("/");
        }
        for (String pattern : split) {
            String original = reverse.get(pattern);
            if (original != null) {
                sb.append(original);
            } else {
                sb.append("???");
            }
        }
        return sb.toString();
    }

    @Override
    public HashMap<String, String> getDirectCodePage() {
        return direct;
    }

    @Override
    public HashMap<String, String> getReverseCodePage() {
        return reverse;
    }

    @Override
    public HashMap<String, String> getDirectAdviceCodePage() {
        return advice;
    }

}
