package ru.netology;

public class Radio {

    private int qantityRStation = 10;
    private int minRStation = 0;
    private int maxRStation = qantityRStation - 1;
    private int currentStation;
    private int maxVolume = 100;
    private int minVolume = 0;
    private int currentVolume;

    public Radio() {

    }

    public Radio(int qantityRStation) {
        this.qantityRStation = qantityRStation;
        this.maxRStation = this.qantityRStation - 1;
    }


    public int getQantityRStation() {
        return qantityRStation;
    }

    public int getMinRStation() {
        return minRStation;
    }

    public int getMaxRStation() {
        return maxRStation;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public int getMaxVolume() {
        return maxVolume;
    }

    public int getMinVolume() {
        return minVolume;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }


    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume < getMinVolume()) {
            newCurrentVolume = getMinVolume();
        }
        if (newCurrentVolume > getMaxVolume()) {
            newCurrentVolume = getMaxVolume();
        }
        currentVolume = newCurrentVolume;
    }


    public void setCurrentStation(int newCurrentStation) {
        if (newCurrentStation < getMinRStation()) {
            newCurrentStation = getMaxRStation();
        }
        if (newCurrentStation > getMaxRStation()) {
            newCurrentStation = getMinRStation();
        }
        currentStation = newCurrentStation;
    }


    public void increaseVolume() {
        if (currentVolume < maxVolume) {
            currentVolume = currentVolume + 1;
        }
    }

    public void reductionVolume() {
        if (currentVolume < maxVolume) {
            currentVolume = currentVolume - 1;
        }
    }


    public void increaseStation() {
        if (currentStation == getMaxRStation()) {
            setCurrentStation(getMinRStation());
        } else {
            currentStation++;

        }
    }

    public void reductionStation() {
        if (currentStation == getMinRStation()) {
            setCurrentStation(getMaxRStation());
        } else {
            currentStation--;

        }
    }
}