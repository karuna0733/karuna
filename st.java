import java.util.*;
public class st {
    public static void main(String[] args) {
        Scanner kbd = new Scanner(System.in);
        String in=kbd.nextLine();
        int vowel=0;
        String input=in.toLowerCase();
        for(int i=0;i<input.length();i++){
            char ch=input.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                vowel++;
            }
            System.out.println(vowel);
        }
    }
}
