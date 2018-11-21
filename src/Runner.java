public class Runner
{
    public static void main(String[] args)
    {
        FrogSimulation frog1 = new FrogSimulation(30,5);
        FrogSimulation frog2 = new FrogSimulation(50,10);
        FrogSimulation frog3 = new FrogSimulation(15,2);

        System.out.println("Frog 1 Success Rate: " + frog1.runSimulations(5) + "\n");
        System.out.println("Frog 2 Success Rate: " + frog2.runSimulations(5) + "\n");
        System.out.println("Frog 3 Success Rate: " + frog3.runSimulations(5) + "\n");
    }
}
