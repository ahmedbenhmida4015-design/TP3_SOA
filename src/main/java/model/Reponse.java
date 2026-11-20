package model;

public class Reponse {
    private double a;
    private double b;
    private double resultat;
    private String operation;

    public Reponse() {
    }

    public Reponse(String operation, double a, double b, double resultat) {
        this.operation = operation;
        this.a = a;
        this.b = b;
        this.resultat = resultat;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getResultat() {
        return resultat;
    }

    public String getOperation() {
        return operation;
    }
}
