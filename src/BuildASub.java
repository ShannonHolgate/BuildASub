import java.util.Scanner;

public class BuildASub {

    public static void main(String[] args) throws Exception {
        String bread = chooseBread();
        String meat = chooseMeat();

        System.out.println("Your chosen bread is: " + bread);
        System.out.println("Your chosen meat is: " + meat);
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
}
