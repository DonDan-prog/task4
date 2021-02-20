public class Num10 
{
    public static void main(String[] args)
    {
        System.out.println("countUniqueBooks(\"AZYWABBCATTTA\", \'A\') -> " + countUniqueBooks("AZYWABBCATTTA", 'A'));
        System.out.println("countUniqueBooks(\"$AA$BBCATT$C$$B$\", \'$\') -> " + countUniqueBooks("$AA$BBCATT$C$$B$", '$'));
        System.out.println("countUniqueBooks(\"ZZABCDEF\", \'Z\') -> " + countUniqueBooks("ZZABCDEF", 'Z'));
    }
    public static int countUniqueBooks(String input, char delimiter)
    {
        int count = 0;

        int first = 0;
        int second = 0;
        while((first = input.indexOf(delimiter, second)) != -1)
        {
            String temp = "";
            second = input.indexOf(delimiter, first + 1);
            for(int i = first + 1; i < second; i++)
            {
                char c = input.charAt(i);
                if(temp.indexOf(c) == -1)
                    temp += c;
            }
            count += temp.length();
            second++;
        }
        return count;
    }
}
