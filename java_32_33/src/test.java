public class test {
    public static void main(String[] args) {
        my_date md = new my_date(31, 1, 2022);
        my_date md2 = new my_date(31,1,2022);
        System.out.println("Day: "+ md.getDay());
        md.setDay(26);
        System.out.println("Day: "+ md.getDay());
        System.out.println(md);

        // so sanh equals
        System.out.println("so sanh: "+ md.equals(md2));
        // hashcode
        System.out.println("md: " + md.hashCode());


    }
}
