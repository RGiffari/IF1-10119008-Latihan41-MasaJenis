package latihan.MasaJenis;

/*
 * @author Raihan Giffari
 * 
 * Nama  : Raihan Giffari
 * Nim   : 10119008
 * Kelas : IF1
 */

public class Main {

        public static void main(String[] args) {
            Kubus kubus = new Kubus();
            kubus.setSisi(5);
            kubus.setMassa(250);
            int volume = kubus.hitungVolume(kubus.getSisi());
            int massaJenis = kubus.hitungMassaJenis(volume, kubus.getMassa());
            System.out.println("======Massa Jenis Kubus======");
            System.out.println("Sisi : " + kubus.getSisi());
            System.out.println("Massa : " + kubus.getMassa());
            System.out.println("======Hasil Perhitungan======");
            System.out.println("Volume : " + volume);
            System.out.println("Massa Jenis : " + massaJenis);
        }
    }
