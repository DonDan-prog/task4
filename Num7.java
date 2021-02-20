public class Num7 
{
    public static void main(String[] args)
    {
        System.out.println("toStarShorthand(\"abbcccd\") -> " + toStarShorthand("abbcccd"));
        System.out.println("toStarShorthand(\"77777geff\") -> " + toStarShorthand("77777geff"));
        System.out.println("toStarShorthand(\"abc\") -> " + toStarShorthand("abc"));
        System.out.println("toStarShorthand(\"\") -> " + toStarShorthand(""));
    }
    
    public static String toStarShorthand(String str)
    {
        String ret = "";
        int strLen = str.length();
        for(int i = 0; i < strLen; i++)
        {
            ret += str.charAt(i);
            int j = i + 1;
            if(j < strLen)
                for(; j < strLen && str.charAt(j) == str.charAt(i); j++);
            if(j - i > 1)
            {
                ret += "*" + Integer.toString(j - i);
                i = j - 1;
            }
        }
        return ret;
    }
}
