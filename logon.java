public class logon {
    public static void main(String[] args) {
        int year = 0;
        int month = 0;
        int remainingDays = 0;
        while(remainingDays >= 365) {
            year++;
            remainingDays -= 365;   
        }
        System.out.println("year: " + year);
        System.out.println("month " + month);
        System.out.println("days " + remainingDays);
    }}