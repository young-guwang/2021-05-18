public class LiteralExample {
    public static void main(String[] args) {
        // TODO 리터럴 연습 
        
        int var1 = 10; // 10 진수
        System.out.println(var1);
        int var2 = 010; // 2진수, 8진수
        System.out.println(var2);
        int var3 = 0x10; // 16진수
        System.out.println(var3);
        char charVar = 'A';
        System.out.println(charVar);
        char hangul = '가';
        System.out.println(hangul);
        String str = "나를사랑한스파이007";
        System.out.println(str);
        long var4 = -200;
        System.out.println(var4);

        int var5 = 0b0110; // 2진수리터럴
        System.out.println(var5);
        
        float var6 = 3.14f; // float타입은 f라는 접미사를 붙여야함
        double var7 = 3.141592;
        long var8 = 1000L; // l리터럴이 없으면 int type 임.
        System.out.println(var6);
        System.out.println(var7);
        System.out.println(var8);

        // byte, short 타입은 잘 사용하지 않음 ==> 자칫하면 오버플로우가 발생

        // 특수 문자(char)  '\b', '\t', '\n, '\f', '\r', '\"', '\'', '\\'
    }
    
}
