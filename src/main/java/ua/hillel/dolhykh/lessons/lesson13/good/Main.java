package ua.hillel.dolhykh.lessons.lesson13.good;

import ua.hillel.dolhykh.lessons.lesson13.good.obstacle.Obstacle;
import ua.hillel.dolhykh.lessons.lesson13.good.obstacle.ObstaclePool;
import ua.hillel.dolhykh.lessons.lesson13.good.obstacle.ObstacleRoad;
import ua.hillel.dolhykh.lessons.lesson13.good.obstacle.ObstacleWall;
import ua.hillel.dolhykh.lessons.lesson13.good.participant.*;

public class Main {
    public static void main(String[] args) {

//        ParticipantDog dog1 = new ParticipantDog("dog1");
//        ParticipantDog dog2 = new ParticipantDog("dog2");
        ParticipantCat cat1 = new ParticipantCat("cat1");
        ParticipantRabbit rabbit1 = new ParticipantRabbit("rabbit1");
        ParticipantElephant elephant1 = new ParticipantElephant("elephant1");

        ObstaclePool obstaclePool = new ObstaclePool();
        ObstacleWall obstacleWall = new ObstacleWall();
        ObstacleRoad obstacleRoad = new ObstacleRoad();

        Obstacle[] obstacles = {obstaclePool, obstacleWall, obstacleRoad};
        Participant[] participants = {cat1, elephant1, rabbit1};

        for (Obstacle obstacle : obstacles) {
            for (Participant participant : participants) {
                obstacle.start(participant);
            }
        }

        for (int i = 0; i < obstacles.length; i++) {
            for (int j = 0; j < participants.length; j++) {
                Obstacle obstacle = obstacles[i];
                Participant participant = participants[j];
                obstacle.start(participant);
            }
        }
    }
}