package jp.ac.uryukyu.ie.e175705;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Board board = new Board();

        int a;
        int b;

        for (int k = 0; k < 9; k++) {
            if (k % 2 == 0) {
                do {
                    a = 0;
                    System.out.println("Oさん、打つ場所を(x,y)座標で指定して下さい。");
                    System.out.println("x=?");
                    int xO = Integer.parseInt(in.nextLine());
                    System.out.println("y=?");
                    int yO = Integer.parseInt(in.nextLine());

                    if (xO < 1 || xO > 3 || yO < 1 || yO > 3) {
                        System.out.println("1~3の数字を入力してください。");
                    } else if (board.check(xO, yO)) {
                        board.setO(xO, yO);
                    } else {
                        System.out.println("埋まっています。");
                        a = 1;
                    }
                    board.show();
                } while (a == 1);
            } else {
                do {
                    b = 0;
                    System.out.println("Xさん、打つ場所を(x,y)座標で指定して下さい。");
                    System.out.println("x=?");
                    int xX = Integer.parseInt(in.nextLine());
                    System.out.println("y=?");
                    int yX = Integer.parseInt(in.nextLine());

                    if (xX < 1 || xX > 3 || yX < 1 || yX > 3) {
                        System.out.println("1~3の数字を入力してください。");
                    } else if (board.check(xX, yX)) {
                        board.setX(xX, yX);
                    } else {
                        System.out.println("埋まっています。");
                        b = 1;
                    }
                    board.show();
                } while (b == 1);
            }

            int judgment = board.judge();

            if (judgment == 1) {
                System.out.println("Oさんの勝ち。おめでとう！");
                break;
            } else if (judgment == -1) {
                System.out.println("Xさんの勝ち。おめでとう！");
                break;
            } else if (k == 8) {
                System.out.println("引き分けです。");
            }

        }
    }
}