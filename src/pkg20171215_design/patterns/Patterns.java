/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg20171215_design.patterns;

import java.util.Observer;

/**
 *
 * @author George
 */
public class Patterns {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        NewsAgent na = new NewsAgent();

        Readers RSS = new Readers();
        Readers BBC = new Readers();

        na.addObserver(BBC);
        na.addObserver(RSS);

        na.newEntry("NEWS TITLE");
        na.updateEntry("NEWS TITLE 2", 0);
        na.updateEntry("NEWS TITLE 3", 0);
        na.updateEntry("NEWS TITLE 4", 0);
    }
}
