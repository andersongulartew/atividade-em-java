package exerciciosinterface.exercicio01;

public class Circulo implements AreaCalculavel{
    double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    @Override
    public double calcularArea() {
        double area;
        area = Math.PI * raio * raio;
        return area;
    }

        @Override
        public String toString() {
        return "Circulo de : " +"\n" + "Raio :" + this.getRaio() + "\n" + " e Area : " + this.calcularArea();
        }

}
