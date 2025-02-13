package Notas;
import java.util.Arrays;
import java.util.OptionalDouble;

public class Notas {
    double[] Lista_notas;

    public Notas()  {
        Lista_notas = new double[5];
    }

    double Promedio()   {
        double Prom =Arrays.stream(Lista_notas).sum() / Lista_notas.length;
        return Prom;
    }

    double Desviacion() {
        double Promedio = Promedio();
        double Suma = 0;
        for (double cadena : Lista_notas)   {
            Suma += Math.pow(cadena - Promedio, 2);
        }
        return Math.sqrt(Suma/Lista_notas.length);
    }

    double Minimo() {
        OptionalDouble minimo = Arrays.stream(Lista_notas).min();
        return minimo.getAsDouble();
    }

    double Maximo() {
        OptionalDouble maximo = Arrays.stream(Lista_notas).max();
        return maximo.getAsDouble();
    }
}