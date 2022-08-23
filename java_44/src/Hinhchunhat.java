public class Hinhchunhat extends Hinh {
    private double chieurong, chieudai;

    public Hinhchunhat(Toado toado, double chieurong, double chieudai){
        super(toado);
        this.chieudai = chieudai;
        this.chieurong = chieurong;
    }
    public double getChieudai() {
        return chieudai;
    }
    public void setChieudai(double chieudai) {
        this.chieudai = chieudai;
    }
    public double getChieurong() {
        return chieurong;
    }
    public void setChieurong(double chieurong) {
        this.chieurong = chieurong;
    }
    @Override
    public double tinhdientich() {
        return this.chieudai * this.chieudai;
    }
}
