public class manager extends pegawai {
    private double Tunjangan;

    public void setTunjangan(double Tunjangan) {
        this.Tunjangan = Tunjangan;
    }

    public double getTunjangan() {
        return this.Tunjangan;
    }

    public void cetakInfo() {
        super.cetakInfo();

        System.out.println("Tunjangan   : " + getTunjangan());
    }
}