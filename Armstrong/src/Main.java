public class Main {
    public static void main(String[] args) {
        int num = 153;
        if (isArmstrong(num)) {
            System.out.println(num + " is an Armstrong number");
        } else {
            System.out.println(num + " is not an Armstrong number");
        }
    }
    public static boolean isArmstrong(int number) {
        //determine string length
        String str = String.valueOf(number);
        int len = str.length();

        // Calculate the sum of the Armstrong calculations for each digit
        int sum = 0;
        for (int i = 0; i < len; i++) {
            int digit = Character.getNumericValue(str.charAt(i));
            sum += Math.pow(digit, len);
        }

        // Check if the sum is equal to the original number
        return sum == number;
    }
}