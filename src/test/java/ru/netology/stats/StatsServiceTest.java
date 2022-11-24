package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {

    @Test
    public void testSum() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expected = 8 + 15 + 13 + 15 + 17 + 20 + 19 + 20 + 7 + 14 + 14 + 18;
        long actual = service.sum(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testAverage() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expected = (8 + 15 + 13 + 15 + 17 + 20 + 19 + 20 + 7 + 14 + 14 + 18) / 12;
        long actual = service.average(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void max() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expected = 8;
        long actual = service.max(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void min() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expected = 9;
        long actual = service.min(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void minAverageSales() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 18, 7, 14, 14, 16};

        int actual = service.minAverageSales(sales);
        long expected = 3;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void maxAverageSales() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 18, 7, 14, 14, 16};

        int actual = service.maxAverageSales(sales);
        long expected = 7;

        Assertions.assertEquals(expected, actual);
    }

}
