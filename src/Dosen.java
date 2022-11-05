

import java.util.Scanner;

public class Dosen extends Pegawai {
    private int nidn;
    private int jabatan;
    private int tunjangan;

    @Override
    public int getNidn() {
        return nidn;
    }

    @Override
    public void setNidn(int nidn) {
        this.nidn = nidn;
    }

    public int getJabatan() {
        return jabatan;
    }

    public void setJabatan(int jabatan) {
        this.jabatan = jabatan;
    }

    public int getTunjangan() {
        return tunjangan;
    }

    public void setTunjangan(int tunjangan) {
        this.tunjangan = tunjangan;
    }
    //    String golongan, jabatan;
//    double gapok, gaji, tunjangan, totgapok, nidn;
//    int jenis, golo, jabatan;



}


