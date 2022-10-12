public class XeMay extends PTGT
{
    private double congSuat; 
    
    public XeMay(int sid,String hangSX,int namSX,double gia,String mau,double congSuat)
    {
        super(sid,hangSX,namSX,gia,mau);
        this.congSuat=congSuat;
    }
    
    public void setCongSuat(double congSuat)
    {
        this.congSuat=congSuat;
    }
    public double getCongSuat()
    {
        return this.congSuat;
    }
    @Override
    public void hienThongTin()
    {
        super.hienThongTin();
        System.out.println("Cong Suat: "+this.congSuat);
    }
}