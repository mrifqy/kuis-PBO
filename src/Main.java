import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int pil, pil2, pil3, usia;
        double struktur = 0, visual = 0, design = 0;
        double jurnal = 0, relevansi = 0, solving = 0;
        double hasilPelajar=0, hasilMahasiswa = 0;
        String nama;
        System.out.println("----------------------------------");
        System.out.println("| PENDAFTARAN BEASISWA PT BENANG |");
        System.out.println("----------------------------------");
        System.out.println();
        System.out.println("   1. Beasiswa Pelajar");
        System.out.println("   2. Beasiswa Mahasiswa");
        System.out.print("Pilih         : ");
        pil = input.nextInt();
        System.out.println();

        if(pil == 1) {
            System.out.println("--------------------");
            System.out.println("| Form Pendaftaran |");
            System.out.println("--------------------");
            System.out.print("Nama lengkap : ");
            nama = input.next();
            System.out.print("Usia         : ");
            usia = input.nextInt();
            do {
                System.out.println("------------------");
                System.out.println("| Form Penilaian |");
                System.out.println("------------------");
                System.out.println("Keterangan : Nilai yang valid antara 0-100");
                System.out.println();
                System.out.print("Nilai Struktur dan Konten Essai     : ");
                struktur = input.nextDouble();
                System.out.print("Nilai Teknik dan Visualisasi        : ");
                visual = input.nextDouble();
                System.out.print("Nilai Kemampuan dan Design Thinking : ");
                design = input.nextDouble();
            } while(struktur>=0 || struktur<=100 || visual>=0 || visual<=100 || design>=0 || design<=0);
            do {
                System.out.println("--------");
                System.out.println("| Menu |");
                System.out.println("--------");
                System.out.println("1. Tampilkan hasil");
                System.out.println("2. Ubah nilai");
                System.out.println("3. Keluar");
                System.out.println("Pilih : ");
                pil2 = input.nextInt();
                if(pil2 == 1) {
                    Seleksi seleksi;
                    seleksi = new Seleksi(struktur, visual, design, hasilPelajar, jurnal, relevansi, solving, hasilMahasiswa);
                    hasilPelajar = seleksi.hasilPelajar();
                    System.out.println("Nilai Akhir : " + hasilPelajar);

                    if (hasilPelajar >= 87.5 && usia >=16 && usia <=24) {
                        System.out.println("Keterangan : BERHASIL");
                        System.out.println("Selamat! " + nama + " (" + usia +" tahun) dinyatakan LULUS program beasiswa PT Benang.");
                    }
                    else {
                        System.out.println("Keterangan : GAGAL");
                        System.out.println("Mohon maaf, " + nama + " (" + usia +" tahun) dinyatakan tidak lulus seleksi beasiswa karena tidak memenuhi syarat");
                    }
                }
                else if (pil2 == 2) {
                    do {
                        System.out.println("------------------");
                        System.out.println("| Form Penilaian |");
                        System.out.println("------------------");
                        System.out.println("Keterangan : Nilai yang valid antara 0-100");
                        System.out.println();
                        System.out.print("Nilai Struktur dan Konten Essai     : ");
                        struktur = input.nextDouble();
                        System.out.print("Nilai Teknik dan Visualisasi        : ");
                        visual = input.nextDouble();
                        System.out.print("Nilai Kemampuan dan Design Thinking : ");
                        design = input.nextDouble();
                    } while(struktur>=0 || struktur<=100 || visual>=0 || visual<=100 || design>=0 || design<=0);
                }
            } while(pil != 3);

        }
        else if(pil == 2) {
            System.out.println("--------------------");
            System.out.println("| Form Pendaftaran |");
            System.out.println("--------------------");
            System.out.println("Nama lengkap : ");
            nama = input.next();
            System.out.println("Usia         : ");
            usia = input.nextInt();
            do {
                System.out.println("------------------");
                System.out.println("| Form Penilaian |");
                System.out.println("------------------");
                System.out.println("Keterangan : Nilai yang valid antara 0-100");
                System.out.println();
                System.out.print("Nilai Struktur dan Konten Jurnal : ");
                jurnal = input.nextDouble();
                System.out.print("Nilai Relevansi Data             : ");
                relevansi = input.nextDouble();
                System.out.print("Nilai Kemampuan Problem Solving  : ");
                solving = input.nextDouble();
            } while(jurnal>=0 || jurnal<=100 || relevansi>=0 || relevansi<=100 || solving>=0 || solving<=0);
            do {
                System.out.println("--------");
                System.out.println("| Menu |");
                System.out.println("--------");
                System.out.println("1. Tampilkan hasil");
                System.out.println("2. Ubah nilai");
                System.out.println("3. Keluar");
                System.out.print("Pilih : ");
                pil3 = input.nextInt();
                if(pil3 == 1) {
                    Seleksi seleksi;
                    seleksi = new Seleksi(struktur, visual, design, hasilPelajar, jurnal, relevansi, solving, hasilMahasiswa);
                    hasilMahasiswa = seleksi.hasilMahasiswa();
                    System.out.println("Nilai Akhir : " + hasilMahasiswa);

                    if (hasilMahasiswa >= 87.5 && usia >=16 && usia <=24) {
                        System.out.println("Keterangan : BERHASIL");
                        System.out.println("Selamat! " + nama + " (" + usia +" tahun) dinyatakan LULUS program beasiswa PT Benang.");
                    }
                    else {
                        System.out.println("Keterangan : GAGAL");
                        System.out.println("Mohon maaf, " + nama + " (" + usia +" tahun) dinyatakan tidak lulus seleksi beasiswa karena tidak memenuhi syarat");
                    }
                }
                else if (pil3 == 2) {
                    do {
                        System.out.println("------------------");
                        System.out.println("| Form Penilaian |");
                        System.out.println("------------------");
                        System.out.println("Keterangan : Nilai yang valid antara 0-100");
                        System.out.println();
                        System.out.print("Nilai Struktur dan Konten Jurnal : ");
                        jurnal = input.nextDouble();
                        System.out.print("Nilai Relevansi Data             : ");
                        relevansi = input.nextDouble();
                        System.out.print("Nilai Kemampuan Problem Solving  : ");
                        solving = input.nextDouble();
                    } while(jurnal>=0 || jurnal<=100 || relevansi>=0 || relevansi<=100 || solving>=0 || solving<=0);
                }
            } while(pil3 != 3);

        }

    }
}
