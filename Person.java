import java.util.*;
public class Person {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<Integer, String> mp = new HashMap<>();
        System.out.print("Enter number of people: ");
        int p = sc.nextInt();
        sc.nextLine();

        for(int i = 1; i <= p; i++) {
            System.out.print("Enter name of person " + i + ": ");
            String str = sc.nextLine();
            mp.put(i, str);
        }

        List<String> arr = new ArrayList<>();
        for(int i = 1; i <= p; i++) {
            System.out.print("Enter tokens held by person " +i +": ");
            String st = sc.nextLine();
            arr.add(st);
        }

        while(true) {
            System.out.println("\n1.Search by name");
            System.out.println("2.Search by Token");
            System.out.println("3.Exit");
            int l = sc.nextInt();
            sc.nextLine();
            
            if(l == 1) {
                System.out.print("Enter name person name: ");
                String j = sc.nextLine();
                for(Map.Entry<Integer, String> mp1 : mp.entrySet()) {
                    if(mp1.getValue().equals(j)) {
                        System.out.println("Tokens: " + arr.get(mp1.getKey() - 1));
                    }
                }
            }
            else if(l == 2) {
                System.out.print("Enter the token number: ");
                int h = sc.nextInt();
                String h1 = h + "";
                for(int i = 0; i < arr.size(); i++) {
                    if(arr.get(i).contains(h1)) {
                        System.out.println("Token " + h + " belongs to: " + mp.get(i + 1));
                    }
                }
            }
            else if(l == 3) {
                break;
            }
        }
       
    }
}