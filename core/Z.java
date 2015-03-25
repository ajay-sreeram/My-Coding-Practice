abstract class X { abstract void method(); }
abstract class Y extends X { }
class Z extends Y { void method() { System.out.println("Class Z"); } }
