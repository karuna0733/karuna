import java.util.Scanner;

public class SBICreditCard {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int primaryAge = sc.nextInt();
        int addonAge = sc.nextInt();
        int employment = sc.nextInt();
        double income = sc.nextDouble();

        if (primaryAge >= 21 && primaryAge <= 60 && addonAge > 18 && income <= 300000) {
            System.out.println("Yes. You are eligible for SBI credit cards");
        } else {
            System.out.println("No. You are not eligible for SBI credit cards");
        }
    }
}
