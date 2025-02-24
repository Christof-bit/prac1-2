public class Punto {
    public float x;
    public float y;

    public Punto(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float[] coord_cartesianas() {
        return new float[]{this.x, this.y};
    }

    public float[] coord_polares() {
        float radio = (float) Math.sqrt(this.x * this.x + this.y * this.y);
        float angulo = (float) Math.toDegrees(Math.atan2(this.y, this.x));
        return new float[]{radio, angulo};
    }

    public String toString() {
        return String.format("(%.2f, %.2f)", this.x, this.y);
    }
}

class Linea {
    private Punto p1;
    private Punto p2;

    public Linea(Punto p1, Punto p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    public String toString() {
        return "Línea de " + p1 + " a " + p2;
    }

    public void dibujaLinea() {
        System.out.println("Dibujando línea de " + p1 + " a " + p2);
    }
}

class Circulo {
    private Punto centro;
    private float radio;

    public Circulo(Punto centro, float radio) {
        this.centro = centro;
        this.radio = radio;
    }

    public String toString() {
        return "Círculo con centro en " + centro + " y radio " + String.format("%.2f", radio);
    }

    public void dibujaCirculo() {
        System.out.println("Dibujando círculo con centro en " + centro + " y radio " + radio);
    }
}

public class Main {
    public static void main(String[] args) {
        Punto p1 = new Punto(0, 3);
        Punto p2 = new Punto(4, 0);
        Linea linea = new Linea(p1, p2);
        Circulo circulo = new Circulo(p1, 5);

        System.out.println(linea);
        linea.dibujaLinea();

        System.out.println(circulo);
        circulo.dibujaCirculo();
    }
}
