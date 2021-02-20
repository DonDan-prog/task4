public class Num8 
{
    public static void main(String[] args)
    {
        System.out.println("doesRhyme(\"Sam I am!\", \"Green eggs and ham.\") -> " + doesRhyme("Sam I am!", "Green eggs and ham."));
        System.out.println("doesRhyme(\"Sam I am!\", \"Green eggs and HAM.\") -> " + doesRhyme("Sam I am!", "Green eggs and HAM."));
        System.out.println("doesRhyme(\"and frequently do?\", \"you gotta move.\") -> " + doesRhyme("and frequently do?", "you gotta move."));
    }
    public static boolean doesRhyme(String str1, String str2)
    {
        final String vowels = "aeiouy";

        String[] arr1 = str1.split(" ");    // getting the array of words
        String[] arr2 = str2.split(" ");
        String lastWord1 = arr1[arr1.length - 1];   // get the last word from string
        String lastWord2 = arr2[arr2.length - 1];

        String vowels1 = "";
        String vowels2 = "";
        for(int i = 0; i < lastWord1.length(); i++)
        {
            int index = vowels.indexOf(Character.toLowerCase(lastWord1.charAt(i)));
            if(index != -1)
                vowels1 += vowels.charAt(index);
        }
        for(int i = 0; i < lastWord2.length(); i++)
        {
            int index = vowels.indexOf(Character.toLowerCase(lastWord2.charAt(i)));
            if(index != -1)
                vowels2 += vowels.charAt(index);
        }

        return vowels1.equals(vowels2);
    }
}
