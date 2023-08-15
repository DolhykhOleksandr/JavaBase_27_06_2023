package ua.hillel.dolhykh.lessons.lesson13.bad;

public class ObstaclePool {

    public void start(ParticipantDog dog) {
        System.out.println(dog.getName() + " swim");
    }

    public void start(ParticipantCat cat) {
        System.out.println(cat.getName() + " swim");
    }

//    public void start(ParticipantRabbit rabbit) {
//        System.out.println(rabbit.getName() + " swim");
//    }

    public void start(ParticipantElephant elephant) {
        System.out.println(elephant.getName() + " swim");
    }
}