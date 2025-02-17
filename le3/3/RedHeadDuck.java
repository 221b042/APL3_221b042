public class RedHeadDuck implements Swimmable, Flyable, Quackable {
    @Override
    public void swim() {
        System.out.println("RedHead Duck is swimming gracefully.");
    }

    @Override
    public void fly() {
        System.out.println("RedHead Duck is flying high!");
    }

    @Override
    public void quack() {
        System.out.println("RedHead Duck quacks loudly.");
    }

    public static void main(String[] args) {
        RedHeadDuck rhd = new RedHeadDuck();
        rhd.swim();
        rhd.fly();
        rhd.quack();
    }
}
