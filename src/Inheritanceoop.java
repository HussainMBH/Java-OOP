//Inheritance = Accessing Super class's methods and variables by using Sub classes
// 3 Type: Single level(P<C), Multy level(GF<F<C), Hirarichal level(one Super class but two sub class)
class Grandparent{
    void elon(){
        System.out.println("i'm a Grand Father");
    }
}

class Parent extends Grandparent{
    void gates(){
        System.out.println("I'm a father");
    }
}
class Child extends Parent{
    void jac(){
        System.out.println("I'm a child");
    }
}

public class Inheritanceoop {
    public static void main(String[]args){
        Child obj1 = new Child();
        obj1.gates();
        obj1.elon();
        Parent obj2 = new Parent();
        obj2.elon();

    }
}
