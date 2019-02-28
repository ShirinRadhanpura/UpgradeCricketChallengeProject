import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;
import java.util.Map;

import java.util.Queue;
import java.util.Scanner;

class Match {
    public String city; // indicates the city where match was scheduled
    public String country; // indicates the host country
    public String date; // Match Date
    public String winner; // shows which country won : India/Australia/NR (No Result)

    public Match(String date, String city, String country,  String winner) {
        this.date = date;
        this.city = city;
        this.country = country;
        this.winner = winner;
    }
}

class Batsmen {
    public String name;
    public int matchPlayed;
    public int runs;
    public double average;
    public int fours;	//Total 4s hit
    public int sixes;	//Total 6s hit

    public Batsmen(String name, int matchPlayed, int runs, double average,int fours, int sixes) {
        this.name = name;
        this.matchPlayed = matchPlayed;
        this.runs = runs;
        this.average = average;
        this.fours = fours;
        this.sixes = sixes;
    }
}

class Bowler {
    public String name;
    public int matchPlayed;
    public int wickets; // total wickets taken
    public double average; // Average shows at after how many runs bowler takes the wicket(lesser the better)
    public double economy;	//per over runs


    public Bowler(String name, int matchPlayed, int wickets, double average,double economy) {
        this.name = name;
        this.matchPlayed = matchPlayed;
        this.wickets = wickets;
        this.average = average;
        this.economy = economy;
    }
}

public class Cricket {

    public void MatchWinner(ArrayList<Match> matches) throws Exception {
        int indCount = 0;
        int ausCount = 0;
        int total = 0;		//Counting matches with results only
        for(int i = 0 ; i<matches.size(); i++)
        {

            if(matches.get(i).winner.equalsIgnoreCase("India"))
            {
                indCount++;	//taking Indian winning count
                total++;
            }
            if(matches.get(i).winner.equalsIgnoreCase("Australia"))
            {
                ausCount++;	//taking Australian winning count
                total++;
            }
        }
        System.out.println("Total Matches Played : " + matches.size());
        System.out.println("Total Matches with results : " + total);
        System.out.println("Matches won by India : " + indCount);
        System.out.println("Matches Won by Australia : " + ausCount);

        //Now we are taking winning Ratio
        int matchRate = total/5;
        System.out.println("*****India should win : " + indCount/matchRate + " matches****");
        System.out.println("*****Australia should win : " + ausCount/matchRate + " matches****");

    }


    public void highestRunScorer(ArrayList<Batsmen> batsmen) throws Exception {
        System.out.println("******Below are the favourable batsmen based on historic data");
        for(int i = 0 ; i<batsmen.size(); i++)
        {

            if(batsmen.get(i).matchPlayed > 10 && batsmen.get(i).average > 50)
            {
                System.out.println(batsmen.get(i).name  +"\t with total runs scored \t" + batsmen.get(i).runs + " with the average of " + batsmen.get(i).average);
            }
        }

    }

    public void highest4Hitter(ArrayList<Batsmen> batsmen) throws Exception {
        System.out.println("******Below are the favourable batsmen who can hit most boundaries");
        for(int i = 0 ; i<batsmen.size(); i++)
        {

            if(batsmen.get(i).matchPlayed > 10 && batsmen.get(i).fours > 100)
            {
                System.out.println(batsmen.get(i).name  +"\t with total Fours : \t" + batsmen.get(i).fours + " with the average of " + batsmen.get(i).average);
            }
        }

    }

    public void highest6Hitter(ArrayList<Batsmen> batsmen) throws Exception {
        System.out.println("******Below are the favourable batsmen who can hit most sixes");
        for(int i = 0 ; i<batsmen.size(); i++)
        {

            if(batsmen.get(i).matchPlayed > 10 && batsmen.get(i).sixes > 20)
            {
                System.out.println(batsmen.get(i).name  +"\t with total sixes : \t" + batsmen.get(i).sixes + " with the average of " + batsmen.get(i).average);
            }
        }

    }


    public void highestWicketTaker(ArrayList<Bowler> bowler) throws Exception {
        System.out.println("******Below are the favourable bowler who can take most wickets");
        for(int i = 0 ; i<bowler.size(); i++)
        {

            if(bowler.get(i).matchPlayed > 5 && bowler.get(i).wickets > 20)
            {
                System.out.println(bowler.get(i).name  +"\t with total wickets : \t" + bowler.get(i).wickets );
            }
        }

    }


