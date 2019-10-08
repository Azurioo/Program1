class KlasaA {
    int wartoscA;
    int wartoscB;
    void przypisz(int x, int y){
        wartoscA = x;
        wartoscB = y;
    }
    public void wyswietl(){
        System.out.println("Wartosc A:" + wartoscA);
        System.out.println("Wartosc B:" + wartoscB);
    }
}

class Kalkulator {
    int dodaj(int a, int b) {
        return a + b;
    }
    int odejmij(int a, int b) {
        return a - b;
    }
    int pomnoz(int a, int b) {
        return a * b;
    }
    int podziel(int a, int b) {
        return a / b;
    }
}

public class Operacje {
    public static void main(String[] args) {

        KlasaA klasa = new KlasaA();
        klasa.przypisz(Integer.parseInt(args[0]),Integer.parseInt(args[1]));

        Kalkulator kalkulator = new Kalkulator();

        int razem = kalkulator.dodaj(klasa.wartoscA, klasa.wartoscB);
        int nierazem = kalkulator.odejmij(klasa.wartoscA, klasa.wartoscB);
        int razemmocno = kalkulator.pomnoz(klasa.wartoscA, klasa.wartoscB);
        int razemslabo = kalkulator.podziel(klasa.wartoscA, klasa.wartoscB);

        System.out.println(razem);
        System.out.println(nierazem);
        System.out.println(razemmocno);
        System.out.println(razemslabo);
    }
}