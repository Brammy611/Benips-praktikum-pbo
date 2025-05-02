public class Manajer extends Pegawai{
    private int tunjangan = 700000;

    public Manajer(){

    }

    public Manajer(String Nama){
        super(Nama);
    }

    public int getTunjangan(){
        return this.tunjangan;
    }

    @Override
    public void tampilData(){
        super.tampilData();
        System.out.println("Tunjangan : " + getTunjangan());
    }
}
