import java.util.Scanner;

public class BuildASub {

        public static void main(String[] args) throws Exception {
            String bread = chooseBread();
            String meat = chooseMeat();
            String sauce = chooseSauce();

            System.out.println("Your chosen bread is: " + bread);
            System.out.println("Your chosen meat is: " + meat);
            System.out.println("Your chosen sauce is:" + sauce);
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
        }
        else if (sauceOption.equalsIgnoreCase("none")){
                sauceType = "no sauce required";
        }
        else {
            System.out.print("ERROR: please try again \n");
                    chooseSauce();
        }
        return sauceType;

        }
    }

