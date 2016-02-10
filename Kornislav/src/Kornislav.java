import java.util.Scanner;
public class Kornislav {

	public static void main(String[] args) {
		int v1,v2,v3,v4,temp;
		Scanner read = new Scanner(System.in);
		
		System.out.print("Enter Value(1) : ");
		v1 = read.nextInt();
		System.out.print("Enter Value(2) : ");
		v2 = read.nextInt();
		System.out.print("Enter Value(3) : ");
		v3 = read.nextInt();
		System.out.print("Enter Value(4) : ");
		v4 = read.nextInt();
		if(v1 != 0 && v2 != 0 && v3 !=0 && v4 != 0){
			if(v2 < v1){
				temp = v2;
				v2 = v1;
				v1 = temp;
			}
			if(v3 < v1){
				temp = v3;
				v3 = v1;
				v1 = temp;
			}
			if(v4 < v1){
				temp = v4;
				v4 = v1;
				v1 = temp;
			}
			if(v3 < v2){
				temp = v3;
				v3 = v2;
				v2 = temp;
			}
			if(v4 < v2){
				temp = v4;
				v4 = v2;
				v2 = temp;
			}
			if(v4 < v3){
				temp = v4;
				v4 = v3;
				v3 = temp;
			}
		}
		System.out.println("Area = "+(int)v1*v3);

	}

}
