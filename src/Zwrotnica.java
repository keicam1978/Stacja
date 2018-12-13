public class Zwrotnica {

    private boolean stan;

    public Zwrotnica (){
        stan = true;
        }

    public boolean getStanZwr(Zwrotnica x)
    {
       return x.stan;
    }


    public void setStanZwr(boolean x)
    {
       //if (x.stan) x.stan=false;
       //else x.stan=true;
       stan = x;
    }

}
