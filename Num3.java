public class Num3 
{
    public static void main(String[] args)
    {
        System.out.println("toCamelCase(\"hello_edabit\") -> " + toCamelCase("hello_edabit"));
        System.out.println("toSnakeCase(\"helloEdabit\") -> " + toSnakeCase("helloEdabit"));
        System.out.println("toCamelCase(\"is_modal_open\") -> " + toCamelCase("is_modal_open"));
        System.out.println("toSnakeCase(\"getColor\") -> " + toSnakeCase("getColor"));
    }
    public static String toCamelCase(String str)
    {
        String ret = "";
        for(int i = 0; i < str.length(); ++i)
        {
            if(str.charAt(i) == '_')
                ret += Character.toUpperCase(str.charAt(++i));
            else
                ret += str.charAt(i);
        }
        return ret;
    }
    public static String toSnakeCase(String str)
    {
        String ret = "";
        for(int i = 0; i < str.length(); ++i)
        {
            if(Character.isUpperCase(str.charAt(i)) == true)
                ret += "_" + Character.toLowerCase(str.charAt(i));
            else
                ret += str.charAt(i);
        }
        return ret;
    }
}
