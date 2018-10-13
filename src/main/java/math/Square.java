package math;

public class Square {

  private final long id;
  private final long value;
  private final long square;

  public Square(long id, long value) {
    this.id = id;
    this.value= value;
    this.square = value*value;
  }

  public long getId() {
    return id;
  }

  public long getValue() {
    return value;
  }

  public long getSquare() {
    return square;
  }
}
