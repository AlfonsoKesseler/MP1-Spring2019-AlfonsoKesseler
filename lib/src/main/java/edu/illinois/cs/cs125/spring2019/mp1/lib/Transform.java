package edu.illinois.cs.cs125.spring2019.mp1.lib;
/**
Transform.
 */
public class Transform {
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

    /**
     * Rotates right.
     * @param array given array.
     * @return rotated array.
     */
    public int[][] rotateRight(final int[][] array) {
        int[][] newArray = new int[array[0].length][array.length];
        for (int x = 0; x < array.length; x++) {
            for (int y = 0; y < array[x].length; y++) {
                newArray[y][array.length - 1 - x] = array[x][y];
            }
        }
        return newArray;
    }

    /**
     * Rotates left.
     * @param array given array.
     * @return rotated array.
     */
    public int[][] rotateLeft(final int[][] array) {
        int[][] newArray = new int[array[0].length][array.length];
        for (int x = 0; x < array.length; x++) {
            for (int y = 0; y < array[x].length; y++) {
                newArray[array[x].length - 1 - y][x] = array[x][y];
            }
        }
        return newArray;
    }

    /**
     * Flips vertically.
     * @param array given array.
     * @return flipped array
     */
    public int[][] flipVertical(final int[][] array) {
        int[][] newArray = new int[array.length][array[0].length];
        for (int x = 0; x < array.length; x++) {
            for (int y = 0; y < array[x].length; y++) {
                newArray[x][y] = array[array.length - x - 1][y];
            }
        }
        return newArray;
    }

    /**
     * Flips horizontally.
     * @param array given array.
     * @return flipped array
     */
    public int[][] flipHorizontal(final int[][] array) {
        int[][] newArray = new int[array.length][array[0].length];
        for (int x = 0; x < array.length; x++) {
            for (int y = 0; y < array[x].length; y++) {
                newArray[x][y] = array[x][array[x].length - 1 - y];
            }
        }
        return newArray;
    }

    /**
     * expands horizontal.
     * @param array given array.
     * @param expand how much expanded.
     * @return expanded array.
     */
    public int[][] expandHorizontal(final int[][] array,final int expand) {
        int[][] newArray = new int[array.length][array[0].length];
        int position = array.length / 2;
        int counter = 0;
        for (int x = 0; x < array.length / 2; x++) {
            int distance = array.length - x;
            int shift = distance / expand;
            for (int y = 0; y < array[x].length; y++) {
                newArray[x][y] = array[position - 1 - shift][y];
                newArray[x][y] = array[position + shift][y];
            }
        }
        return newArray;
    }
}
