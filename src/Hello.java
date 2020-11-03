public class Hello {
    public static void main(String[] args) {


//        public static int calculateHighScorePosition(int playerScore) {
//            if (playerScore > 1000)
//            {
//                "The score is greater than a 1000";
//            }
//            return
//        }
        checkNumber(0);
    }
    public static void checkNumber(int number) {
        if (number > 0) {
            System.out.println("positive");
        }
        else if(number < 0) {
            System.out.println("negative");
        }
        else {
            System.out.println("zero");
        }
    }
    public static long toMilesPerHour(double kilometersPerHour) {
        if (kilometersPerHour < 0) {
            return -1;
        }
        return Math.round(kilometersPerHour/1.60934);
    }
    public static void printConversion(double kilometersPerHour) {
        if (kilometersPerHour < 0) {
            System.out.println("Invalid Value");
            return;
        }
        long result = toMilesPerHour(kilometersPerHour);
        System.out.println(kilometersPerHour + " km/h = " + result + "mi/h");
    }
    public static void printMegaBytesAndKiloBytes(int kiloBytes) {
        if (kiloBytes < 0) {
            System.out.println("Invalid Value");
        }
        long megabytes = kiloBytes / 1024;
        long remainingKiloBytes = kiloBytes % 1024;
        System.out.println(kiloBytes + " KB = " +megabytes + " MB and "+
                remainingKiloBytes + " KB");
    }
    public static boolean shouldWakeUp(boolean isCurrentlyBarking, int hourOfDay) {
        if ((hourOfDay < 0) || (hourOfDay > 23)) {
            return false;
        }
        else if((isCurrentlyBarking) && (hourOfDay < 8 || hourOfDay > 22)) {
            return true;
        }
        return false;
    }
    public static boolean isLeapYear(int year) {
        if ((year < 0) || (year >= 9999)) {
            return false;
        }
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    return true;
                }
                return false;
            }
            else {
                return  true;
            }
        }
        else {
            return false;
        }
    }
    public static boolean areEqualByThreeDecimalPlaces(double a, double b) {
        a *= 1000;
        b *= 1000;
        a = (long) a;
        b = (long) b;
        if (a == b) {
            return true;
        }
        return  false;
    }
    public static boolean hasEqualSum(int a, int b, int result) {
        if (a + b == result) {
            return  true;
        }
        return false;
    }
    public static boolean hasTeen(int a, int b, int c) {
        if (isInrange(a) || isInrange(b) || isInrange(c)) {
            return true;
        }
        return false;
    }
    public static boolean isInrange(int num) {
        if (num > 12 && num < 20) {
            return true;
        }
        return false;
    }

}
