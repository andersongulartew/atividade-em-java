package exerciciosinterface.exercicio01;

public class Quadrado implements AreaCalculavel{
    private int lado;

    public Quadrado(int lado) {
        this.lado = lado;
    }

    public int getLado() {
        return lado;
    }

    public void setLado(int lado) {
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
        double area = this.getLado() * getLado();
        return area;
    }
    @Override
    public String toString() {
        return "Quadrado : " + "\n" + "Lado : " + this.getLado() +
                "\n" + "Area : " + this.calcularArea();
    }
}

