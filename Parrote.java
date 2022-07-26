public class Parrote extends Bird {

    public Parrote(String name) {
        super(name);
    }

    @Override
    public String getName() {
        // System.out.println(super.getName());
        return super.getName();
    }

    @Override
    public void fly() {
        super.fly();;
        System.out.println("flying up and down");
    }

    // super.fly();
    
}
