public class test {
    public static void main(String[] args) {
        Hangsx h1 = new Hangsx("samsung", "england");
        Phuongtiendichuyen p1 = new Maybay(h1);
        System.out.println("vantoc: "+ p1.vantoc());
        System.out.println("PT: "+ p1.laytenhangsx());
        System.out.println("ten: "+ p1.getTenLoaiPhuongTien());
    }
}
