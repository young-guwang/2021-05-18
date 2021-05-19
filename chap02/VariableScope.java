public class VariableScope {
    int outVar;
    // static int outVar ; // 멤버필드 = 전역변수(클래스 내의 어디서든지 활동)
                 // 전역변수는 초기값을 주지 않아도 기본값이 할당
    public static void main(String[] args) {
        int var1; // 메인메소드 전역에서 활동
        if(true){
            int var2; // 이 if문 내에서만 활동
            var1 = 10;
            var2 = 20;
        }
        System.out.println("var1:" + var1);
        // System.out.println("var2:" + var2);

        for(int i = 0; i<1; i++){ // i의 영역 : 이 for문 내에서만 활동
            int var3 = 30;
            var1 = 100;
        }
        System.out.println("var1:" + var1 );
        // System.out.println("outVar:" + outVar );
        System.out.println("outVar:" + new VariableScope().outVar);
        

    }
    
}
