package designpatterns.behavioural.interpreter.yorumlayici;


import designpatterns.behavioural.interpreter.dil.KargaDili;


public class KargaDiliYorumlayici implements Yorumlayici {

    @Override
    public String yorumla(String soz) {

        KargaDili kargaDili = new KargaDili();
        String turkce = kargaDili.turkceyeCevir(soz);

        return turkce;
    }
}
