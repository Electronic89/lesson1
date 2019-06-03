package Lesson_1.Marafon.Cross;

public class Cross extends Lesson_1.Marafon.Cross.Obstacle
{
    private int dist;

    public Cross(int dist)
    {
        this.dist = dist;
    }

    @Override
    public void doIt(Lesson_1.Marafon.competitors.Competitor competitor)
    {
        competitor.run(dist);
    }
}