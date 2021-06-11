import java.util.Scanner;
public class RSPGame {
    public static void main(String[] args){
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("-----------------가위바위보 게임-------------------");
            System.out.println("가위(0), 바위(1), 보(2) 중에 입력하세요.");
            System.out.print("입력: ");
            int user = sc.nextInt();

            // 유저
            if (user == 0) {
                System.out.println("Player : 가위");
            } else if (user == 1) {
                System.out.println("Player : 바위");
            } else if (user == 2) {
                System.out.println("Player : 보");
            } else {
                System.out.println("값을 잘못 입력하셨습니다.");
                System.out.println("게임을 다시 시작해 주십시오.");
                break;

            }

            //컴퓨터
            int com = (int) (Math.random() * 3);

            if (com == 0) {
                System.out.println("Computer : 가위");
            } else if (com == 1) {
                System.out.println("Computer : 바위");
            } else if (com == 2) {
                System.out.println("Computer : 보");
            } else if (user > 2) {
                break;
            }

            if (com - user == -2 || com - user == 1) {
                System.out.println("Player LOSE... ");
            } else if (com - user == -1 || com - user == 2) {
                System.out.println("Player VICTORY !! ");
            } else if (com == user) {
                System.out.println("-- DRAW --");
            } else if (user > 2) {
                break;
            }
        }

    }
}
