package ru.netology.service;

import static org.junit.Assert.assertEquals;

public class CashbackHackServiceTest {

    @org.junit.Test
    public void testRemainAmountLessThanBoundaryFirstTest() {
        CashbackHackService service = new CashbackHackService();
        int amount = 900;
        int actual = service.remain(amount);
        int expected = 100;
        assertEquals(expected, actual);
    }
    @org.junit.Test
    public void testRemainAmountLessThanBoundarySecondTest() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1;
        int actual = service.remain(amount);
        int expected = 999;
        assertEquals(expected, actual);
    }

    @org.junit.Test
    public void testRemainAmountLessThanBoundaryThirdTest() {
        CashbackHackService service = new CashbackHackService();
        int amount = 500;
        int actual = service.remain(amount);
        int expected = 500;
        assertEquals(expected, actual);
    }

    @org.junit.Test
    public void testRemainAmountEqualToBoundary() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;
        int actual = service.remain(amount);
        int expected = 0;
        assertEquals(expected, actual);
    }
}