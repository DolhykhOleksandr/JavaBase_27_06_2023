package ua.hillel.dolhykh.homeworks.homework12.variant1;

public class Main {
    public static void main(String[] args) {
        MusicStyles[] musicBands = {
                new PopMusic(),
                new RockMusic(),
                new ClassicMusic()
        };

        for (MusicStyles band : musicBands) {
            band.playMusic();
        }
    }
}