import java.util.Scanner;
public class Task6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a message: ");
        String msg = scan.nextLine();
        InputHelper.prettyHeader(msg);
    }
}
