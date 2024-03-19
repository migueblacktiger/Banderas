import java.awt.Color;

public class banderas {
  public static final int YELLOW = new Color(250, 201, 20).getRGB();
  public static final int BLUE = new Color(17, 13, 99).getRGB();
  public static final int RED = new Color(196, 0, 15).getRGB();
  public static final int BLACK = new Color(5, 5, 5).getRGB();
  public static final int WHITE = new Color(255, 255, 255).getRGB();
  public static final int GREEN = new Color(35, 138, 51).getRGB();

  public static void main(String[] args) {
    int[][] flagMatrix = {};

    for (int h = 1; h <= 2; h += 1)
      for (int w = 1; w <= 2; w += 1) {
        flagMatrix = banderaSuiza(h * 12, w * 24);

        JOptionPaneArrays.showColorArray2D(null, flagMatrix);

      }

  }

  public static int[][] banderaColombia(int height, int width) {
    int[][] flag = new int[height][width];
    int rowIni = 0, rowEnd = 0, colIni = 0, colEnd = 0;// no recomendable poner variables juntas
    rowIni = (height * 0) / 4;
    rowEnd = (height * 2) / 4;
    colIni = (width * 0) / 1;
    colEnd = (width * 1) / 1;
    for (int r = rowIni; r < rowEnd; r += 1)
      for (int c = colIni; c < colEnd; c += 1)
        flag[r][c] = YELLOW;

    rowIni = (height * 2) / 4;
    rowEnd = (height * 3) / 4;
    colIni = (width * 0) / 1;
    colEnd = (width * 1) / 1;
    for (int r = rowIni; r < rowEnd; r += 1)
      for (int c = colIni; c < colEnd; c += 1)
        flag[r][c] = BLUE;

    rowIni = (height * 3) / 4;
    rowEnd = (height * 4) / 4;
    colIni = (width * 0) / 1;
    colEnd = (width * 1) / 1;
    for (int r = rowIni; r < rowEnd; r += 1)
      for (int c = colIni; c < colEnd; c += 1)
        flag[r][c] = RED;

    return flag;

  }

  public static int[][] banderaVenezuela(int height, int width) {
    int[][] flag = new int[height][width];
    int rowIni = 0, rowEnd = 0, colIni = 0, colEnd = 0;// no recomendable poner variables juntas
    rowIni = (height * 0) / 3;
    rowEnd = (height * 1) / 3;
    colIni = (width * 0) / 1;
    colEnd = (width * 1) / 1;
    for (int r = rowIni; r < rowEnd; r += 1)
      for (int c = colIni; c < colEnd; c += 1)
        flag[r][c] = YELLOW;

    rowIni = (height * 1) / 3;
    rowEnd = (height * 2) / 3;
    colIni = (width * 0) / 1;
    colEnd = (width * 1) / 1;
    for (int r = rowIni; r < rowEnd; r += 1)
      for (int c = colIni; c < colEnd; c += 1)
        flag[r][c] = BLUE;

    rowIni = (height * 2) / 3;
    rowEnd = (height * 3) / 3;
    colIni = (width * 0) / 1;
    colEnd = (width * 1) / 1;
    for (int r = rowIni; r < rowEnd; r += 1)
      for (int c = colIni; c < colEnd; c += 1)
        flag[r][c] = RED;

    return flag;

  }

  public static int[][] banderaPolonia(int height, int width) {
    int[][] flag = new int[height][width];
    int rowIni = 0, rowEnd = 0, colIni = 0, colEnd = 0;// no recomendable poner variables juntas
    rowIni = (height * 0) / 2;
    rowEnd = (height * 1) / 2;
    colIni = (width * 0) / 1;
    colEnd = (width * 1) / 1;
    for (int r = rowIni; r < rowEnd; r += 1)
      for (int c = colIni; c < colEnd; c += 1)
        flag[r][c] = WHITE;

    rowIni = (height * 1) / 2;
    rowEnd = (height * 2) / 2;
    colIni = (width * 0) / 1;
    colEnd = (width * 1) / 1;
    for (int r = rowIni; r < rowEnd; r += 1)
      for (int c = colIni; c < colEnd; c += 1)
        flag[r][c] = RED;

    return flag;

  }

