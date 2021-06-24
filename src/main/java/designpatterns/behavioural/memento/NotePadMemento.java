package designpatterns.behavioural.memento;


public class NotePadMemento {

    private String metin;

    public NotePadMemento() {
        metin = "";
    }

    public NotePadMemento(String metin) {
        this.metin = metin;
    }

    public String getMetin() {
        return metin;
    }
}
