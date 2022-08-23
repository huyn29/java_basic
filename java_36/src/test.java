public class test {
    public static void main(String[] args) {
        date ngay1 = new date(15, 4, 1980);
        date ngay2 = new date(18, 9, 1980);
        date ngay3 = new date(5, 8, 1978);

        hangsx sx1 = new hangsx("hang 1", "trung quoc");
        hangsx sx2 = new hangsx("hang 2", "mi");
        hangsx sx3 = new hangsx("hang 3", "VN");

        bophim bophim1 = new bophim("huyn1", 2012, sx1, 2345, ngay1);
        bophim bophim2 = new bophim("huyn2", 2016, sx2, 89297, ngay2);
        bophim bophim3 = new bophim("huyn3", 2015, sx3, 9987482, ngay3);

        System.out.println("gia bp1 nho hon bp3: "+ bophim1.sosanhgaive(bophim3));
        System.out.println("ten hang san xuat: "+ bophim2.laytenhangsanxuat());
        System.out.println("gia sau khi khuyen mai: "+ bophim1.tinhtiensaugiamgia(50));
    }    
}
