package Lesson_1.Marafon.Cross;

public class Wall extends Lesson_1.Marafon.Cross.Obstacle
{
    private int height;

    public Wall(int height)
    {
        this.height = height;
    }

    @Override
    public void doIt(Lesson_1.Marafon.competitors.Competitor competitor)
    {
        competitor.jump(height);
    }
}