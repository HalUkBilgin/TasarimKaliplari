package designpatterns.behavioural.visitor.islemler;

import designpatterns.behavioural.visitor.saglikbankanligi.EnumHastaDurumu;
import designpatterns.behavioural.visitor.saglikbankanligi.EnumHastalik;
import designpatterns.behavioural.visitor.saglikbankanligi.Hasta;
import designpatterns.behavioural.visitor.saglikbankanligi.Hastane;

import java.util.List;


public class HastaHesaplaUtil {

    public static int hastaSayisiHesapla(Hastane hastane, EnumHastalik hastalik){

        List<Hasta> hastaList = hastane.getHastaList();

        int hastaSayisi = 0;
        for (Hasta hasta : hastaList) {
            if (hastalik.equals(hasta.getHastalik())){
                hastaSayisi++;
            }
        }

        return hastaSayisi;
    }

    public static int hastaSayisiHesapla(Hastane hastane, EnumHastalik hastalik, EnumHastaDurumu durumu){

        List<Hasta> hastaList = hastane.getHastaList();

        int hastaSayisi = 0;
        for (Hasta hasta : hastaList) {
            if (hastalik.equals(hasta.getHastalik())){
                if (durumu.equals(hasta.getDurumu())){
                    hastaSayisi++;
                }
            }
        }

        return hastaSayisi;
    }
}
