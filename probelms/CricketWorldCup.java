public class CricketWorldCup {
    public static void main(String[] args) {
        Team[] team = new Team[4];
        team[0] = new Team("Bangladesh", "Shakib");
        team[1] = new Team("India", "Rohit");
        team[2] = new Team("England", "Buttler");
        team[3] = new Team("New Zealand", "Williamson");
        Match[] m= new Match[6];
        m[0] = new Match(team[0],team[1]);
        m[0].updateResult(320, 240);

        m[1] = new Match(team[2],team[3]);
        m[1].updateResult(220, 220);

        m[2] = new Match(team[1],team[3]);
        m[2].updateResult(350, 355);

        m[3] = new Match(team[2],team[0]);
        m[3].updateResult(280, 280);

        m[4] = new Match(team[0],team[3]);
        m[4].updateResult(267, 265);

        m[5] = new Match(team[1],team[2]);
        m[5].updateResult(239, 280);

        System.out.println("point table");
        System.out.println("Team name|Captain name|Total Match|Points");
        for (int i = 0; i < team.length; i++) {
            System.out.println(team[i].getCountry()+ "|"+ team[i].getCaptain_name()+"|"+team[i].getTotal_match()+"|"+team[i].getpoint());   
        }
    }

}
class Team{
    private String Country;
    private String Captain_name;
    private int point=0;
    private int Total_match=0;
    public String getCountry(){
        return Country;
    }
    public void setCountry(String Country){
        this.Country=Country;
    }
    public String getCaptain_name(){
        return Captain_name;
    }
    public void setCaptain_name(String Captain_name){
        this.Captain_name=Captain_name;
    }
    public int getpoint(){
        return point;
    }
    public void setpoint(int point){
        this.point=point;
    }
    public int getTotal_match(){
        return Total_match;
    }
    public void setTotal_match(int Total_match){
        this.Total_match=Total_match;
    }

    public Team(String Country, String Captain_name){
        this.Country=Country;
        this.Captain_name=Captain_name;
    }
    
    public void updateResult(int result){
        if (result==0) {
            point+=1;
        }
        else if(result==1){
            point+=3;
        }
        
    }
    public void play(){
        Total_match++;
    }
}
class Match{
    private Team teamA;
    private Team teamB;
    public Team getteamA(){
        return teamA;
    }
    public void setteamA(Team teamA){
        this.teamA=teamA;
    }
    public Team getteamB(){
        return teamB;
    }
    public void setteamB(Team teamB){
        this.teamB=teamB;
    }
    public Match(Team teamA,Team teamB){
        this.teamA=teamA;
        this.teamB=teamB;
    }
    int result;
    public void updateResult(int runsA, int runsB){
        teamA.play();
        teamB.play();
        if (runsA>runsB) {
            teamA.updateResult(1);
            teamB.updateResult(2);
        }
        else if (runsA==runsB) {
            teamA.updateResult(0);
            teamB.updateResult(0);
        }
        else if (runsA<runsB) {
            teamA.updateResult(2);
            teamB.updateResult(1);
        }
    }
    
}