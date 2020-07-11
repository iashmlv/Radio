package ru.netology.domain;

public class Radio {

    private int currentStation;
    private int currentVolume;
    private final int maxStation = 9;
    private final int minStation = 0;
    private final int maxVolume = 10;
    private final int minVolume = 0;

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

    public int getMaxStation() {
        return maxStation;
    }

    public int getMinStation() {
        return minStation;
    }

    public int getMaxVolume() {
        return maxVolume;
    }

    public int getMinVolume() {
        return minVolume;
    }


}
