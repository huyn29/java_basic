public class sach {
    private String bookname;
    private double price;
    private int namxuatban;
    private tacgia author;
    
    // Contructor
    public sach(String bookname, double price, int namxuatban, tacgia author){
        this.bookname = bookname;
        this.price = price;
        this.namxuatban = namxuatban;
        this.author = author;
    }
    public String getBookname() {
        return bookname;
    }
    public void setBookname(String bookname) {
        this.bookname = bookname;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public int getNamxuatban() {
        return namxuatban;
    }
    public void setNamxuatban(int namxuatban) {
        this.namxuatban = namxuatban;
    }
    public tacgia getTacgia() {
        return author;
    }
    public void setTacgia(tacgia author) {
        this.author = author;
    }
    public void inTenSach (){
         System.out.println(this.bookname);
    }

    public boolean kiemtracungnam (sach sachkhac){
            return this.namxuatban == sachkhac.namxuatban;
    }
    public double giasaukhigiam(double x){
        return this.price*(1-x/100);
    }
}
