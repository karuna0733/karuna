public class str123 {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder("java");
        sb.append("program");
        System.out.println(sb);
        sb.replace(0,4,"python");
        System.out.println(sb);
    }
}
