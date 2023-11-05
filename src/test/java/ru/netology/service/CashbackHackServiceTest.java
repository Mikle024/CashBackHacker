package ru.netology.service;

import org.junit.Assert;
import org.junit.Test;

public class CashbackHackServiceTest {
    CashbackHackService service = new CashbackHackService();

    @Test
    public void shouldBeCalculatedAtAmount0() {

        Assert.assertEquals(1_000, service.remain(0));
    }

    @Test
    public void shouldBeCalculatedAtAmount1() {

        Assert.assertEquals(999, service.remain(1));
    }

    @Test
    public void shouldBeCalculatedAtAmount100() {

        Assert.assertEquals(900, service.remain(100));
    }

    @Test
    public void shouldBeCalculatedAtAmount999() {

        Assert.assertEquals(1, service.remain(999));
    }

    @Test
    public void shouldBeCalculatedAtAmount1_000() {

        Assert.assertEquals(0, service.remain(1_000));
    }

    @Test
    public void shouldBeCalculatedAtAmount1_001() {

        Assert.assertEquals(999, service.remain(1_001));
    }
}
