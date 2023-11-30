import java.util.Scanner;
public class Task3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int birthDay;
        int birthYear = InputHelper.getRangedInt(scan, "Please enter your birth year[1950-2010]: ", 1950, 2010);
        int birthMonth = InputHelper.getRangedInt(scan, "Please enter your birth month: ", 1, 12);
        if (birthMonth == 1 || birthMonth == 3 || birthMonth == 5 || birthMonth == 7 || birthMonth == 8 || birthMonth == 10 || birthMonth == 12) {
            birthDay = InputHelper.getRangedInt(scan, "Please enter your birth day[1-31]: ", 1, 31);
        } else if (birthMonth == 2) {
            birthDay = InputHelper.getRangedInt(scan, "Please enter your birth day[1-28]: ", 1, 28);
        } else {
            birthDay = InputHelper.getRangedInt(scan, "Please enter your birth day[1-30]: ", 1, 30);
        }
        int birthHour = InputHelper.getRangedInt(scan, "Please enter your birth hour[1-24]: ", 1, 24);
        int birthMin = InputHelper.getRangedInt(scan, "Please enter your birth minute[1-59]: ", 1, 59);

        System.out.printf("%-10s %5d", "Year: ", birthYear);
        System.out.printf("\n%-10s %5d", "Month: ", birthMonth);
        System.out.printf("\n%-10s %5d", "Day: ", birthDay);
        System.out.printf("\n%-10s %5d", "Hour: ", birthHour);
        System.out.printf("\n%-10s %5d", "Minute: ", birthMin);
    }
}

