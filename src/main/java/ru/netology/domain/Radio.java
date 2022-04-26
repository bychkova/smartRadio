package ru.netology.domain;

public class Radio {
    private int station;
    private int volume;
    private int stationsAmount = 10;
    private int minStation = 0;
    private int minVolume = 0;
    private int maxVolume = 100;

    public Radio (int stationsAmount){
        this.stationsAmount = stationsAmount;
    }

    public Radio (){
    }

    public int getStation() {
        return station;
    }

    public void setStation(int station) {
        if (station < minStation) {
            return;
        }
        if (station > stationsAmount) {
            return;
        }
        this.station = station;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        if (volume < minVolume) {
            return;
        }
        if (volume > maxVolume) {
            return;
        }
        this.volume = volume;
    }

    public void nextStation() {
        if (station == (stationsAmount - 1)) {
            setStation(minStation);
        } else {
            setStation(station + 1);
        }
    }

    public void prevStation() {
        if (station == minStation) {
            setStation(stationsAmount - 1);
        } else {
            setStation(station - 1);
        }
    }

    public void increaseVolume() {
        if (volume < maxVolume) {
            setVolume(volume + 1);
        } else {
            setVolume(volume);
        }
    }

    public void decreaseVolume() {
        if (volume > minVolume) {
            setVolume(volume - 1);
        } else {
            setVolume(volume);
        }
    }
}