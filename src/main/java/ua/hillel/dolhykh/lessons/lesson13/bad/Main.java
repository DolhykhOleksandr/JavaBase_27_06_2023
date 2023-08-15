package ua.hillel.dolhykh.lessons.lesson13.bad;

public class Main {
    public static void main(String[] args) {

        ParticipantDog dog1 = new ParticipantDog("dog1");
        ParticipantDog dog2 = new ParticipantDog("dog2");
        ParticipantCat cat1 = new ParticipantCat("cat1");
//        ParticipantRabbit rabbit1 = new ParticipantRabbit("rabbit1");
        ParticipantElephant elephant1 = new ParticipantElephant("elephant1");

        ObstaclePool obstaclePool = new ObstaclePool();
        ObstacleWall obstacleWall = new ObstacleWall();


        obstaclePool.start(dog1);
        obstaclePool.start(dog2);
        obstaclePool.start(cat1);
//        obstaclePool.start(rabbit1);
        obstaclePool.start(elephant1);

        obstacleWall.start(dog1);
        obstacleWall.start(dog2);
        obstacleWall.start(cat1);
//        obstacleWall.start(rabbit1);
        obstacleWall.start(elephant1);


    }
}