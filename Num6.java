public class Num6 
{
    public static void main(String[] args)
    {
        System.out.println("bugger(39) -> " + bugger(39));
        System.out.println("bugger(999) -> " + bugger(999));
        System.out.println("bugger(4) -> " + bugger(4));
    }
    public static int bugger(int n)
    {
        int new_n = n;
        int iteration = 0;
        while(new_n > 10)
        {
            int temp = new_n;
            new_n = 1;
            while(temp > 0)
            {
                new_n *= temp % 10;
                temp /= 10;
            }
            iteration++;
        } 
        return iteration;
    }
}
