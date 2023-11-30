import java.util.Scanner;
public class Task4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean continueYN = true;
        double total = 0;
        do {
            double price = InputHelper.getRangedDouble(scan, "Please enter the price of your item: ", 0.5, 9.99);
            continueYN = InputHelper.getYNConfirm(scan, "Do you want to continue[Y/N]: ");
            total = total + price;
        } while (continueYN);
        System.out.printf("%-10s %5.2f", "Total cost in $:", total);
    }
}
