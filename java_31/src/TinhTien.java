public class TinhTien {
    public static void main(String[] args) {
        HoaDon bill = new HoaDon("Trung Nguyen", 100, 1.5);
        System.out.println("Tong tien: " + bill.tinhtien());
        System.out.println(bill.ktkllh(2));
    }
}
