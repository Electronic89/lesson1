package Lesson_1.Marafon.cross;

import Lesson_1.Marafon.competitors.Competitor;
import Lesson_1.Marafon.cross.Obstacle;

public class Water extends Obstacle {
    int length;

    public Water(int length) {
        this.length = length;
    }

    @Override
    public void doIt(Competitor competitor) {
        competitor.swim(length);
    }
}