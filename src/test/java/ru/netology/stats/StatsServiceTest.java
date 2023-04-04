package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {
    @Test
    public void testSumAllSales() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 180;
        long actual = service.sumAllSales(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testAverageSalesInMonth() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 180 / 12;
        long actual = service.averageSalesInMonth(sales);

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void testMaxMonth() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 8;
        long actual = service.maxMonthSale(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testMinMonth() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 9;
        long actual = service.minMonthSale(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testMonthBellowAver() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 5;
        long actual = service.monthsBellowAverage(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testMonthAboveAver() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 5;
        long actual = service.monthsAboveAverage(sales);

        Assertions.assertEquals(expected, actual);

    }
}
