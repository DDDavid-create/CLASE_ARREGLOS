import javax.swing.*;
import java.sql.SQLOutput;

public class Metodos {
    int edad;
    String nombre, materia;
    double notaFinal;


    public Metodos(){
        solicitarDatos();
    }

    public void solicitarDatos() {
        int nEstudiantes = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de estudiantes"));

        String[] nombres = new String[nEstudiantes];
        String[] materias = new String[nEstudiantes];
        int[] edades = new int[nEstudiantes];
        double[] notas = new double[nEstudiantes];

        for (int i = 0; i < nombres.length; i++) {
            nombre = JOptionPane.showInputDialog("Ingrese el nombre del estudiante: " + (i+1));
            nombres[i]=nombre;

            materia = JOptionPane.showInputDialog("Ingrese la materia del estudiante: " + nombres[i]);
            materias[i] = materia;

            notaFinal = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la nota final del estudiante: " + nombres[i]));
            notas[i] = notaFinal;

            edad    = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad del estudiante: " + nombres[i]));
            edades[i] = edad;
        }
        imprimirDatos(nombres, materias, notas, edades);
    }

    private void imprimirDatos(String[] nombres, String[] materias, double[] notas, int[] edades) {
        for (int i = 0; i <nombres.length ; i++) {
            String msj = "Nombre " + (i+1) + ": " + nombres[i] + "\n";
            msj += "Materia " + (i+1) + ": " + materias[i] + "\n";
            msj += "Nota " + (i+1) + ": " + notas[i] + "\n";
            msj += "Edad " + (i+1) + ": " + edades[i] + "\n";

            JOptionPane.showMessageDialog(null, msj);
        }
        double sumaNotas = calcularSumaNotas(notas);
        System.out.println(sumaNotas);

        double promedioNotas = calcularPromedio(notas);
        System.out.println(promedioNotas);

    }


    public double calcularSumaNotas(double[] notas){
        double suma = 0;
        for (int i = 0; i < notas.length; i++) {
            suma+=notas[i];
        }
        return suma;

    }

    public double calcularPromedio(double[] notas){
        double suma = 0, promedio = 0;
        for (int i = 0; i < notas.length; i++) {
            suma += notas[i];
            promedio = suma/notas.length;
        }
        return promedio;
    }

    public void validarRango(double nota){


    }

}
