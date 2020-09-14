package dankook.sw.donghyeon;

public class TaxReport {
    private TaxCalc calc;

    public TaxReport(TaxCalc tc, double amount) {   // Constructor injection
        calc = tc;
        calc.setTaxableIncome(amount);
    }

    public void printTax() {
        double tax = calc.computeTax();
        String strTax = String.format("%.2f", tax);
        System.out.println("소득금액 : " + calc.getTaxableIncome() + "의 세금 : " + strTax);
    }
}
