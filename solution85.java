public class solution85 {
    public int compress(char[] chars) {
        StringBuilder sb = new StringBuilder();
        int  n = chars.length;
        int count = 1;
        sb.append(chars[0]);
        for(int i=1;i<n;i++)
        {
            char curr = chars[i];
            char prev = chars[i-1];
            if(prev==curr)
            {
                count++;
            }
            if(prev!=curr)
            {   if(count>1)
                sb.append(count);
                sb.append(curr);
                count = 1;
            }
        }
        if(count>1)
        {
            sb.append(count);
        }

        for(int i=0;i<sb.length();i++)
        {
            chars[i]=sb.charAt(i);
        }
        return sb.length();
    }

    public static void main(String[] args) {
        solution85 s85=new solution85();
        System.out.println( s85.compress(new char[] {'a','a','b','b','c','c','c'}));
    }
}
