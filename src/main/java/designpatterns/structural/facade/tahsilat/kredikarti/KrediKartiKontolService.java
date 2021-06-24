package designpatterns.structural.facade.tahsilat.kredikarti;

import designpatterns.structural.facade.DateUtil;
import designpatterns.structural.facade.borc.OdemeBilgileriDto;

import java.util.Date;


public class KrediKartiKontolService {

    public boolean isKrediKartiGecerli(OdemeBilgileriDto odemeBilgileriDto){

        Long sonKullanmaAy = odemeBilgileriDto.getSonKullanmaAy();
        Long sonKullanmaYil = odemeBilgileriDto.getSonKullanmaYil();

        Date gununTarihi = DateUtil.getGununTarihi();

        Long gununAyi = DateUtil.tarihinAyi(gununTarihi);
        Long gununYili = DateUtil.tarihinYili(gununTarihi);

        boolean isKrediKartiGecerli = false;
        if (sonKullanmaYil.compareTo(gununYili) > 0){
            isKrediKartiGecerli = true;
        } else if (sonKullanmaYil.compareTo(gununYili) == 0){
            if (sonKullanmaAy.compareTo(gununAyi) >= 0){
                isKrediKartiGecerli = true;
            }
        }

        if (!isKrediKartiGecerli){
            System.out.println("Geçersiz kredi kartı bilgileri!");
        }

        return isKrediKartiGecerli;
    }
}
