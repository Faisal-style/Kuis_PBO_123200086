public class Web extends Nilai implements Data {
    String nama;
    int nik;

    Web(String nama, int nik) {
        super(nama, nik);
        // TODO Auto-generated constructor stub
        this.nama = nama;
        this.nik = nik;
    }

    public int NilaiTotal() {
        return (tulis * 40 / 100) + (coding * 35 / 100) + (wawancara * 25 / 100);
    }

    public String nama() {
        // TODO Auto-generated method stub
        return this.nama;
    }
}
