public class TestMahasiswa {
public static void main(String[] args){
Mahasiswa MHS = new Mahasiswa();
Mahasiswa PTI = new Mahasiswa();
Mahasiswa PTE = new Mahasiswa();
System.out.println("IDENTITAS AWAL : ");
MHS.cetak();

MHS.ubah("DITA",2010,"Madiun");
System.out.println("IDENTITAS AKHIR : ");
MHS.cetak();

MHS.ubah("DANIAL",2011,"Madura");
System.out.println("IDENTITAS PTI : ");
MHS.cetak();

MHS.ubah("Hasan",2011,"Madinah");
System.out.println("IDENTITAS PTE : ");
MHS.cetak();
}
}