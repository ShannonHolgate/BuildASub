package com.kainos.buildasub.oop;

import java.util.List;

public class Sandwich {

    private String Bread = "";
    private String Meat = "";
    private List<String> Cheese;
    private Boolean Toasted = false;
    private List<String> Lettuce;

    public Sandwich() {
        System.out.println("com.kainos.buildasub.oop.Sandwich created");
    }

    @Override
    public String toString() {
        return  "Bread: " + Bread + '\n' +
                "Meat: " + Meat + '\n' +
                "Cheese: " + Cheese.toString() + '\n' +
                "Toasted: " + Toasted + '\n' +
                "Lettuce: " + Lettuce.toString();
    }

    public String getBread() {
        return Bread;
    }

    public String getMeat() {
        return Meat;
    }

    public List<String> getCheese() {
        return Cheese;
    }

    public Boolean getToasted() {
        return Toasted;
    }

    public List<String> getLettuce(){
        return Lettuce;
    }

    public void setBread(String bread) {
        Bread = bread;
    }

    public void setMeat(String meat) {
        Meat = meat;
    }

    public void setCheese(List<String> cheese) {
        Cheese = cheese;
    }

    public void setToasted(Boolean toasted) {
        Toasted = toasted;
    }

    public void setLettuce(List<String> Lettuce){
        this.Lettuce = Lettuce;
    }
}
