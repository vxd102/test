import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        String str = "Orders (0)" +
                "0" +
                ")";

        Pattern pattern = Pattern.compile("\\d");
        Matcher matcher = pattern.matcher(str);
        while(matcher.find())
        System.out.println(matcher.group() );
    }
}
