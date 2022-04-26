package ru.netology.domain;

public class Radio {
    private int station;
    private int volume;
    private int stationsAmount = 10;
    private int minStation = 0;
    private int minVolume = 0;
    private int maxVolume = 100;
    /*т.к. в задании не указано, будем считать, что минимально возможное кол-во станций = 1
                                                    максимально возможное = 50 */
    private int minStationsAmount = 1;
    private int maxStationsAmoumt = 50;

    public Radio(int customStationsAmount) {
        if (customStationsAmount < minStationsAmount) {
            customStationsAmount = stationsAmount;
        }
        if (customStationsAmount > maxStationsAmoumt) {
            customStationsAmount = stationsAmount;
        }
        this.stationsAmount = customStationsAmount;
    }

    public Radio() {
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

    public int getStationsAmount() {
        return stationsAmount;
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