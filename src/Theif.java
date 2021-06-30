public class Theif {

    public static void main(String[] args){
        //객체 생성
        Wallet wallet = new Wallet(30000);
        System.out.println(wallet.toString());

        //지갑속 돈 훔치기
        Theif.steal(wallet);

        //지갑확인
        System.out.println(" -> "+ wallet.toString);
    }

    //클래스 메소드
    public static void steal(Wallet target){
        target.money = 0;
    }
}

class Wallet{
   private int money;

    public Wallet(int i){
        money = i;
    }

    //메소드
    public String toString(){
        return String.format("Wallet {money: %d }",money);
    }
}
