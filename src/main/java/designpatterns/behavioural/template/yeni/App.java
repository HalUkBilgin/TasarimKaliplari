package designpatterns.behavioural.template.yeni;


public class App {

    public static void main(String[] args) {

        AnadoluLisesiDilekce anadoluLisesiDilekce =
                new AnadoluLisesiDilekce("12-Fen-A", "1093", "Sadık Bahadır Memiş");

        FenLisesiDilekce fenLisesiDilekce = new FenLisesiDilekce("10", "91", "Ayşe Yusuf", "B");

        anadoluLisesiDilekce.dilekceYazdir();
        System.out.println("\n\n");
        fenLisesiDilekce.dilekceYazdir();
    }
}
