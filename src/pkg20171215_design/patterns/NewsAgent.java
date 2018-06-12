/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg20171215_design.patterns;

import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;

/**
 *
 * @author George
 */
public class NewsAgent extends Observable {

    private ArrayList<String> news;

    public ArrayList<String> getNews() {
        return news;
    }

    public NewsAgent() {
        news = new ArrayList<String>();
    }

    public void newEntry(String a) {
        news.add(a);
        setChanged();
        notifyObservers(a);
    }

    public void updateEntry(String a, int b) {
        news.set(b, a);
        String[] A = new String[10];
        A[0] = a;
        setChanged();

        notifyObservers(A);
    }

//    public void notifyObservers(Observable observable, String a) {
//        //System.out.println("News Updated");
//        Iterable<Observer> observers;
//        for (Observer ob : observers) {
//            ob.update(observable, a);
//        }
//    }
}
