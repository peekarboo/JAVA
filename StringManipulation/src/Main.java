import word.FindTheNthWord;
import word.ReverseWord;

public class Main {
    public static void main(String[] args) {
        ReverseWord reverseWord = new ReverseWord();
        String newWord = reverseWord.execute("Sharon is My Name");

        //Using Module FindTheWord
        FindTheNthWord find = new FindTheNthWord();
        System.out.println(find.execute(newWord, 1));
    }
}