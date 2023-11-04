// Jeremi Toroj 21.10.2023

import java.util.Random;

public class Main {

    public static void main(String[] args) {

        // using random for more interesting matrices
        Random random = new Random();

        // creating two matrices
        Matrix matrix1 = new Matrix(5);
        Matrix matrix2 = new Matrix(5);



        // setting values for matrices with loops
        for (int i = 0; i < matrix1.getDimension(); i++){
            for (int j = 0; j < matrix1.getDimension(); j++){
                matrix1.setValue(i, j, random.nextInt(5));
            }
        }

        for (int i = 0; i < matrix2.getDimension(); i++){
            for (int j = 0; j < matrix2.getDimension(); j++){
                matrix2.setValue(i, j, random.nextInt(5));
            }
        }

        // changing their values at [0][0]
        matrix1.setValue(0, 0, 6);
        matrix2.setValue(0, 0, 17);


        // matrix1
        System.out.println("Matrix 1:");
        matrix1.printMatrix();

        // matrix2
        System.out.println("Matrix 2:");
        matrix2.printMatrix();

        // matrix1 =  matrix1 + matrix2
        System.out.println("Matrix1 = Matrix 1 + Matrix 2:");
        matrix1.addMatrix(matrix2);
        matrix1.printMatrix();

        // matrix3 = matrix1 + matrix2
        System.out.println("Matrix 1 * Matrix 2:");
        Matrix matrix3 = matrix1.multiplyMatrix(matrix2);
        matrix3.printMatrix();

        // matrix3 determinant
        System.out.println("Determinant of Matrix 3:");
        System.out.println(matrix3.determinant());

    }

}