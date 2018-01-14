package jp.ac.uryukyu.ie.e175705;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class BoardTest {
    int kago[][] = {
            {0, 0, 0},
            {0, 0, 0},
            {0, 0, 0}};
    @Test
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
}