public class TestClub {
    public static void main(String[] args) {
        Club club1 = new Club();
        Club club2 = new Club("Chelsea", 1, 2, 0);
        Club club3 = new Club(club2); // Copy constructor

        System.out.println("Name: " + club2.getName());
        club2.setName("Arsenal");
        System.out.println("Name after setting: " + club2.getName());

        System.out.println("Wins: " + club2.getWins());
        club2.setWins(2);
        System.out.println("Wins after setting: " + club2.getWins());

        System.out.println("Draws: " + club2.getDraws());
        club2.setDraws(1);
        System.out.println("Draws after setting: " + club2.getDraws());

        System.out.println("Losses: " + club2.getLosses());
        club2.setLosses(1);
        System.out.println("Losses after setting: " + club2.getLosses());

        System.out.println("Number of matches played: " + club2.numMatchesPlayed());
        System.out.println("Has the club finished the league? " + club2.isFinish());
        System.out.println("Points: " + club2.getPoints());

        System.out.println(club2);
        System.out.println(club3);
    }
}
