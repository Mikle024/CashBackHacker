package ru.netology.service;

import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CashbackHackServiceJupiterTest {
    CashbackHackService service = new CashbackHackService();

    @Test
    public void shouldBeCalculatedAtAmount0() {

        Assertions.assertEquals(1_000, service.remain(0));
    }

    @Test
    public void shouldBeCalculatedAtAmount1() {

        Assertions.assertEquals(999, service.remain(1));
    }

    @Test
    public void shouldBeCalculatedAtAmount100() {

        Assertions.assertEquals(900, service.remain(100));
    }

    @Test
    public void shouldBeCalculatedAtAmount999() {

        Assertions.assertEquals(1, service.remain(999));
    }

    @Test
    public void shouldBeCalculatedAtAmount1_000() {

        Assertions.assertEquals(0, service.remain(1_000));
    }

    @Test
    public void shouldBeCalculatedAtAmount1_001() {

        Assertions.assertEquals(999, service.remain(1_001));
    }
}
