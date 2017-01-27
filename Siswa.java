public class Siswa {
public String nama;
public int angkatan;
public String asal;
public Siswa () {
nama = "Ani";
angkatan = 2014;
asal = "Surabaya";
}
public void ubah (String nm, int ak, String as){
nama = nm;
angkatan = ak;
asal = as;
}
public void cetak (){
System.out.println("nama : "+nama);
System.out.println("angkatan : "+angkatan);
System.out.println("asal : "+asal);
}
}

