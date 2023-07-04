class ValidParentheses{
    public boolean isValid(String str) {
        Stack<Character> s = new Stack<>();
        for(int i=0;i<str.length();i++)
        {
            char x = str.charAt(i);
            if(isOpening(x))
            {
                s.push(x);
            }
            else
            {
                if(s.isEmpty())
                {
                    return false;
                }
                else if(!isMatching(s.peek(),x))
                {
                    return false;
                }
                else
                {
                    s.pop();
                }
            }
        }
            return s.isEmpty();
    }
    boolean isOpening(char c)
    {
        return c == '(' || 
           c == '[' ||
           c == '{';
    }
    boolean isMatching(char m,char n)
    {
        return (m == '(' && n == ')') || 
           (m == '{' && n == '}') || 
           (m == '[' && n == ']') ;
    }
}
