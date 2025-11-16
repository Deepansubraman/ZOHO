public class hello {
    public static void main(String[] args) {
       
       String str="A man, in the boat says : I see 1-2-3 in the sky";
       char[] arr=str.toCharArray();
      
       int right=str.length()-1;
       int left=0;
       while(right>=left)
       {
        if(arr[right]==' ' || arr[right]==',' || arr[right]=='-' )
        {
            right--;
        }
        else if(arr[left]==' ' || arr[left]==',' || arr[left]=='-' )
        {
            left++;
        }
        else{
            char temp=arr[right];
            arr[right]=arr[left];
            arr[left]=temp;
            right--;
            left++;
        }
       }
       for(int i=0;i<arr.length;i++)
       {
        System.out.print(arr[i]);
       }
      
    }
}
 