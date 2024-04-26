package edu.manaure.javaInitial;

public class Exercise {
        boolean onOrOff = false;
        int canal = 1;
        int volume = 10;


    public void on() {
        onOrOff = true;
    }

    public void off() {
        onOrOff = false;
    }

    public void increaseVolume () {
        volume++;
    }

    public void decreaseVolume () {
        volume--;
    }
}
