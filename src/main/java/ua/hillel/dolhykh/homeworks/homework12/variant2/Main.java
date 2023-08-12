package ua.hillel.dolhykh.homeworks.homework12.variant2;

public class Main {
    public static void main(String[] args) {
        MusicStyles[] musicStyles = {new PopMusic(), new RockMusic(), new ClassicMusic()};

        for (MusicStyles group : musicStyles) {
            group.playMusic();
        }
    }
}
