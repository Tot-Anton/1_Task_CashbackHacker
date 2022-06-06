package ru.netology.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CashbackHackServiceTest {

    CashbackHackService service = new CashbackHackService();


    @org.testng.annotations.Test
    //докупить на сто
    public void BuyOnHundred() {
        org.testng.Assert.assertEquals(service.remain(900), 100);
    }

    @org.testng.annotations.Test
    //докупить на тысячу
    public void BuyOnThousand() {
        org.testng.Assert.assertEquals(service.remain(1000), 1000);
    }

    @org.testng.annotations.Test
    //докупить на 1
    public void BuyOnAndOne() {
        org.testng.Assert.assertEquals(service.remain(999), 1);
    }

    @org.testng.annotations.Test
    //докупить на 999
    public void BuyOnNineHundredAndNinetyNine() {
        org.testng.Assert.assertEquals(service.remain(1001), 999);
    }

    @org.testng.annotations.Test
    //докупить на 1000
    public void BuyByThousand() {
        org.testng.Assert.assertEquals(service.remain(0), 1000);
    }

    @org.testng.annotations.Test
    //докупить на 700
    public void BuyForSevenHundred() {
        org.testng.Assert.assertEquals(service.remain(300), 700);
    }

    @org.testng.annotations.Test
    //должен вызвать исключение
    public void MustCallUpException() {
        org.testng.Assert.assertThrows(RuntimeException.class, () -> {
            service.remain(-1);
        });
    }





}