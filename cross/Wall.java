package Lesson_1.Marafon.cross;

import Lesson_1.Marafon.competitors.Competitor;
import Lesson_1.Marafon.cross.Obstacle;

public class Wall extends Obstacle {
    int height;

    public Wall(int height) {
        this.height = height;
    }

    @Override
    public void doIt(Competitor competitor) {
        competitor.jump(height);
    }
}