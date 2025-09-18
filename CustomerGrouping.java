import java.util.Scanner;

public class CustomerGrouping {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        int gender = sc.nextInt();

        if (age < 25) {
            if (gender == 1) System.out.println("Group 1");
            else if (gender == 2) System.out.println("Group 2");
            else System.out.println("Invalid");
        } else if (age <= 45) {
            if (gender == 1) System.out.println("Group 3");
            else if (gender == 2) System.out.println("Group 4");
            else System.out.println("Invalid");
        } else {
            System.out.println("Group 5");
        }
    }
}
