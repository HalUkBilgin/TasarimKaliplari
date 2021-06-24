package designpatterns.structural.bridge.bridgeIlk;


public class Muzik {

    private String adi;
    private String ses;

    public Muzik(String adi, String ses) {
        this.adi = adi;
        this.ses = ses;
    }

    @Override
    public String toString() {
        return adi;
    }

    public String getAdi() {
        return adi;
    }

    public void setAdi(String adi) {
        this.adi = adi;
    }

    public String getSes() {
        return ses;
    }

    public void setSes(String ses) {
        this.ses = ses;
    }
}
