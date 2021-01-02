package services;


public class USAInterestService implements InterestService {

    private double interestRate = 1.0;

    public USAInterestService() {

    }

    @Override
    public double getInterestRate() {
        return interestRate;
    }


}



