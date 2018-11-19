public class FrogSimulation
{
    private int goalDistance;
    private int maxHops;

    public FrogSimulation(int dist, int numHops)
    {
        goalDistance = dist;
        maxHops = numHops;
    }

    private int hopDistance()
    {
        int mult = 1;
        if(Math.random()*10+1>8)
        {
            mult = -1;
        }
        return((int)(Math.random()*10+1)*mult);
    }

    public boolean simulate()
    {
        int frogDist = 0;
        int hopNum = 0;
        int jump = hopDistance();

        while(hopNum<maxHops)
        {
            frogDist += jump;

            String out = "";

            out = "Goal: " + goalDistance;
            out += "Hops:  ";
            
            if(frogDist<0)
            {
                return(false);
            }
            else
            {
                if(frogDist >= goalDistance)
                {
                    return(true);
                }
            }
            hopNum++;
        }
        return(false);
    }

    public double runSimulations(int num)
    {
        int success = 0;

        for(int i = 0;i<num;i++)
        {
            if(simulate())
            {
                success++;
            }
        }
        return((double)success)/num;
    }
}
