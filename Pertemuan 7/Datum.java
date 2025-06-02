public class Datum<Generik> {
    private Generik isi;

    public Datum(Generik isi) {
        this.isi = isi;
    }

    public Generik getIsi(){
        return this.isi;
    }

    public void setIsi(Generik x){
        this.isi = x;
    }
    
}
