import java.util.Scanner;

public class BuildASub {



    public static void main(String[] args) throws Exception {
        String bread = chooseBread();
        String meat = chooseMeat();
        String cheese = chooseCheese();
        Boolean isToastRequired = doYouWantToasted();
        String sauce = chooseSauce();
        //initalising the string which will hold the salad order.
        String saladChoice = "";
        Boolean isSaladAdded = addSalad();


        //Calling addSalad method to check if they user would like salad or not.

        if (isSaladAdded) {
            //if yes, call the saladChoice method to build the customer's salad order.
            saladChoice = saladChoice();

        }//end if

        reciptPrint(bread, meat, cheese, isToastRequired, saladChoice, isSaladAdded, sauce);


        Sub mySub = new Sub(chooseMeat(), chooseBread(), saladChoice(), chooseCheese(), isToastRequired(), chooseSauce());

    }


    public static void reciptPrint(String pBread, String pMeat, String pCheese, boolean isItToasted, String pSaladChoice, boolean pAddSalad, String pSauce) {

        if (isItToasted) {
            System.out.println("Your sub will be toasted");
        } else {
            System.out.println("Cold bread for you");
        }
        if (pAddSalad) {
            System.out.println("Salad choice: " + pSaladChoice);
        }
        System.out.println("Your chosen bread is: " + pBread);
        System.out.println("Your chosen meat is: " + pMeat);
        System.out.println("Your chosen cheese is: " + pCheese);
        System.out.println("Your chosen sauce is " + pSauce);


    }


    public static String chooseBread() {
        String breadType;

        System.out.println("Choose a bread:\n" +
                "\t1. Flour\n" +
                "\t2. Wholemeal");
        Scanner scan = new Scanner(System.in);
        int breadOption = scan.nextInt();


        switch (breadOption) {
            case 1:
                breadType = "Flour";
                break;
            case 2:
                breadType = "Wholemeal";
                break;
            default:
                breadType = "Flour";
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
            case 1:
                meatType = "Ham";
                break;
            case 2:
                meatType = "Bacon";
                break;
            case 3:
                meatType = "Goat";
        }

        if (!meatType.isEmpty()) {
            return meatType;
        } else {
            throw new Exception("Meat not set!");
        }
    }

    public static String chooseSauce() {
        String sauceType = "";
        System.out.print("Would you like any sauce on your sub?");

        Scanner scan = new Scanner(System.in);
        String sauceOption = scan.nextLine();

        if (sauceOption.equalsIgnoreCase("yes")) {
            System.out.print("please type 1) for tomato \n 2) for mayo or \n 3) for sweet chilli");
            sauceType = scan.nextLine();
            switch (sauceType) {
                case "1":
                    sauceType = "Tomato";
                    break;
                case "2":
                    sauceType = "mayo";
                    break;
                case "3":
                    sauceType = "sweet chilli";

            }
        } else if (sauceOption.equalsIgnoreCase("none")) {
            sauceType = "no sauce required";
        } else {
            System.out.print("ERROR: please try again \n");
            chooseSauce();
        }
        return sauceType;

    }

    public static String chooseCheese() {
        String selectedCheese = "";
        System.out.println("What cheese do you want: \n 1. Regular \n 2. Peppered \n 3. No Cheese");
        Scanner scan = new Scanner(System.in);
        int cheeseOption = scan.nextInt();
        switch (cheeseOption) {
            case 1:
                selectedCheese = "Regular";
                break;
            case 2:
                selectedCheese = "Peppered";
                break;
            default:
                selectedCheese = "No Cheese";
                break;
        }
        return selectedCheese;
    }


    public static Boolean doYouWantToasted() {
        Boolean toast = false;
        System.out.println("Would you like your sub toasted? Y/N : ");
        Scanner scan = new Scanner(System.in);
        String enteredOption = scan.nextLine();

        if (enteredOption.toUpperCase().equals("Y")) {
            toast = true;
        }

        return toast;
    }

    public static Boolean addSalad() {
        //Boolean defaulted to false, so the default is that no salad is required
        Boolean wouldLikeSalad = false;

        //new scanner for user input
        Scanner scan = new Scanner(System.in);
        //prompting customer for selecting if they would or not like a salad
        System.out.println("Do you want salad?:\n" +
                "\t1. Y\n" +
                "\t2. N\n");

        //reading in customers choice
        String saladChoice = scan.nextLine();

        //checking if the customer has chosen they want salad
        if (saladChoice.equalsIgnoreCase("Y")) {
            //if yes update the boolean to true
            wouldLikeSalad = true;
        }//end if

        //returning the customer's choice of wanting salad or not
        return wouldLikeSalad;

    }//end method addSalad()

    public static String saladChoice() {
        //Array holding salad options
        String[] saladOptions = {"Lettuce", "Tomato", "Peppers"};
        //Array holding customers choice
        String[] saladChoice = new String[saladOptions.length];
        //String to hold final order
        String finalChoice = "";
        //Scanner for user input
        Scanner scan = new Scanner(System.in);
        //counter to keep choice array correct
        int saladCounter = 0;


        //for loop to loop through options and check if customer wants each part
        for (int index = 0; index < saladOptions.length; index++) {
            System.out.println("Would you like " + saladOptions[index]);
            System.out.println("1. Y" + "\n2. N");
            String userChoice = scan.nextLine();

            //if they want the item, add it to their choice
            if (userChoice.equalsIgnoreCase("Y")) {
                saladChoice[saladCounter] = saladOptions[index];
                //increment saladCounter
                saladCounter++;
            }//end if
        }//end for

        //for loop putting choice into a single string
        for (int index = 0; index < saladChoice.length; index++) {
            //if it's not null they will add the choice to string
            if (saladChoice[index] != null) {
                finalChoice += saladChoice[index] + " ,";
            }//end if
        }//end for

        //returning the final salad order
        return finalChoice;
    }//end method saladChoice()
}//end class
