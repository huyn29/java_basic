public class XeTai extends PTGT
{
    private double trongTai;
    
    public XeTai(int sid,String hangSX,int namSX,double gia,String mau,double trongTai)
    {
        super(sid,hangSX,namSX,gia,mau);
        this.trongTai=trongTai;
    }
    
    public void setTrongTai(double trongTai)
    {
        this.trongTai=trongTai;
    }
    public double getTrongTai()
    {
        return this.trongTai;
    }
    @Override
    public void hienThongTin()
    {
        super.hienThongTin();
        System.out.println("Trong tai cua xe la: "+this.trongTai);
    }
}