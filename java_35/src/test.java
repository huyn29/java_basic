public class test {
    public static void main(String[] args) {
        date day1 = new date(15,5,2021);
        date ngay2 = new date(14,2,2021);
        date ngay3 = new date(18,8,2021);

        tacgia tg1 = new tacgia("huyn29", day1);
        tacgia tg2 = new tacgia("thanh nga", ngay2);
        tacgia tg3 = new tacgia("haiNguyen", ngay3);

        sach s1 = new sach("toan hoc", 10.4, 2012,tg1);
        sach s2 = new sach("sinh hoc", 12, 2019, tg2);
        sach s3 = new sach("dia li", 89, 2033, tg3);

        s1.inTenSach();
        s2.inTenSach();
        s3.inTenSach();
        
        System.out.println("so sanh: "+ s1.kiemtracungnam(s3));
        System.out.println("Gia sau khi giam: "+ s3.giasaukhigiam(20));
    }
}
