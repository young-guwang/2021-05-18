public class IntType {
    public static void main(String[] args) {
        int pay = 7_500_000;
        long total = 127_556_777L;

        // int hab = pay + total;
        long hab = pay + total;
        System.out.println(hab);
        System.out.println(1.3 + 2.78); // 4.08 기대
        System.out.println(3.4 + 78); // 81.4 기대
        byte a = 10;
        byte b = 30;
        System.out.println(a+b);
        byte c = 30 + 40;
        System.out.println(c);
        
        // ----------- 문제 
        int apple = 1;
        double pieceUnit = 0.1;
        int number = 7;
        double res = apple - (pieceUnit * number); 
        System.out.println(res); // 기대 0.3
        
        // 0.3으로 떨어지게 하려면
        int orange = 1;
        int totalPiece = orange * 10;
        int num = 7;
        int temp = totalPiece - num;
        double result = temp / 10.0;
        System.out.println(result); // 기대 0.3
        // -------------------
        // System.out.println(5/0); // divide by zero(0) 에러
        System.out.println(5/0.0); //  Infinity
    }
}
