import java.util.Scanner;
public class Byeongsin {
    public static void main(String[] args){
        String name;
        int age;

        Scanner sc = new Scanner(System.in);

        System.out.println("이름을 입력하십쇼");
        name = sc.next();

        System.out.println("나이를 입력하십쇼");
        age = sc.nextInt();

        System.out.println("제 이름은 "+name+"입니다.");
        System.out.println("그리고 나이는 "+age+"입니다.");
   }
}
