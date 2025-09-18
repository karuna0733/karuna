import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int count = String.valueOf(Math.abs(n)).length();
        System.out.println(count);
    }
}
