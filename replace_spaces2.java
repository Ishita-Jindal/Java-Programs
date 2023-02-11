import java.util.*;
import java.util.Scanner; 
class replace_spaces2 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String string = scan.nextLine();
        char element = scan.next().charAt(0);
        String result = "";
        for(int i = 0; i<string.length(); i++){
            if(string.charAt(i) == ' '){
                result += element;
            }
            else{
                result += string.charAt(i);
            }
        }
        System.out.println(result);
    }
}
