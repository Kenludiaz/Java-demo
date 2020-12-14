import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
//        Runnable runnable =
//        () -> {
//            String myString = "Let's Split this up into an array";
//            String[] parts = myString.split(" ");
//            for (String part : parts) {
//                System.out.println(part);
//            }
//
//        };
//        Function<String, String> lambda = (String source) -> {
//        StringBuilder returnVal = new StringBuilder();
//        for (int i = 0; i < ((String) source).length(); i++) {
//            if (i % 2 == 1) {
//                returnVal.append(source.charAt(i));
//            }
//        }
//        return returnVal.toString();
//        };
//        Supplier<String> s = () -> "I love Java!";
//        String supplierResult = s.get();
//
//        System.out.println(supplierResult);


    }

    public static String everySecond(Function<String, String> func, String source) {
        return func.apply(source);
    }
}
