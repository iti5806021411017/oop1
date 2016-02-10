import java.util.Scanner;
public class SevenDwarves {

	public static void main(String[] args) {
		int n1,n2,n3,n4,n5,n6,n7,n8,n9;
		Scanner scan = new Scanner(System.in);
			System.out.print("Enter Value 1 : ");
			n1=scan.nextInt();
			System.out.print("Enter Value 2 : ");
			n2=scan.nextInt();
			System.out.print("Enter Value 3 : ");
			n3=scan.nextInt();
			System.out.print("Enter Value 4 : ");
			n4=scan.nextInt();
			System.out.print("Enter Value 5 : ");
			n5=scan.nextInt();
			System.out.print("Enter Value 6 : ");
			n6=scan.nextInt();
			System.out.print("Enter Value 7 : ");
			n7=scan.nextInt();
			System.out.print("Enter Value 8 : ");
			n8=scan.nextInt();
			System.out.print("Enter Value 9 : ");
			n9=scan.nextInt();
		System.out.print("Result = ");
			
		// 12,13,14,15,16,17,18,19
		if((n3+n4+n5+n6+n7+n8+n9)==100)
			System.out.println(n3+" "+n4+" "+n5+" "+n6+" "+n7+" "+n8+" "+n9);
		if((n2+n4+n5+n6+n7+n8+n9)==100)
			System.out.println(n2+" "+n4+" "+n5+" "+n6+" "+n7+" "+n8+" "+n9);
		if((n2+n3+n5+n6+n7+n8+n9)==100)
			System.out.println(n2+" "+n3+" "+n5+" "+n6+" "+n7+" "+n8+" "+n9);
		if((n2+n3+n4+n6+n7+n8+n9)==100)
			System.out.println(n2+" "+n3+" "+n4+" "+n6+" "+n7+" "+n8+" "+n9);
		if((n2+n3+n4+n5+n7+n8+n9)==100)
			System.out.println(n2+" "+n3+" "+n4+" "+n5+" "+n7+" "+n8+" "+n9);
		if((n2+n3+n4+n5+n6+n8+n9)==100)
			System.out.println(n2+" "+n3+" "+n4+" "+n5+" "+n6+" "+n8+" "+n9);
		if((n2+n3+n4+n5+n6+n7+n9)==100)
			System.out.println(n2+" "+n3+" "+n4+" "+n5+" "+n6+" "+n7+" "+n9);
		if((n2+n3+n4+n5+n6+n7+n8)==100)
			System.out.println(n2+" "+n3+" "+n4+" "+n5+" "+n6+" "+n7+" "+n8);
	
		
		// 23,24,25,26,27,28,29
		if((n1+n4+n5+n6+n7+n8+n9)==100)
			System.out.println(n1+" "+n4+" "+n5+" "+n6+" "+n7+" "+n8+" "+n9);
		if((n1+n3+n5+n6+n7+n8+n9)==100)
			System.out.println(n1+" "+n3+" "+n5+" "+n6+" "+n7+" "+n8+" "+n9);
		if((n1+n3+n4+n6+n7+n8+n9)==100)
			System.out.println(n1+" "+n3+" "+n4+" "+n6+" "+n7+" "+n8+" "+n9);
		if((n1+n3+n4+n5+n7+n8+n9)==100)
			System.out.println(n1+" "+n3+" "+n4+" "+n5+" "+n7+" "+n8+" "+n9);
		if((n1+n3+n4+n5+n6+n8+n9)==100)
			System.out.println(n1+" "+n3+" "+n4+" "+n5+" "+n6+" "+n8+" "+n9);
		if((n1+n3+n4+n5+n6+n7+n9)==100)
			System.out.println(n1+" "+n3+" "+n4+" "+n5+" "+n6+" "+n7+" "+n9);
		if((n1+n3+n4+n5+n6+n7+n8)==100)
			System.out.println(n1+" "+n3+" "+n4+" "+n5+" "+n6+" "+n7+" "+n8);
		
		// 34,35,36,37,38,39
		if((n1+n2+n5+n6+n7+n8+n9)==100)
			System.out.println(n1+" "+n2+" "+n5+" "+n6+" "+n7+" "+n8+" "+n9);
		if((n1+n2+n4+n6+n7+n8+n9)==100)
			System.out.println(n1+" "+n2+" "+n4+" "+n6+" "+n7+" "+n8+" "+n9);
		if((n1+n2+n4+n5+n7+n8+n9)==100)
			System.out.println(n1+" "+n2+" "+n4+" "+n5+" "+n7+" "+n8+" "+n9);
		if((n1+n2+n4+n5+n6+n8+n9)==100)
			System.out.println(n1+" "+n2+" "+n4+" "+n5+" "+n6+" "+n8+" "+n9);
		if((n1+n2+n4+n5+n6+n7+n9)==100)
			System.out.println(n1+" "+n2+" "+n4+" "+n5+" "+n6+" "+n7+" "+n9);
		if((n1+n2+n4+n5+n6+n7+n8)==100)
			System.out.println(n1+" "+n2+" "+n4+" "+n5+" "+n6+" "+n7+" "+n8);
		
		// 45,46,47,48,49
		if((n1+n2+n3+n6+n7+n8+n9)==100)
			System.out.println(n1+" "+n2+" "+n3+" "+n6+" "+n7+" "+n8+" "+n9);
		if((n1+n2+n3+n5+n7+n8+n9)==100)
			System.out.println(n1+" "+n2+" "+n3+" "+n5+" "+n7+" "+n8+" "+n9);
		if((n1+n2+n3+n5+n6+n8+n9)==100)
			System.out.println(n1+" "+n2+" "+n3+" "+n5+" "+n6+" "+n8+" "+n9);
		if((n1+n2+n3+n5+n6+n7+n9)==100)
			System.out.println(n1+" "+n2+" "+n3+" "+n5+" "+n6+" "+n7+" "+n9);
		if((n1+n2+n3+n5+n6+n7+n8)==100)
			System.out.println(n1+" "+n2+" "+n3+" "+n5+" "+n6+" "+n7+" "+n8);
		
		// 56,57,58,59
		if((n1+n2+n3+n4+n7+n8+n9)==100)
			System.out.println(n1+" "+n2+" "+n3+" "+n4+" "+n7+" "+n8+" "+n9);
		if((n1+n2+n3+n4+n6+n8+n9)==100)
			System.out.println(n1+" "+n2+" "+n3+" "+n4+" "+n6+" "+n8+" "+n9);
		if((n1+n2+n3+n4+n6+n7+n9)==100)
			System.out.println(n1+" "+n2+" "+n3+" "+n4+" "+n6+" "+n7+" "+n9);
		if((n1+n2+n3+n4+n6+n7+n8)==100)
			System.out.println(n1+" "+n2+" "+n3+" "+n4+" "+n6+" "+n7+" "+n8);
		
		// 67,68,69
		if((n1+n2+n3+n4+n5+n8+n9)==100)
			System.out.println(n1+" "+n2+" "+n3+" "+n4+" "+n5+" "+n8+" "+n9);
		if((n1+n2+n3+n4+n5+n7+n9)==100)
			System.out.println(n1+" "+n2+" "+n3+" "+n4+" "+n5+" "+n7+" "+n9);
		if((n1+n2+n3+n4+n5+n7+n8)==100)
			System.out.println(n1+" "+n2+" "+n3+" "+n4+" "+n5+" "+n7+" "+n8);
		
		// 78,79
		if((n3+n4+n5+n6+n7+n8+n9)==100)
			System.out.println(n1+" "+n2+" "+n3+" "+n4+" "+n5+" "+n6+" "+n9);
		if((n1+n2+n3+n4+n5+n6+n8)==100)
			System.out.println(n1+" "+n2+" "+n3+" "+n4+" "+n5+" "+n6+" "+n8);
		
		// 89
		if((n1+n2+n3+n4+n5+n6+n7)==100)
			System.out.println(n1+" "+n2+" "+n3+" "+n4+" "+n5+" "+n6+" "+n7);
	}

}
