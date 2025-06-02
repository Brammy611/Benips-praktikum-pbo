public class ContohMetodeGenerik {
    public <G> G Fungsi(Datum<G> D) {
        return D.getIsi();
    }

    // Prosedur generik yang hanya menerima G yang merupakan turunan dari Anabul
    public <G extends Anabul> void Prosedur(Datum<G> D) {
        D.getIsi().Bersuara();
        D.getIsi().Gerak();
    }
}
