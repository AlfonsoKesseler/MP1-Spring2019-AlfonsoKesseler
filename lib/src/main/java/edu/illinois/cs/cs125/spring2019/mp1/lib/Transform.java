package edu.illinois.cs.cs125.spring2019.mp1.lib;
/**
Transform.
 */
public class Transform {
    /**
    Image.
     */
    private int[][] image;
    /**
    Shifts left.
     @param array given array.
     @param shift how much to shift.
     @return Shifted array.
     */
    public int[][] shiftLeft(final int[][] array, final int shift) {
        int[][] newArray = new int[array.length][array[0].length];
        int move = shift % array[0].length;
        for (int x = 0; x < array.length; x++) {
            for (int y = 0; y < array[x].length; y++) {
                if (array[x][y + move] > array[x].length) {
                    newArray[x][y] = array[x][y + move - array[x].length];
                } else {
                    newArray[x][y] = array[x][y + move];
                }
            }
        }
        return newArray;
    }

    /**
     Shifts right.
     @param array given array.
     @param shift how much to shift.
     @return Shifted array.
     */
    public int[][] shiftRight(final int[][] array, final int shift) {
        int[][] newArray = new int[array.length][array[0].length];
        int move = shift % array[0].length;
        for (int x = 0; x < array.length; x++) {
            for (int y = 0; y < array[x].length; y++) {
                if (array[x][y - move] < array[x].length) {
                    newArray[x][y] = array[x][y - move + array[x].length];
                } else {
                    newArray[x][y] = array[x][y - move];
                }
            }
        }
        return newArray;
    }

    /**
     Shifts up.
     @param array given array.
     @param shift how much to shift.
     @return Shifted array.
     */
    public int[][] shiftUp(final int[][] array, final int shift) {
        int[][] newArray = new int[array.length][array[0].length];
        int move = shift % array.length;
        for (int x = 0; x < array.length; x++) {
            for (int y = 0; y < array[x].length; y++) {
                if (array[x - move][y] < array.length) {
                    newArray[x][y] = array[x - move + array.length][y];
                } else {
                    newArray[x][y] = array[x - move][y];
                }
            }
        }
        return newArray;
    }

    /**
     Shifts down.
     @param array given array.
     @param shift how much to shift.
     @return Shifted array.
     */
    public int[][] shiftDown(final int[][] array, final int shift) {
        int[][] newArray = new int[array.length][array[0].length];
        int move = shift % array.length;
        for (int x = 0; x < array.length; x++) {
            for (int y = 0; y < array[x].length; y++) {
                if (array[x + move][y] > array.length) {
                    newArray[x][y] = array[x + move - array.length][y];
                } else {
                    newArray[x][y] = array[x + move][y];
                }
            }
        }
        return newArray;
    }
}
