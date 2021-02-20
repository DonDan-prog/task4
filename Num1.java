public class Num1
{
    public static void main(String[] args)
    {
        System.out.println(bessi(10, 7, "hello my name is Bessie and this is my essay"));
    }
    public static String bessi(int n, int k, String str)
    {
        String ret = "";

        String[] arr = str.split(" ");

        int added = 0; // amount of added spaces
        String temp_str = "";
        for(int i = 0; i < n;)
        {
            String s = arr[i];
            if(temp_str.length() + s.length() - added <= k)
            {
                temp_str += s + ' ';
                added++;
                i++;
            }
            else
            {
                added = 0;
                ret += temp_str + '\n';
                temp_str = "";
            }
        }
        ret += temp_str + '\n';
        return ret;
    }
}