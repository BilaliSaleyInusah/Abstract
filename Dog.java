import java.rmi.StubNotFoundException;

public class Dog extends Animal {

    public Dog(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println(super.getName() + " is now eating ");
    }

    @Override
    public void breath() {
        System.out.println("breath in , breath out , repeat");
    }

    
    
}
