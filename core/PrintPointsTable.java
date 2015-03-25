import java.util.*;
import java.text.*;
class PrintPointsTable
{
    public static void main(String s[])
    {
        List<TeamPoints> teamPositions = new ArrayList<TeamPoints>();
        teamPositions.add(new TeamPoints("India", 4, 2, 1, 1, 5, 0.45));
        teamPositions.add(new TeamPoints("Sri Lanka", 4, 2, 2, 0, 4, 0.32));
        teamPositions.add(new TeamPoints("England", 4, 1, 2, 1, 3, 0.21));
        teamPositions.add(new TeamPoints("Pakistan", 4, 0, 4, 0, 0, -1.4));
        printPointsTable(teamPositions);

    }
    private static void printPointsTable(List<TeamPoints> teamPositions) {
        System.out.println("----------------------------------------------");
        System.out.println("Team           M    W    L    T    P     NRR");
        System.out.println("----------------------------------------------");
        for(TeamPoints tp:teamPositions)
            System.out.println(print(tp));

    }

    public static String print(TeamPoints tp)
    {
        int i;
        String st=tp.team;
        for(i=st.length(); st.length()<15;)
            st+=" ";
        st+=tp.matches+"    ";
        st+=tp.won+"    ";
        st+=tp.loss+"    ";
        st+=tp.tie+"    ";
        st+=tp.points+"    ";
        if(tp.netRunRate<0)
            st+="-";
        else
            st+="+";
        DecimalFormat DForm = new DecimalFormat("0.000");

        st+=DForm.format(Math.abs(tp.netRunRate));
        return st;
    }

}
class TeamPoints {

    String team;
    int matches;
    int won;
    int loss;
    int tie;
    int points;
    double netRunRate;

    public TeamPoints(String team, int matches, int won, int loss, int tie, int points, double netRunRate) {
        super();
        this.team = team;
        this.matches = matches;
        this.won = won;
        this.loss = loss;
        this.tie = tie;
        this.points = points;
        this.netRunRate = netRunRate;
    }

    @Override
    public String toString() {
        return "[" + team + ":" + matches + ":" + won + ":" + loss + ":" + tie + ":" + points + ":" + netRunRate + "]";
    }
}
