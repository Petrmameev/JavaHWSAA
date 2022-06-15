package ru.netology.javahwsaa.services;

public class StatsService {
    public int minSales(long[] sales) {
        int minMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (long sale : sales) {
            // sales[minMonth] - продажи в месяце minMonth
            // sale - продажи в рассматриваемом месяце
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return minMonth + 1;

    }

    public int maxSales(long[] sales) {
        int maxSales = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale >= sales[maxSales]) {
                maxSales = month;
            }
            month = month + 1;
        }
        return maxSales + 1;
    }

    public long sum(long[] sales) {
        long ans = 0;
        for (long sale : sales) {
            ans += sale;
        }
        return ans;
    }

    public long average(long[] sales) {
        long sum = sum(sales);
        return sum / 12;
    }

    public int aboveAverage(long[] sales){
        int count = 0;
        long avg = average(sales);
        for (long sale : sales) {
            if (sale > avg) {
                count++;
            }
        }
        return count;
    }
    public int belowAverage(long[] sales){
        int count = 0;
        long avg = average(sales);
        for (long sale : sales) {
            if (sale < avg) {
                count++;
            }

        }
        return count;
    }

}
