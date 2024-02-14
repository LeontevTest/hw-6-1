package org.example.Statistics.service;

public class main {

    public static void Main(String[] args) {
        StatsService service = new StatsService();
        int[] sales = {
                8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18
        };

        System.out.println(service.sumSales(sales));
        System.out.println(service.averageSales(sales));
        System.out.println(service.maxMonthSales(sales));
        System.out.println(service.minMonthSales(sales));
        System.out.println(service.quantityMonthBelowAverageSales(sales));
        System.out.println(service.quantityMonthAboveAverageSales(sales));

    }
}
