public class Overloading{
static int tambah (int a, int b){
		return a+b;
	}
	static double tambah (double a, double b){
		return a+b;
	}
	static int tambah (int a, int b, int c){
		return a+b+c;
	}
	
public static void main(String[]args){
	int a=3;
	int b=4;
	int c=8;
System.out.println("1.  " +(a+b));
	System.out.println("2. a(3) + b(4) = " +(a+b));
	System.out.println("3. " +(a+b+c));
	System.out.println("4. " +(a+b+(7.5)));
}}