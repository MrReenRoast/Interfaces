import java.util.ArrayList;
import java.awt.Rectangle;

public class BigRectLister {
    public static void main(String[] args) {
        ArrayList<Rectangle> rectangles = new ArrayList<>();
        rectangles.add(new Rectangle(0, 0, 1, 1));
        rectangles.add(new Rectangle(1, 1, 3, 4));
        rectangles.add(new Rectangle(2, 2, 2, 3));
        rectangles.add(new Rectangle(3, 3, 8, 4));
        rectangles.add(new Rectangle(4, 4, 2, 2));
        rectangles.add(new Rectangle(5, 5, 1, 2));
        rectangles.add(new Rectangle(6, 6, 4, 3));
        rectangles.add(new Rectangle(7, 7, 1, 3));
        rectangles.add(new Rectangle(8, 8, 100, 100));
        rectangles.add(new Rectangle(9, 9, 2, 1));

        BigRectangleFilter filter = new BigRectangleFilter();

        System.out.println("Rectangles with perimeter greater than 10: ");
        for (Rectangle rect : rectangles) {
            if (filter.accept(rect)){
                System.out.println(rect);
            }
        }
    }
}