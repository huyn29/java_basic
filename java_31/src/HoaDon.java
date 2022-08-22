// Hoa don tinh tien ca phe
public class HoaDon {
    private String tenloaicafe;
    private double giatien1kg;
    private double khoiluong;

    public HoaDon(String ten, double gia, double kl){
        this.tenloaicafe = ten;
        this.giatien1kg = gia;
        this.khoiluong = kl;
    }
    public double tinhtien(){
        return this.giatien1kg* this.khoiluong;
    }
    public boolean ktkllh (double kl){
        return this.khoiluong > kl;
    }
    
}
