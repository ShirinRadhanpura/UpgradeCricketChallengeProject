# UpgradeCricketChallengeProject

This project is created to support prediction of ODI Cricket Match 
1.	Winner of the series
2.	Series output
3.	Highest run scorer
4.	Highest wicket-taker
5.	Maximum sixes
6.	Maximum fours

## Data Selection
Data for the prediction of matches taken from [ESPNcricinfo] (http://stats.espncricinfo.com/australia-v-india-2014-15/engine/records/index.html?id=2;id=6;type=headtohead)

We have collected data for matches played between India vs Australia in excel sheet and stored required field data in ArrayList Data structure.


##Installation
Please run Cricket.java file.

##Output
As we have taken the static data (Historic data) output would be same (No User input required)
Below is the output from our analysis:
Total Matches Played : 31
Total Matches with results : 26
Matches won by India : 15
Matches Won by Australia : 11
*****India should win : 3 matches****
*****Australia should win : 2 matches****
******Below are the favourable batsmen based on historic data
Virat Kohli	 with total runs scored 	1335 with the average of 51.34
RG Sharma	 with total runs scored 	1778 with the average of 65.85
GJ Bailey	 with total runs scored 	710 with the average of 71.0
JP Faulkner	 with total runs scored 	327 with the average of 54.5
SPD Smith	 with total runs scored 	609 with the average of 50.75
******Below are the favourable batsmen who can hit most boundaries
MS Dhoni	 with total Fours : 	101 with the average of 45.52
Virat Kohli	 with total Fours : 	118 with the average of 51.34
RG Sharma	 with total Fours : 	141 with the average of 65.85
******Below are the favourable batsmen who can hit most sixes
MS Dhoni	 with total sixes : 	30 with the average of 45.52
RG Sharma	 with total sixes : 	66 with the average of 65.85
GJ Maxwell	 with total sixes : 	29 with the average of 37.68
******Below are the favourable bowler who can take most wickets
I Sharma	 with total wickets : 	26
UT Yadav	 with total wickets : 	21
MG Johnson	 with total wickets : 	43

##Analysis##
as per above output we have below result
1.	Winner of the series
*****India should win : 3 matches****
*****Australia should win : 2 matches****
2.	Series output
*****India should win : 3 matches****
*****Australia should win : 2 matches****
3.	Highest run scorer
We have below 5 Batsmen to choose and We are predicting : "Virat Kohli"
Virat Kohli	 with total runs scored 	1335 with the average of 51.34
RG Sharma	 with total runs scored 	1778 with the average of 65.85
GJ Bailey	 with total runs scored 	710 with the average of 71.0
JP Faulkner	 with total runs scored 	327 with the average of 54.5
SPD Smith	 with total runs scored 	609 with the average of 50.75

4.	Highest wicket-taker
I Sharma	 with total wickets : 	26
UT Yadav	 with total wickets : 	21
MG Johnson	 with total wickets : 	43
We are predicting "Umesh Yadav" for highest wicket taker

5.	Maximum sixes
MS Dhoni	 with total sixes : 	30 with the average of 45.52
RG Sharma	 with total sixes : 	66 with the average of 65.85
GJ Maxwell	 with total sixes : 	29 with the average of 37.68
We are predicting "Rohit Sharma" for most sixes.

6.	Maximum fours
MS Dhoni	 with total Fours : 	101 with the average of 45.52
Virat Kohli	 with total Fours : 	118 with the average of 51.34
RG Sharma	 with total Fours : 	141 with the average of 65.85
Here we are predicting "Virat Kohli" for most Fours
