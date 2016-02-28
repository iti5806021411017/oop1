import java.util.Scanner;
public class decode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text;
		char a;
		Scanner s = new Scanner(System.in);
		System.out.print("Enter text Decode : ");
		text=s.nextLine();
		text=text.toUpperCase();
		for(int i=text.length()-1;i>=0;i--){
			a = text.charAt(i);
			if(a == 'R'){
				a ='E';
			}
			else if(a == 'W'){
				a = 'R';
			}
			else if(a == 'E'){
				a = 'W';
			}
			System.out.print(a);
		}
		s.close();
	}	

}
