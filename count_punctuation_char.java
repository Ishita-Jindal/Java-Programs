import java.util.Scanner;

class count_punctuation_char {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String string = scan.nextLine();
        char[] my_array = {',', ';', '!', '.', '?', '-', ':', '/', '\'', '\"'};
        int count = 0;
        for (int i = 0; i < string.length(); i++){
            for (int j = 0; j < my_array.length; j++){
                if(string.charAt(i) == my_array[j]){
                    System.out.println(string.charAt(i));
                    count++;
                    break;
                };
            }
        }
        System.out.println(count);
    }
}
