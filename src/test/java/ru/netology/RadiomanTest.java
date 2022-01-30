package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadiomanTest {
    @Test
    public void testgetCurrentNumberStantion() {
        Radioman rad = new Radioman();
        int expected = 0;
        int actual;
        actual = rad.getCurrentNumberStantion();

        assertEquals(expected, actual);
    }
    @Test
    public void testsetNumberStationNext() {
        Radioman rad = new Radioman();
        rad.setCurrentNumberStantion(9);
        rad.setNumberStationNext();
        int expected = 0;
        int actual = rad.getCurrentNumberStantion();

        assertEquals(expected, actual);
    }
    @Test
    public void testsetNumberStationNext2() {
        Radioman rad = new Radioman();
        rad.setCurrentNumberStantion(8);
        rad.setNumberStationNext();
        int expected = 9;
        int actual = rad.getCurrentNumberStantion();

        assertEquals(expected, actual);
    }
    @Test
    public void testsetNumberStationPrev() {
        Radioman rad = new Radioman();
        rad.setCurrentNumberStantion(0);
        rad.setNumberStationPrev();
        int expected = 9;
        int actual = rad.getCurrentNumberStantion();

        assertEquals(expected, actual);
    }
    @Test
    public void testsetNumberStationPrev2() {
        Radioman rad = new Radioman();
        rad.setCurrentNumberStantion(7);
        rad.setNumberStationPrev();
        int expected = 6;
        int actual = rad.getCurrentNumberStantion();

        assertEquals(expected, actual);
    }
    @Test
    public void testsetCurrentNumberStantion() {
        Radioman rad = new Radioman();
        rad.setCurrentNumberStantion(8);
        int expected = 8;
        int actual = rad.getCurrentNumberStantion();

        assertEquals(expected, actual);
    }
    @Test
    public void testsetCurrentNumberStantion2() {
        Radioman rad = new Radioman();
        rad.setCurrentNumberStantion(10);
        int expected = 0;
        int actual = rad.getCurrentNumberStantion();

        assertEquals(expected, actual);
    }
    @Test
    public void testsetCurrentNumberStantion3() {
        Radioman rad = new Radioman();
        rad.setCurrentNumberStantion(-1);
        int expected = 0;
        int actual = rad.getCurrentNumberStantion();

        assertEquals(expected, actual);
    }
    @Test
    public void testincreaseVolume1() {
        Radioman rad = new Radioman();
        rad.setCurrentVolume(7);
        rad.increaseVolume();
        int expected = 8;
        int actual = rad.getCurrentVolume();

        assertEquals(expected, actual);
    }
    @Test
    public void testincreaseVolume2() {
        Radioman rad = new Radioman();
        rad.setCurrentVolume(9);
        rad.increaseVolume();
        int expected = 10;
        int actual = rad.getCurrentVolume();

        assertEquals(expected, actual);
    }
    @Test
    public void testincreaseVolume3() {
        Radioman rad = new Radioman();
        rad.setCurrentVolume(10);
        rad.increaseVolume();
        int expected = 10;
        int actual = rad.getCurrentVolume();

        assertEquals(expected, actual);
    }
    @Test
    public void testgetCurrentVolume() {
        Radioman rad = new Radioman();
        rad.setCurrentVolume(8);
        int expected = 8;
        int actual = rad.getCurrentVolume();

        assertEquals(expected, actual);
    }
    @Test
    public void testgetCurrentVolume2() {
        Radioman rad = new Radioman();
        rad.setCurrentVolume(11);
        int expected = 0;
        int actual = rad.getCurrentVolume();

        assertEquals(expected, actual);
    }
    @Test
    public void testgetCurrentVolume3() {
        Radioman rad = new Radioman();
        rad.setCurrentVolume(-1);
        int expected = 0;
        int actual = rad.getCurrentVolume();

        assertEquals(expected, actual);
    }
    @Test
    public void testdecreaseVolume1() {
        Radioman rad = new Radioman();
        rad.setCurrentVolume(10);
        rad.decreaseVolume();
        int expected = 9;
        int actual = rad.getCurrentVolume();

        assertEquals(expected, actual);
    }
    @Test
    public void testdecreaseVolume2() {
        Radioman rad = new Radioman();
        rad.decreaseVolume();
        int expected = 0;
        int actual = rad.getCurrentVolume();

        assertEquals(expected, actual);
    }
}
