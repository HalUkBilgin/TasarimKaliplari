package designpatterns.structural.decorator;


public class KucukRaporDecorator extends RaporDecorator {

    private int genislik;

    public KucukRaporDecorator(Rapor rapor) {
        super(rapor);
        this.genislik = 30;
    }

    @Override
    public String getMetin() {

        String metin = super.getMetin();

        String kucukMetin = RaporUtil.metniSigdir(metin, genislik);

        return kucukMetin;
    }
}
