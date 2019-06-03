package Lesson_1.Marafon;

import Lesson_1.Marafon.competitors.Cat;
import Lesson_1.Marafon.competitors.Competitor;
import Lesson_1.Marafon.competitors.Dog;
import Lesson_1.Marafon.competitors.Human;
import Lesson_1.Marafon.cross.Cross;
import Lesson_1.Marafon.cross.Obstacle;
import Lesson_1.Marafon.cross.Wall;

public class Main {
    public static void main(String[] args) {
        Competitor[] competitors = {new Human("Боб"), new Cat("Барсик"), new Dog("Бобик")};
        Obstacle[] course = {new Cross(80), new Wall(2), new Wall(1), new Cross(120)};
        for (Competitor c : competitors) {
            for (Obstacle o : course) {
                o.doIt(c);
                if (!c.isOnDistance()) break;
            }
        }
        for (Competitor c : competitors) {
            c.info();
        }
    }
}