package ru.netology.statistics;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

    class StatsServiceTest {
        StatsService service = new StatsService();

        @Test
        void calculateSum() {
            long[] months = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
            long expected = 180;
            long actual = service.calculateSum(months);
            assertEquals(expected, actual);
        }

        @Test
        void calculateAverage() {
            long[] months = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
            long expected = 15;
            long actual = service.calculateAverage(months);
            assertEquals(expected, actual);
        }

        @Test
        void findMax () {
            long[] months = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
            long expected = 6;
            long actual = service.findMax(months);
            assertEquals(expected, actual);
        }

        @Test
        void findMin () {
            long[] months = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
            long expected = 9;
            long actual = service.findMin(months);
            assertEquals(expected, actual);
        }

        @Test
        void sumBelowAverage () {
            long[] months = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
            long expected = 5;
            long actual = service.sumAboveAverage(months);
            assertEquals(expected, actual);
        }

        @Test
        void sumAboveAverage () {
            long[] months = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
            long expected = 5;
            long actual = service.sumAboveAverage(months);
            assertEquals(expected, actual);
        }
    }
