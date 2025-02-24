class Singleton {
    static Singleton inst = new Singleton();

    static int counter = 0;

    private Singleton() {
        counter++;
        System.out.println("Count: " + counter);
    }

    public static Singleton getobject() {
        return inst;
    }
}

public class Main {
    public static void main(String[] args) {
        Singleton s1 = Singleton.getobject();
        Singleton s2 = Singleton.getobject();
    }
}