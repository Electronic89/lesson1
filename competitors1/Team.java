package Lesson_1.Marafon.Competitors;

public class Team {
    private String teamName;
    private Lesson_1.Marafon.competitors.Competitor[] competitors;

    public Team(String teamName, Lesson_1.Marafon.competitors.Competitor... competitors) {

        this.teamName = teamName;
        this.competitors = competitors;
    }

    public Lesson_1.Marafon.competitors.Competitor[] getCompetitors() {
        return competitors;
    }

    public void showResults() {
        System.out.printf("%s info:\n", teamName);
        for (Lesson_1.Marafon.competitors.Competitor competitor : competitors) {
            competitor.info();
        }
    }



}
