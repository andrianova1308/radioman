package ru.netology;

public class Radioman {

    private int currentNumberStantion;
    private int currentVolume;
    private int maxStation;


    public  Radioman(){
        maxStation = 9;
    }


    public Radioman(int stationsCount) {
        maxStation = stationsCount -1;

    }

    public int getCurrentNumberStantion() {
        int currentNumberStantion = this.currentNumberStantion;
        return currentNumberStantion;
    }

    public int getCurrentVolume() {

        return currentVolume;
    }

    public void setCurrentNumberStantion(int currentNumber){
        if (currentNumber > maxStation) {
            return;
        }
        if (currentNumber < 0) {
            return;
        }
        currentNumberStantion=currentNumber;
    }
    public void setCurrentVolume(int tempcurrentVolume){
        if (tempcurrentVolume > 100) {
            return;
        }
        if (tempcurrentVolume < 0) {
            return;
        }
        currentVolume=tempcurrentVolume;
    }

    public void setNumberStationNext() {
        if (currentNumberStantion < maxStation) {
            currentNumberStantion = currentNumberStantion + 1;
            return;
        }
        currentNumberStantion = 0;
    }

    public void setNumberStationPrev() {
        if (currentNumberStantion > 0) {
            currentNumberStantion = currentNumberStantion - 1;
            return;
        }
        currentNumberStantion = maxStation;
    }

    public void increaseVolume() {
        if (currentVolume < 100) {
            currentVolume = currentVolume + 1;
        }
        return;
    }

    public void decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
        return;
    }

}