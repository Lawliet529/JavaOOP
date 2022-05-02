package lab8.polymorphism.shape;

import java.util.StringJoiner;

public class Rectangle extends Shape {

  protected double width;
  protected double length;

  public Rectangle() {
    super();
    width = 1.0;
    length = 1.0;
  }

  public Rectangle(double width, double length) {
    this.width = width;
    this.length = length;
  }

  public Rectangle(double width, double length, String color, boolean filled) {
    super(color, filled);
    this.width = width;
    this.length = length;
  }

  public double getWidth() {
    return width;
  }

  public void setWidth(double width) {
    this.width = width;
  }

  public double getLength() {
    return length;
  }

  public void setLength(double length) {
    this.length = length;
  }

  @Override
  public double getArea() {
    return width * length;
  }

  @Override
  public double getPerimeter() {
    return 2 * (width + length);
  }

  @Override
  public String toString() {
    return new StringJoiner(", ", Rectangle.class.getSimpleName() + "[", "]")
        .add(Shape.class.getSimpleName() + "[" + "color='" + color + "'")
        .add("filled=" + filled + "]")
        .add("width=" + width)
        .add("length=" + length)
        .toString();
  }
}
