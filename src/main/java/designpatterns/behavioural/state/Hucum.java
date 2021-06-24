package designpatterns.behavioural.state;


public class Hucum implements Konsol {

    @Override
    public void kareBas() {
        System.out.println("Şut çekiliyor.");
    }

    @Override
    public void ucgenBas() {
        System.out.println("Ara pası veriliyor.");
    }

    @Override
    public void yuvarlakBas() {
        System.out.println("Orta açılıyor.");
    }

    @Override
    public void xBas() {
        System.out.println("Kısa pas veriliyor.");
    }
}
