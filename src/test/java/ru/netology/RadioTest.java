package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    Radio radio = new Radio();


    @Test
    public void shouleSetVolume() {


        radio.setCurrentVolume(15);

        int expected = 15;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void ahouldNotSetVolumeAboveMax() {

        radio.setCurrentVolume(120);

        int expected = 100;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void ahouldNotSetVolumeAboveMin() {

        radio.setCurrentVolume(-1);

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseVolume() {

        radio.setCurrentVolume(12);
        radio.increaseVolume();

        int expected = 13;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseVolumeN() {
        Radio radio = new Radio();
        radio.setCurrentVolume(101);
        radio.increaseVolume();

        int expected = 100;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void reductionVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(12);
        radio.reductionVolume();

        int expected = 11;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void reductionVolumeN() {
        Radio radio = new Radio();
        radio.setCurrentVolume(120);
        radio.reductionVolume();

        int expected = 100;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);

    }

}