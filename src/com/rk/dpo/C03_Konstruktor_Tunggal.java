package com.rk.dpo;

public class C03_Konstruktor_Tunggal {
    public static void main(String[] args) {
        //Instansiasi Object
        bjrsangkar bjrsangkar1 = new bjrsangkar();
        bjrsangkar bjrsangkar2 = new bjrsangkar();
        bjrsangkar bjrsangkar3 = new bjrsangkar();

        bjrsangkar1.setSisi(6);
        bjrsangkar2.setSisi(15);
        bjrsangkar3.setSisi(25);

        System.out.println("=====================");
        System.out.println("    BUJUNG SANGKAR");
        System.out.println("=====================");
        System.out.println("Sisi 1         =  " + bjrsangkar1.getSisi());
        System.out.println("Luas 1         =  " + bjrsangkar1.hitungLuas());
        System.out.println("Keliling 1     =  " + bjrsangkar1.hitungKeliling());
        System.out.println("Sisi 2         =  " + bjrsangkar2.getSisi());
        System.out.println("Luas 2         =  " + bjrsangkar2.hitungLuas());
        System.out.println("Keliling 2     =  " + bjrsangkar2.hitungKeliling());
        System.out.println("Sisi 3         =  " + bjrsangkar3.getSisi());
        System.out.println("Luas 3         =  " + bjrsangkar3.hitungLuas());
        System.out.println("Keliling 3     =  " + bjrsangkar3.hitungKeliling());

    }

}

class bjrsangkar {
    private int sisi;

    bjrsangkar() {
        setSisi(5);
    }

    public void setSisi(int s) {
        if (s > 5) {
            sisi = s;
        }
    }

    public int getSisi() {
        return (sisi);
    }

    public int hitungLuas() {
        return (sisi * sisi);
    }

    public int hitungKeliling() {
        return (4 * sisi);
    }


}
