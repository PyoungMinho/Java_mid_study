package lang.string.chaining;

public class MethodChainingMain3 {

    public static void main(String[] args) {
        ValueAdder adder = new ValueAdder();
        int result = adder.add(1).add(2).add(3).getValue(); //adder가 this를 반환해서 체이닝이 가능한 형태 (메서드 체이닝)
        System.out.println("result = " + result);

        //StringBuilder가 메서드 체이닝 기법을 사용한다.
    }
}
