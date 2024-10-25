package lang.string.test;

public class TestString6 {

    public static void main(String[] args) {
        String str = "start hello java, hello spring, hello jpa";
        String key = "hello";

        int count = 0;
        int index = str.indexOf(key);
        System.out.println("index: " + index);

        while (index >= 0) {
            index = str.indexOf(key, index + 1); // index가 못찾으면 -1이 나오니깐 그리고 처음에 찾은거 다음부터 찾기 위해서 +1 다 찾으면 -1
            count++;
        }

        System.out.println("count = " + count);
    }
}
