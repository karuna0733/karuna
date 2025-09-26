import java.util.Scanner;

public class str12 {
    public static void main(String[] args) {
        Scanner kbd = new Scanner(System.in);
String input=kbd.nextLine();
String[] words=input.trim().split("\\s+");
for(String word:words){
    System.out.println(word);
}
    }
}
