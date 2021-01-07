package sybexreview.exams.two;

import java.util.Arrays;

class Toy {
    private boolean containsIce = false;

    public boolean containsIce() {
        return containsIce;
    }

    public void removeIce() {
        containsIce = true;
    }
}

public class Otter {
    private static void play() {
        Toy toy = new Toy();
        toy.removeIce();
    }

    private static void play(Toy toy) {
        toy.removeIce();
    }


    public static void main(String[] args) {
        Toy toy = new Toy();
        Otter.play();
        Otter.play(toy);
        System.out.println(toy.containsIce());

        // doesn't compile,
//        int one ,two =0;
//        System.out.println(one);

        // (1,2,3,4,5,6) X X X X X
        // X X X X X X
        // X X X X X X

        int[][] arr = new int[6][3];
        arr[0] = new int[]{1,2,3,4,5,6};

        System.out.println("length of 2d array: " + arr.length);

        for(int i=0; i<arr.length; i++) {
                System.out.print(arr[0][i] + " ");

        }

       // int[][] differentSize = {{1,4}, {3}, {9,8,7}};
        int[][] differentSize = {
                {1, 2, 3,4},
                {4, 5, 6, 9},
                {7},
        };

        System.out.println();
        System.out.println("arr.length: " + differentSize.length);
        System.out.println("arr[0].length: "+ differentSize[0].length);
        System.out.println(differentSize[0]);
        System.out.println("arr[1].length: " + differentSize[1].length);
        System.out.println(differentSize[1]);
        System.out.println("arr[2].length: " + differentSize[2].length);
        System.out.println(differentSize[2]);



        for(int i =0; i<differentSize.length; i++) { // returns 3
            for(int j=0; j<differentSize[i].length; j++) {
                System.out.print(differentSize[i][j] + " ");
            }
            System.out.println();
        }


        System.out.println(Arrays.toString(arr[1]));
    }

}
