public class Dog extends Animal {
    public Dog(){
        super("Dog");
    }
    @Override
    public void eat() {
        System.out.println("toi an xuong");
    }
    @Override
    public void makesound() {
        System.out.println("gau gau");
    }
}
