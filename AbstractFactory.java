package pkgabstract.factory.pattern;

public abstract class AbstractFactory {
    abstract DataMahasiswa getDataMahasiswa(String siswa);
    abstract DataPengajar getDataPengajar(String pengajar) ;
}
