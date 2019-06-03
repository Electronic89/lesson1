package Lesson_1.Marafon.lesson1.git.cross;


public class Course {

    private Lesson_1.Marafon.Cross.Obstacle[] obstacles;

    public Course(Lesson_1.Marafon.Cross.Obstacle... obstacles)
    {
        this.obstacles = obstacles;
    }

    public void doIt(Lesson_1.Marafon.Competitors.Team team)
    {
        for (Lesson_1.Marafon.competitors.Competitor c : team.getCompetitors())
        {
            for (Lesson_1.Marafon.Cross.Obstacle o : obstacles)
            {
                o.doIt(c);
                if (!c.isOnDistance()) break;
            }
        }
    }

}


