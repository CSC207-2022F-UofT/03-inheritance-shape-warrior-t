/*
 * This file defines an abstract class named Bag.
 * In this exercise, you will be writing a larger class according to
 * the TODOs we have left you. You may find the readings in chapter
 * 1. Introduction to Java helpful.
 */

import java.util.ArrayList;

public abstract class Bag {

    private String color;
    private int numberOfContents;
    private int capacity;
    private ArrayList<String> contents = new ArrayList<>();

    public Bag(String color, int capacity) {
        this.color = color;
        this.capacity = capacity;
    }

    public String getColor() {
        return color;
    }

    public int getNumberOfContents() {
        return numberOfContents;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setColor(String color) {
        this.color = color;
    }

    /**
     * Add an item to this Bag unless it has reached full capacity.
     * If this bag has reached full capacity, do nothing.
     *
     * @param item the item to be added
     * @return whether the item was added successfully
     * (in other words, whether this Bag had space for the item)
     */
    public boolean addItem(String item) {
        if (numberOfContents < capacity) {
            contents.add(item);
            numberOfContents++;
            return true;
        } else {
            return false;
        }
    }

    /**
     * Remove and return the last item added to this Bag.
     * If there are no items in this Bag, return null.
     *
     * @return the item removed, or null if this Bag is empty
     */
    public String popItem() {
        if (numberOfContents > 0) {
            int lastIndex = numberOfContents - 1;
            String item = contents.get(lastIndex);
            contents.remove(lastIndex);
            numberOfContents--;
            return item;
        } else {
            return null;
        }
    }

    /**
     * Increase this bag's capacity by n.
     *
     * @param n the amount to increase this Bag's capacity by
     */
    public void increaseCapacity(int n) {
        capacity += n;
    }

    /**
     * Return the details of this Bag.
     *
     * @return a string reporting the color, number of contents, and capacity of this Bag
     */
    @Override
    public String toString() {
        return this.color + " Bag (" + this.numberOfContents + " / " +
                this.capacity + ")";
    }

    /*
     * Below we have defined an abstract method.
     * This method takes no arguments and does not return anything.
     * It increases the capacity of this Bag.
     *
     * You will need to implement this method in
     * HandBag.java and CrossbodyBag.java.
     *
     * We recommend you look at HandBag.java first.
     */
    public abstract void enhance();

}
