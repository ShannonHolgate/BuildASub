import java.util.Scanner;

public class BuildASub {

    public static void main(String[] args) throws Exception {
        String bread = chooseBread();
        String meat = chooseMeat();
        String cheese = chooseCheese();
        Boolean isToastRequired = doYouWantToasted();

        System.out.println("Your chosen bread is: " + bread);
        System.out.println("Your chosen meat is: " + meat);
        if(isToastRequired){
            System.out.println("Your sub will be toasted");
        }else{
            System.out.println("Cold bread for you");
        }
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

    public static String chooseCheese(){
        String selectedCheese = "";
        System.out.println("What cheese do you want: \n 1. Regular \n 2. Peppered \n 3. No Cheese");
        Scanner scan = new Scanner(System.in);
        int cheeseOption = scan.nextInt();
        switch (cheeseOption){
            case 1:
                selectedCheese = "Regular";
                break;
            case 2:
                selectedCheese = "Peppered";
                break;
            default:
                selectedCheese ="No Cheese";
                break;
        }
        return selectedCheese;
    }



    public static Boolean doYouWantToasted(){
        Boolean toast = false;
        System.out.println("Would you like your sub toasted? Y/N : ");
        Scanner scan = new Scanner(System.in);
        String enteredOption = scan.nextLine();

        if(enteredOption.toUpperCase().equals("Y")){
            toast=true;
        }

        return toast;
    }
}
