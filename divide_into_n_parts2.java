import java.util.*;
class divide_into_n_parts2 {

    static String solution(String string, int n){
        int x = string.length() / n;
        for (int i = 0; i< string.length(); i += x){
            System.out.println(string.substring(i, i+x));
        }
        return "";
    }
    
    static String check_division(String string, int n){
        String result = "Not Possible";
        if (string.length() % n != 0){
            return result;
        }
        return solution(string, n);
        
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String string = scan.nextLine();
        int n = scan.nextInt();
        check_division(string, n);
    }
}
