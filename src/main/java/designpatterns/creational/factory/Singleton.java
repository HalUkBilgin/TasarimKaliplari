package designpatterns.creational.factory;


public class Singleton {

    private static Singleton singleton;

    private static int sayi = 0;

    private Singleton() {
        System.out.println("Ben oluştum");
    }

    public static Singleton getSingleton() {

        synchronized (Singleton.class) {
            if (singleton == null) {
                singleton = new Singleton();
            }
        }

        sayi++;
        System.out.println(sayi);

        return singleton;
    }
}
