public class Main {
    public static void main(String[] args) {
        Circle small_circle=new Circle();
        Circle big_circle=new Circle();
        int r_small=7;
        int r_big=14;
        small_circle.setRadius(r_small);
        big_circle.setRadius(r_big);
        small_circle.comuteArea();
        big_circle.comuteArea();
        System.out.println("shaded area= "+(big_circle.area-small_circle.area)+"cm^2");
    }
}