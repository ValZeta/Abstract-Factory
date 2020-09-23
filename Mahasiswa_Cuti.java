package pkgabstract.factory.pattern;
import java.util.Scanner;
public class Mahasiswa_Cuti implements DataMahasiswa {
    String xx[];
    @Override
    public void input_data_MHS() {
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan Jumlah Mahasiswa : ");
        int jumlah = in.nextInt();
        xx = new String[jumlah];
        for(int i = 0; i < jumlah; i++){
            AbstractFactoryPatternDemo af = new AbstractFactoryPatternDemo();
            System.out.print("Masukkan nama Anda : ");
            String nama = in.next();
            System.out.print("Masukkan NIM Anda : ");
            String NIM = in.next();
            System.out.print("Masukkan Alasan Cuti Anda : ");
            String matkul = in.next();
            String x = nama.concat(" - " + NIM.concat(" - " + matkul));
            xx[i] = x;
        }
    }
    
    public void tampilkan_data_MHS(){
        try{
            for (int i = 0; i < xx.length; i++) {
                System.out.println(xx[i]);
            }  
        }catch(NullPointerException e){
            System.out.println("TIDAK ADA DATA!");
        }
    }
}
