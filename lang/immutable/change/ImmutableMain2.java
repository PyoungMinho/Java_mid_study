package lang.immutable.change;

public class ImmutableMain2 {

    public static void main(String[] args) {
        ImmutableObj obj1 = new ImmutableObj(10);
        obj1.add(20); // add함수로 새로운 ImmutableObj 객체를 받아온다 return 객체를 안써서 아래 첫번째 출력은 10이다.

        System.out.println("obj1 = " + obj1.getValue());
        System.out.println("obj1 immu = " + obj1.add(20).getValue());
    }
}
