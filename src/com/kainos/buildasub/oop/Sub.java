package com.kainos.buildasub.oop;

import java.util.ArrayList;

/**
 * Created by trainee on 17/10/16.
 */
public class Sub {
    private String meat;
    private String bread;
    private ArrayList <String> salad;
    private String cheese;
    private boolean isToasted;
    private String sauce;

    public Sub(String meat, String bread, ArrayList <String> salad, String cheese, boolean isToasted, String sauce){
        this.meat = meat;
        this.bread = bread;
        this.salad = salad;
        this.cheese = cheese;
        this.isToasted = isToasted;
        this.sauce = sauce;
    }//end constructor

}//end class Sub
