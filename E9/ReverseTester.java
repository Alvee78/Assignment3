package class19.E9;
import java.lang.StringBuilder;
public class ReverseTester {
    private String word;
    public ReverseTester(){
        word = "desserts";
    }

    public String getWord() {
        return word;
    }

    public String getReversedString(){
        StringBuilder stringBuilder = new StringBuilder(word);
        stringBuilder.reverse();
        return stringBuilder.toString();
    }

}
