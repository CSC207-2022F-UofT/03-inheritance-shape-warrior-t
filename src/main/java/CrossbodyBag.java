/*
 * This file is currently empty, but with a variety of TODOs to implement.
 * You may want to refer to HandBag.java to see how to structure your code.
 *
 * You may find the readings in chapter 3. Relationships between Classes
 * helpful while working through this exercise.
 */

public class CrossbodyBag extends Bag {

    int numberOfStraps;

    /**
     * Create a new CrossbodyBag with the given color,
     * capacity, and number of straps.
     *
     * @param color          the given color
     * @param capacity       the given capacity
     * @param numberOfStraps the given number of straps
     */
    public CrossbodyBag(String color, int capacity, int numberOfStraps) {
        super(color, capacity);
        this.numberOfStraps = numberOfStraps;
    }

    public int getNumberOfStraps() {
        return numberOfStraps;
    }

    /**
     * Increase the capacity of this bag by 2.
     */
    @Override
    public void enhance() {
        super.increaseCapacity(2);
    }

    /**
     * Return the details of this CrossbodyBag.
     *
     * @return a string reporting the color, number of straps,
     * number of contents, and capacity of this Bag
     */
    @Override
    public String toString() {
        return getColor() + " Crossbody Bag with " + numberOfStraps + " straps ("
                + getNumberOfContents() + " / " + getCapacity() + ")";
    }

}
