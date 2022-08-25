public class Fx500 implements MaytinhBotui{
    @Override
    public double cong(double a, double b) {
        return a+ b;
    }
    @Override
    public double tru(double a, double b) {
        return a- b;
    }
    @Override
    public double nhan(double a, double b) {
        return a*b;
    }
    @Override
    public double chia(double a, double b) {
        return a/b;
    }
    
}
