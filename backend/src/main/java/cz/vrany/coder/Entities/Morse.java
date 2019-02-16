/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cz.vrany.coder.Entities;

/**
 *
 * @author michal
 */
public class Morse {
    //Znak	Kód	Ukázka a pomůcka	
    public static final String[][] codePage = new String[][]{
        new String[]{"A", ".-", "akát"},
        new String[]{"B", "-...", "blýskavice"},
        new String[]{"C", "-.-.", "cílovníci"},
        new String[]{"D", "-..", "dálava, dálnice"},
        new String[]{"E", ".", "erb"},
        new String[]{"F", "..-.", "Filipíny, filiálka"},
        new String[]{"G", "--.", "Grónská zem, gnómóny"},
        new String[]{"H", "....", "hrachovina, holubice"},
        new String[]{"CH", "----", "chléb nám dává, chvátá k nám sám"},
        new String[]{"I", "..", "ibis, Ivan"},
        new String[]{"J", ".---", "jasmín bílý, junácká hůl"},
        new String[]{"K", "-.-", "krákorá, království"},
        new String[]{"L", ".-..", "lupíneček, lední hokej, liščí doupě"},
        new String[]{"M", "--", "mává, mlází"},
        new String[]{"N", "-.", "národ, nástup"},
        new String[]{"O", "---", "ó náš pán, ó náš háj"},
        new String[]{"P", ".--.", "papírníci"},
        new String[]{"Q", "--.-", "kvílí orkán"},
        new String[]{"R", ".-.", "rarášek"},
        new String[]{"S", "...", "sekera, sobota, světluška, severka"},
        new String[]{"T", "-", "tón, trám, trůn, tůň"},
        new String[]{"U", "..-", "učený, uličník"},
        new String[]{"V", "...-", "vyučený, vyvolený"},
        new String[]{"W", ".--", "wagón klád, Waltrův vůz"},
        new String[]{"X", "-..-", "Xénokratés, Xénie má"},
        new String[]{"Y", "-.--", "ý se ztrácí, ý se krátí, Ýgar mává"},
        new String[]{"Z", "--..", "známá žena, zpíváme jen, zrádná žena"},
        new String[]{"1", ".----", ""},
        new String[]{"2", "..---", ""},
        new String[]{"3", "...--", ""},
        new String[]{"4", "....-", ""},
        new String[]{"5", ".....", ""},
        new String[]{"6", "-....", ""},
        new String[]{"7", "--...", ""},
        new String[]{"8", "---..", ""},
        new String[]{"9", "----.", ""},
        new String[]{"0", "-----", ""},
        new String[]{"?", "..--..", "otazník"},
        new String[]{",", "--..--", "čárka"},
        new String[]{"!", "--...-", "vykřičník"},
        new String[]{".", ".-.-.-", "tečka"},
        new String[]{";", "-.-.-.", "středník"},
        new String[]{"/", "-..-.", "lomítko"},
        new String[]{"=", "-...-", "rovnítko"},
        new String[]{"-", "-....-", "pomlčka"},
        new String[]{"'", ".----.", "apostrof odsuvník, tabulátor[zdroj?]"},
        new String[]{"(", "-.--.", "závorka (otevírací)"},
        new String[]{")", "-.--.-", "závorka (uzavírací)"},
        new String[]{"\"", ".-..-.", "uvozovka"},
        new String[]{":", "---...", "dvojtečka"},
        new String[]{"_", "..--.-", "podtržítko"},
        new String[]{"+", ".-.-.", "plus (kříž)"},
        new String[]{"@", ".--.-.", "zavináč (posíláme e-mail)"}};
}
