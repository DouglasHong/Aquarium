/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aquarium;

/**
 *
 * @author Douglas
 */
public class Fish {

    private String fish;
    private int quantity;
    private Color color[];

    /**
     * @return the fish
     */
    public String getFish() {
        return fish;
    }

    /**
     * @param fish the fish to set
     */
    public void setFish(String fish) {
        this.fish = fish;
    }

    /**
     * @return the quantity
     */
    public int getQuantity() {
        return quantity;
    }

    /**
     * @param quantity the quantity to set
     */
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    /**
     * @return the color
     */
    public Color[] getColor() {
        return color;
    }

    /**
     * @param color the color to set
     */
    public void setColor(Color[] color) {
        this.color = color;
    }

}
