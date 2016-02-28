import java.util.Scanner;

public class Encode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text;
		char a;
		Scanner s = new Scanner(System.in);
		System.out.print("Enter text Encode : ");
		text=s.nextLine();
		text=text.toUpperCase();
		for(int i=text.length()-1;i>=0;i--){
			a = text.charAt(i);
			if(a == 'E'){
				a ='R';
			}
			else if(a == 'R'){
				a = 'W';
			}
			else if(a == 'W'){
				a = 'E';
			}
			System.out.print(a);
		}
		s.close();
	}

}
