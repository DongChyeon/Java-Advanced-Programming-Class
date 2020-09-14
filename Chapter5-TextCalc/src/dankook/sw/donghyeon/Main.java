package dankook.sw.donghyeon;

public class Main {
    public static void main(String[] args) {
        TaxCalc tc1 = new TaxCalc2019();
        TaxReport report1 = new TaxReport(tc1,20000000);
        report1.printTax();
        System.out.println("--------------------------------------");

        TaxCalc tc2 = new TaxCalc2020();
        TaxReport report2 = new TaxReport(tc2, 40000000);
        report2.printTax();

        // 금액에 따라 누진세율이 다름을 보여주기 위한 코드
        report2 = new TaxReport(tc2,50000000);
        report2.printTax();

        report2 = new TaxReport(tc2, 80000000);
        report2.printTax();

        report2 = new TaxReport(tc2, 120000000);
        report2.printTax();
    }
}
