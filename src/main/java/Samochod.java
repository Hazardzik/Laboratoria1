public class Samochod extends Pojazd{
    boolean otwarty=true;
    void zamknijDrzwi(){
        if(otwarty){
            System.out.println("Drzwi są otwarte.");
        }
        else{
            System.out.println("Drzwi sa zmakniete");
        }

    }
}
