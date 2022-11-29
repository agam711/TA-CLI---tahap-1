/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package npm07220soalpendahuluan1;

import java.util.Date;

/**
 *
 * @author Agam
 */
public class PraktikanEntity {
    String npm,nama,password,notelp,kelas;
    Date TanggalLahir;
    int indexpraktikum;
    int indexaslab;

    public PraktikanEntity(String npm, String nama, String password, String notelp, String kelas, Date TanggalLahir, int indexpraktikum, int indexaslab) {
        this.npm = npm;
        this.nama = nama;
        this.password = password;
        this.notelp = notelp;
        this.kelas = kelas;
        this.TanggalLahir = TanggalLahir;
        this.indexpraktikum = indexpraktikum;
        this.indexaslab = indexaslab;
    }

    public String getNpm() {
        return npm;
    }

    public String getNama() {
        return nama;
    }

    public String getPassword() {
        return password;
    }

    public String getNotelp() {
        return notelp;
    }

    public String getKelas() {
        return kelas;
    }

    public Date getTanggalLahir() {
        return TanggalLahir;
    }

    public int getIndexpraktikum() {
        return indexpraktikum;
    }

    public int getIndexaslab() {
        return indexaslab;
    }
    
}
