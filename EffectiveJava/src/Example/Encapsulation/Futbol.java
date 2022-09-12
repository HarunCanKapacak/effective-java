package Example.Encapsulation;

public class Futbol {
    //encapsulation veriyi kontroll� tutma
    //1-> Do�rudan eri�ilebilirlik kalkar(get set ile dolayl� eri�im)
    //2-> Set ile verilerimde kontrol sa�layabliyorum.
    //3-> read only (set kald�rmak istenirse)
    //4-> write only(get kald�rmak istenirse)

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























