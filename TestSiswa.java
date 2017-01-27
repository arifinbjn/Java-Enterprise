public class TestSiswa{
public static void main (String[] args){
Siswa SSW=new Siswa();
System.out.println("IDENTITAS AWAL : ");
SSW.cetak();
SSW.ubah("Sony Aditya",2014,"Malang");
System.out.println("IDENTITAS AKHIR : ");
SSW.cetak();
}
}