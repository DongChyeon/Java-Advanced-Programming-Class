package dankook.sw.donghyeon;

public class Main {
    public static void main(String[] args) {
        TaxCalc tc1 = new TaxCalc2019();
        TaxReport report1 = new TaxReport(tc1,20000000);
        report1.printTax();

        TaxCalc tc2 = new TaxCalc2020();
        TaxReport report2 = new TaxReport(tc2, 40000000);
        report2.printTax();

        tc2.setTaxableIncome(50000000);
        report2.printTax();

        tc2.setTaxableIncome(80000000);
        report2.printTax();

        tc2.setTaxableIncome(120000000);
        report2.printTax();
    }
}
