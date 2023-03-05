public class Main {
    public static void main(String[] args) {

        System.out.println(isFizzBuzz("fib"));
    }
    public static String isFizzBuzz(String value)
    {
        String result = "";
        if(value.startsWith("f")){
            result += "Fizz";
        }
        if (value.endsWith("b")){
            result += "Buzz";
        }
        if(result.isEmpty()){
            result = value;
        }
        return result;

    }
}