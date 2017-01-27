import java.io.*;

public class InputNama{
public static String bacaInputan(){
	String baca=" ";
	InputStreamReader input = new InputStreamReader (System.in);
	BufferedReader buf = new BufferedReader (input);
	try{
		baca=buf.readLine();
	} catch(IOException e){
		System.out.println("Error!");
	}
	return baca;
}
public static void main (String []args){
	//Digunakan untuk menangkap exception
	String name=" ";
	String karakter;
	System.out.println("Please Input Your Name : ");
	name=bacaInputan();
	System.out.println("Please Input Your Character  : ");
	karakter=bacaInputan();
	
	System.out.println("\n-----------------------------------------");
	System.out.println("Hello... My Name is  : "+name);
	System.out.println("I'am a very "+karakter+" person");
	}
}
