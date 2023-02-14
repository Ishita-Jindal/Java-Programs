import java.util.*;
class divide_into_n_parts {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String string = scan.nextLine();
        int n = scan.nextInt();
        int x = string.length() / n;
        for (int i = 0; i< string.length(); i += x){
            System.out.println(string.substring(i, i+x));
        }
    }
}
