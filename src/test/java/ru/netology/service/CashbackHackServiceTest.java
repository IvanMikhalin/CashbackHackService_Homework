package ru.netology.service;

//import org.junit.Test;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

//import static junit.framework.TestCase.assertEquals;

//import static org.junit.Assert.*;

public class CashbackHackServiceTest {

    @Test
    public void shouldShowTheRestOfAmount() {
        int amount = 1999;
        int expected = 1;
        CashbackHackService service = new CashbackHackService ();
        int actual = service.remain(amount);
        assertEquals(expected, actual);
    }

    @Test
    public void shouldShowTheRestOfAmountIfEqualTo1000() {
        int amount = 3000;
        int expected = 0;
        CashbackHackService service = new CashbackHackService ();
        int actual = service.remain(amount);
        assertEquals(expected, actual);
    }
}