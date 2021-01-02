package services;

import java.security.InvalidParameterException;

public class BrazilInterestService {

    private double interestRate;

    public BrazilInterestService(double interestRate) {
        this.interestRate = interestRate;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public double payment(double amount, int months){
        if (months < 1 || months > 12){

            throw new InvalidParameterException("Months must be greater than zero or less  then 13");
        }
        return (double) amount * Math.pow(1.0 + interestRate / 100.00, months);

    }


}
