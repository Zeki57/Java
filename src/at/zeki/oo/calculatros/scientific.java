package at.zeki.oo.calculatros;

public class scientific extends basic {
    public double sine(double num) {
        double numInRadians = Math.toRadians(num);
        return Math.sin(numInRadians);
    }

    public double cosine(double num) {
        double numInRadians = Math.toRadians(num);
        return Math.cos(numInRadians);
    }
}