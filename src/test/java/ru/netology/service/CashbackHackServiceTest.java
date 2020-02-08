package ru.netology.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CashbackHackServiceTest {

    @Test
    void shouldReturn1000IfAmountIs0() {
        CashbackHackService cashback = new CashbackHackService();
        int amount = 0;
        int actual = cashback.remain(amount);
        int expexted = 1000;
        assertEquals(expexted, actual);
    }


    @Test
    void shouldReturn1IfAmountsIs900() {
        CashbackHackService cashback = new CashbackHackService();
        int amount = 900;
        int actual = cashback.remain(amount);
        int expexted = 100;
        assertEquals(expexted, actual);
    }


    @Test
    void shouldReturn0IfAmountIs1000() {
        CashbackHackService cashback = new CashbackHackService();
        int amount = 1000;
        int actual = cashback.remain(amount);
        int expexted = 0;
        assertEquals(expexted, actual);
    }
}