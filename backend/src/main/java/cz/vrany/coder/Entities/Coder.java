/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cz.vrany.coder.Entities;

import java.util.HashMap;

/**
 * Univerzalni rozhrani poskytjici pristupove metody pro koder
 *
 * @author michal
 */
public interface Coder {

    /**
     * metoda vraci jmeno koderu
     *
     * @return
     */
    public String getName();

    /**
     * Metoda vraci popis koderu
     *
     * @return
     */
    public String getDesc();

    /**
     * Metoda provede zakodovani pozadovaneho retezce kodovaci tabulkou/koderem
     *
     * @param input
     * @return
     */
    public String encode(String input);

    /**
     * Metoda provede odkodovani pozadovaneho retezce kodovaci tabulkou/koderem
     *
     * @param input
     * @return
     */
    public String decode(String input);

    /**
     * Metoda vraci kodovaci tabulku abecedy (prevody z abecedy do noveho
     * kodovani)
     *
     * @return
     */
    public HashMap<String, String> getDirectCodePage();

    /**
     * Metoda vraci kodovaci tabulku prevodu z kodovani do puvodni abecedy
     *
     * @return
     */
    public HashMap<String, String> getReverseCodePage();

    /**
     * Metoda vraci tabulku napoved kodovani abecedy
     *
     * @return
     */
    public HashMap<String, String> getDirectAdviceCodePage();

}
