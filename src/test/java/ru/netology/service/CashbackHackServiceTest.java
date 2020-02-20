package ru.netology.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CashbackHackServiceTest {

    @Test
    void shouldReturn1000IfAmountIs0() {
        CashbackHackService cashback = new CashbackHackService();
        int amount = 0;
        int actual = cashback.remain(amount);
        int expected = 1000;
        assertEquals(expected, actual);
    }


    @Test
    void shouldReturn100IfAmountsIs900() {
        CashbackHackService cashback = new CashbackHackService();
        int amount = 900;
        int actual = cashback.remain(amount);
        int expected = 100;
        assertEquals(expected, actual);
    }


    @Test
    void shouldReturn0IfAmountIs1000() {
        CashbackHackService cashback = new CashbackHackService();
        int amount = 1000;
        int actual = cashback.remain(amount);
        int expected = 0;
        assertEquals(expected, actual);
    }
}