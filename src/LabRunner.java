import java.util.Scanner;

public class LabRunner {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a string");
        String str = scan.nextLine();

        System.out.println("Your string is " + str.length() + " characters long.");
        int length = str.length();
        System.out.println("The first half of your word is " + str.substring(0, length / 2));
        System.out.println("The second half of your word is " + str.substring(length / 2, length));

        System.out.println("Enter a second string");
        String str2 = scan.nextLine();
        if (str.length() > str2.length()) {
            System.out.println("The first string was longer");
        } else if (str.length() == str2.length()) {
            System.out.println("The strings are the same length");
        } else {
            System.out.println("The second string is longer");
        }
        if (str.equals(str2)) {
            System.out.println("They have the same sequence of characters.");
        } else if (str.compareTo(str2)<0) {
            System.out.println("String 1 comes first alphabetically.");
        } else {
            System.out.println("String 2 comes first alphabetically.");
        }




    }
}
