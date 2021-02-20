import java.util.ArrayList;
import java.util.Stack;

public class Num2 
{
    public static void main(String[] args)
    {
        System.out.println("split(\"()()()\") -> " + split("()()()"));
        System.out.println("split(\"((()))\") -> " + split("((()))"));
        System.out.println("split(\"((()))(())()()(()())\") -> " + split("((()))(())()()(()())"));
        System.out.println("split(\"((())())(()(()()))\") -> " + split("((())())(()(()()))"));
    }
    public static ArrayList<String> split(String str)
    {
        ArrayList<String> ret = new ArrayList<>();
        Stack<Character> bracketAnalizer = new Stack<>();

        String temp = "";
        for(int i = 0; i < str.length(); ++i)
        {
            if(str.charAt(i) == '(')
            {
                temp += '(';
                bracketAnalizer.push('(');
            }
            if(str.charAt(i) == ')')
            {
                temp += ')';
                bracketAnalizer.pop();
            }
            if(bracketAnalizer.empty()) 
            {
                ret.add(temp);
                temp = "";
            }
        }
        return ret;
    }    
}
