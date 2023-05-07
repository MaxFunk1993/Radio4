package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioStTest {
    @Test
    public void shouleSetStation() {
        Radio radioSt = new Radio();

        radioSt.setCurrentStation(9);

        int expected = 9;
        int actual = radioSt.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouleSetStationZ() {
        Radio radioSt = new Radio();

        radioSt.setCurrentStation(11);

        int expected = 0;
        int actual = radioSt.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouleSetStationX() {
        Radio radioSt = new Radio();

        radioSt.setCurrentStation(-1);

        int expected = 9;
        int actual = radioSt.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shuldSetToMaxStation() {
        Radio radioSt = new Radio();

        radioSt.setToMaxStation();

        int expected = 9;
        int actual = radioSt.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shuldSetToMinStation() {
        Radio radioSt = new Radio();

        radioSt.setToMinStation();

        int expected = 0;
        int actual = radioSt.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseStation() {
        Radio radioSt = new Radio();
        radioSt.setCurrentStation(7);
        radioSt.increaseStation();

        int expected = 8;
        int actual = radioSt.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseStationN() {
        Radio radioSt = new Radio();
        radioSt.setCurrentStation(9);
        radioSt.increaseStation();

        int expected = 0;
        int actual = radioSt.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void reductionStation() {
        Radio radioSt = new Radio();
        radioSt.setCurrentStation(8);
        radioSt.reductionStation();

        int expected = 7;
        int actual = radioSt.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void reductionStationN() {
        Radio radioSt = new Radio();
        radioSt.setCurrentStation(0);
        radioSt.reductionStation();

        int expected = 9;
        int actual = radioSt.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }
}
