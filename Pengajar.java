package pkgabstract.factory.pattern;

public class Pengajar extends AbstractFactory{
    @Override
    public DataPengajar getDataPengajar(String guru){
        if(guru == null){
            return null;
        }
        if(guru.equalsIgnoreCase("DOSENTETAP")){
            return new Dosen_Tetap();
        } else if(guru.equalsIgnoreCase("DOSENTAMU")){
            return new Dosen_Tamu();
        }
        return null;
    }

    @Override
    DataMahasiswa getDataMahasiswa(String color) {
        return null;
    }
}
