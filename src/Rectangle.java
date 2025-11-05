public class Rectangle {
    private double width;
    private double length;

    public Rectangle(double width, double length){
        this.width = width;
        this.length = length;
    }

    public double area(){
        return width * length;
    }

    public double perimeter(){
        return 2*width + 2*length;
    }

    public boolean isSmaller(Rectangle r1){
        if (this.area() < r1.area()){
            return true;
        }
        else{
            return false;
        }
    }

    public static void main(String[]args){
        Rectangle r1 = new Rectangle(3.0, 5.0);
        Rectangle r2 = new Rectangle(4.0, 6.0);
        System.out.println(r1.isSmaller(r2));
    }

}
