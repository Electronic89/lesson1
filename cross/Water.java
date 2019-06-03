package Lesson_1.Marafon.Cross;

public class Water extends Lesson_1.Marafon.Cross.Obstacle
{
    private int dist;

    public Water(int dist)
    {
        this.dist = dist;
    }

    @Override
    public void doIt(Lesson_1.Marafon.competitors.Competitor competitor)
    {
        competitor.swim(dist);
    }
}