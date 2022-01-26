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
//    public static int startTournament(){
//
//    }

    public static void main(String[] args) {
        SoccerTeam tiger = new SoccerTeam();
        SoccerTeam dolphin = new SoccerTeam();
        SoccerTeam pats = new SoccerTeam();
        SoccerTeam bucaneers = new SoccerTeam();

        startTournament();
        System.out.println("Tournament 1");
        tiger.played(dolphin,6,7);
        dolphin.played(pats,6,6);
        pats.played(bucaneers,9,10);
        bucaneers.played(dolphin,5,4);

        System.out.println("Tigers point:"+tiger.getPoints());
        System.out.println("Pats point:"+pats.getPoints());
        System.out.println("Dolphin point:"+dolphin.getPoints());
        System.out.println("Bucaneers point:"+bucaneers.getPoints());
        System.out.println("Total Games:"+getNumGames());
        System.out.println("Total Goals:"+getNumGoals());

        dolphin.reset();
        tiger.reset();
        bucaneers.reset();
        pats.reset();

        startTournament();

        System.out.println("Tournament 2");

        tiger.played(dolphin,8,7);
        dolphin.played(pats,6,12);
        pats.played(bucaneers,7,10);
        bucaneers.played(dolphin,5,19);

        System.out.println("Tigers point:"+tiger.getPoints());
        System.out.println("Pats point:"+pats.getPoints());
        System.out.println("Dolphin point:"+dolphin.getPoints());
        System.out.println("Bucaneers point:"+bucaneers.getPoints());
        System.out.println("Total Games:"+getNumGames());
        System.out.println("Total Goals:"+getNumGoals());
    }
}
