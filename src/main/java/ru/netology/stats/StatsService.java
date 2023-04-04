package ru.netology.stats;

public class StatsService {
    public long sumAllSales(long[] sales) {
        long sumSales = 0;
        for (long sale : sales) {
            sumSales += sale;
        }
        return sumSales;
    }

    public long averageSalesInMonth(long[] sales) {
        return sumAllSales(sales) / 12;
    }


    public int maxMonthSale(long[] sales) {
        int maxMonth = 0;
        long salesMax = sales[0];
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= salesMax) {
                maxMonth = i;
                salesMax = sales[i];
            }
        }
        return maxMonth + 1;
    }

    public int minMonthSale(long[] sales) {
        int minMonth = 0;
        long salesMin = sales[0];
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= salesMin) {
                minMonth = i;
                salesMin = sales[i];
            }
        }
        return minMonth + 1;
    }

    public int monthsBellowAverage(long[] sales) {
        int counter = 0;
        long averageSalesInMonth = averageSalesInMonth(sales);

        for (long sale : sales) {
            if (sale < averageSalesInMonth(sales)) {
                counter++;
            }
        }
        return counter;
    }

    public int monthsAboveAverage (long [] sales) {
        int counter = 0;

        for (long sale : sales) {
            if (sale > averageSalesInMonth(sales)) {
                counter++;
            }
        }
        return counter;
    }
}
