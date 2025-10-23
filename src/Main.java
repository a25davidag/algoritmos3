public class Main {
    public static void main(String[] args) {


    }


    //Ejercicio1 Crea una función que sea getSalaryMean(double[] salaries) que devuelva el salario medio de la empresa.
    public static double getSalaryMean(double[] salaries) {
        int contador = 0;
        double sumador = 0;
        for (int i = 0; i < salaries.length; i++) {
            if (salaries[i] > 0) {
                sumador = sumador + salaries[i];
                contador++;
            }
        }
        return (sumador / contador);
    }

    //Ejercicio2
    public static double getSalaryMedian(double[] salaries) {
        double mediana = 0;
        for (int i = 0; i < salaries.length - 1; i++) {
            for (int j = 0; j < salaries.length - i - 1; j++) {
                if (salaries[j] > salaries[j + 1]) {
                    double temporal = salaries[j];
                    salaries[j] = salaries[j + 1];
                    salaries[j + 1] = temporal;
                }
            }
        }
        for (int i = 0; i < salaries.length; i++) {
            if (salaries.length % 2 == 0) {
                mediana = (salaries[salaries.length / 2] + salaries[(salaries.length / 2) - 1]) / 2;
            } else {
                mediana = salaries[salaries.length / 2];
            }
        }
        return mediana;
    }

    //Ejercicio3
    public static double getPayroll(double salary, int children, double percentage, boolean disability) {

        double paga = 0;
        for (int i = 1; i <= children; i++) {
            if (i < 3) {
                percentage--;
            } else {
                percentage = percentage - 3;
            }
        }
        if (disability) {
            paga = salary - (((salary * percentage) / 100)) + 500;
        } else {
            paga = salary - (((salary * percentage) / 100));
        }
        return paga;
    }

    //Ejercicio4
    public static double[][] transposeMatrix(double[][] matrix) {

        double[][] matrix2 = new double[matrix[0].length][matrix.length];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix2[i][j] = matrix[j][i];
            }
        }
        return matrix2;
    }
}