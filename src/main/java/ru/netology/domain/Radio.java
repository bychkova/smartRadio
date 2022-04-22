package ru.netology.domain;

public class Radio {
    private int station;
    private int volume;

    public int getStation() {
        return station;
    }

    public void setStation(int station) {
        if (station < 0) {
            return;
        }
        if (station > 9) {
            return;
        }
        this.station = station;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        if (volume < 0) {
            return;
        }
        if (volume > 10) {
            return;
        }
        this.volume = volume;
    }

    public void nextStation() {
        if (station == 9) {
            setStation(0);
        } else {
            setStation(station + 1);
        }
    }

    public void prevStation() {
        if (station == 0) {
            setStation(9);
        } else {
            setStation(station - 1);
        }
    }

    public void increaseVolume() {
        if (volume < 10) {
            setVolume(volume + 1);
        } else {
            setVolume(volume);
        }
    }

    public void decreaseVolume() {
        if (volume > 0) {
            setVolume(volume - 1);
        } else {
            setVolume(volume);
        }
    }
}