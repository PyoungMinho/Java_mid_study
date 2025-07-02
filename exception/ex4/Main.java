package exception.ex4;

class Parent {
  static { System.out.print("P1"); }              // (1) Parent static initializer
  { System.out.print("P2"); }                     // (2) Parent instance initializer
  public Parent() {                               // (3) Parent constructor
    System.out.print("P3");
    show();                                     // (4) overridden → Child.show() 호출 가능
  }
  void show() { System.out.print("P4"); }         // (5) Parent show()
  static void staticMethod() { System.out.print("P5"); }
}

class Child extends Parent {
  static { System.out.print("C1"); }              // (6) Child static initializer
  { System.out.print("C2"); }                     // (7) Child instance initializer
  public Child() {                                // (8) Child constructor
    System.out.print("C3");
    Parent.staticMethod();                      // (9) call Parent.staticMethod()
    show();                                     // (10) Child.show()
  }
  @Override
  void show() { System.out.print("C4"); }         // (11) Child show()
}

public class Main {
  static { System.out.print("M1"); }              // (12) Main static initializer
  public static void main(String[] args) {
    System.out.print("M2");                     // (13)
    Parent.staticMethod();                      // (14)
    new Child();                                // (15)
    System.out.print("M3");                     // (16)
  }
}

//M1M2P1P5C1P2P3C4C2C3P5C4M3