

public class Semafor {




    private Typy.kolor upLight;
    private Typy.kolor stop;
    private Typy.kolor downLigh;
    private Typy.kolor belt;
    boolean N;


    public Semafor(){
        upLight= Typy.kolor.czerwony;
        downLigh= Typy.kolor.brak;
        belt= Typy.kolor.brak;
        N=false;
        stop= Typy.kolor.brak;

    }

    private  void setSemafor(){

    }

    private Typy.predkosc getSemafor(Typy.kolor gorne, Typy.kolor dolne, Typy.kolor pas){
        Typy.predkosc V= Typy.predkosc.stop;

        return V;
    }

}
