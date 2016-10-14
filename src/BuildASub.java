import java.util.Scanner;

public class BuildASub {

    public static void main(String[] args) throws Exception {
        String bread = chooseBread();
        String meat = chooseMeat();
        String cheese = ChooseCheese();
        Boolean toast = DoYouWantToasted();

        System.out.println("Your chosen bread is: " + bread);
        System.out.println("Your chosen meat is: " + meat);
        System.out.println("Your chosen cheese is: " + cheese);
        if(toast){
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

    public static String ChooseCheese(){
        String SelectedCheese = "";
        System.out.println("What cheese do you want: \n 1. Regular \n 2. Peppered");
        Scanner scan = new Scanner(System.in);
        int CheeseOption = scan.nextInt();
        switch (CheeseOption){
            case 1:
                SelectedCheese = "Regular";
                        break;
            case 2:
                SelectedCheese = "Peppered";
                        break;
            default:
                SelectedCheese ="No Cheese";
                        break;
        }
        return SelectedCheese;
    }



    public static Boolean DoYouWantToasted(){
        Boolean toast = false;
        System.out.println("Would you like your sub toasted? Y/N : ");
        Scanner scan = new Scanner(System.in);
        String EnteredOption = scan.nextLine();

        switch(EnteredOption){
            case "y":
                toast=true;
                break;
            case "Y":
                toast=true;
                break;
        }

        return toast;
    }
}
