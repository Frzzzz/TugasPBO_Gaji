public class PegawaiNonTetap extends Pegawai{
    int noPeg, kehadiran, gaji;
    String nama, masaKontrak;

    public PegawaiNonTetap(int noPeg, String nama, String masaKontrak, int kehadiran, int gaji){
        this.noPeg = noPeg;
        this.nama = nama;
        this.masaKontrak = masaKontrak;
        this.kehadiran = kehadiran;
        this.gaji = gaji;
    }

    public int getUangMakan(){
        return 6000 * kehadiran;
    }
    //setter
    public void setNoPeg(int noPeg){
        this.noPeg = noPeg;
    }
    public void setNama(String nama){
        this.nama = nama;
    }
    public void setMasaKontrak(String masaKontrak){
        this.masaKontrak = masaKontrak;
    }
    public void setKehadiran(int kehadiran){
        this.kehadiran = kehadiran;
    }
    public void setGaji(int gaji){
        this.gaji = gaji;
    }

    public void lihatData(){
        System.out.println("No. Pegawai : "+noPeg);
        System.out.println("Nama Pegawai : "+nama);
        System.out.println("Masa Kontrak : "+masaKontrak);
        System.out.println("Kehadiran : "+kehadiran);
        System.out.println("Uang Makan : "+getUangMakan());
        System.out.println("Gaji : "+gaji);
    }
    public void hitungGaji(){
        int gajiBersih = getUangMakan() + gaji;
        System.out.println("Gaji Bersih : "+gajiBersih);
    }
}
