public class bophim {
    private String tenphim;
    private int namSx;
    private hangsx nhasx;
    private double giave;
    private date ngaychieu;

    // Contructor

    public bophim(String tenphim, int namSx, hangsx nhasx, double giave, date ngaychieu){
        this.tenphim = tenphim;
        this.namSx = namSx;
        this.nhasx = nhasx;
        this.giave = giave;
        this.ngaychieu = ngaychieu;
    }
    public String getTenphim() {
        return tenphim;
    }
    public void setTenphim(String tenphim) {
        this.tenphim = tenphim;
    }
    public int getNamSx() {
        return namSx;
    }
    public void setNamSx(int namSx) {
        this.namSx = namSx;
    }
    public hangsx getNhasx() {
        return nhasx;
    }
    public void setNhasx(hangsx nhasx) {
        this.nhasx = nhasx;
    }
    public double getGiave() {
        return giave;
    }
    public void setGiave(double giave) {
        this.giave = giave;
    }
    public date getNgaychieu() {
        return ngaychieu;
    }
    public void setNgaychieu(date ngaychieu) {
        this.ngaychieu = ngaychieu;
    }

    public boolean sosanhgaive(bophim bophimkhac){
        return this.giave < bophimkhac.giave;
    }
    public String laytenhangsanxuat(){
        return this.nhasx.getTenHangsx();
    }
    public double tinhtiensaugiamgia(int x){
        double g = (double)x;
        //System.out.println(g);
        return this.giave*(1-g/100);
    }
}   