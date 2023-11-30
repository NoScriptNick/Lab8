import java.util.Scanner;
public class Task5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String ssn = InputHelper.getRegExString(scan, "Please enter your social security number: ", ("\\d{3}-\\d{2}-\\d{4}"));
        System.out.println("Your ssn is " + ssn);
        String uc = InputHelper.getRegExString(scan, "Please enter your UC Student M Number: ", ("(M|m)\\d{5}"));
        System.out.println("Your Student M Number is: " + uc);
        System.out.printf("%-8s %8s %8s %8s %8s", "Menu:", "O - Open", "S - Save", "V - View", "Q - Quit");
        String menu = InputHelper.getRegExString(scan, " ", ("[OoSsVvQq]"));
        System.out.println("You chose: " + menu);

    }
}
