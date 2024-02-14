package org.example.Statistics.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {
    StatsService service = new StatsService();
    int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

    @Test

    public void shouldCalcSumSales() {
        int expectedSum = 180;
        int actualSum = service.sumSales(sales);
        Assertions.assertEquals(expectedSum, actualSum);
    }

    @Test

    public void shouldCalcAverageSales() {
        int expectedAverage = 15;
        int actualAverage = service.averageSales(sales);
        Assertions.assertEquals(expectedAverage, actualAverage);
    }

    @Test

    public void shouldCalcMaxMonthSales() {
        int expectedMaxMonth = 8;
        int actualMaxMonth = service.maxMonthSales(sales);
        Assertions.assertEquals(expectedMaxMonth, actualMaxMonth);
    }

    @Test

    public void shouldCalcMinMonthSales() {
        int expectedMinMonth = 9;
        int actualMinMonth = service.minMonthSales(sales);
        Assertions.assertEquals(expectedMinMonth, actualMinMonth);
    }

    @Test

    public void shouldCalcQuantityMonthBelowAverageSales() {
        int expectedMonthBelow = 5;
        int actualMonthBelow = service.quantityMonthBelowAverageSales(sales);
        Assertions.assertEquals(expectedMonthBelow, actualMonthBelow);
    }

    @Test

    public void shouldCalcQuantityMonthAboveAverageSales() {
        int expectedMonthAbove = 5;
        int actualMonthAbove = service.quantityMonthAboveAverageSales(sales);
        Assertions.assertEquals(expectedMonthAbove, actualMonthAbove);
    }


}
