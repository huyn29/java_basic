public class tacgia {
    private String nameAuthor;
    private date Ngaysinh;

    // Contructor
    public tacgia(String nameAuthor, date Ngaysinh){
        this.nameAuthor = nameAuthor;
        this.Ngaysinh = Ngaysinh;
    }

    public String getNameAuthor() {
        return nameAuthor;
    }
    public void setNameAuthor(String nameAuthor) {
        this.nameAuthor = nameAuthor;
    }
    public void setNgaysinh(date ngaysinh) {
        Ngaysinh = ngaysinh;
    }
    public date getNgaysinh() {
        return Ngaysinh;
    }
}
