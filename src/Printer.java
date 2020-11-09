public class Printer {
    private double tonerLevels;
    private double numberOfPagesPrinted;
    private boolean isADuplexPrinter;

    public Printer(double tonerLevels, double numberOfPagesPrinted, boolean isADuplexPrinter) {
        this.tonerLevels = tonerLevels;
        this.numberOfPagesPrinted = numberOfPagesPrinted;
        this.isADuplexPrinter = isADuplexPrinter;
    }

    public void fillToner(double amount) {
        if (this.tonerLevels + amount > 100.00) {
            this.tonerLevels = 100.00;
        }
        else {
            this.tonerLevels += amount;
        }
    }

    public void printPages(long amount) {
        this.numberOfPagesPrinted += amount;
    }

    public double getTonerLevels() {
        return tonerLevels;
    }

    public double getNumberOfPagesPrinted() {
        return numberOfPagesPrinted;
    }

    public boolean isADuplexPrinter() {
        return isADuplexPrinter;
    }
}
