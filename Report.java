import java.io.*;

public class Report{
public static String bacaInputan(){
	String baca="";
	InputStreamReader input = new InputStreamReader (System.in);
	BufferedReader buf = new BufferedReader (input);
	try{
		baca = buf.readLine();
		}catch( Exception e ){
		System.out.println("Error!");
		}
		return baca;
}
public static void main(String[]sandy){
//digunakan untuk menangkap exception.
String name="";
int nilaiMatematika;
int nilaiFisika;
int nilaiKimia;
System.out.print("Masukkan nama : ");
name=bacaInputan();
System.out.print("masukkan Nilai Matematika : ");
nilaiMatematika=Integer.parseInt(bacaInputan());
System.out.print("Masukkan nilai Fisika : ");
nilaiFisika=Integer.parseInt(bacaInputan());
System.out.print("masukkan Nilai Kimia : ");
nilaiKimia=Integer.parseInt(bacaInputan());
System.out.print("\n----------------------------------------------\n");
System.out.println(""+name);
System.out.println("Nilai Kamu adalah");
System.out.println("Matematika"+nilaiMatematika);
System.out.println("Fisika"+nilaiFisika);
System.out.println("kimia"+nilaiKimia);
}
}