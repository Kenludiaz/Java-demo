import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {
        inputThenPrintSumAndAverage();
    }
    public static int Min() {
        Scanner scanner = new Scanner(System.in);
        int min = Integer.MAX_VALUE;
        while(true)
        {
            System.out.println("Enter a number: ");
            if(scanner.hasNextInt())
            {
                int value = scanner.nextInt();
                if (value < min) {
                    min = value;
                }
            } else {
                System.out.println(min);
                scanner.nextLine();
                break;
            }
            scanner.nextLine();
        }
        scanner.close();
        return min;
    }
    public static int Max() {
        Scanner scanner = new Scanner(System.in);
        int max = Integer.MIN_VALUE;
        while(true)
        {
            System.out.println("Enter a number: ");
            if(scanner.hasNextInt())
            {
                int value = scanner.nextInt();
                if (value > max) {
                    max = value;
                }
            } else {
                System.out.println(max);
                break;
            }
            scanner.nextLine();
        }
        scanner.close();
        return max;
    }
    public static void inputThenPrintSumAndAverage() {
        Scanner scanner = new Scanner(System.in);
        boolean isAnInt = scanner.hasNextInt();
        long sum = 0;
        long counter = 0;

        while(isAnInt) {
            sum += scanner.nextInt();
            counter += 1;
            isAnInt = scanner.hasNextInt();
        }

        scanner.close();
        long avg = Math.round( (double) sum/counter);
        System.out.println("SUM = " + sum + " AVG = " +  avg);
    }
    public static int getBucketCount(double width, double height,
                                     double areaPerBucket, int extraBuckets) {
        if (width <= 0 ||
            height <= 0 ||
            areaPerBucket <= 0 ||
            extraBuckets < 0){
            System.out.println("Invalid Input");
            return  -1;
        }
        double surfaceArea = width * height;
        double remainingArea = surfaceArea - areaPerBucket * extraBuckets;

        return (int) Math.ceil(remainingArea/areaPerBucket);

    }
    public static int getBucketCount(double width, double height,
                                   double areaPerBucket) {
        if (width <= 0 ||
                height <= 0 ||
                areaPerBucket <= 0){
            System.out.println("Invalid Input");
            return  -1;
        }
        double surfaceArea = width * height;

        return (int) Math.ceil(surfaceArea/areaPerBucket);

    }
    public static int getBucketCount(double area,
                                   double areaPerBucket) {
        if (area <= 0 ||
            areaPerBucket <= 0){
            System.out.println("Invalid Input");
            return  -1;
        }

        return (int) Math.ceil(area/areaPerBucket);

    }


}
