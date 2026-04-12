package org.example.exercises;

public class InvestmentCalculator_2 {
    public static void bookSolution() {
        float total = 14000;
        System.out.println("Original investment: $" + total);
        // Inceases by 40 percent the first year
        total = total + (total * .4F);
        System.out.println("After one year: $" + total);
        // Loses $1,500 the second year
        total = total - 1500F;
        System.out.println("After two years: $" + total);
        // Increases by 12 percent the third year
        total = total + (total * .12F);
        System.out.println("After three years: $" + total);
    }
    public static void main(String[] args) {
        float investmentAmount = 14_000;
        investmentAmount *= 1.4F;
        investmentAmount -= 1_500;
        investmentAmount *= 1.12F;

        System.out.println(investmentAmount);
        bookSolution();
    }

}
