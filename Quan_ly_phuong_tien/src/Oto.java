public class Oto extends PTGT
{
    private int soCho;
    private String kieuDongCo;
    
    public Oto(int sid,String hangSX,int namSX,double gia,String mau,int soCho,String kieuDongCo)
    {
        super(sid,hangSX,namSX,gia,mau);
        this.soCho=soCho;
        this.kieuDongCo=kieuDongCo;
    }
    
    public void setSoChoNgoi(int soCho)
    {
        this.soCho=soCho;
    }
    public void setKieuDongCo(String kieuDongCo)
    {
        this.kieuDongCo=kieuDongCo;
    }
    @Override
    public void hienThongTin()
    {
        super.hienThongTin();
        System.out.println("So Cho ngoi: "+this.soCho);
        System.out.println("Kieu dong co: "+this.kieuDongCo);
    }
}