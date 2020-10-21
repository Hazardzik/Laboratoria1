public class Main {
    public static void main(String[] args) {
        Samochod Audi=new Samochod();
        Audi.kola=4;
        Audi.marka="Audi";
        Audi.odpalPojazd();
        Audi.zamknijDrzwi();
        System.out.println(Audi.kola+"  "+Audi.marka);
    }
}