    public static void main(String[] args) throws Exception {
        Cricket cricket = new Cricket();

        ArrayList<Match> matches = new ArrayList<Match>();
        /*
         * Below data has been taken from espncricinfo site
         * http://stats.espncricinfo.com/australia-v-india-2014-15/engine/records/team/match_results.html?class=2;id=2;id=6;type=headtohead
         *
         */
        matches.add(new Match("10/17/2010","Kochi","India","NR"));
        matches.add(new Match("10/20/2010","Visakhapatnam","India","India"));
        matches.add(new Match("10/24/2010","Margao","India","NR"));
        matches.add(new Match("3/24/2011","Ahmedabad","India","India"));
        matches.add(new Match("2/5/2012","Melbourne","Australia","Australia"));
        matches.add(new Match("2/12/2012","Adelaide","Australia","India"));
        matches.add(new Match("2/19/2012","Brisbane","Australia","Australia"));
        matches.add(new Match("2/26/2012","Sydney","Australia","Australia"));
        matches.add(new Match("10/13/2013","Pune","India","Australia"));
        matches.add(new Match("10/16/2013","Jaipur","India","India"));
        matches.add(new Match("10/19/2013","Mohali","India","Australia"));
        matches.add(new Match("10/23/2013","Ranchi","India","NR"));
        matches.add(new Match("10/26/2013","Cuttack","India","abandoned"));
        matches.add(new Match("10/30/2013","Nagpur","India","India"));
        matches.add(new Match("11/2/2013","Bengaluru","India","India"));
        matches.add(new Match("1/18/2015","Melbourne","Australia","Australia"));
        matches.add(new Match("1/26/2015","Sydney","Australia","NR"));
        matches.add(new Match("3/26/2015","Sydney","Australia","India"));
        matches.add(new Match("1/12/2016","Perth","Australia","Australia"));
        matches.add(new Match("1/15/2016","Brisbane","Australia","India"));
        matches.add(new Match("1/17/2016","Melbourne","Australia","Australia"));
        matches.add(new Match("1/20/2016","Canberra","Australia","Australia"));
        matches.add(new Match("1/23/2016","Sydney","Australia","India"));
        matches.add(new Match("9/17/2017","Chennai","India","India"));
        matches.add(new Match("9/21/2017","Kolkata","India","India"));
        matches.add(new Match("9/24/2017","Indore","India","India"));
        matches.add(new Match("9/28/2017","Bengaluru","India","Australia"));
        matches.add(new Match("10/1/2017","Nagpur","India","India"));
        matches.add(new Match("1/12/2019","Sydney","Australia","Australia"));
        matches.add(new Match("1/15/2019","Adelaide","Australia","India"));
        matches.add(new Match("1/18/2019","Melbourne","Australia","India"));

        cricket.MatchWinner(matches);

        ArrayList<Batsmen> batsmen = new ArrayList<Batsmen>();
        /*
         * Below data has been taken from espncricinfo site
         * http://stats.espncricinfo.com/australia-v-india-2014-15/engine/records/averages/batting.html?class=2;current=4;id=2;id=6;team=6;type=headtohead
         * http://stats.espncricinfo.com/australia-v-india-2014-15/engine/records/averages/batting.html?class=2;current=4;id=2;id=6;team=2;type=headtohead
         */
        batsmen.add(new Batsmen("KK Ahmed",1,0,0,0,0));
        batsmen.add(new Batsmen("R Ashwin",15,85,14.16,5,0));
        batsmen.add(new Batsmen("JJ Bumrah",5,10,0,2,0));
        batsmen.add(new Batsmen("YS Chahal",5,1,1,0,0));
        batsmen.add(new Batsmen("R Dhawan",3,12,12,1,0));
        batsmen.add(new Batsmen("S Dhawan",18,681,40.05,83,6));
        batsmen.add(new Batsmen("MS Dhoni",51,1548,45.52,101,30));
        batsmen.add(new Batsmen("Gurkeerat Singh",3,13,6.5,2,0));
        batsmen.add(new Batsmen("RA Jadeja",26,231,17.76,17,0));
        batsmen.add(new Batsmen("KM Jadhav",6,199,49.75,22,2));
        batsmen.add(new Batsmen("KD Karthik",4,37,18.5,2,0));
        batsmen.add(new Batsmen("Virat Kohli",31,1335,51.34,118,15));
        batsmen.add(new Batsmen("Kuldeep Yadav",6,3,1.5,0,0));
        batsmen.add(new Batsmen("B Kumar",15,111,22.2,12,0));
        batsmen.add(new Batsmen("Mohammed Shami",10,10,10,1,0));
        batsmen.add(new Batsmen("Mohammed Siraj",1,0,0,0,0));
        batsmen.add(new Batsmen("MK Pandey",8,193,48.25,20,2));
        batsmen.add(new Batsmen("HH Pandya",5,222,55.5,13,12));
        batsmen.add(new Batsmen("AR Patel",4,5,2.5,0,0));
        batsmen.add(new Batsmen("AM Rahane",12,469,46.9,45,3));
        batsmen.add(new Batsmen("SK Raina",25,537,31.58,45,11));
        batsmen.add(new Batsmen("AT Rayudu",3,47,15.66,4,1));
        batsmen.add(new Batsmen("V Shankar",1,0,0,0,0));
        batsmen.add(new Batsmen("I Sharma",18,9,4.5,0,0));
        batsmen.add(new Batsmen("MM Sharma",1,0,0,0,0));
        batsmen.add(new Batsmen("RG Sharma",31,1778,65.85,141,66));
        batsmen.add(new Batsmen("BB Sran",3,0,0,0,0));
        batsmen.add(new Batsmen("UT Yadav",11,10,5,1,0));
        batsmen.add(new Batsmen("AC Agar",2,9,9,1,0));
        batsmen.add(new Batsmen("GJ Bailey",13,710,71,58,18));
        batsmen.add(new Batsmen("JP Behrendorff",2,1,0,0,0));
        batsmen.add(new Batsmen("SM Boland",4,0,0,0,0));
        batsmen.add(new Batsmen("AT Carey",3,47,15.66,8,0));
        batsmen.add(new Batsmen("HWR Cartwright",2,2,1,0,0));
        batsmen.add(new Batsmen("MJ Clarke",30,858,39,68,6));
        batsmen.add(new Batsmen("NM Coulter0Nile",6,13,3.25,0,0));
        batsmen.add(new Batsmen("PJ Cummins",6,11,5.5,1,0));
        batsmen.add(new Batsmen("JP Faulkner",16,327,54.5,21,16));
        batsmen.add(new Batsmen("AJ Finch",20,856,45.05,88,18));
        batsmen.add(new Batsmen("BJ Haddin",19,425,35.41,39,11));
        batsmen.add(new Batsmen("PSP Handscomb",6,210,35,13,3));
        batsmen.add(new Batsmen("JW Hastings",5,2,0,0,0));
        batsmen.add(new Batsmen("JR Hazlewood",3,0,0,0,0));
        batsmen.add(new Batsmen("TM Head",5,119,23.8,10,1));
        batsmen.add(new Batsmen("MG Johnson",27,171,21.37,14,5));
        batsmen.add(new Batsmen("UT Khawaja",3,114,38,11,0));
        batsmen.add(new Batsmen("NM Lyon",4,12,0,1,1));
        batsmen.add(new Batsmen("MR Marsh",5,164,82,15,2));
        batsmen.add(new Batsmen("SE Marsh",11,508,46.18,39,6));
        batsmen.add(new Batsmen("GJ Maxwell",19,603,37.68,53,29));
        batsmen.add(new Batsmen("JS Paris",2,0,0,0,0));
        batsmen.add(new Batsmen("JA Richardson",3,18,9,1,0));
        batsmen.add(new Batsmen("KW Richardson",6,0,0,0,0));
        batsmen.add(new Batsmen("PM Siddle",8,14,4.66,1,0));
        batsmen.add(new Batsmen("SPD Smith",14,609,50.75,58,7));
        batsmen.add(new Batsmen("B Stanlake",1,0,0,0,0));
        batsmen.add(new Batsmen("MA Starc",7,0,0,0,0));
        batsmen.add(new Batsmen("MP Stoinis",8,239,59.75,18,8));
        batsmen.add(new Batsmen("MS Wade",13,260,26,12,6));
        batsmen.add(new Batsmen("DA Warner",15,636,45.42,63,11));
        batsmen.add(new Batsmen("SR Watson",19,717,37.73,89,19));
        batsmen.add(new Batsmen("A Zampa",4,13,13,0,0));

        cricket.highestRunScorer(batsmen);
        cricket.highest4Hitter(batsmen);
        cricket.highest6Hitter(batsmen);

        ArrayList<Bowler> bowler = new ArrayList<Bowler>();
        /*
         * Below data has been taken from espncricinfo site
         * http://stats.espncricinfo.com/australia-v-india-2014-15/engine/records/averages/bowling.html?class=2;current=4;id=2;id=6;team=6;type=headtohead
         * http://stats.espncricinfo.com/australia-v-india-2014-15/engine/records/averages/bowling.html?class=2;current=4;id=2;id=6;team=2;type=headtohead
         */
        bowler.add(new Bowler("KK Ahmed",1,0,0,6.87));
        bowler.add(new Bowler("R Ashwin",15,16,49.06,5.77));
        bowler.add(new Bowler("JJ Bumrah",5,7,28.85,4.92));
        bowler.add(new Bowler("YS Chahal",5,12,17.83,4.97));
        bowler.add(new Bowler("R Dhawan",3,1,160,6.4));
        bowler.add(new Bowler("S Dhawan",18,0,0,0));
        bowler.add(new Bowler("MS Dhoni",51,0,0,0));
        bowler.add(new Bowler("Gurkeerat Singh",3,0,0,6.8));
        bowler.add(new Bowler("RA Jadeja",26,20,58.1,5.37));
        bowler.add(new Bowler("KM Jadhav",6,2,60.5,5.26));
        bowler.add(new Bowler("KD Karthik",4,0,0,0));
        bowler.add(new Bowler("V Kohli",31,0,0,8.2));
        bowler.add(new Bowler("Kuldeep Yadav",6,9,36.66,6.11));
        bowler.add(new Bowler("B Kumar",15,16,40.87,5.19));
        bowler.add(new Bowler("Mohammed Shami",10,13,37.3,5.91));
        bowler.add(new Bowler("Mohammed Siraj",1,0,0,7.6));
        bowler.add(new Bowler("MK Pandey",8,0,0,0));
        bowler.add(new Bowler("HH Pandya",5,6,31.33,6.06));
        bowler.add(new Bowler("AR Patel",4,4,37.25,4.96));
        bowler.add(new Bowler("AM Rahane",12,0,0,0));
        bowler.add(new Bowler("SK Raina",25,2,100.5,5.58));
        bowler.add(new Bowler("AT Rayudu",3,0,0,6.5));
        bowler.add(new Bowler("V Shankar",1,0,0,3.83));
        bowler.add(new Bowler("I Sharma",18,26,31.38,5.92));
        bowler.add(new Bowler("MM Sharma",1,2,37.5,7.5));
        bowler.add(new Bowler("RG Sharma",31,2,32.5,7.22));
        bowler.add(new Bowler("BB Sran",3,3,56.66,6.45));
        bowler.add(new Bowler("UT Yadav",11,21,32.23,6.78));
        bowler.add(new Bowler("AC Agar",2,2,62.5,6.57));
        bowler.add(new Bowler("GJ Bailey",13,0,0,0));
        bowler.add(new Bowler("JP Behrendorff",2,3,30.33,4.96));
        bowler.add(new Bowler("SM Boland",4,1,259,6.64));
        bowler.add(new Bowler("AT Carey",3,0,0,0));
        bowler.add(new Bowler("HWR Cartwright",2,0,0,0));
        bowler.add(new Bowler("MJ Clarke",30,15,28.66,5.24));
        bowler.add(new Bowler("NM Coulter0Nile",6,10,33.1,5.61));
        bowler.add(new Bowler("PJ Cummins",6,4,68,4.77));
        bowler.add(new Bowler("JP Faulkner",16,17,49.23,6.57));
        bowler.add(new Bowler("AJ Finch",20,2,21,4.75));
        bowler.add(new Bowler("BJ Haddin",19,0,0,0));
        bowler.add(new Bowler("PSP Handscomb",6,0,0,0));
        bowler.add(new Bowler("JW Hastings",5,12,21.58,5.39));
        bowler.add(new Bowler("JR Hazlewood",3,2,53.5,4.28));
        bowler.add(new Bowler("TM Head",5,0,0,6.21));
        bowler.add(new Bowler("MG Johnson",27,43,26.06,5.08));
        bowler.add(new Bowler("UT Khawaja",3,0,0,0));
        bowler.add(new Bowler("NM Lyon",4,1,243,6.39));
        bowler.add(new Bowler("MR Marsh",5,4,54.5,6.6));
        bowler.add(new Bowler("SE Marsh",11,0,0,0));
        bowler.add(new Bowler("GJ Maxwell",19,2,157,6.09));
        bowler.add(new Bowler("JS Paris",2,1,93,5.81));
        bowler.add(new Bowler("JA Richardson",3,6,18.66,3.73));
        bowler.add(new Bowler("KW Richardson",6,13,25.76,5.89));
        bowler.add(new Bowler("PM Siddle",8,4,82,5.55));
        bowler.add(new Bowler("SPD Smith",14,0,0,8.42));
        bowler.add(new Bowler("B Stanlake",1,0,0,4.9));
        bowler.add(new Bowler("MA Starc",7,12,20.91,4.67));
        bowler.add(new Bowler("MP Stoinis",8,6,64.5,6.03));
        bowler.add(new Bowler("MS Wade",13,0,0,0));
        bowler.add(new Bowler("DA Warner",15,0,0,0));
        bowler.add(new Bowler("SR Watson",19,17,35.58,5.79));
        bowler.add(new Bowler("A Zampa",4,4,55.5,6));

        cricket.highestWicketTaker(bowler);

    }

}
