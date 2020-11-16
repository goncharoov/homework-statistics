package ru.netology.statistics;

public class StatsService {

    public long calculateSum (long[] months) {
        long sum = 0;
        for (long month : months) {
            sum += month;
        }
        return sum;
    }

    public long calculateAverage (long[] months) {
        long sum = 0;
        for (long month : months) {
            sum += month;
        }
        long average = sum / months.length;
        return average;
    }

    public long findMax (long[] months) {
        int i = 1;
        int monthIndex = 1;
        int max = 0;
        for (long month : months) {
            if (max <= monthIndex) {
                max = monthIndex;
                monthIndex = i;
            }
        }
        return monthIndex;
    }

    public long findMin (long[] months) {
        int i = 1;
        int monthIndex = 1;
        long min = months[0];
        for (long month : months) {
            if (min > month) {
                min = month;
                monthIndex = i;
            }
            i++;
        }
        return monthIndex;
    }

    public long sumBelowAverage (long[] months) {
        long sum = 0;
        for (long month : months) {
            sum += month;
        }
        long average = sum / months.length;
        int belowAverage = 0;
        for (long month : months) {
            if (month < average) {
                belowAverage++;
            }
        }
        return belowAverage;
    }

    public long sumAboveAverage (long[] months) {
        long sum = 0;
        for (long month : months) {
            sum += month;
        }
        long average = sum / months.length;
        int aboveAverage = 0;
        for (long month : months) {
            if (month > average) {
                aboveAverage++;
            }
        }
        return aboveAverage;
    }
}
