import word.ReverseWord;

public class Main {
    public static void main(String[] args) {

        System.out.println(reverse(23456));
    }
    public static int reverse(int num) {
        String str = String.valueOf(num);
        StringBuilder sb = new StringBuilder(str).reverse();
        return Integer.parseInt(sb.toString());
    }
}