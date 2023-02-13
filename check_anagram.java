import java.util.Scanner;
import java.util.Arrays;
class check_anagram {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String string1 = scan.nextLine();
        String string2 = scan.nextLine();
        char[] arr1 = string1.toCharArray();
        char[] arr2 = string2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        System.out.println(Arrays.equals(arr1, arr2));
    }
}
