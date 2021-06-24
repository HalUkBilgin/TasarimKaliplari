package designpatterns.behavioural.command;

import java.math.BigDecimal;


public class BolmeCommand implements Islem {

    @Override
    public BigDecimal islem(BigDecimal sayi1, BigDecimal sayi2) {
        return sayi1.divide(sayi2);
    }
}
