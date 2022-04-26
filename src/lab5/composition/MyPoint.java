package lab5.composition;

/**
 * 2. Exercises on Composition
 *
 * <p>2.6 The MyPoint Class
 */
public class MyPoint {

  private int x;
  private int y;

  public MyPoint() {
    x = 0;
    y = 0;
  }

  public MyPoint(int x, int y) {
    this.x = x;
    this.y = y;
  }

  public int getX() {
    return x;
  }

  public void setX(int x) {
    this.x = x;
  }

  public int getY() {
    return y;
  }

  public void setY(int y) {
    this.y = y;
  }

  public int[] getXY() {
    return new int[]{x, y};
  }

  public void setXY(int x, int y) {
    this.x = x;
    this.y = y;
  }

  @Override
  public String toString() {
    return String.format("(%d, %d)", x, y);
  }

  public double distance(int x, int y) {
    return Math.sqrt(
        Math.pow(this.x - x, 2) + Math.pow(this.y - y, 2)
    );
  }

  public double distance(MyPoint another) {
    return Math.sqrt(
        Math.pow(this.x - another.getX(), 2) + Math.pow(this.y - another.getY(), 2)
    );
  }

  public double distance() {
    return Math.sqrt(x * x + y * y);
  }
}
