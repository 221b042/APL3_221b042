public class WoodenDuck implements Swimmable {
    @Override
    public void swim() {
        System.out.println("Wooden Duck is floating on water.");
    }

    public static void main(String[] args) {
        WoodenDuck wd = new WoodenDuck();
        wd.swim();
    }
}