  public static int[][] banderaPanama(int height, int width) {
    int[][] flag = new int[height][width];
    int rowIni = 0, rowEnd = 0, colIni = 0, colEnd = 0;// no recomendable poner variables juntas
    rowIni = (height * 0) / 2;
    rowEnd = (height * 1) / 2;
    colIni = (width * 0) / 2;
    colEnd = (width * 1) / 2;
    for (int r = rowIni; r < rowEnd; r += 1)
      for (int c = colIni; c < colEnd; c += 1)
        flag[r][c] = WHITE;

    rowIni = (height * 0) / 2;
    rowEnd = (height * 1) / 2;
    colIni = (width * 1) / 2;
    colEnd = (width * 2) / 2;
    for (int r = rowIni; r < rowEnd; r += 1)
      for (int c = colIni; c < colEnd; c += 1)
        flag[r][c] = RED;
    rowIni = (height * 1) / 2;
    rowEnd = (height * 2) / 2;
    colIni = (width * 0) / 2;
    colEnd = (width * 1) / 2;
    for (int r = rowIni; r < rowEnd; r += 1)
      for (int c = colIni; c < colEnd; c += 1)
        flag[r][c] = BLUE;

    rowIni = (height * 1) / 2;
    rowEnd = (height * 2) / 2;
    colIni = (width * 1) / 2;
    colEnd = (width * 2) / 2;
    for (int r = rowIni; r < rowEnd; r += 1)
      for (int c = colIni; c < colEnd; c += 1)
        flag[r][c] = WHITE;

    return flag;

  }

  public static int[][] banderaChile(int height, int width) {
    int[][] flag = new int[height][width];
    int rowIni = 0, rowEnd = 0, colIni = 0, colEnd = 0;

    rowIni = (height * 0) / 2;
    rowEnd = (height * 1) / 2;
    colIni = (height * 0) / 2;
    colEnd = (height * 1) / 2;

    for (int r = rowIni; r < rowEnd; r += 1)
      for (int c = colIni; c < colEnd; c += 1)
        flag[r][c] = BLUE;

    rowIni = (height * 0) / 2;
    rowEnd = (height * 1) / 2;
    colIni = (height * 1) / 2;
    colEnd = (width * 2) / 2;

    for (int r = rowIni; r < rowEnd; r += 1)
      for (int c = colIni; c < colEnd; c += 1)
        flag[r][c] = WHITE;

    rowIni = (height * 1) / 2;
    rowEnd = (height * 2) / 2;
    colIni = (width * 0) / 2;
    colEnd = (width * 2) / 2;

    for (int r = rowIni; r < rowEnd; r += 1)
      for (int c = colIni; c < colEnd; c += 1)
        flag[r][c] = RED;

    return flag;
  }

  public static int[][] banderaUSA(int height, int width) {
    int[][] flag = new int[height][width];
    int rowIni = 0, rowEnd = 0, colIni = 0, colEnd = 0;

    for (int b = 0; b < 12; b += 1) {
      rowIni = (height * b) / 12;
      rowEnd = (height * (b + 1)) / 12;
      colIni = (b < 6) ? (height * 1) / 2 : (width * 0) / 1;
      colEnd = (width * 1) / 1;

      for (int r = rowIni; r < rowEnd; r += 1) {
        for (int c = colIni; c < colEnd; c += 1) {
          if (b % 2 == 0) {
            flag[r][c] = RED;
          } else if (b % 2 == 1) {
            flag[r][c] = WHITE;
          }

        }
      }
    }
    rowIni = (height * 0) / 2;
    rowEnd = (height * 1) / 2;
    colIni = (height * 0) / 2;
    colEnd = (height * 1) / 2;

    for (int r = rowIni; r < rowEnd; r += 1)
      for (int c = colIni; c < colEnd; c += 1)
        flag[r][c] = BLUE;

    return flag;
  }

