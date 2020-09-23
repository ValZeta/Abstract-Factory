package pkgabstract.factory.pattern;

public class Mahasiswa extends AbstractFactory{
    @Override
    public DataPengajar getDataPengajar(String guru){
        return null;
    }

    @Override
    DataMahasiswa getDataMahasiswa(String siswa) {
    if(siswa == null){
        return null;
    }
    if(siswa.equalsIgnoreCase("AKTIF")){
        return new Mahasiswa_Aktif();
    } else if(siswa.equalsIgnoreCase("CUTI")){
        return new Mahasiswa_Cuti();
    } 
    return null;
  }
}