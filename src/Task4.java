import java.util.Scanner;
public class Task4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean continueYN = true;
        do {
            double price = InputHelper.getRangedDouble(scan, "Please enter the price of your item: ", 0.5, 9.99);
            continueYN = InputHelper.getYNConfirm(scan, "Do you want to continue[Y/N]: ");
        } while (continueYN == true);
    }
}
