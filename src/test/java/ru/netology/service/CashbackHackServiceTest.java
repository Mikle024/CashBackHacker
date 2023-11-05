package ru.netology.service;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CashbackHackServiceTest {
    CashbackHackService service = new CashbackHackService();

    @Test
    public void shouldBeCalculatedAtAmount0() {

        Assert.assertEquals(service.remain(0), 1_000);
    }

    @Test
    public void shouldBeCalculatedAtAmount1() {

        Assert.assertEquals(service.remain(1), 999);
    }

    @Test
    public void shouldBeCalculatedAtAmount100() {

        Assert.assertEquals(service.remain(100), 900);
    }

    @Test
    public void shouldBeCalculatedAtAmount999() {

        Assert.assertEquals(service.remain(999), 1);
    }

    @Test
    public void shouldBeCalculatedAtAmount1_000() {

        Assert.assertEquals(service.remain(1_000), 0);
    }

    @Test
    public void shouldBeCalculatedAtAmount1_001() {

        Assert.assertEquals(service.remain(1_001), 999);
    }
}
