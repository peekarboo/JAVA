public class ReverseWord {
    public String execute(String word){
        String [] splitWord = word.split(" ");
        StringBuilder sb = new StringBuilder();

        for (int i = splitWord.length - 1; i >= 0; i--) {
            sb.append(splitWord[i]);
            sb.append(" ");
        }
        return sb.toString().trim();
    }
}
