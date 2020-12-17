import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {

        String challenge1 = "I want a bike.";
        String challenge2 = "I want a ball.";

        String regex = "I want a b.+";
        Pattern regexPattern = Pattern.compile("I want a b.+");
        Matcher matcher = regexPattern.matcher(challenge1);
        Matcher matcher2 = regexPattern.matcher(challenge1);

//        Matcher answer = reg

        System.out.println(matcher.matches());
        System.out.println(matcher2.matches());

        String challenge4 = "Replace all blanks with underscores.";
        System.out.println(challenge4.replaceAll(" ", "_"));

        String challenge5 = "aaabccccccddddeffffg";
        System.out.println(challenge5.matches("[a-g]+"));

        String challenge7 = "abcd.125avdcsdf.7tstzfa.999";
        System.out.println(challenge7.matches("\\w+.\\d+"));

        Pattern pattern = Pattern.compile("(\\d+)");
        matcher = pattern.matcher(challenge7);
        System.out.println("The numbers in the pattern are:");
        while (matcher.find()) {
            System.out.println(matcher.start(1));
        }


        String challenge = "{0,2}, {1,5}, {4,7}, {1,2},{2,4}";
        pattern = Pattern.compile("\\{(.+?)}");
        matcher = pattern.matcher(challenge);
        System.out.println("The coordinates are: ");
        while (matcher.find()) {
            System.out.println(matcher.group(1));
        }

        challenge = "11111-1234";
        pattern = Pattern.compile("(^\\d{5}-\\d{4})?$");
        matcher = pattern.matcher(challenge);
        System.out.println(matcher.matches());
    }
}
