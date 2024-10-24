package lang.immutable.address;

public class MemberMainV2 {

    public static void main(String[] args) {
        ImmutableAddress address = new ImmutableAddress("서울");

        MemberV2 memberA = new MemberV2("회원A", address);
        MemberV2 memberB = new MemberV2("회원B", address);

        //회원A, 회원B의 처음 주소는 모두 서울
        System.out.println("memberA = " + memberA);
        System.out.println("memberB = " + memberB);

        //회원B의 주소를 부산으로 변경해야함
        //memberB.getAddress().setValue("부산"); //컴파일 오류
        memberB.setAddress(new ImmutableAddress("부산"));
        memberB.setAddress(new ImmutableAddress("인천")); // 같은 객체를 참조하는걸 새로운 객체를 만들어서 A와 B의 참조를 따로따로 만들어 값 변경(생성)
        System.out.println("부산 -> memberB.address");
        System.out.println("memberA = " + memberA);
        System.out.println("memberB = " + memberB);
    }
}
