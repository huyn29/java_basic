import java.util.Date;
public class PTGT
{
    private int sid;
    private String hangSX;
    private int namSX;
    private double gia;
    private String mau;
   

    public PTGT(int sid,String hangSX,int namSX,double gia,String mau)
    {
        this.sid=sid;
        this.hangSX=hangSX;
        this.namSX=namSX;
        this.gia=gia;
        this.mau=mau;
    }
    public void setSid(int sid)
    {
        this.sid=sid;
    }
    public void setHangSx(String hangSX)
    {
        this.hangSX=hangSX;
    }
    public void setNamSx(int namSX)
    {
        this.namSX=namSX;
    }
    public void setGia(double gia)
    {
        this.gia=gia;
    }
    public void setMau(String mau)
    {
        this.mau=mau;
    }
   
    public String getHangSX()
    {
        return this.hangSX;
    }
    public int getNamSX()
    {
        return this.namSX;
    }
    public double getGia()
    {
        return this.gia;
    }
    public String getMau()
    {
        return this.mau;
    }
    public int getSid()
    {
        return this.sid;
    }
    public void hienThongTin()
    {
        System.out.println("So id: " +this.sid);
        System.out.println("Hang san xuat: "+this.hangSX);
        System.out.println("Nam san xuat: "+this.namSX);
        System.out.println("Gia : "+this.gia);
        System.out.println("Mau: "+this.mau);
       
    }

}