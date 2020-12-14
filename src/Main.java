import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        Function<String, String> lambda = (String source) -> {
        StringBuilder returnVal = new StringBuilder();
        for (int i = 0; i < ((String) source).length(); i++) {
            if (i % 2 == 1) {
                returnVal.append(source.charAt(i));
            }
        }
        return returnVal.toString();
    };
//        Runnable runnable =
//        () -> {
//            String myString = "Let's Split this up into an array";
//            String[] parts = myString.split(" ");
//            for (String part : parts) {
//                System.out.println(part);
//            }
//
//        };
        String result = lambda.apply("1234567890");
        System.out.println(result);
    }
}
