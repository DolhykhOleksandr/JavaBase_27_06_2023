package ua.hillel.dolhykh.lessons.lesson13.good.participant;

public abstract class Participant {

    private String name;

    public Participant(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}