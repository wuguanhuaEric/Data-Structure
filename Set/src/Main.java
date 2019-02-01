public class Main
{
    private static double testSet(Set<String> set, String filename)
    {
        long startTime = System.nanoTime();

        long endTime = System.nanoTime();

        return (endTime - startTime) / 1000000000.0;
    }

    public static void main(String[] args)
    {

    }
}
