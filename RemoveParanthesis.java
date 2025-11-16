import java.util.*;

public class RemoveParanthesis {
    public static void main(String[] args) {
        String str = "((abc)((de))";
        ArrayList<Integer> arr = new ArrayList<>();
        Stack<HashMap<Character,Integer>> st = new Stack<>();
        for(int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);
            if(ch=='(')
            {
               HashMap<Character, Integer> map = new HashMap<>();
                map.put('(', i);
                st.push(map);

            }
            if(!st.isEmpty() && ch==')')
            {
                st.pop();
            }
        }
         ArrayList<Integer>arr1=new ArrayList<>();
        while(!st.isEmpty())
        {
            HashMap<Character,Integer>map=st.pop();
            arr1.add(map.get('('));
        }
       
        int j=0;
        String s="";
        for (int i = 0; i < str.length(); i++) {
            if(j < arr1.size() && arr1.get(j)==i)
            {
                j++;
                continue;
                
            }
            else{
                s+=str.charAt(i);
            }
        }
        System.out.println(s);
    }
}