  public static int[][] banderaRepCheca(int height, int widht) {
    int[][] flag = new int[height][widht];
    int rowIni = 0, rowEnd = 0, colIni = 0, colEnd = 0;

    rowIni = (height * 0) / 2;
    rowEnd = (height * 2) / 2;
    colIni = (height * 0) / 2;
    colEnd = (height * 1) / 2;
    for (int c = colIni; c < colEnd; c += 1) {
      for (int r = rowIni; r < rowEnd - (c * 2); r++)
        flag[r + c][c] = BLUE;
    }

    rowIni = (height * 0) / 2;
    rowEnd = (height * 1) / 2;
    colIni = 0;
    colEnd = widht;
    for (int r = rowIni; r < rowEnd; r += 1) {
      for (int c = colIni + r + 1; c < colEnd; c += 1) {
        flag[r][c] = WHITE;
        flag[height - 1 - r][c] = RED;
      }
    }

    rowIni = (height * 1) / 2;
    rowEnd = (height * 2) / 2;
    colIni = (height * 1) / 2;
    colEnd = (widht * 2) / 2;
    for (int r = rowIni; r < rowEnd; r += 1) {
      for (int c = colIni; c < colEnd; c += 1)
        flag[r][c] = RED;
    }
    return flag;
  }

  public static int[][] banderaDinamarca(int height, int width) {
    int[][] flag = new int[height][width];
    int rowIni = 0, rowEnd = 0, colIni = 0, colEnd = 0;

    rowIni = (int) (height * 0.01);
    rowEnd = (int) (height * 0.45);
    colIni = (int) (width * 0.0);
    colEnd = (int) (width * 0.25);

    for (int i = rowIni; i < rowEnd; i += 1)
      for (int j = colIni; j < colEnd; j++) {
        flag[i][j] = RED;
      }

    rowIni = (int) (height * 0);
    rowEnd = (height * 1) / 2;
    colIni = (int) (width * 0.30);
    colEnd = (int) (width * 0.99 + 1);

    for (int i = rowIni; i < rowEnd; i += 1)
      for (int j = colIni; j < colEnd; j++) {
        flag[i][j] = RED;
      }

    rowIni = (int) (height * 0);
    rowEnd = (int) (height * 0.99 + 1);
    colIni = (int) (width * 0.22);
    colEnd = (int) (width * 0.30);

    for (int i = rowIni; i < rowEnd; i += 1)
      for (int j = colIni; j < colEnd; j++) {
        flag[i][j] = WHITE;
      }

    rowIni = (int) (height * 0.46);
    rowEnd = (int) (height * 0.6);
    colIni = (int) (width * 0.0);
    colEnd = (int) (width * 0.99 + 1);

    for (int i = rowIni; i < rowEnd; i += 1)
      for (int j = colIni; j < colEnd; j++) {
        flag[i][j] = WHITE;
      }

    rowIni = (int) (height * 0.60);
    rowEnd = (int) (height * 0.99 + 1);
    colIni = (int) (width * 0.0);
    colEnd = (int) (width * 0.22);

    for (int i = rowIni; i < rowEnd; i += 1)
      for (int j = colIni; j < colEnd; j++) {
        flag[i][j] = RED;
      }

    rowIni = (int) (height * 0.65);
    rowEnd = (int) (height * 2) / 2;
    colIni = (int) (width * 0.30);
    colEnd = (int) (width * 0.99 + 1);

    for (int i = rowIni; i < rowEnd; i += 1)
      for (int j = colIni; j < colEnd; j++) {
        flag[i][j] = RED;
      }
    return flag;

  }

