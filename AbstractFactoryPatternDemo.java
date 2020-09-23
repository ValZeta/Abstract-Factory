package pkgabstract.factory.pattern;
import java.util.Scanner;
public class AbstractFactoryPatternDemo {
    
    public static void main(String[] args) {
        //Mahasiswa_Aktif m = new Mahasiswa_Aktif();
        AbstractFactory pengajarFactory = FactoryProducer.getFactory("PENGAJAR");
        DataPengajar pengajar1 = pengajarFactory.getDataPengajar("DOSENTETAP");
        DataPengajar pengajar2 = pengajarFactory.getDataPengajar("DOSENTAMU");
        
        AbstractFactory siswaFactory = FactoryProducer.getFactory("MAHASISWA");
        DataMahasiswa siswa1 = siswaFactory.getDataMahasiswa("AKTIF");
        DataMahasiswa siswa2 = siswaFactory.getDataMahasiswa("CUTI");
        
        for(String b = "y"; b.equals("y") || b.equals("Y");){
                System.out.println("===============================");
                System.out.println("###DATA MAHASISWA DAN DOSEN###");
                System.out.println("===============================");
                System.out.println("1. DOSEN");
                System.out.println("2. MAHASISWA");
                System.out.println("===============================");
                Scanner scan = new Scanner(System.in);
                System.out.print("Masukkan Pilihan: ");
                int pil = scan.nextInt();
                System.out.println("===============================");
                switch (pil){
                    case 1:
                        System.out.println("DATA DOSEN");
                        System.out.println("1. TETAP");
                        System.out.println("2. TIDAK TETAP");
                        System.out.println("3. TAMPILKAN SEMUA DATA");
                        System.out.println("===============================");
                        System.out.print("Masukkan Pilihan: ");
                        int pilpengajar = scan.nextInt();
                        System.out.println("===============================");
                        if(pilpengajar==1){
                            pengajar1.input_data();
                        }
                        else if (pilpengajar==2){
                            pengajar2.input_data();
                        }
                        else if (pilpengajar==3){
                            System.out.println("============DOSEN TETAP============");
                            pengajar1.tampilkan_data();
                            System.out.println("============DOSEN TAMU============");
                            pengajar2.tampilkan_data();
                        }
                        else{
                            System.out.println("MENU TIDAK TERSEDIA!");
                        }
                        break;
                    case 2:
                        System.out.println("DATA MAHASISWA");
                        System.out.println("1. AKTIF");
                        System.out.println("2. CUTI");
                        System.out.println("3. TAMPILKAN SEMUA DATA");
                        System.out.println("===============================");
                        System.out.print("Masukkan Pilihan: ");
                        int pilsiswa = scan.nextInt();
                        System.out.println("===============================");
                        if(pilsiswa==1){
                            siswa1.input_data_MHS();
                        }
                        else if (pilsiswa==2){
                            siswa2.input_data_MHS();
                        }
                        else if (pilsiswa==3){
                            System.out.println("============MAHASISWA AKTIF============");
                            siswa1.tampilkan_data_MHS();
                            System.out.println("============MAHASISWA CUTI============");
                            siswa2.tampilkan_data_MHS();
                   
                        }
                        else{
                            System.out.println("MENU TIDAK TERSEDIA!");
                        }
                        break;
                    default:
                        System.out.println("MENU TIDAK TERSEDIA!");
                        break;
                }
                System.out.println("===============================");
                System.out.print("Mengulang? (Y/N): ");
                b = scan.next();
            }
    }
 }