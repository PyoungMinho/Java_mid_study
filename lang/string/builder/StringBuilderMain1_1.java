package lang.string.builder;

public class StringBuilderMain1_1 {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append("A");
        sb.append("B");
        sb.append("C");
        sb.append("D");
        System.out.println("sb = " + sb);

        String str = "A" + "B" + "C" + "D";
        System.out.println("str = " + str); //이렇게 해도 되지만 StringBuilder 를 이용하는 이유
                                            // String str = String("A") + String("B") + String("C") + String("D");
                                            // String str = new String("AB")+ String("C") + String("D");
                                            // String str = new String("ABC")+ String("D");
                                            // String str = new String("ABCD"); 흐름으로 진행되기 때문에 효율차이
                                            // But 자바가 간단한 리터럴 + 리터럴은 최적화로 String상수풀에 넣어서 사용해서 짧은거 더하면 그냥 + 해도됌

        sb.insert(4, " Java");
        System.out.println("insert = " + sb);

        sb.delete(4, 8); // "Java" 의 a 가 남아서 끝에 달라붙는다.
        System.out.println("delete = " + sb);

        sb.reverse();
        System.out.println("reverse = " + sb);

        //StringBuilder -> String
        String string = sb.toString(); // 다시 불변으로 변경
        System.out.println("string = " + string);
    }
}
