import beasiswa.BeasiswaMahasiswa;
import beasiswa.BeasiswaPelajar;


public class Seleksi implements BeasiswaPelajar,BeasiswaMahasiswa {
    double struktur, visual, design, hasilPelajar;
    double jurnal, relevansi, solving, hasilMahasiswa;
    public Seleksi(double struktur, double visual, double design, double hasilPelajar,  double jurnal, double relevansi, double solving, double hasilMahasiswa) {
        this.struktur = struktur;
        this.visual = visual;
        this.design = design;
        this.hasilPelajar = hasilPelajar;
        this.jurnal = jurnal;
        this.relevansi = relevansi;
        this.solving = solving;
        this.hasilMahasiswa = hasilMahasiswa;
    }

    @Override
    public double jurnal() {
        jurnal = jurnal * 0.6;
        return jurnal;
    }

    @Override
    public double relevansi() {
        relevansi = relevansi * 0.25;
        return relevansi;
    }

    @Override
    public double solving() {
        solving = solving * 0.15;
        return solving;
    }

    @Override
    public double hasilMahasiswa() {
        hasilMahasiswa = jurnal() + relevansi() + solving();
        return hasilMahasiswa;
    }

    @Override
    public double struktur() {
        struktur = struktur * 0.5;
        return struktur;
    }

    @Override
    public double visual() {
        visual = visual * 0.2;
        return visual;
    }

    @Override
    public double design() {
        design = design * 0.3;
        return design;
    }

    @Override
    public double hasilPelajar() {
        hasilPelajar =  struktur() + visual() + design();
        return hasilPelajar;
    }

}
