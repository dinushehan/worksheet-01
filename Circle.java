public class Circle {
    int radius;
    int area;
    int circumference;
    final double pi=Math.PI;
    public void comuteArea() {
        area= (int) (pi*radius*radius);
    }
    public void computeCircumference() {
        circumference= (int) (2*pi*radius);
    }
    public void setRadius(int radius){
        this.radius=radius;
    }
}
