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
public class Aquarium {

    private int year;
    private Gravel gravel;
    private Fish fish;
    private Coral coral;

    /**
     * @return the gravel
     */
    public Gravel getGravel() {
        return gravel;
    }

    /**
     * @param gravel the gravel to set
     */
    public void setGravel(Gravel gravel) {
        this.gravel = gravel;
    }

    /**
     * @return the fish
     */
    public Fish getFish() {
        return fish;
    }

    /**
     * @param fish the fish to set
     */
    public void setFish(Fish fish) {
        this.fish = fish;
    }

    /**
     * @return the coral
     */
    public Coral getCoral() {
        return coral;
    }

    /**
     * @param coral the coral to set
     */
    public void setCoral(Coral coral) {
        this.coral = coral;
    }

    /**
     * @return the year
     */
    public int getYear() {
        return year;
    }

    /**
     * @param year the year to set
     */
    public void setYear(int year) {
        this.year = year;
    }

}
