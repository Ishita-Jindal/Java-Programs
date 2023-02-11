import java.util.*;
import java.util.Scanner;

class replace_space {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String string = scan.nextLine();
        char element = scan.next().charAt(0);
        string = string.replace(' ', element);
        System.out.println(string);
    }
}
