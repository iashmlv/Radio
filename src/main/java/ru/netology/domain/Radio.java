package ru.netology.domain;

public class Radio {

    private int currentStation;
    private int currentVolume;
    private int maxStation = 9;
    private int minStation = 0;
    private int maxVolume = 100;
    private int minVolume = 0;

    public Radio(int maxStation) {
        this.maxStation = maxStation;
    }

    public Radio() {

    }

    public void setNextStation() {
        if(currentStation == maxStation) {
            currentStation = minStation;
            return;
        }
        currentStation += 1;
    }

    public void setPreviousStation() {
        if(currentStation == minStation) {
            currentStation = maxStation;
            return;
        }
        currentStation -= 1;
    }

    public void increaseVolume() {
        if (currentVolume == maxVolume) {
            return;
        }

        currentVolume += 1;
    }

    public void decreaseVolume() {
        if (currentVolume == minVolume) {
            return;
        }

        currentVolume -= 1;
    }

    public int getMaxStation() {
        return maxStation;
    }

    public int getMinStation() {
        return minStation;
    }

    public void setMinStation(int minStation) {
        this.minStation = minStation;
    }

    public int getMaxVolume() {
        return maxVolume;
    }

    public void setMaxVolume(int maxVolume) {
        this.maxVolume = maxVolume;
    }

    public int getMinVolume() {
        return minVolume;
    }

    public void setMinVolume(int minVolume) {
        this.minVolume = minVolume;
    }




    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int currentStation) {
        if(currentStation>maxStation){
            return;
        }
        if(currentStation<minStation){
            return;
        }
        this.currentStation = currentStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        this.currentVolume = currentVolume;
    }

}
