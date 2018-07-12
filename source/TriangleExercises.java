class TriangleExercises {

  void easiestExerciseEver() {
    System.out.println("*");
  }

  void drawAHorizonalLine(int n) {
    String asterisk = "";
    for (int i = 0; i < n; i++) {
      asterisk += "*";
    }
    System.out.println(asterisk);
  }

  void drawAVerticalLine(int n) {
    String asterisk = "";
    for (int i = 0; i < n; i++) {
      asterisk += ("*\n");
    }
    System.out.println(asterisk);
  }

}

class TriangleExercisesTestDrive {
  public static void main(String[] args) {

    TriangleExercises triangle = new TriangleExercises();

    System.out.println("Print one asterisk to the console");
    triangle.easiestExerciseEver();
    System.out.println("Given Given a number n, print n asterisks on one line.");
    triangle.drawAHorizonalLine(8);
    System.out.println("Given a number n, print n lines, each with one asterisks");
    triangle.drawAVerticalLine(3);
  }

}
