import java.util.Scanner;
public class productofarray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();
        
        int[] arr = new int[n];
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        
        int product = 1;
        for (int i = 0; i < n; i++) {
            product *= arr[i];
        }
        
        System.out.println("The product of the elements in the array is: " + product);
        
        scanner.close();
    }
    
}
