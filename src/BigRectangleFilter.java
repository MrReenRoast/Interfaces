import java.awt.Rectangle;

public class BigRectangleFilter implements Filter {
    public boolean accept(Object x) {
        if (x instanceof Rectangle rect) {
            int perimeter = 2 * (rect.width + rect.height);

            return perimeter > 10;
        }
        return false;
    }
}