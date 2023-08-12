package ua.hillel.dolhykh.homeworks.homework12.variant2;

public class Main {
    public static void main(String[] args) {
        PopMusic popBand = new PopMusic();
        RockMusic rockBand = new RockMusic();
        ClassicMusic classicBand = new ClassicMusic();

        for (MusicStyles musicStyle : new MusicStyles[]{popBand, rockBand, classicBand}) {
            musicStyle.playMusic();
        }
    }
}