package designpatterns.behavioural.template.eski;


public class EskiApp {

    public static void main(String[] args) {
        AnadoluLisesiEskiDilekce anadolu = new AnadoluLisesiEskiDilekce("12 Fen-A",
                "1093", "Sadık Bahadır Memiş");


        anadolu.dilekceYazdir();

        System.out.println("\n\n");

        FenLisesiEskiDilekce fen = new FenLisesiEskiDilekce("10",
                "91", "Ayşe Yusuf", "B");

        fen.dilekceYazdir();

    }
}
