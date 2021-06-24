package designpatterns.structural.facade;

import designpatterns.structural.facade.borc.Borc;

import designpatterns.structural.facade.borc.OdemeBilgileriDto;
import designpatterns.structural.facade.gecikme.GecikmeZammiHesaplamaService;
import designpatterns.structural.facade.tahsilat.TahsilatKontrolService;
import designpatterns.structural.facade.tahsilat.kredikarti.KrediKartiService;

import java.math.BigDecimal;


public class TahsilatFacade {

    private GecikmeZammiHesaplamaService gecikmeZammiHesaplamaService;
    private TahsilatKontrolService tahsilatKontrolService;
    private KrediKartiService krediKartiService;

    public TahsilatFacade() {
        gecikmeZammiHesaplamaService = new GecikmeZammiHesaplamaService();
        tahsilatKontrolService = new TahsilatKontrolService();
        krediKartiService = new KrediKartiService();
    }

    public boolean tahsilatYap(Borc borc, OdemeBilgileriDto odemeBilgileriDto){

        boolean tahsilataUygun = tahsilatKontrolService.isTahsilataUygun(borc);

        if (!tahsilataUygun){
            return false;
        }

        BigDecimal borcTutari = borc.getBorcTutari();

        BigDecimal gecikmeZammi = gecikmeZammiHesaplamaService.gecikmeZammiHesapla(borcTutari, borc.getVadeTarihi());

        BigDecimal odenecekTutar = borcTutari.add(gecikmeZammi);

        System.out.println("Bilgi: Kredi kartından " + odenecekTutar + " TL tahsilat deneniyor.");

        boolean isSuccess = krediKartiService.krediKartindanTahsilDene(odemeBilgileriDto, odenecekTutar);

        return isSuccess;

    }
}











