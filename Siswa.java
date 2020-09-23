package pkgabstract.factory.pattern;

public class Siswa extends AbstractFactory{
    @Override
    public DataPengajar getDataPengajar(String guru){
        return null;
    }

    @Override
    DataSiswa getDataSiswa(String siswa) {
    if(siswa == null){
        return null;
    }
    if(siswa.equalsIgnoreCase("NAMASISWA")){
        return new Mahasiswa_Aktif();
    } else if(siswa.equalsIgnoreCase("ALAMATSISWA")){
        return new Mahasiswa_Cuti();
    } 
    return null;
  }
}