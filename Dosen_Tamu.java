package pkgabstract.factory.pattern;

import java.util.Scanner;

public class Dosen_Tamu implements DataPengajar {
    String xx[];
    @Override
    public void input_data() {
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan Jumlah Dosen : ");
        int jumlah = in.nextInt();
        xx = new String[jumlah];
        for(int i = 0; i < jumlah; i++){
            AbstractFactoryPatternDemo af = new AbstractFactoryPatternDemo();
            System.out.print("Masukkan nama Anda : ");
            String nama = in.next();
            System.out.print("Masukkan NIDN Anda : ");
            String NIM = in.next();
            String x = nama.concat(" - " + NIM);
            xx[i] = x;
        }
    }
    
    @Override
    public void tampilkan_data(){
        try{
            for (int i = 0; i < xx.length; i++) {
                System.out.println(xx[i]);
            }  
        }catch(NullPointerException e){
            System.out.println("TIDAK ADA DATA!");
        }
    }
}