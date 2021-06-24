package designpatterns.structural.bridge.cihaz;

import designpatterns.structural.bridge.Muzik;
import designpatterns.structural.bridge.muzikcalar.MuzikCalar;
import designpatterns.structural.bridge.sescihazi.SesCihazi;


public class Telefon extends MuzikCalabilenBilgisayar {

    public Telefon(SesCihazi sesCihazi, MuzikCalar muzikCalar) {
        super(sesCihazi, muzikCalar);
    }

    @Override
    public void muzikCal(Muzik muzik) {
        System.out.println("Telefon müzik çalıyor");

        super.muzikCal(muzik);
    }
}
