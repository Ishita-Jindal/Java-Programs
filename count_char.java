import java.util.*;
class count_char{
	public static void main(String[] args){
		Scanner str1 = new Scanner(System.in);
		String string1 = str1.nextLine();
		String space = " ";
		int count = 0;
		for(int i = 0; i< string1.length(); i++){
			char element = string1.charAt(i);
			char spaces = space.charAt(0);
			if(element == spaces){
				count = count + 1;
			}
		}
		System.out.println(string1.length()-count);
	}
}
    
