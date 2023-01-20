package ReviewClass3;

import java.util.Scanner;

public class SwitchDemo {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter your favorite browser");
        String browser=scan.nextLine();

        switch (browser.toLowerCase()){

            case"Chrome":
                System.out.println("Test case executed in "+browser);
                break;
            case "Safari":
            System.out.println("Test case executed in "+browser);
            break;
            case"Microsoft Edge":
                System.out.println("Test case executed in "+browser);
                break;
            default:
                System.out.println("Browser is unknown - ne execution");

        }
    }
}
