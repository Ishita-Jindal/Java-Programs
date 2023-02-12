import java.util.Scanner;
class count_vowels_consonants {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String string = scan.nextLine();
        char[] vowels = {'a', 'e', 'i', 'o', 'u'};
        int vowels_count = 0;
        int Consonants = 0;
        boolean answer = false;
        string = string.toLowerCase();
        
        for(int i = 0; i < string.length(); i++){
            for(int j = 0; j < vowels.length; j++){
                if(string.charAt(i) == vowels[j]){
                    vowels_count++;
                    answer = true;
                    break; 
                }
            }
            if (answer == false && string.charAt(i) >= 'a' && string.charAt(i) <= 'z'){
                Consonants++;
                //System.out.println(string.charAt(i));
            }
            else{
                answer = false;
            }
        }
        System.out.println("vowels: " + vowels_count);
        System.out.println("Consonants: " + Consonants);
    }
}

