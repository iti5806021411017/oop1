import java.util.Scanner;
public class Trik {
	public static void main(String[] args) {
			int left=1,center=0,right=0,temp;
			String swap;
			Scanner scan = new Scanner(System.in);
			do{
				System.out.print("Enter Value : ");
				swap = scan.next();
			}while(swap.length() > 50 || swap.length() < 1 || swap.length() == 0 ||
					(swap.charAt(0) != 'A' && swap.charAt(0) != 'B'  && swap.charAt(0) != 'C'
					 && swap.charAt(0) != 'a'  && swap.charAt(0) != 'b'  && swap.charAt(0) != 'c'));
			int i=0;
			while(i<swap.length()){
				if(swap.charAt(i) == 'A' || swap.charAt(i) == 'a'){
					temp=left;
					left=center;
					center=temp;
				}else if(swap.charAt(i) == 'B' || swap.charAt(i) == 'b'){
					temp=center;
					center=right;
					right=temp;
				}else{
					temp=left;
					left=right;
					right=temp;
				}
				i++;
			}
			if(left == 1) System.out.println("1");
			else if(center == 1) System.out.println("2");
			else System.out.println("3");
	}

}
