package lang.immutable.testImmutable;

public class ImmutableMyDate {

  private final int year;
  private final int month;
  private final int day;

  public ImmutableMyDate(int year, int month, int day) {
    this.year = year;
    this.month = month;
    this.day = day;
  }

  public ImmutableMyDate withYear(int year) {
    return new ImmutableMyDate(year, month, day); // Immutable 이지만 값은 변경 가능하게
  }

  public ImmutableMyDate withMonth(int month) {
    return new ImmutableMyDate(year, month, day);
  }
  public ImmutableMyDate withDay(int day) {
    return new ImmutableMyDate(year, month, day);
  }


  @Override
  public String toString() {
    return year + "-" + month + "-" + day;
  }
}
