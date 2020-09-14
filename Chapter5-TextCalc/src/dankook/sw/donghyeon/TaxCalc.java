package dankook.sw.donghyeon;

public interface TaxCalc {
    void setTaxableIncome(double amount);
    double computeTax();
}