  public static int[][] banderaFinlandia(int height, int width) {
    int[][] flag = new int[height][width];
    int rowIni = 0, rowEnd = 0, colIni = 0, colEnd = 0;

    rowIni = (int) (height * 0.01);
    rowEnd = (int) (height * 0.45);
    colIni = (int) (width * 0.0);
    colEnd = (int) (width * 0.25);

    for (int i = rowIni; i < rowEnd; i += 1)
      for (int j = colIni; j < colEnd; j++) {
        flag[i][j] = WHITE;
      }

    rowIni = (int) (height * 0);
    rowEnd = (height * 1) / 2;
    colIni = (int) (width * 0.30);
    colEnd = (int) (width * 0.99 + 1);

    for (int i = rowIni; i < rowEnd; i += 1)
      for (int j = colIni; j < colEnd; j++) {
        flag[i][j] = WHITE;
      }

    rowIni = (int) (height * 0);
    rowEnd = (int) (height * 0.99 + 1);
    colIni = (int) (width * 0.18);
    colEnd = (int) (width * 0.35);

    for (int i = rowIni; i < rowEnd; i += 1)
      for (int j = colIni; j < colEnd; j++) {
        flag[i][j] = BLUE;
      }

    rowIni = (int) (height * 0.35);
    rowEnd = (int) (height * 1);
    colIni = (int) (width * 0.0);
    colEnd = (int) (width * 0.99 + 1);

    for (int i = rowIni; i < rowEnd; i += 1)
      for (int j = colIni; j < colEnd; j++) {
        flag[i][j] = BLUE;
      }

    rowIni = (int) (height * 0.70);
    rowEnd = (int) (height * 0.99 + 1);
    colIni = (int) (width * 0.0);
    colEnd = (int) (width * 0.18);

    for (int i = rowIni; i < rowEnd; i += 1)
      for (int j = colIni; j < colEnd; j++) {
        flag[i][j] = WHITE;
      }

    rowIni = (int) (height * 0.70);
    rowEnd = (int) (height * 2) / 2;
    colIni = (int) (width * 0.35);
    colEnd = (int) (width * 0.99 + 1);

    for (int i = rowIni; i < rowEnd; i += 1)
      for (int j = colIni; j < colEnd; j++) {
        flag[i][j] = WHITE;
      }
    return flag;

  }

  public static int[][] banderaNoruega(int height, int width) {
    int[][] flag = new int[height][width];
    int rowIni = 0, rowEnd = 0, colIni = 0, colEnd = 0;

    rowIni = (int) (height * 0);
    rowEnd = (int) (height * 0.35);
    colIni = (int) (width * 0);
    colEnd = (int) (width * 0.18);

    for (int i = rowIni; i < rowEnd; i += 1)
      for (int j = colIni; j < colEnd; j++) {
        flag[i][j] = RED;
      }

    rowIni = (int) (height * 0);
    rowEnd = (height * 1) / 3;
    colIni = (int) (width * 0.35);
    colEnd = (int) (width * 0.99 + 1);

    for (int i = rowIni; i < rowEnd; i += 1)
      for (int j = colIni; j < colEnd; j++) {
        flag[i][j] = RED;
      }

      rowIni = (int) (height * 0.35);
      rowEnd = (int) (height * 1);
      colIni = (int) (width * 0);
      colEnd = (int) (width * 0.99 + 1);
  
      for (int i = rowIni; i < rowEnd; i += 1)
        for (int j = colIni; j < colEnd; j++) {
          flag[i][j] = WHITE;
        }

  
      rowIni = (int) (height * 0.35);
      rowEnd = (int) (height * 1);
      colIni = (int) (width * 0);
      colEnd = (int) (width * 0.99 + 1);
  
      for (int i = rowIni; i < rowEnd; i += 1)
        for (int j = colIni; j < colEnd; j++) {
          flag[i][j] = WHITE;
        }

    rowIni = (int) (height * 0);
    rowEnd = (int) (height * 0.99 + 1);
    colIni = (int) (width * 0.21);
    colEnd = (int) (width * 0.3);

    for (int i = rowIni; i < rowEnd; i += 1)
      for (int j = colIni; j < colEnd; j++) {
        flag[i][j] = BLUE;
      }

    rowIni = (int) (height * 0.45);
    rowEnd = (int) (height * 1);
    colIni = (int) (width * 0);
    colEnd = (int) (width * 0.99 + 1);

    for (int i = rowIni; i < rowEnd; i += 1)
      for (int j = colIni; j < colEnd; j++) {
        flag[i][j] = BLUE;
      }

      rowIni = (int) (height * 0.61);
      rowEnd = (int) (height * 1);
      colIni = (int) (width * 0);
      colEnd = (int) (width * 0.21);
  
      for (int i = rowIni; i < rowEnd; i += 1)
        for (int j = colIni; j < colEnd; j++) {
          flag[i][j] = WHITE;
        }
        
    rowIni = (int) (height * 0.70);
    rowEnd = (int) (height * 0.99 + 1);
    colIni = (int) (width * 0.0);
    colEnd = (int) (width * 0.18);

    for (int i = rowIni; i < rowEnd; i += 1)
      for (int j = colIni; j < colEnd; j++) {
        flag[i][j] = RED;
      }

    rowIni = (int) (height * 0.7);
    rowEnd = (int) (height * 2) / 2;
    colIni = (int) (width * 0.35);
    colEnd = (int) (width * 0.99 + 1);

    for (int i = rowIni; i < rowEnd; i += 1)
      for (int j = colIni; j < colEnd; j++) {
        flag[i][j] = RED;
      }

      rowIni = (int) (height * 0.59);
      rowEnd = (int) (height * 0.7);
      colIni = (int) (width * 0.3);
      colEnd = (int) (width * 1);
  
      for (int i = rowIni; i < rowEnd; i += 1)
        for (int j = colIni; j < colEnd; j++) {
          flag[i][j] = WHITE;
        }

    return flag;

  }

