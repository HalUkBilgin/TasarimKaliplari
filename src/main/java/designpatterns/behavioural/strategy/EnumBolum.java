package designpatterns.behavioural.strategy;


public enum EnumBolum {
    
    SOZEL("Sözel"),
    SAYISAL("Sayısal"),
    ESIT_AGIRLIK("Eşit Ağırlık"),
    ;

    private String bolum;

    EnumBolum(String bolum) {
        this.bolum = bolum;
    }

    @Override
    public String toString() {
        return bolum;
    }
}
