import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            String nama;
            int coding, tulis, wawancara, nik;
            do {

                System.out.println("FORM PENDAFTARAN PT. UDIN");
                System.out.println("1. Web Development");
                System.out.println("2. Android Development");
                System.out.print("Pilih Jenis Form :");
                int pilih = input.nextInt();
                switch (pilih) {
                    case 1:
                        System.out.println();
                        System.out.println("FORM PENDAFTARAN");
                        System.out.println();
                        System.out.print("Input NIK : ");
                        nik = input.nextInt();
                        input.nextLine();
                        System.out.print("Input Nama : ");
                        nama = input.nextLine();
                        System.out.print("Input Nilai Tes Tulis : ");
                        tulis = input.nextInt();
                        System.out.print("Input Nilai Tes Coding : ");
                        coding = input.nextInt();
                        System.out.print("Input Nilai Tes Wawancara : ");
                        wawancara = input.nextInt();
                        Web webject = new Web(nama, nik);

                        webject.InputNilai(coding, tulis, wawancara);
                        do {
                            System.out.println("Menu");
                            System.out.println("1. Edit");
                            System.out.println("2. Tampil");
                            System.out.println("3. Exit");
                            System.out.print("Pilih : ");
                            pilih = input.nextInt();
                            if (pilih == 1) {
                                System.out.println();
                                System.out.println("FORM EDIT");
                                System.out.println();
                                System.out.print("Input Nilai Tes Tulis : ");
                                tulis = input.nextInt();
                                System.out.print("Input Nilai Tes Coding : ");
                                coding = input.nextInt();
                                System.out.print("Input Nilai Tes Wawancara : ");
                                wawancara = input.nextInt();
                                webject.InputNilai(coding, tulis, wawancara);
                            } else if (pilih == 2) {
                                System.out.println("Nilai Akhir : " + webject.NilaiTotal());
                                if (webject.NilaiTotal() < 85) {
                                    System.out.println("Keterangan : GAGAL");
                                    System.out.println("Mohon Maaf Kepada Saudara " + webject.nama()
                                            + " Telah ditolak sebagai Web Dev");
                                    System.out.println();
                                } else {
                                    System.out.println("Keterangan : LOLOS");
                                    System.out.println(
                                            "Selamat Kepada Saudara " + webject.nama()
                                                    + " Telah diterima Sebagai Web Dev");
                                    System.out.println();
                                }
                            } else {
                                System.exit(0);
                            }
                        } while (true);

                    case 2:
                        System.out.println();
                        System.out.println("FORM PENDAFTARAN");
                        System.out.println();
                        System.out.print("Input NIK : ");
                        nik = input.nextInt();
                        input.nextLine();
                        System.out.print("Input Nama : ");
                        nama = input.nextLine();
                        System.out.print("Input Nilai Tes Tulis : ");
                        tulis = input.nextInt();
                        System.out.print("Input Nilai Tes Coding : ");
                        coding = input.nextInt();
                        System.out.print("Input Nilai Tes Wawancara : ");
                        wawancara = input.nextInt();
                        Android androidject = new Android(nama, nik);
                        androidject.InputNilai(coding, tulis, wawancara);
                        do {
                            System.out.println("Menu");
                            System.out.println("1. Edit");
                            System.out.println("2. Tampil");
                            System.out.println("3. Exit");
                            System.out.print("Pilih : ");
                            pilih = input.nextInt();
                            if (pilih == 1) {
                                System.out.println();
                                System.out.println("FORM EDIT");
                                System.out.println();
                                System.out.print("Input Nilai Tes Tulis : ");
                                tulis = input.nextInt();
                                System.out.print("Input Nilai Tes Coding : ");
                                coding = input.nextInt();
                                System.out.print("Input Nilai Tes Wawancara : ");
                                wawancara = input.nextInt();
                                androidject.InputNilai(coding, tulis, wawancara);
                            } else if (pilih == 2) {
                                System.out.println("Nilai Akhir : " + androidject.NilaiTotal());
                                if (androidject.NilaiTotal() < 85) {
                                    System.out.println("Keterangan : GAGAL");
                                    System.out.println("Mohon Maaf Kepada Saudara " + androidject.nama()
                                            + " Telah ditolak sebagai Android Dev");
                                    System.out.println();
                                } else {
                                    System.out.println("Keterangan : LOLOS");
                                    System.out.println(
                                            "Selamat Kepada Saudara " + androidject.nama()
                                                    + " Telah diterima Sebagai Android Dev");
                                    System.out.println();
                                }
                            } else {
                                System.exit(0);
                            }
                        } while (true);
                    default:
                        System.out.println("PILIHAN ANDA SALAH");
                        break;
                }
            } while (true);
        }
    }
}
