import java.util.Date;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
public class QuanLyPhuongTienGT
{

    private ArrayList ds=new ArrayList();
    
    public PTGT nhapOto(x) 
    {
        System.out.println("Nhap so id: ");
        int sid =sc.nextInt();

        System.out.print("Nhap hang san xuat: ");
        String hangSx=sc.nextLine();
        
        System.out.print("Nhap nam san xuat:");
        int namSX=sc.nextInt();
        
        System.out.print("Nhap gia xe:");
        double gia=sc.nextDouble();
        sc.nextLine();
        
        System.out.print("Nhap mau xe:");
        String mau=sc.nextLine();
        
        System.out.print("Nhap so cho ngoi:");
        int soCho=sc.nextInt();
        sc.nextLine();
        
        System.out.print("Nhap kieu dong co:");
        String kdc=sc.nextLine();
        
        return new Oto(sid,hangSx,namSX,gia,mau,soCho,kdc);
    }
    public PTGT nhapXeMay(Scanner sc) 
    {
        System.out.println("Nhap so id: ");
        int sid = sc.nextInt();

        System.out.print("Nhap hang san xuat: ");
        String hangSx=sc.nextLine();
        
        System.out.print("Nhap nam san xuat:");
        int namSX=sc.nextInt();
        
        System.out.print("Nhap gia xe:");
        double gia=sc.nextDouble();
        sc.nextLine();
        
        System.out.print("Nhap mau xe:");
        String mau=sc.nextLine();
        
        System.out.print("Nhap Cong Suat:");
        double congSuat=sc.nextDouble();
        
        
        return new XeMay(sid,hangSx,namSX,gia,mau,congSuat);
    }
    public PTGT nhapXeTai(Scanner sc) 
    {
        System.out.println("Nhap so id: ");
        int sid = sc.nextInt();

        System.out.print("Nhap hang san xuat: ");
        String hangSx=sc.nextLine();
        
        System.out.print("Nhap nam san xuat:");
        int namSX=sc.nextInt();
        
        System.out.print("Nhap gia xe:");
        double gia=sc.nextDouble();

        
        System.out.print("Nhap mau xe:");
        String mau=sc.nextLine();
        
        System.out.print("Nhap trong tai cua xe:");
        double trongTai=sc.nextDouble();
        
        XeTai xetai = new XeTai(sid,hangSx,namSX,gia,mau,trongTai);
        System.out.print(xetai.hienThongTin());
    }
    public void nhapDangKiPhuongTien()
    {
        Scanner x = new Scanner(System.in);
        char c;
        int chon=0;
        while(true)
        {
            System.out.print("Ban muon nhap loai xe nao (1-XeTai,2-Xemay,3-Oto):");
            chon=x.nextInt();
            //sc.nextLine();
            switch(chon)
            {
                case 1:{
                    ds.add(nhapXeTai(x));
                    break;
                }
                case 2:{
                    ds.add(nhapXeMay(x));
                    break;
                }
                case 3:{
                    ds.add(nhapOto(x));
                    break;
                }
                default:
                {
                    ds.add(nhapXeTai(x));
                    break;
                }
            }
            System.out.println("Ban co muon nhap nua khong: (Y/N)");
            c=sc.nextLine().charAt(0); // lấy kí tự đầu tiên nhập vào
            if(c=='N'||c=='n')
                break;
        }
    }
    // public void timKiemTheoMau(Scanner sc)
    // {
    //     System.out.print("Nhap mau can tim kiem:");
    //     String mauTk=sc.nextLine();
    //     for(int i=0;i < ds.size();i++)
    //     {
    //         String mau=ds.get(i).getMau();
    //         if(mau.equalsIgnoreCase(mauTk))
    //             ds.get(i).hienThongTin();
    //     }
    // }
    public void inra(){
        System.out.println(ds.get(1).hienThongTin());
    }
    // public void timKiemTheoNamSX(Scanner sc)
    // {
    //     System.out.print("Nhap nam  de tim kiem:");
    //     int nam=sc.nextInt();
    //     int tg=0;
    //     for(int i=0;i < ds.size();i++)
    //     {
    //        tg=ds.get(i).getNamSX();
    //        if(tg==nam)
    //             ds.get(i).hienThongTin();
    //     }
    // }
    public static void main(String[] args)
    {
        QuanLyPhuongTienGT PT=new QuanLyPhuongTienGT();
        Scanner sc=new Scanner(System.in);
        PT.nhapDangKiPhuongTien(sc);
        PT.inra();
        // PT.timKiemTheoMau(sc);
        // PT.timKiemTheoNamSX(sc);
    }
}