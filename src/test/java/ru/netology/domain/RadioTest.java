package ru.netology.domain;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {
    @Test
    void shouldCreateDefaultRadio() {
        Radio radio = new Radio();

        int actual = radio.getStationsAmount();
        int expected = 10;

        assertEquals(actual, expected);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/dataSetStationsAmount.csv")
    void shouldSetStationsAmount(String testName, int stationsAmount, int expected) {
        Radio radio = new Radio(stationsAmount);

        int actual = radio.getStationsAmount();

        assertEquals(actual, expected);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/dataSetStation.csv")
    void shouldSetStation(String testName, int stationsAmount, int station, int expected) {
        Radio radio = new Radio(stationsAmount);
        radio.setStation(station);

        int actual = radio.getStation();

        assertEquals(actual, expected);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/dataNextStation.csv")
    void shouldNextStation(String testName, int stationsAmount, int station, int expected) {
        Radio radio = new Radio(stationsAmount);
        radio.setStation(station);
        radio.nextStation();

        int actual = radio.getStation();

        assertEquals(actual, expected);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/dataPrevStation.csv")
    void shouldPrevStation(String testName, int stationsAmount, int station, int expected) {
        Radio radio = new Radio(stationsAmount);
        radio.setStation(station);
        radio.prevStation();

        int actual = radio.getStation();

        assertEquals(actual, expected);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/dataSetVolume.csv")
    void shouldSetVolume(String testName, int volume, int expected) {
        Radio radio = new Radio();
        radio.setVolume(volume);

        int actual = radio.getVolume();

        assertEquals(actual, expected);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/dataIncreaseVolume.csv")
    void shouldIncreaseVolume(String testName, int volume, int expected) {
        Radio radio = new Radio();
        radio.setVolume(volume);
        radio.increaseVolume();

        int actual = radio.getVolume();

        assertEquals(actual, expected);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/dataDecreaseVolume.csv")
    void shouldDecreaseVolume(String testName, int volume, int expected) {
        Radio radio = new Radio();
        radio.setVolume(volume);
        radio.decreaseVolume();

        int actual = radio.getVolume();

        assertEquals(actual, expected);
    }
}