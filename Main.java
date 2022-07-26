public class Main{

    public static void main(String[] args) {
        Dog dog = new Dog("zoom");
        dog.breath();
        dog.eat();
        // dog.getName();
        // Bird bird = new Bird("pirote");
        // bird.breath();
        // bird.eat();
        // dog.eat();
        Parrote parrote = new Parrote("favorite");
        parrote.getName();
        parrote.eat();
        parrote.breath();
        parrote.fly();
    }
}