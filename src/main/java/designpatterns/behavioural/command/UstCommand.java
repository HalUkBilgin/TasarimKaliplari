package designpatterns.behavioural.command;

import java.math.BigDecimal;


public class UstCommand implements Islem {

    @Override
    public BigDecimal islem(BigDecimal sayi1, BigDecimal sayi2) {
        return sayi1.pow(sayi2.intValue());
    }
}
