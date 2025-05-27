package poly.ex6;

public class SoundFlyMain {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Bird bird = new Bird();
        Chicken chicken = new Chicken();

        method(dog);
        method(bird);
        method(chicken);

        flyAnimal(bird);
        flyAnimal(chicken);
    }

    private static void method(AbstractAnimal animal){
        animal.move();
        animal.sound();
    }
    private static void flyAnimal(Fly fly){
        fly.fly();
    }

}
