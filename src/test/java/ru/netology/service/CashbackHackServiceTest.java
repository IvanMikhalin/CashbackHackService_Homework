package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {

    @Test
    public void shouldShowTheRestOfAmount() {
    int amount = 1999;
    int expected = 1;
    CashbackHackService service = new CashbackHackService ();
    int actual = service.remain(amount);
    assertEquals(actual, expected);
    }

    @Test
    public void shouldShowTheRestOfAmountIfEqualTo1000() {
        int amount = 3000;
        int expected = 0;
        CashbackHackService service = new CashbackHackService ();
        int actual = service.remain(amount);
        assertEquals(actual, expected);

    }
}