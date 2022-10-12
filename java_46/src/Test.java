import java.sql.Array;
import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        Fx500 mt1 = new Fx500();
        System.out.println("5+3="+mt1.cong(5, 3));

        double[] arr= new double[] {1,4,6,7,8,3,2};

        SapXepChen sx1 = new SapXepChen();

        sx1.sapXepTang(arr);
        System.out.println(Arrays.toString(arr));

    }
}
