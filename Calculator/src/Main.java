public class Main {
    public static void main(String[] args) {
        System.out.println(calculate("2+3/3-2*5/2+11"));
    }

    public static double calculate(String expression) {
        // Split the expression into numbers and operators
        String[] values = expression.split("(?<=[-+*/])|(?=[-+*/])");

        // Convert the numbers to doubles
        double[] numbers = new double[values.length / 2 + 1];
        for (int i = 0; i < values.length; i += 2) {
            numbers[i / 2] = Double.parseDouble(values[i]);
        }

        // Apply the operators in order of precedence
        for (int i = 1; i < values.length; i += 2) {
            int previousIndex = i - 2;
            int numbersIndex = i / 2;
            if (values[i].equals("*")) {
                if (checkPreviousOperand(values, previousIndex)) {
                    numbers[(previousIndex) / 2] *= Double.parseDouble(values[i + 1]);
                } else {
                    numbers[numbersIndex] *= Double.parseDouble(values[i + 1]);
                }

            } else if (values[i].equals("/")) {
                if (checkPreviousOperand(values, previousIndex)) {
                    numbers[(previousIndex) / 2] /= Double.parseDouble(values[i + 1]);
                } else {
                    numbers[numbersIndex] /= Double.parseDouble(values[i + 1]);
                }
            }
        }

        double firstValue = numbers[0];

        //Perform Addition and Subtraction
        for (int i = 1; i < values.length; i += 2) {
            int numbersIndex = i / 2;
            if (values[i].equals("+")) {
                firstValue += numbers[numbersIndex + 1];
            } else if (values[i].equals("-")) {
                firstValue -= numbers[numbersIndex + 1];
            }
        }

        return numbers[0];
    }

    private static boolean checkPreviousOperand(String[] operands, int previousIndex) {

        return operands[previousIndex].equals("*") || operands[previousIndex].equals("/");
    }
}