public class Simulation
{
    private double shot;
    public Simulation()
    {
        shot = 0;
    }
    public boolean wentIn(double shotPct)
    {
        shot = (double)(Math.random()*100+1);
        if(shot<=shotPct)
        {
            return true;
        }
        return false;
    }


}