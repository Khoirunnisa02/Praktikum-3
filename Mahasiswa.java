public class Mahasiswa extends Manusia {
private String nim;
private String jurusan;

//setter
	public void setNIM(String nim){
		this.nim = nim;
    }

    public void setJurusan(String jurusan){
        this.jurusan = jurusan;
    }

//getter
    public String getNIM(){
		return this.nim;
	}

    public String getJurusan(){
        return this.jurusan;
    }

    public void cetakInfo() {
    super.cetakInfo();
	System.out.println("NIM          : " + this.nim);
    System.out.println("Jurusan      : " + this.jurusan);
    }
}