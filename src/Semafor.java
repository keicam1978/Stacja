

public class Semafor {


    private Typy.kolor downLight;
    private Typy.kolor upLight;
    private Typy.kolor stop;
    private Typy.kolor belt;
    boolean N;


    public Semafor(){
        upLight = Typy.kolor.brak;
        stop = Typy.kolor.czerwony;
        downLight = Typy.kolor.brak;
        belt= Typy.kolor.brak;
        N=false;
    }

    private  void setSemafor(Typy.predkosc speed, Typy.sem next){



    }

    private Typy.predkosc getPredkosc(Typy.kolor gorne, Typy.kolor dolne, Typy.kolor pas){

        Typy.predkosc V= Typy.predkosc.v0;

        if (gorne != Typy.kolor.brak) {

            if (dolne == Typy.kolor.brak) V = Typy.predkosc.vmax;

            if (dolne == Typy.kolor.zolty) {
                if (pas == Typy.kolor.zielony) V = Typy.predkosc.v100;
                if (pas == Typy.kolor.zolty) V = Typy.predkosc.v60;
                if (pas == Typy.kolor.brak) V = Typy.predkosc.v40;
            }
        }
        return V;
    }

}
