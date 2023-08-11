package ua.hillel.dolhykh.homeworks.homework12.variant2;

public class Main {
    public static void main(String[] args) {
        MusicStyles popBand = new PopMusic();
        MusicStyles rockBand = new RockMusic();
        MusicStyles classicBand = new ClassicMusic();

        for (MusicStyles musicStyle : new MusicStyles[]{popBand, rockBand, classicBand}) {
            musicStyle.playMusic();
        }
    }
}