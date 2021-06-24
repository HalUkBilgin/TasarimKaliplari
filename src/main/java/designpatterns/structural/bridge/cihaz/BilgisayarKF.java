package designpatterns.structural.bridge.cihaz;

import designpatterns.structural.bridge.Muzik;
import designpatterns.structural.bridge.muzikcalar.Fizy;
import designpatterns.structural.bridge.sescihazi.Kulaklik;


public class BilgisayarKF extends MuzikCalabilenBilgisayar {

    public BilgisayarKF() {

        sesCihazi = new Kulaklik();
        muzikCalar = new Fizy();
    }

    @Override
    public void muzikCal(Muzik muzik) {

        System.out.println("Bilgisayar çalıştı");
        super.muzikCal(muzik);
    }
}
