package dev.nidhi.OOPS.Interfaces;

public class Client {
    public static void main(String[] args) {
        BoseMusicSystem boseMusicSystem = new BoseMusicSystem();
        SonyMusicSystem sonyMusicSystem = new SonyMusicSystem();

        Car c = new Car(sonyMusicSystem);
        c.playMusic();
    }
}
