import java.util.Scanner;

public class AgeGrouping {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] ages = new int[n];
        for (int i = 0; i < n; i++) ages[i] = sc.nextInt();

        int baby = 0, school = 0, adult = 0;
        for (int age : ages) {
            if (age <= 5) baby++;
            else if (age <= 20) school++;
            else adult++;
        }
        System.out.println("Baby: " + baby);
        System.out.println("Attending school: " + school);
        System.out.println("Adult: " + adult);
    }
}
