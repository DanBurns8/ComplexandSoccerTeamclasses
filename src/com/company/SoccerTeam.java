package com.company;

public class SoccerTeam {
    private int tie;
    private int lose;
    private int win;
    private static int numGoals;
    private static int numGames;
    public SoccerTeam(){
        tie=0;
        lose=0;
        win=0;
        numGoals=0;
        numGames=0;
    }
    public void played(SoccerTeam other, int myScore, int otherScore){
        numGames++;
        numGoals=numGoals+myScore+otherScore;
        if(myScore>otherScore){
            win++;
            other.lose++;
        }
        if(myScore<otherScore){
            lose++;
            other.win++;
        }
        if(myScore==otherScore){
            tie++;
            other.tie++;
        }
    }
    public int getPoints(){
        return win*3+tie;
    }
    public void reset(){
        tie=0;
        lose=0;
        win=0;
    }
    public static int getNumGames(){
        return numGames;
    }
    public static int getNumGoals(){
        return numGoals;
    }
    public static void startTournament(){
        numGoals=0;
        numGames=0;
    }

    public static void main(String[] args) {
        SoccerTeam dolphin = new SoccerTeam();
        SoccerTeam tiger = new SoccerTeam();
        SoccerTeam bucaneers = new SoccerTeam();
        SoccerTeam pats = new SoccerTeam();

        startTournament();
        System.out.println("Tournament 1");
        dolphin.played(tiger,5,8);
        tiger.played(bucaneers,8,2);
        pats.played(dolphin,10,14);
        bucaneers.played(pats,3,1);

        System.out.println("Tiger's points are "+tiger.getPoints());
        System.out.println("Pats' points are "+pats.getPoints());
        System.out.println("Dolphin's points are "+dolphin.getPoints());
        System.out.println("Bucaneers' points are "+bucaneers.getPoints());
        System.out.println("Total Games played are "+getNumGames());
        System.out.println("Total Goals scored are "+getNumGoals());

        dolphin.reset();
        tiger.reset();
        bucaneers.reset();
        pats.reset();

        startTournament();

        System.out.println("Tournament 2");

        dolphin.played(tiger,9,4);
        tiger.played(bucaneers,7,12);
        pats.played(dolphin,3,17);
        bucaneers.played(pats,6,9);

        System.out.println("Tiger's points are "+tiger.getPoints());
        System.out.println("Pats' points are "+pats.getPoints());
        System.out.println("Dolphin's point are "+dolphin.getPoints());
        System.out.println("Bucaneers' point are "+bucaneers.getPoints());
        System.out.println("Total Games played are "+getNumGames());
        System.out.println("Total Goals scored are "+getNumGoals());
    }
}
//        Tournament 1
//        Tiger's points are 6
//        Pats' points are 0
//        Dolphin's points are 3
//        Bucaneers' points are 3
//        Total Games played are 4
//        Total Goals scored are 51
//        Tournament 2
//        Tiger's points are 0
//        Pats' points are 3
//        Dolphin's point are 6
//        Bucaneers' point are 3
//        Total Games played are 4
//        Total Goals scored are 67
