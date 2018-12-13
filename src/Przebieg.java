public class Przebieg {

    private boolean stan;
    private Typy.zwr[] przebieg = new Typy.zwr[5];

    public void Przebieg(String x){
        stan = false;
        for (int i=1;i<5;i++) przebieg[i]=Typy.zwr.nic;
        switch (x){
            case "AE":
                przebieg[0] = Typy.zwr.z1;
               break;
            case "AD":
                przebieg[0]= Typy.zwr.z1;
                przebieg[1]= Typy.zwr.z2;
                break;
            case "EW1":
                break;
            case "EW2":
                break;
            case "DW1":
                break;
            case "DW2":
                break;
        }

    }

    public void SetPrzebieg(Przebieg x){
         x.przebieg[0]
    }

    public boolean getStanPrzebieg(Przebieg x){
        return x.stan;
    }

    public Zwrotnica[] getPrzebieg(Przebieg x) {
        return x.przebieg;
    }
}
