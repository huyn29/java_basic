public abstract class Phuongtiendichuyen {
    protected String tenLoaiPhuongTien;
    protected Hangsx nhasx;
    public Phuongtiendichuyen(String tenLoaiPhuongTien, Hangsx nhasx){
        this.tenLoaiPhuongTien = tenLoaiPhuongTien;
        this.nhasx = nhasx;
    }
    public String getTenLoaiPhuongTien() {
        return tenLoaiPhuongTien;
    }
    public void setTenLoaiPhuongTien(String tenLoaiPhuongTien) {
        this.tenLoaiPhuongTien = tenLoaiPhuongTien;
    }
    public String laytenhangsx(){
        return this.nhasx.getName();
    }
    public abstract int vantoc();
}
