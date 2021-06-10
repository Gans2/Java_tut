public class Random {
    public static void main(String[] args){
        //메소드로부터 값을 반환
        int x = rollDiece();

        //결과 출력
        System.out.printf("주사위의 눈 : %d",x);
    }

    //1~6사이의 임의의 정수 반환
    public  static int rollDiece(){
      double r = 6 * Math.random(); //0.0000 ~ 5.9999
        int temp = (int) r; //int 값을 줌으로서 > 0 ~ 5
        int n = temp + 1; // 0 ~ 5 > 1 ~ 6
        return n;
    }
}
