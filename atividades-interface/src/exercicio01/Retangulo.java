package exercicio01;

public class Retangulo implements AreaCalculavel{
    double base;
    double altura;

    public Retangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        double area = this.getBase() * this.getAltura();
        return area;
    }

    @Override
    public String toString() {
        return "Retangulo :" + "\n" + "Base : " + this.getBase()+
                "\n" + "Altura=" + this.getAltura() + "\n" +
                "Area Total :" + this.calcularArea() + " ";
    }
}
