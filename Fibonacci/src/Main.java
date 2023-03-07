public class Main {
    public static void main(String[] args) {
        int number = 7;
        for(int i=1; i<=number; i++){
            System.out.print(getFibonacci(i) +" ");
        }
    }

    public static int getFibonacci(int number){
        if(number == 1 || number == 2){
            return 1;
        }
        return getFibonacci(number - 2) + getFibonacci(number - 1);

    }
}