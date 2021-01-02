package application;

import services.BrazilInterestService;
import services.USAInterestService;
import services.InterestService;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Set country 0 to Brazil or 1 to USA");
        int country = sc.nextInt();
        System.out.println("Amount: ");
        double amount = sc.nextDouble();
        System.out.println("Months: ");
        int months = sc.nextInt();

        InterestService is;
        if (country == 0) {
            is = new BrazilInterestService();
        } else {
            is = new USAInterestService();
        }

        double payment = is.payment(amount, months);

        System.out.println("Payment after " + months + " months");
        System.out.println(String.format("%.2f", payment));
        sc.close();
    }

}
