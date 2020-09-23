package pkgabstract.factory.pattern;

public class FactoryProducer {
    public static AbstractFactory getFactory(String choice){
        if(choice.equalsIgnoreCase("PENGAJAR")){
            return new Pengajar();
        } else if(choice.equalsIgnoreCase("MAHASISWA")){
            return new Mahasiswa();
        }
        return null;
    }
}
