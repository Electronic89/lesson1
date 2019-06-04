/*
Харионовский Евгений 
1. Разобраться с имеющимся кодом;
2. Добавить класс Team, который будет содержать название команды, массив из четырех участников (в конструкторе можно сразу указыватьвсех участников ), метод для вывода информации о членах команды, прошедших дистанцию, метод вывода информации обо всех членах команды.
3. Добавить класс Course (полоса препятствий), в котором будут находиться массив препятствий и метод, который будет просить команду пройти всю полосу;
В итоге должно быть что-то вроде:

public static void main(String[] args) {
Course c = new Course(...); // Создаем полосу препятствий
Team team = new Team(...); // Создаем команду
c.doIt(team); // Просим команду пройти полосу
team.showResults(); // Показываем результаты
}
*/

package Lesson_1.Marafon;

import Lesson_1.Marafon.Competitors.Cat;
import Lesson_1.Marafon.Competitors.Dog;
import Lesson_1.Marafon.Competitors.Human;
import Lesson_1.Marafon.Cross.Cross;
import Lesson_1.Marafon.Cross.Wall;
import Lesson_1.Marafon.lesson1.git.cross.Course;

public class Main {
    public static void main(String[] args) {
        Course c = new Course(new Cross(500), new Wall(2), new Lesson_1.Marafon.Cross.Water(5));

        Lesson_1.Marafon.Competitors.Team team1 = new Lesson_1.Marafon.Competitors.Team("Команда А", new Human("Гена"),
                new Dog("Тузик"), new Dog("Ритузик"));

        Lesson_1.Marafon.Competitors.Team team2 = new Lesson_1.Marafon.Competitors.Team("Команда Б", new Human("Валера"), new Cat("Васька"),
                 new Dog("Уран"));


        c.doIt(team1);
        System.out.println();
        c.doIt(team2);

        System.out.println();
        team1.showResults();
        System.out.println();
        team2.showResults();
    }
    }
