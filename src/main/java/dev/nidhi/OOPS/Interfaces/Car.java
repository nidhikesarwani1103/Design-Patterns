package dev.nidhi.OOPS.Interfaces;

public class Car {

    //socket to plug in the music system
    //Loose coupling - Car is not dependent on any specific music system
    MusicSystem ms;
    public Car(MusicSystem ms) {
        this.ms = ms;
    }
    public void playMusic(){
        ms.playMusic();
    }
}
