import java.util.Scanner;
public class strr {
    public static void main(String[] args) {
        Scanner kbd = new Scanner(System.in);
        String input=kbd.nextLine();
        int space=0;
        for(int i=0;i<input.length();i++){
            if(input.charAt(i)==' '){
                space++;
            }
            System.out.println(space+1);
        }
}
}
