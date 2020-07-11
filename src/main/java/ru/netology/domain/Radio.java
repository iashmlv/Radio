package ru.netology.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Radio {

    private int currentStation;
    private int currentVolume;
    private int maxStation = 10;
    private int minStation = 0;
    private int maxVolume = 100;
    private int minVolume = 0;

    public void setNextStation() {
        if(currentStation >= maxStation) {
            currentStation = minStation;
            return;
        }
        currentStation += 1;
    }

    public void setPreviousStation() {
        if(currentStation <= minStation) {
            currentStation = maxStation;
            return;
        }
        currentStation -= 1;
    }

    public void increaseVolume() {
        if (currentVolume >= maxVolume) {
            currentVolume = maxVolume;
            return;
        }

        currentVolume += 1;
    }

    public void decreaseVolume() {
        if (currentVolume <= minVolume) {
            currentVolume = minVolume;
            return;
        }

        currentVolume -= 1;
    }

    public Radio(int maxStation) {
        this.maxStation = maxStation;
    }


}
