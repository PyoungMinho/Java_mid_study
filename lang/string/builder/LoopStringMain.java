package lang.string.builder;

public class LoopStringMain {

    public static void main(String[] args) {
        // 앵간해서는 + 연산자 쓰면 되는데 힘든경우가 있다 밑에 코드로 알아보자
        long startTime = System.currentTimeMillis();
        String result = "";

        for (int i = 0; i < 100000; i++) {
            result += "Hello Java ";
        }

        long endTime = System.currentTimeMillis();

        System.out.println("result = " + result);
        System.out.println("time = " + (endTime - startTime) + "ms"); //time = 2840ms but StringBuilder 사용하면 time = 6ms
    }
}
