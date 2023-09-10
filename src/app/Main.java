package app;

public class Main {

    static int count;

    public static void main(String[] args) {

        double[] prices = {17.25, 21.67, 19.05, 18.66, 20.18, 21.36, 18.05};

        count = 0;

        System.out.println("Distribution of prices by days:");

        for (int index = 0; index < prices.length; index++) {
            double a = prices[index];
            count++;
            System.out.println(count + ") " + a);
        }

        System.out.println("--------------------");


        for (int i = 0; i < prices.length; i++) {
            for (int j = 1; j < (prices.length - i); j++) {
                if (prices[j - 1] > prices[j]) {

                    double temp = prices[j - 1];
                    prices[j - 1] = prices[j];
                    prices[j] = temp;
                }
            }
        }
        System.out.print("Sorted data of prices: ");
        for (double number : prices) {
            System.out.print(number + "; ");
        }
        double sum1 = 0;

        for (int i = 0; i < prices.length; i++) sum1 += prices[i];

        double mid = sum1 / prices.length;

        System.out.println("\n--------------------\n" + "Average price is: " + mid);
    }
}