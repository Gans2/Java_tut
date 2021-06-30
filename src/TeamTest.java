public class TeamTest {
    public static void main(String[] args){
        //객체 생성
        Player Kim = new Player("Kim", new int[]{9,8,10});
        Player Lee = new Player("Lee", new int[]{10,9,10});
        Player Park = new Player("Park", new int[]{8,10,9});
        Player Ten = new Player("Ten", new int[]{5,7,9});
        Player Yan = new Player("Yan", new int[]{8,5,4});
        Player Men = new Player("Men", new int[]{5,3,7});

        //객체 배열 만들기
        Player[] koreaPlayers = {Kim, Lee, Park};
        Player[] chinaPlayers = {Ten, Yan, Men};

        //팀 객체 생성
        Team korea = new Team("KOREA",koreaPlayers);
        Team china = new Team("CHINA",chinaPlayers);

        //팀 점수 출력
        korea.printTeamPoint();
        china.printTeamPoint();
    }
}

//팀 클래스
class Team{
    String nation;
    Player[] players;

    Team(String str, Player[] arr){
        nation = str;
        players = arr;
    }
void printTeamPoint(){
        int sum = 0;
        for(int i = 0; i<players.length; i++){
            sum += players[i].totalPoints();
        }
        System.out.printf("%s -> %d point\n",nation,sum);
}
}

//선수 클래스
class Player {
    String name;
    int[] points;

    Player (String str, int[] arr){
        name = str;
        points = arr;
    }

    void printTotalPoints(){
        System.out.printf("%s -> %d점\n",name,totalPoints());
    }

    //메소드
    int totalPoints(){
        int sum = 0;
        for(int i = 0; i <points.length; i++){
            sum += points[i];
        }
        return sum;
    }
}