/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package npm07220soalpendahuluan1;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class NPM07220SoalPendahuluan1 {

    static ArrayList<AslabEntity> dataAslab = new ArrayList();
    static ArrayList<PraktikanEntity> datapraktikan = new ArrayList();
    static Scanner input = new Scanner(System.in);

    static void daftar() {
        System.out.println("NPM = ");
        String npm = input.next();
        System.out.println("Nama = ");
        String nama = input.next();
        System.out.println("Password = ");
        String pass = input.next();
        System.out.println("No. Telp = ");
        String notelp = input.next();
        System.out.print("Input Tanggal Lahir (MM/dd/yyyy) = ");
        Date tanggal = new Date(input.next());
        System.out.print("Kelas = ");
        String kelas = input.next();
        for (int i = 0; i < dataAslab.size(); i++) {
            System.out.println(i + ". " + dataAslab.get(i).nama);
        }
        System.out.print("Pilih Aslab = ");
        int indexaslab = input.nextInt();
        for (int i = 0; i < PraktikumEntity.Praktikum.length; i++) {
            System.out.println(i + ". " + PraktikumEntity.Praktikum[i]);
        }
        System.out.print("Pilih Praktikum = ");
        int indexprak = input.nextInt();
        datapraktikan.add(new PraktikanEntity(npm, nama, pass, notelp, kelas, tanggal, indexprak, indexaslab));
    }

    static void DataAslab() {
        String npmAslab[] = {"01", "02", "03", "04", "05", "06", "07"};
        String passwordAslab[] = {"01", "02", "03", "04", "05", "06", "07"};
        String namaAslab[] = {"Michael", "Fadlan", "Odila", "Fitria", "Sita", "Eric", "Fernanda"};
        String notelpAslab[] = {"01", "02", "03", "04", "05", "06", "07"};
        String tglLahirAslab[] = {"04/05/2000", "01/12/2000", "03/3/2000", "23/6/2000", "11/3/2000", "13/9/2000", "22/12/2000"};
        for (int i = 0; i < npmAslab.length; i++) {
            dataAslab.add(new AslabEntity(npmAslab[i], namaAslab[i], passwordAslab[i], notelpAslab[i], new Date(tglLahirAslab[i])));
        }
    }

    static void view(String npm, String password) {
        for (int i = 0; i < datapraktikan.size(); i++) {
            if (npm.equals(datapraktikan.get(i).getNpm()) && password.equals(datapraktikan.get(i).getPassword())) {
                System.out.println("NPM = " + datapraktikan.get(i).getNpm());
                System.out.println("Nama = " + datapraktikan.get(i).getNama());
                System.out.println("Tanggal Lahir = " + new SimpleDateFormat("dd-MM-yyyy").format(datapraktikan.get(i).getTanggalLahir()));
                System.out.println("No Telp = " + datapraktikan.get(i).getNotelp());
                System.out.println("Nama Asisten = " + dataAslab.get(datapraktikan.get(i).indexaslab).getNama());
                System.out.println("Praktikum =" + PraktikumEntity.Praktikum[datapraktikan.get(i).indexpraktikum]);
                break;
            } else if (i == datapraktikan.size() - 1 && npm != datapraktikan.get(i).getNpm() && password != datapraktikan.get(i).getPassword()) {
                System.out.println("nama atau password salah");
            } else if (i <= datapraktikan.size() - 1 && npm != datapraktikan.get(i).getNpm() && password != datapraktikan.get(i).getPassword()) {
                continue;
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("Selamat Datang di Laboratorium Infomatika ITATS !!");
        int pil;
        DataAslab();
        do {
            System.out.println("1. Daftar");
            System.out.println("2. Login");
            System.out.println("3. Exit");
            System.out.println("Pilih = ");
            pil = input.nextInt();
            switch (pil) {
                case 1:
                    daftar();
                    break;
                case 2:
                    System.out.println("NPM = ");
                    String npm = input.next();
                    System.out.println("Password = ");
                    String pass = input.next();
                    view(npm, pass);
                    break;
            }
        } while (pil != 3);
    }
}
