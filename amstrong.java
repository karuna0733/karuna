public class amstrong {
    public static void main(String[] args) {
        int num = 153; // Example number
        int originalNum = num;
        int sum = 0;
        
        while (num != 0) {
            int digit = num % 10;
            sum += digit * digit * digit;
            num /= 10;
        }
        
        if (sum == originalNum) {
            System.out.println(originalNum + " is an Armstrong number.");
        } else {
            System.out.println(originalNum + " is not an Armstrong number.");
        }
    }
}
