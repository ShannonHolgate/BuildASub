package com.kainos.buildasub.oop;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BuildASub {

    public static String chooseBread() {
        String breadType;

        System.out.println("Choose a bread:\n" +
                "\t1. Flour\n" +
                "\t2. Wholemeal");
        Scanner scan = new Scanner(System.in);
        int breadOption = scan.nextInt();



        switch (breadOption) {
            case 1: breadType = "Flour";
                break;
            case 2: breadType = "Wholemeal";
                break;
            default: breadType = "Flour";
        }

        return breadType;
    }

    public static String chooseMeat() throws Exception {
        String meatType = "";

        System.out.println("Choose a meat:\n" +
                "\t1. Ham\n" +
                "\t2. Bacon\n" +
                "\t3. Goat");
        Scanner scan = new Scanner(System.in);
        int meatOption = scan.nextInt();



        switch (meatOption) {
            case 1: meatType = "Ham";
                break;
            case 2: meatType = "Bacon";
                break;
            case 3: meatType = "Goat";
        }

        if (!meatType.isEmpty()) {
            return meatType;
        }
        else {
            throw new Exception("Meat not set!");
        }
    }

    public static List<String> ChooseCheese(){
        List<String> SelectedCheese = new ArrayList<String>();
        Boolean ContinueEnteringCheese = true;

            System.out.println("Do you want cheese (Y/N)?");
            Scanner scan = new Scanner(System.in);
            String enteredOption = scan.nextLine();
            if(enteredOption.toUpperCase().equals("Y")){
                while(ContinueEnteringCheese){
                    System.out.println("What cheese do you want: \n 1. Regular \n 2. Peppered \n 3. Exit Cheese Selection");
                    Scanner CheeseScan = new Scanner(System.in);
                    String cheeseOption = CheeseScan.nextLine();
                    switch (cheeseOption){
                        case "1":
                            SelectedCheese.add("Regular");
                            break;
                        case "2":
                            SelectedCheese.add("Peppered");
                            break;
                        default:
                            SelectedCheese.add("No Cheese");
                            ContinueEnteringCheese = false;
                            break;
                    }
                }
            }else{
                return SelectedCheese;
            }


        return SelectedCheese;
    }

    public static List<String> ChooseSalads(){
        List<String> SelectedSalads = new ArrayList<String>();
        Boolean ContinueEnteringSalad = true;

        System.out.println("Do you want Salad (Y/N)?");
        Scanner scan = new Scanner(System.in);
        String enteredOption = scan.nextLine();
        if(enteredOption.toUpperCase().equals("Y")){
            while(ContinueEnteringSalad){
                System.out.println("What salad do you want: \n 1. Lettuce \n 2. Tomato \n 3. Peppers \n 4. Exit Salad Selection");
                Scanner CheeseScan = new Scanner(System.in);
                String cheeseOption = CheeseScan.nextLine();
                switch (cheeseOption){
                    case "1":
                        SelectedSalads.add("Lettuce");
                        break;
                    case "2":
                        SelectedSalads.add("Tomato");
                        break;
                    case "3":
                        SelectedSalads.add("Peppers");
                        break;
                    default:
                        SelectedSalads.add("No Salad");
                        ContinueEnteringSalad = false;
                        break;
                }
            }
        }else{
            return SelectedSalads;
        }


        return SelectedSalads;
    }

    public static Boolean doYouWantToasted(){
        Boolean toast = false;
        System.out.println("Would you like your sub toasted? Y/N : ");
        Scanner scan = new Scanner(System.in);
        String enteredOption = scan.nextLine();

        if(enteredOption.toUpperCase().equals("Y")){
            toast = true;
        }

        return toast;
    }

    //OOP
    public static void main(String[] args) throws Exception {
        Sandwich sandwich = new Sandwich();
        sandwich.setCheese(ChooseCheese());
        sandwich.setLettuce(ChooseSalads());
        sandwich.setBread(chooseBread());
        sandwich.setMeat(chooseMeat());
        sandwich.setToasted(doYouWantToasted());
        System.out.println(sandwich.toString());
    }

}