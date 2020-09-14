package dankook.sw.donghyeon;

public class TaxCalc2020 implements TaxCalc {
    private double taxableIncome;

    public TaxCalc2020() {
        taxableIncome = 0;
    }

    @Override
    public void setTaxableIncome(double amount) {
        taxableIncome = amount;
    }

    @Override
    public double getTaxableIncome() {
        return taxableIncome;
    }

    @Override
    public double computeTax() {
        if (taxableIncome < 50000000) {
            return taxableIncome * 0.2;
        } else if (taxableIncome < 80000000) {
            return taxableIncome * 0.25;
        } else if (taxableIncome < 120000000) {
            return taxableIncome * 0.3;
        } else {
            return taxableIncome * 0.35;
        }
    }
}
