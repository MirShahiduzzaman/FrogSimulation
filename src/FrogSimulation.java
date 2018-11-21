public class FrogSimulation
{
    private int goalDistance;
    private int maxHops;

    /**
     * constructor for FrogSimulation
     * @param dist distance the frog is trying to reach
     * @param numHops max number of hops frog can make in one simulation
     */
    public FrogSimulation(int dist, int numHops)
    {
        goalDistance = dist;
        maxHops = numHops;
    }

    /**
     * returns a random int representing the distance the frog jumped
     * @return a random int representing the distance the frog jumped
     */
    private int hopDistance()
    {
        int mult = 1;
        if(Math.random()*10+1>8)
        {
            mult = -1;
        }
        return((int)(Math.random()*10+1)*mult);
    }

    /**
     * runs one simulation using the goalDistance and maxHops
     * @return a boolean representing whether a frog passed the goal or not
     */
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

    /**
     * runs frog simulation for num times and returns a decimal representing the number of successes
     * @param num number of times to run simulation
     * @return double representing the proportion of successes out of all the simulations
     */
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
