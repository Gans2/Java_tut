import java.util.Scanner;

public class Money {
    public static void main(String[] args) {
        int[] unit = {50000, 10000, 1000, 500, 100, 50, 10, 1};
        Scanner sc = new Scanner(System.in);
        System.out.println("금액 입력: ");
        int Money = sc.nextInt();
        do {
            if (Money < 0) {
                System.out.println("0보다 큰 금액을 입력하세요.");
               return;

            } else {
                break;
            }
        } while (Money < 0);
        for (int i = 0; i < unit.length; i++) {
            System.out.println(unit[i] + "원 짜리: " + Money / unit[i] + "개");
            Money = Money % unit[i];

        }
    }
}
