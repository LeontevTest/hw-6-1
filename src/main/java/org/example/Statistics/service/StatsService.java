package org.example.Statistics.service;

public class StatsService {
    public int sumSales(int[] sales) {
        int sum = 0;

        for (int i = 0; i < sales.length; i++) {

            sum += sales[i];
        }
        return sum;
    }

    public int averageSales(int[] sales) {
        int sum = 0;
        int averageSum = 0;

        for (int i = 0; i < sales.length; i++) {

            sum += sales[i];

            averageSum = sum / sales.length;
        }
        return averageSum;
    }

    public int maxMonthSales(int[] sales) {
        int maxMonth = 0;

        for (int i = 0; i < sales.length; i++) {

            if (sales[i] >= sales[maxMonth]) {

                maxMonth = i;
            }
        }
        return maxMonth + 1;
    }

    public int minMonthSales(int[] sales) {
        int minMonth = 0;

        for (int i = 0; i < sales.length; i++) {

            if (sales[i] <= sales[minMonth]) {

                minMonth = i;
            }
        }
        return minMonth + 1;
    }

    public int quantityMonthBelowAverageSales(int[] sales) {
        int quantity = 0;
        int averageSum = averageSales(sales);

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > averageSum) {

                quantity++;
            }
        }
        return quantity;
    }

    public int quantityMonthAboveAverageSales(int[] sales) {
        int quantity = 0;
        int averageSum = averageSales(sales);

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < averageSum) {

                quantity++;
            }
        }
        return quantity;
    }
}
