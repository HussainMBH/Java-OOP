abstract class animal {
    abstract void sound();
}

class Lion extends animal{
    @Override
    void sound(){
        System.out.println("My name is Lion");
    }}
class Tiger extends animal{
    @Override
    void sound(){
        System.out.println("My name is Tiger");
    }
        }
