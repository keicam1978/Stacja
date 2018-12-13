public class Stacja {

    public static void main(String[] args){




        Semafor semaforA = new Semafor();
        Semafor semaforB = new Semafor();
        Semafor samaforC = new Semafor();
        Semafor W1 = new Semafor();
        Semafor W2 = new Semafor();

        Zwrotnica Z1 = new Zwrotnica();
        Zwrotnica Z2 = new Zwrotnica();
        Zwrotnica Z3 = new Zwrotnica();
        Zwrotnica Z4a = new Zwrotnica();
        Zwrotnica Z4b = new Zwrotnica();
        Zwrotnica Z5 = new Zwrotnica();
        Zwrotnica Z6 = new Zwrotnica();

        Przebieg AE = new Przebieg("AE");

        System.out.println(AE.getPrzebieg(AE)[0]);
        //Z1.setStanZwr(false);
        ///System.out.println(Z1.getStanZwr(Z1));
        //Z1.setStanZwr(true);
        //System.out.println(Z1.getStanZwr(Z1));
    }

    private void stanStacji(){

    }

    private void wyswietl(){

    }

}
