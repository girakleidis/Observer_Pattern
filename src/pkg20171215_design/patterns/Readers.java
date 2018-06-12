/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg20171215_design.patterns;

import java.lang.reflect.Array;
import java.util.Observable;
import java.util.Observer;

/**
 *
 * @author George
 */
public class Readers implements Observer {

    public void update(Observable arg0, Object arg1) {
        if (arg1.getClass().toString().equals("class java.lang.String")) {
            System.out.println("New news " + arg1);
        } else {
            System.out.println("Updated news " + ((Object[]) arg1)[0]);
        }
    }
}
