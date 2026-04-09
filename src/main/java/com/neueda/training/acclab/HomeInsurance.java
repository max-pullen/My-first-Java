package com.neueda.training.acclab;

public class HomeInsurance implements Detailable {

    private int premium;
    private int excess;
    private int sumInsured;

    public HomeInsurance(int premium, int excess, int sumInsured) {
        this.premium = premium;
        this.excess = excess;
        this.sumInsured = sumInsured;
    }

    @Override
    public String getDetails() {
        return "Premium: " + premium + ", Excess: " + excess + ", Sum Insured: " + sumInsured;
    }

}
