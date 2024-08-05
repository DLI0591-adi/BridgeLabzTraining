package Day1;

public class seventh {
    int length;
    int width;
    seventh(int length, int width)
    {
        this.length = length;
        this.width = width;
    }
    int area()
    {
        return length*width;
    }
    int perimeter()
    {
        return 2*(length+width);
    }

    public static void main(String[] args) {
        seventh obj = new seventh(13,14);
        System.out.println("Area of rectangle :"+obj.area());
        System.out.println("Perimeter of rectangle :"+obj.perimeter());
    }
}

