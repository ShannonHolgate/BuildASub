import java.util.Scanner;

public class BuildASub {

    public static void main(String[] args) throws Exception {
        String bread = chooseBread();
        String meat = chooseMeat();
        Boolean salad = addSalad ();

        String saladChoice = "";

        if(salad == true)
        {
            saladChoice = saladChoice();
        }//end if

        System.out.println("Your chosen bread is: " + bread);
        System.out.println("Your chosen meat is: " + meat);
        System.out.println("Your salad choices are: "  + saladChoice);
    }


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

    public static Boolean addSalad (){
        Boolean subSalad = false;

        Scanner scan = new Scanner(System.in);
        System.out.println("Do you want salad?:\n" +
        "\t1. Yes\n" +
        "\t2. No\n");
        int saladChoice = scan.nextInt();
        if(saladChoice == 1){
            subSalad = true;
        }
        return subSalad;

    }

    public static String saladChoice(){
        //Array holding salad options
        String[] saladOptions = {"Lettuce", "Tomato", "Peppers"};
        //Array holding customers choice
        String[] saladChoice = new String[saladOptions.length];
        //String to hold final order
        String finalChoice = "";
        //Scanner for user input
        Scanner scan = new Scanner(System.in);
        //counter to keep choice array correct
        int saladCounter =0;

        //for loop to loop through options and check if customer wants each part
        for(int index =0; index < saladOptions.length; index++)
        {
            System.out.println("Would you like " + saladOptions[index]);
            System.out.println("1. Yes" + "\n2. No");
            int userChoice = scan.nextInt();

            //if they want the item, add it to their choice
            if(userChoice == 1)
            {
                saladChoice[saladCounter] =  saladOptions[index];
                //increment saladCounter
                saladCounter++;
            }//end if
        }//end for

        //for loop putting choice into a single string
        for(int index = 0; index < saladChoice.length; index++)
        {
            //if it's not null they will add the choice to string
            if(saladChoice[index] != null)
            {
                finalChoice += saladChoice[index] + " ,";
            }//end if
        }//end for

        return finalChoice;
    }//end method saladChoice()
}
