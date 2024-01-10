import processing.core.PApplet;

public class Sketch extends PApplet {

  // ... existing code ...

  public void draw_section2() {
    int intX = 0;
    int intY = 0;

    for (int intRow = 0; intRow < 30; intRow++) {
      for (int intColumn = 0; intColumn < 30; intColumn++) {
        intX = 3 + 300; // Add 300 to x to shift everything over
        intY = 300 + 3 + 0;

        fill((intRow + intColumn) % 2 == 0 ? color(255) : color(0));
        noStroke();
        rect(intX, intY, 5, 5);
      }
    }
  }

  public void draw_section3() {
    int intX = 0;
    int intY = 0;

    for (int intRow = 0; intRow < 30; intRow++) {
      for (int intColumn = 0; intColumn < 30; intColumn++) {
        intX = 3 + 600; // Add 600 to x to shift everything over
        intY = 300 + 3 + 0;

        int colorValue = (intRow * intColumn) % 255;
        fill(color(255, colorValue, 0));
        noStroke();
        rect(intX, intY, 5, 5);
      }
    }
  }

  public void draw_section4() {
    int intX = 0;
    int intY = 0;

    for (int intRow = 0; intRow < 30; intRow++) {
      for (int intColumn = 0; intColumn < 30; intColumn++) {
        intX = 3 + 900; // Add 900 to x to shift everything over
        intY = 300 + 3 + 0;

        int colorValue = (intRow + intColumn) % 255;
        fill(color(colorValue, 0, 255));
        noStroke();
        rect(intX, intY, 5, 5);
      }
    }
  }

  public void draw_section5() {
    int intX = 0;
    int intY = 0;

    for (int intRow = 0; intRow < 30; intRow++) {
      intX = 3 + 0;
      intY = 3 + (intRow * 5);

      fill(0, 0, 255);
      noStroke();
      rect(intX, intY, 5, 5);
    }
  }

  public void draw_section6() {
    int intX = 0;
    int intY = 0;

    for (int intColumn = 0; intColumn < 30; intColumn++) {
      intX = 3 + 300;
      intY = 3 + 300 + (intColumn * 5);

      fill(255, 0, 0);
      noStroke();
      rect(intX, intY, 5, 5);
    }
  }

  public void draw_section7() {
    int intX = 0;
    int intY = 0;

    for (int intRow = 0; intRow < 30; intRow++) {
      intX = 3 + 600;
      intY = 3 + (intRow * 5);

      fill(0, 255, 0);
      noStroke();
      rect(intX, intY, 5, 5);
    }
  }

  public void draw_section8() {
    int intX = 0;
    int intY = 0;

    for (int intColumn = 0; intColumn < 30; intColumn++) {
      intX = 3 + 900;
      intY = 3 + 300 + (intColumn * 5);

      fill(255);
      noStroke();
      rect(intX, intY, 5, 5);
    }
  }

  // ... rest of the code ...

}
