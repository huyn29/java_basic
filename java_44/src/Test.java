public class Test {
    public static void main(String[] args) {
        Toado td1 = new Toado(5, 5);
        Toado td2 = new Toado(7, 9);
        Toado td3 = new Toado(12, 1);

        // Hinh h = new Hinh(td1); ==> loi bien dich
        Hinh h1 = new Diem(td1);
        Hinh h2 = new Hinhchunhat(td2, 5, 10);
        Hinh h3 = new Hinhtron(td3, 5);

        System.out.println("Dt1: "+ h1.tinhdientich());
        System.out.println("Dt2: "+ h2.tinhdientich());
        System.out.println("Dt3: "+ h3.tinhdientich());

    }
}
