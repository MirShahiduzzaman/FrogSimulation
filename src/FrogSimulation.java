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
        int jump;
        System.out.print("Goal: " + goalDistance + " Hops:  ");

        while(hopNum<maxHops)
        {
            jump = hopDistance();
            System.out.print(jump + "  ");
            frogDist += jump;

            if(frogDist<0)
            {
                System.out.print("Failed Reached Negative Distance\n");
                return(false);
            }
            else
            {
                if(frogDist >= goalDistance)
                {
                    System.out.print("Success Final Distance: " + frogDist + "\n");
                    return(true);
                }
            }
            hopNum++;
        }
        System.out.print("Failed Final Distance: " + frogDist + "\n");
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
