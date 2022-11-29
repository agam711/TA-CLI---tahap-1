/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package npm07220soalpendahuluan1;

import java.util.Date;

public class AslabEntity {
    String npm,nama,password,notelp;
    Date TanggalLahir;

    public AslabEntity(String npm, String nama, String password, String notelp, Date TanggalLahir) {
        this.npm = npm;
        this.nama = nama;
        this.password = password;
        this.notelp = notelp;
        this.TanggalLahir = TanggalLahir;
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

    public Date getTanggalLahir() {
        return TanggalLahir;
    }
    
}
