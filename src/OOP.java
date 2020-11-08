public class OOP {
    public static void main(String args[]) {
        SimpleCalculator Calc = new SimpleCalculator();
        Calc.setFirstNumber(4.0);
        Calc.setSecondNumber(5.0);
        System.out.println(Calc.getAdditionResult());
        System.out.println(Calc.getSubtractionResult());
        System.out.println(Calc.getMultiplicationResult());
        System.out.println(Calc.getDivisionResult());
    }
}
