package ru.netology;

public class Radio {
    private int volume;
    private int numberStation;
    private int maxStationNumber;
    private int maxVolume = 100;

    void next() {
        if (numberStation == maxStationNumber) {
            numberStation = 0;
        } else {
            numberStation = numberStation + 1;
        }
    }

    void prev() {
        if (numberStation == 0) {
            numberStation = maxStationNumber;
        } else {
            numberStation = numberStation - 1;
        }
    }

    public void setNumberStation(int numberStation) {
        if (numberStation >= 0 && numberStation <= maxStationNumber) {
            this.numberStation = numberStation;
        }
    }

    public int getNumberStation() {
        return numberStation;
    }

    public void increaseVolume() {
        if (volume < maxVolume) {
            volume = volume + 1;
        }
    }

    public void decreaseVolume() {
        if (volume > 0) {
            volume = volume - 1;
        }
    }

    public int getVolume() {
        return volume;
    }

    public Radio(int stationCount) {
        this.maxStationNumber = stationCount - 1;
    }

    public Radio() {
        this.maxStationNumber = 9;
    }

}
