package word;
public class FindTheNthWord {
    public String execute(String word, Integer n){
        String [] words = word.split(" ");
        return words[n-1];
    }
}
