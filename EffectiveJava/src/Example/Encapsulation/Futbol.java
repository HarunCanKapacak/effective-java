package Example.Encapsulation;

public class Futbol {
    //encapsulation veriyi kontrollü tutma
    //1-> Doðrudan eriþilebilirlik kalkar(get set ile dolaylý eriþim)
    //2-> Set ile verilerimde kontrol saðlayabliyorum.
    //3-> read only (set kaldýrmak istenirse)
    //4-> write only(get kaldýrmak istenirse)

    private String takimAdi;
    private int takimOyuncuSayisi;

    public Futbol(String takimAdi, int takimOyuncuSayisi) {
        this.takimAdi = takimAdi;
        this.takimOyuncuSayisi = takimOyuncuSayisi;
    }

    public String getTakimAdi() {
        return takimAdi;
    }

    public void setTakimAdi(String takimAdi) {
        this.takimAdi = takimAdi;
    }

    public int getTakimOyuncuSayisi() {
        return takimOyuncuSayisi;
    }

    public void setTakimOyuncuSayisi(int takimOyuncuSayisi) {
        this.takimOyuncuSayisi = takimOyuncuSayisi;
    }
}























