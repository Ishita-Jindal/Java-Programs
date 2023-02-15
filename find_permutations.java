import java.util.*;
import java.util.Scanner;
class find_permutations {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String string = scan.nextLine();
        for (int i = 0; i < string.length(); i++){
            String result = "";
            result += string.charAt(i);
            System.out.println(result);
            for (int j = i+1; j<string.length(); j++){
                result += string.charAt(j);
                System.out.println(result);
            }
        }
    }
}
