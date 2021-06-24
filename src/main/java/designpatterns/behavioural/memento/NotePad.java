package designpatterns.behavioural.memento;


public class NotePad {

    private String metin;

    public NotePad() {
        metin = "";
    }

    public NotePad(String metin) {
        this.metin = metin;
    }

    public void ekle(String eklenecekMetin){
        metin = metin + eklenecekMetin;
    }

    public NotePadMemento kaydet(){
        return new NotePadMemento(metin);
    }

    public void geriDon(NotePadMemento memento){
        metin = memento.getMetin();
    }

    public void yazdir(){
        System.out.println(metin);
    }
}