  public static int[][] banderaKWT(int height, int widht) {
    int[][] flag = new int[height][widht];
    int rowIni = 0, rowEnd = 0, colIni = 0, colEnd = 0;

    rowIni = (height * 0) / 2;
    rowEnd = (height * 2) / 2;
    colIni = (height * 0) / 2;
    colEnd = (height * 1) / 2;
    for (int c = colIni; c < colEnd; c += 1) {
      for (int r = rowIni; r < rowEnd - (c * 2); r++)
        flag[r + c][c] = BLACK;
    }

    rowIni = (height * 0) / 3;
    rowEnd = (height * 1) / 3;
    colIni = 0;
    colEnd = widht;
    for (int r = rowIni; r < rowEnd; r += 1) {
      for (int c = colIni + r + 1; c < colEnd; c += 1) {
        flag[r][c] = GREEN;
        flag[height - 1 - r][c] = RED;
      }
    }

    rowIni = (height * 1) / 3;
    rowEnd = (height * 2) / 3;
    colIni = 0;
    colEnd = widht;
    for (int r = rowIni; r < rowEnd; r += 1) {
      for (int c = colIni + r + 1; c < colEnd; c += 1) {
        flag[r][c] = WHITE;
        flag[height - 1 - r][c] = WHITE;
      }
    }
    return flag;
  }

  public static int[][] banderaSuiza(int height, int width) {
    int[][] flag = new int[height][width];
    int rowIni = 0, rowEnd = 0, colIni = 0, colEnd = 0;

    rowIni = (int) (height * 0);
    rowEnd = (int) (height * 0);
    colIni = (int) (width * 0);
    colEnd = (int) (width * 0);

    for (int i = rowIni; i < rowEnd; i += 1)
      for (int j = colIni; j < colEnd; j++) {
        flag[i][j] = RED;
      }

    rowIni = (int) (height * 0);
    rowEnd = (height * 1);
    colIni = (int) (width * 0);
    colEnd = (int) (width * 1);

    for (int i = rowIni; i < rowEnd; i += 1)
      for (int j = colIni; j < colEnd; j++) {
        flag[i][j] = RED;
      }

    rowIni = (int) (height * 0.1);
    rowEnd = (int) (height * 0.9 + 1);
    colIni = (int) (width * 0.39);
    colEnd = (int) (width * 0.65);

    for (int i = rowIni; i < rowEnd; i += 1)
      for (int j = colIni; j < colEnd; j++) {
        flag[i][j] = WHITE;
      }

    rowIni = (int) (height * 0.4);
    rowEnd = (int) (height * 0.7);
    colIni = (int) (width * 0.18);
    colEnd = (int) (width * 0.85);

    for (int i = rowIni; i < rowEnd; i += 1)
      for (int j = colIni; j < colEnd; j++) {
        flag[i][j] = WHITE;
      }

    rowIni = (int) (height * 0.70);
    rowEnd = (int) (height * 0.99 + 1);
    colIni = (int) (width * 0.0);
    colEnd = (int) (width * 0.18);

    for (int i = rowIni; i < rowEnd; i += 1)
      for (int j = colIni; j < colEnd; j++) {
        flag[i][j] = RED;
      }

    rowIni = (int) (height * 1);
    rowEnd = (int) (height * 2) / 2;
    colIni = (int) (width * 0.35);
    colEnd = (int) (width * 0.99 + 1);

    for (int i = rowIni; i < rowEnd; i += 1)
      for (int j = colIni; j < colEnd; j++) {
        flag[i][j] = RED;
      }
    return flag;

  }

}