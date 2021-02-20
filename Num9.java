public class Num9 
{
    public static void main(String[] args)
    {
        System.out.println("trouble(451999277, 41177722899) -> " + trouble(451999277L, 41177722899L));
        System.out.println("trouble(1222345, 12345) -> " + trouble(1222345, 12345));
        System.out.println("trouble(666789, 12345667) -> " + trouble(666789, 12345667));
        System.out.println("trouble(33789, 12345337) -> " + trouble(33789, 12345337));
    }
    public static boolean trouble(long n1, long n2)
    {
        String num1 = Long.toString(n1);
        String num2 = Long.toString(n2);

        int start = 0;
        int numLen = num1.length();
        for(int i = 0; i < numLen; i++)
        {
            int j = i + 1;
            if(j < numLen - 1)
            {
                for(; num1.charAt(j) == num1.charAt(i) && j < numLen; j++);
                if(j - i == 3)
                    start = i;
            }
        }
        int index = num2.indexOf(num1.charAt(start));
        int i = index;
        for(;i < num2.length() && num1.charAt(start) == num2.charAt(i); i++);
        return (i - index) == 2;
    }
}
