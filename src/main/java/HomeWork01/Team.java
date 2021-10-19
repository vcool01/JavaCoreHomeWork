package HomeWork01;

public  class Team {
    protected String teamName;
    public int countMember = 4;
    protected Player [] memberTeam = new Player[countMember];

    public Team(String name){
        this.teamName = name;
        this.memberTeam[0] = new Player("Оля");
        this.memberTeam[1] = new Player("Вася");
        this.memberTeam[2] = new Player("Глеб");
        this.memberTeam[3] = new Player("Борис");
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String name) {
        this.teamName = name;
    }

    public void passedDistance(Course c){
        System.out.println("Прошли дистанцию из команды " +
                this.getTeamName() + ": ");
        for(int i = 0; i < this.countMember; i++){

            if (c.doIt(this.memberTeam[i])){
                System.out.println(this.memberTeam[i].getName());
//            System.out.println(team1.memberTeam[i].toString());
            }
        }
    }

    public void allMembers(){
        System.out.println(this.getTeamName() + " :");
        for(int i = 0; i < countMember; i++) {
            System.out.println(this.memberTeam[i].toString());
        }
    }
}
