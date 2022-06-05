package ru.netology.service;

import static org.junit.jupiter.api.Assertions.*;

public class CashbackHackServiceTest {
    CashbackHackService service = new CashbackHackService();

    @org.junit.Test
    //докупить на сто
    public void BuyOnHundred() {
        org.junit.Assert.assertEquals(100, service.remain(900));
    }

    @org.junit.Test
    //докупить на тысячу
    public void BuyOnThousand() {
        org.junit.Assert.assertEquals(0, service.remain(1000));
    }

    @org.junit.Test
    //докупить на 1
    public void BuyOnAndOne() {
        org.junit.Assert.assertEquals(1, service.remain(999));
    }

    @org.junit.Test
    //докупить на 999
    public void BuyOnNineHundredAndNinetyNine() {
        org.junit.Assert.assertEquals(999, service.remain(1001));
    }


}