

public class Semafor {




    private Kolory.kolor upLight;
    private Kolory.kolor stop;
    private Kolory.kolor downLigh;
    private Kolory.kolor belt;
    boolean N;


    public Semafor(Kolory.kolor gorne, Kolory.kolor dolne, Kolory.kolor pas, boolean N){
        upLight=gorne;
        downLigh=dolne;
        belt=pas;
        this.N=N;

    }

    private  void setLight(){

    }

    private Kolory.predkosc getSpeed(Kolory.kolor gorne, Kolory.kolor dolne, Kolory.kolor pas){
        Kolory.predkosc V= Kolory.predkosc.stop;
        
        return V;
    }

}
