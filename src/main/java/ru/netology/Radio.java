package ru.netology;

public class Radio {
    private int volume;
    private int numberStation;

    void next() {
        if (numberStation == 9) {
            numberStation = 0;
        } else {
            numberStation = numberStation + 1;
        }
    }

    void prev() {
        if (numberStation == 0) {
            numberStation = 9;
        } else {
            numberStation = numberStation - 1;
        }
    }

    public void setNumberStation(int numberStation) {
        if (numberStation >= 0 && numberStation <= 9) {
            this.numberStation = numberStation;
        }
    }

    public int getNumberStation() {
        return numberStation;
    }

    public void increaseVolume() {
        if (volume < 10) {
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
}
