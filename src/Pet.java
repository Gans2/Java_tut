public class Pet {
    public static void main(String[] args){
        //dog 객체 생성
        dog d = new dog();

        d.name = "멍무이";
        d.breeds = "리트리버";
        d.age = 3;

        //dog 객체 필드 값 출력
        System.out.printf("이름 : %s\n",d.name);
        System.out.printf("품종 : %s\n",d.breeds);
        System.out.printf("나이 : %s\n",d.age);

        d.wag();
        d.bark();
    }
}

//dog 클래스
class dog {
    //필드 영역
    String name; // 이름
    String breeds; // 품종
    int age; // 나이

    void wag(){
        System.out.println("살랑살랑 꼬리를 칩니다.");
    }

    void bark(){
        System.out.println("멍멍! 개가 짖습니다.");
    }

}
