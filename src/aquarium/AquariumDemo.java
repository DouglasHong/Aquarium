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
public class AquariumDemo {

    public static void main(String a[]) {
        Aquarium aquarium = new Aquarium();
        Gravel gravel = new Gravel();
        Fish fish = new Fish();
        Coral coral = new Coral();

        Color fishcolor[] = new Color[1];
        fishcolor[0] = new Color();
        Color gravelcolor[] = new Color[1];
        gravelcolor[0] = new Color();

        gravelcolor[0].setColor("green gravel");
        fishcolor[0].setColor("white fish");

        aquarium.setYear(2014);
        gravel.setColor(gravelcolor);
        fish.setColor(fishcolor);
        fish.setQuantity("5 fish");
        coral.setQuantity("10 coral");

        aquarium.setGravel(gravel);
        aquarium.setFish(fish);
        aquarium.setCoral(coral);

        Color[] gc = aquarium.getGravel().getColor();
        Color[] fc = aquarium.getFish().getColor();

        System.out.println("The aqaurium has " + gc[0].getColor() + " , "
                + aquarium.getFish().getQuantity() + "," + fc[0].getColor()
                + "," + aquarium.getCoral().getQuantity() + ","
                + " the color of the aquarium is " + " and the aqaurium built in "
                + aquarium.getYear());
        Aquarium[] aqs1 = createAquarium(3, 2);

        printAquarium(aqs1);
    }

    public static void printAquarium(Aquarium aqs[]) {
        for (int i = 0; i < aqs.length; i++) {
            Aquarium aq = aqs[i];
            Gravel g = aq.getGravel();
            String gType = g.getGravel();
            Color[] gc = g.getColor();
            for (int c = 0; c < gc.length; c++) {
                Color co = gc[c];
                System.out.println("The color of the gravel is " + co.getColor() + " and the type of gravel is " + gType);
            }

            Fish f = aq.getFish();
            String fs = f.getFish();
            String fq = f.getQuantity();
            Color[] fc = f.getColor();
            for (int z = 0; z < fc.length; z++) {
                Color fo = fc[z];
                System.out.println("There are " + fq + " " + fs + " and their color is " + fo.getColor());
            }
            Coral cor = aq.getCoral();
            String col = cor.getCoral();
            String coq = cor.getQuantity();
            System.out.println("There are " + coq + " " + col + " in this aquarium");
        }
    }

    public static Aquarium[] createAquarium(int aqN, int cN) {
        Aquarium aqs[] = new Aquarium[aqN];

        for (int i = 0; i < aqs.length; i++) {
            Aquarium aq = new Aquarium();

            Gravel g = createGravel(i, cN);
            aq.setGravel(g);

            Fish f = createFish(i, cN);
            aq.setFish(f);

            Coral cor = createCoral(i);
            aq.setCoral(cor);
            aqs[i] = aq;

        }
        return aqs;
    }

    private static Coral createCoral(int i) {
        Coral cor = new Coral();
        cor.setCoral("Spiky Coral " + i);
        cor.setQuantity("20 " + i);

        return cor;
    }

    private static Fish createFish(int i, int cN) {
        Fish f = new Fish();
        f.setFish("Goldfish " + i);
        f.setQuantity("10 " + i);
        Color fc[] = new Color[cN];
        for (int d = 0; d < fc.length; d++) {
            Color fic = new Color();
            fic.setColor("Red-orange " + d);
            fc[d] = fic;
        }
        f.setColor(fc);
        return f;
    }

    private static Gravel createGravel(int i, int cN) {
        Gravel g = new Gravel();
        g.setGravel("gravel " + i);
        Color gc[] = new Color[cN];
        for (int c = 0; c < gc.length; c++) {
            Color colo = new Color();
            colo.setColor("Orange" + c);
            gc[c] = colo;

        }
        g.setColor(gc);
        return g;
    }

}
