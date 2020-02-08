import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Parsing {

    public static void main(String[] args) {

        String Sequence = "0832 973213 ada 074o-123 312 0721 912 123 123 321 212 0732-222111(7480)-732213 0932-213-231(0732)-1321220749 223-102a0792-010-110";
        String Regex;

        Regex = "\\(?07\\d{2}\\)?[-\\s]?\\d{3}[-\\s]?\\d{3}";

        Pattern checkRegex = Pattern.compile(Regex);
        Matcher regexMatcher = checkRegex.matcher(Sequence);

        System.out.println("The phone numbers are:");
        while (regexMatcher.find()) {
            System.out.println(regexMatcher.group());

        }

    }

}