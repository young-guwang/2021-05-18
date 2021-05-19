public class CharType {
    public static void main(String[] args) {
        // 낱자를 저장할 수 있는타입
        char var1 = '가';
        char var2 = 'A';
        char var3 = '韓';
        char var4 = '★';
        
        System.out.println(""+var1 + var2 + var3 + var4);

        // 응용
        // '가'의 코드 값
        System.out.println(var1 + 0); // 44032
        // 힣 의 코드 값
        System.out.println('힣' + 0); // 55203
        // 한글 글자에 할당된 메모리 수 (55203 - 44032  + 1 = 11172)

        for(int i = 44032; i <= 55203; i++){
            System.err.println((char)i);
        }
    }
}
