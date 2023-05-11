package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioStTest {
    Radio radioSt = new Radio(10);
    Radio radio2 = new Radio();

    @Test
    public void shouleSetStation() {


        radioSt.setCurrentStation(9);

        int expected = 9;
        int actual = radioSt.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouleSetStationZ() {


        radioSt.setCurrentStation(11);

        int expected = 0;
        int actual = radioSt.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouleSetStationX() {

        radioSt.setCurrentStation(-1);

        int expected = 9;
        int actual = radioSt.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void increaseStation() {

        radioSt.setCurrentStation(7);
        radioSt.increaseStation();

        int expected = 8;
        int actual = radioSt.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseStationN() {

        radioSt.setCurrentStation(9);
        radioSt.increaseStation();

        int expected = 0;
        int actual = radioSt.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void reductionStation() {

        radioSt.setCurrentStation(8);
        radioSt.reductionStation();

        int expected = 7;
        int actual = radioSt.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void reductionStationN() {

        radioSt.setCurrentStation(0);
        radioSt.reductionStation();

        int expected = 9;
        int actual = radioSt.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void belowZeroStation() {

        radioSt.setCurrentStation(-1);
        radioSt.increaseStation();

        int expected = 88;
        int actual = radio2.getCurrentStation();

        Assertions.assertEquals(actual, actual);
    }

    @Test
    public void TotalRStation10() {

        Assertions.assertEquals(10, radio2.getQantityRStation());
    }

    @Test
    public void increaseStation2() {

        radioSt.setCurrentStation(7);
        radioSt.increaseStation();

        int expected = 8;
        int actual = radioSt.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseStationN2() {

        radio2.setCurrentStation(9);
        radio2.increaseStation();

        int expected = 0;
        int actual = radio2.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void reductionStation2() {

        radio2.setCurrentStation(8);
        radio2.reductionStation();

        int expected = 7;
        int actual = radio2.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void reductionStationN2() {

        radio2.setCurrentStation(0);
        radio2.reductionStation();

        int expected = 9;
        int actual = radio2.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }
}
