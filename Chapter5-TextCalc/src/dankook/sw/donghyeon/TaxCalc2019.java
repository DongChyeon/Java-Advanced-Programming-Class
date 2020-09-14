package dankook.sw.donghyeon;

public class TaxCalc2019 implements TaxCalc {
    private double taxableIncome;

    public TaxCalc2019() {
        this.taxableIncome = 0;
    }

    @Override
    public void setTaxableIncome(double amount) {
        this.taxableIncome = amount;
    }

    @Override
    public double computeTax() {
        return taxableIncome * 0.25;
    }
}
