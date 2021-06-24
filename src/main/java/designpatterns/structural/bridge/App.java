package designpatterns.structural.bridge;

import designpatterns.structural.bridge.cihaz.BilgisayarKF;
import designpatterns.structural.bridge.cihaz.Telefon;
import designpatterns.structural.bridge.muzikcalar.Fizy;
import designpatterns.structural.bridge.muzikcalar.Spotify;
import designpatterns.structural.bridge.sescihazi.Kulaklik;


public class App {

    public static void main(String[] args) {

        Muzik muzik = new Muzik("Sezen Aksu - Gülümse", "Gülümse hadi gülümse");

        BilgisayarKF bilgisayarKF = new BilgisayarKF();
        bilgisayarKF.muzikCal(muzik);

        System.out.println("***********************");

        Telefon telefon = new Telefon(new Kulaklik(), new Fizy());
        telefon.muzikCal(muzik);

        System.out.println("***********************");

        Telefon telefon2 = new Telefon(new Kulaklik(), new Spotify());
        telefon2.muzikCal(muzik);

    }
}
