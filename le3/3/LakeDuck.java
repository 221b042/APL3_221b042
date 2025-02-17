public class LakeDuck implements Swimmable, Flyable, Quackable {
    @Override
    public void swim() {
        System.out.println("Lake Duck is swimming calmly.");
    }

    @Override
    public void fly() {
        System.out.println("Lake Duck is soaring over the lake.");
    }

    @Override
    public void quack() {
        System.out.println("Lake Duck quacks.");
    }

    public static void main(String[] args) {
        LakeDuck ld = new LakeDuck();
        ld.swim();
        ld.fly();
        ld.quack();
    }
}
