import java.util.Scanner;

public class Pegawai {
    protected int nip;
    protected String nama;
    protected int nohp;
    protected String gol;
    protected int nidn;

    protected int gaji;

    public Pegawai(int nip, String nama, int nohp, String gol, int nidn,int gaji){
        this.nip = nip;
        this.nama = nama;
        this.nohp = nohp;
        this.gol = gol;
        this.nidn = nidn;
        this.gaji = gaji;
    }

    public int getNip() {
        return nip;
    }

    public void setNip(int nip) {
        this.nip = nip;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getNohp() {
        return nohp;
    }

    public void setNohp(int nohp) {
        this.nohp = nohp;
    }

    public String getGol() {
        return gol;
    }

    public void setGol(String gol) {
        this.gol = gol;
    }

    public int getNidn() {
        return nidn;
    }

    public void setNidn(int nidn) {
        this.nidn = nidn;
    }

    public int getGaji() {
        return gaji;
    }

    public void setGaji(int gaji) {

        this.gaji = gaji;
    }
    int jenis,jabatan,golongan, tunjangan, gapok, totgapok;
    public void Inputan() {

        Scanner duit = new Scanner(System.in);

        System.out.println("-------------------------------------");
        System.out.println("PROGRAM MENGHITUNG GAJI POKOK PEGAWAI");
        System.out.println("-------------------------------------");
        System.out.print("Masukan NIP : ");
        nip = duit.nextLine();
        System.out.print("Masukan NIDN : ");
        nidn = duit.nextLine();
        System.out.print("Masukan Nama Anda : ");
        nama = duit.nextLine();
        System.out.print("\nMasukan jenis pekerjaan Anda : ");
        System.out.print("1. Dosen");
        System.out.print("2. T.U");
        System.out.print("3. Staff");
        jenis = duit.nextInt();
        System.out.println("\nMasukan golongan Anda : ");
        System.out.print("1. I");
        System.out.print("2. II");
        System.out.print("3. III");
        gol = duit.nextInt();
        System.out.print("Masukan Jabatan Anda : ");
        System.out.print("1. Dosen");
        System.out.print("2. Keprodi");
        System.out.print("3. Rektor");
        jabatan = duit.nextInt();

    }

    public void Acount(){
        if (jenis == 1) {
            switch(jenis){
                case 1 :
                    if (jabatan ==  1 && gol == 1) {
                        gaji = 2000000;
                        tunjangan = 500000;
                        jabatan = "Dosen";
                        golongan = "I";
                    }else if(jabatan == 1 && gol == 2){
                        gaji = 3000000;
                        tunjangan = 1000000;
                        jabatan = "Dosen";
                        golongan = "I";
                    }else if(jabatan == 1 && gol == 3){
                        gaji = 5000000;
                        tunjangan = 2000000;
                        jabatan = "Dosen";
                        golongan = "I";

                    }
                case 2 :
                    if (jabatan == 2 && gol == 1) {
                        gaji = 3000000;
                        tunjangan = 750000;
                        jabatan = "Keprodi";
                        golongan = "II";
                    }else if(jabatan == 2 && gol == 2){
                        gaji = 2500000;
                        tunjangan = 500000;
                        jabatan = "II";
                        golongan = "Keprodi";
                    }else if(jabatan == 2 && gol == 3){
                        gaji = 5000000;
                        tunjangan = 1500000;
                        jabatan = "Keprodi";
                        golongan = "II";
                    }
                case 3:
                    if (jabatan == 3 && gol == 1) {
                        gaji = 3000000;
                        tunjangan = 1500000;
                        jabatan = "Rektor";
                        golongan = "III";
                    }else if(jabatan == 3 && gol == 2){
                        gaji = 3500000;
                        tunjangan = 1750000;
                        jabatan = "Rektor";
                        golongan = "III";
                    }else if(jabatan == 3 && gol == 3){
                        gaji = 4000000;
                        tunjangan = 2000000;
                        jabatan = "Rektor";
                        golongan = "III";
                    }
            }
        }

        gapok = gaji;
        totgapok = gapok + tunjangan;
    }

    public void Output(){
        System.out.println("NIP Anda : " + nip);
        System.out.println("NIDN Anda : " + nidn);
        System.out.println("Nama Anda : " + nama);
        System.out.println("Gaji pokok Anda : " + gapok);
        System.out.println("Tunjangan Anda : " + tunjangan);
        System.out.println("Jabatan Anda : " + jabatan);
        System.out.println("Golongan Anda : " + golongan);
        System.out.println("Total Gaji Pokok  Anda : " + totgapok);
    }
}
