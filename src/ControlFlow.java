public class ControlFlow {
    public static void main(String[] args){
        drowRectangle();
    }

    public static void drowRectangle() {
        drowLine(); // 윗변
        drowEdge();
        drowLine(); // 밑변
    }

    //직선 그리기
    public static void drowLine(){
        System.out.println("* * * * * *");
    }

    //모서리 점 찍기
    public static void drowEdge(){
        System.out.println("*         *");
    }

}
