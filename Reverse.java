public class Reverse {
    public static String ReverseStr(String a) {
        StringBuilder rev = new StringBuilder();
        for (int j = a.length() - 1; j >= 0; j--) {
            rev.append(a.charAt(j));
        }
        return rev.toString();
    }
    public static void main(String[] args) {
        String b = "Hello";
        System.out.print(ReverseStr(b));
    }
}
