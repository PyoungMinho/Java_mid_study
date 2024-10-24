package lang.string.equals;

public class StringEqualsMain1 {

    public static void main(String[] args) {
        String str1 = new String("hello"); //x001
        String str2 = new String("hello"); //x002
        System.out.println("new String() == 비교: " + (str1 == str2)); // 참조값 비교 (동일성)
        System.out.println("new String() equals 비교:" + (str1.equals(str2)));
        // 값 비교 new String()은 참조형이기 때문에 equals를 사용해서 비교해야 한다. (동등성)

        String str3 = "hello"; //x003 리터럴
        String str4 = "hello"; //x004 리터럴
        System.out.println("리터럴 == 비교: " + (str3 == str4)); // 리터럴을 사용하면 java 는 효율을 위해서 문자열 pool에 넣어두기때문에 주소가 같다.
        System.out.println("리터럴 equals 비교: " + (str3.equals(str4)));

        String str5 ="Abc";
        String str6 ="Abc";
        System.out.println("동일성 비교 : "+ str5==str6); // => false임 why? 연산자 우선순위에 따라 동일성 비교 : Abc == Abc 가 되어버리기 때문에
        System.out.println("동일성 비교 : "+ (str5==str6));
        System.out.println("== : "+str5.equals(str6));
    }
}
