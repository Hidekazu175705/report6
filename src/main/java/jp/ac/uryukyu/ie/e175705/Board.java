package jp.ac.uryukyu.ie.e175705;

public class Board {
    int kago[][] = {
            {0, 0, 0},
            {0, 0, 0},
            {0, 0, 0}};

    void show() {
        for (int m = 0; m < 3; m++) {
            for (int n = 0; n < 3; n++) {
                if (kago[n][m] == 1) {
                    System.out.print("O");
                } else if (kago[n][m] == -1) {
                    System.out.print("X");
                } else {
                    System.out.print("-");
                }
            }
            System.out.print('\n');
        }
    }

    public boolean check(int x, int y) {
        if (kago[x - 1][y - 1] == 0) {
            return true;
        } else return false;
    }

    public void setO(int xO, int yO) {
        kago[xO - 1][yO - 1] = 1;
    }

    public void setX(int xX, int yX) {
        kago[xX - 1][yX - 1] = -1;
    }

    public int judge() {
        if (kago[0][0] == 1 && kago[0][1] == 1 && kago[0][2] == 1) {
            return 1;
        } else if (kago[1][0] == 1 && kago[1][1] == 1 && kago[1][2] == 1) {
            return 1;
        } else if (kago[2][0] == 1 && kago[2][1] == 1 && kago[2][2] == 1) {
            return 1;
        } else if (kago[0][0] == 1 && kago[1][0] == 1 && kago[2][0] == 1) {
            return 1;
        } else if (kago[0][1] == 1 && kago[1][1] == 1 && kago[2][1] == 1) {
            return 1;
        } else if (kago[0][2] == 1 && kago[1][2] == 1 && kago[2][2] == 1) {
            return 1;
        } else if (kago[0][0] == 1 && kago[1][1] == 1 && kago[2][2] == 1) {
            return 1;
        } else if (kago[0][2] == 1 && kago[1][1] == 1 && kago[2][0] == 1) {
            return 1;
        } else if (kago[0][0] == -1 && kago[0][1] == -1 && kago[0][2] == -1) {
            return -1;
        } else if (kago[1][0] == -1 && kago[1][1] == -1 && kago[1][2] == -1) {
            return -1;
        } else if (kago[2][0] == -1 && kago[2][1] == -1 && kago[2][2] == -1) {
            return -1;
        } else if (kago[0][0] == -1 && kago[1][0] == -1 && kago[2][0] == -1) {
            return -1;
        } else if (kago[0][1] == -1 && kago[1][1] == -1 && kago[2][1] == -1) {
            return -1;
        } else if (kago[0][2] == -1 && kago[1][2] == -1 && kago[2][2] == -1) {
            return -1;
        } else if (kago[0][0] == -1 && kago[1][1] == -1 && kago[2][2] == -1) {
            return -1;
        } else if (kago[0][2] == -1 && kago[1][1] == -1 && kago[2][0] == -1) {
            return -1;
        }
        return 0;
    }
}