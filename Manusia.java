public class Manusia{
	private String nama;
	private String jenisKelamin;
	private String umur;
	private String alamat;

	//setter
	public void setNama(String nama){
		this.nama = nama;
	}
	
	public void setJenisKelamin(String jenisKelamin){
		this.jenisKelamin = jenisKelamin;
	}

	public void setUmur(String umur){
		this.umur = umur;
	}

	public void setAlamat(String alamat){
		this.alamat = alamat;
	}



	public void cetakInfo() {
	System.out.println("Nama         : " + this.nama);
    System.out.println("JenisKelamin : " + this.jenisKelamin);
    System.out.println("Umur         : " + this.umur);
    System.out.println("Alamat       : " + this.alamat);
}
}

