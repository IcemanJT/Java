// Jeremi Toroj 21.10.2023

public class Matrix {

        private final int n; // Dimension of the matrix
        private final int[][] vectors; // Vectors of the matrix

        // Constructor
        public Matrix(int n_dimension){
            this.n = n_dimension;
            this.vectors = new int[this.n][this.n];
        }


        // Setters and getters

        // Sets the value of the matrix at position i, j
        public void setValue(int i, int j, int value){
            this.vectors[i][j] = value;
        }

        // Returns the value of the matrix at position i, j
        public int getValue(int i, int j){
            return this.vectors[i][j];
        }

        // Returns the dimension of the matrix
        public int getDimension(){
            return this.n;
        }

        // Methods

        // Prints the matrix
        public void printMatrix(){
            for (int i = 0; i < this.n; i++){
                for (int j = 0; j < this.n; j++){
                    System.out.print(this.vectors[i][j] + " ");
                }
                System.out.println();
            }
        }

        // Adds a matrix to this.matrix
        public void addMatrix(Matrix matrix){
            if (this.n != matrix.getDimension()){
                System.out.println("Error: Matrix dimensions must be equal.");
                return;
            }

            for (int i = 0; i < this.n; i++){
                for (int j = 0; j < this.n; j++){
                    this.vectors[i][j] += matrix.getValue(i, j);
                }
            }
        }

        // Multiplies this.matrix by a matrix
        public Matrix multiplyMatrix(Matrix matrix){

            if (this.n != matrix.getDimension()){
                System.out.println("Error: Matrix dimensions must be equal.");
                return null;
            }

            Matrix result = new Matrix(this.n);

            for (int i = 0; i < this.n; i++){
                for ( int j = 0; j < this.n; j++){
                    for (int k = 0; k < this.n; k++){
                        result.setValue(i, j, result.getValue(i, j) + this.getValue(i, k) * matrix.getValue(k, j));
                    }
                }
            }
            return result;
        }

        // Calculates the determinant of this.matrix
        public double determinant(){
            double det = 0;
            if (this.n == 1){
                det = this.getValue(0, 0);
            }
            else if (this.n == 2){
                det = this.getValue(0, 0) * this.getValue(1, 1) - this.getValue(0, 1) * this.getValue(1, 0);
            }
            else {
                for (int i = 0; i < this.n; i++){
                    Matrix subMatrix = new Matrix(this.n - 1);
                    for (int j = 1; j < this.n; j++){
                        for (int k = 0; k < this.n; k++){
                            if (k < i){
                                subMatrix.setValue(j - 1, k, this.getValue(j, k));
                            }
                            else if (k > i){
                                subMatrix.setValue(j - 1, k - 1, this.getValue(j, k));
                            }
                        }
                    }
                    det += Math.pow(-1, i) * this.getValue(0, i) * subMatrix.determinant();
                }
            }
            return det;
        }


}