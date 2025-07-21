#include <stdio.h>

// Define a structure to represent a non-zero element in the sparse matrix
struct Element {
    int row;
    int col;
    int value;
};

// Function to add two sparse matrices
void addSparseMatrices(struct Element matrix1[], int size1, struct Element matrix2[], int size2, struct Element result[], int *sizeResult) {
    int i = 0, j = 0, k = 0;

    // Traverse both matrices and merge them
    while (i < size1 || j < size2) {
        if (i >= size1) {
            result[k++] = matrix2[j++];
        } else if (j >= size2) {
            result[k++] = matrix1[i++];
        } else {
            // Compare the elements by row and column
            if (matrix1[i].row < matrix2[j].row || (matrix1[i].row == matrix2[j].row && matrix1[i].col < matrix2[j].col)) {
                result[k++] = matrix1[i++];
            } else if (matrix1[i].row > matrix2[j].row || (matrix1[i].row == matrix2[j].row && matrix1[i].col > matrix2[j].col)) {
                result[k++] = matrix2[j++];
            } else {
                // If the same position, add their values
                result[k].row = matrix1[i].row;
                result[k].col = matrix1[i].col;
                result[k].value = matrix1[i].value + matrix2[j].value;
                k++;
                i++;
                j++;
            }
        }
    }

    *sizeResult = k;  // Update the size of the result matrix
}

// Function to print the sparse matrix
void printSparseMatrix(struct Element matrix[], int size) {
    printf("Resultant Sparse Matrix (only non-zero elements):\n");
    for (int i = 0; i < size; i++) {
        printf("Row %d, Column %d = %d\n", matrix[i].row, matrix[i].col, matrix[i].value);
    }
}

int main() {
    int rows, cols;
    struct Element matrix1[100], matrix2[100], result[100];  // Assuming max 100 non-zero elements
    int size1 = 0, size2 = 0, sizeResult = 0;

    // Input the matrix dimensions
    printf("Enter the number of rows: ");
    scanf("%d", &rows);
    printf("Enter the number of columns: ");
    scanf("%d", &cols);

    // Input elements for the first sparse matrix
    printf("Enter non-zero elements for the first sparse matrix:\n");
    printf("Enter row, column and value (or enter 0 for end input):\n");
    while (1) {
        int r, c, v;
        printf("Row: ");
        scanf("%d", &r);
        if (r == 0) break;  // End input if row is 0
        printf("Column: ");
        scanf("%d", &c);
        printf("Value: ");
        scanf("%d", &v);

        matrix1[size1].row = r;
        matrix1[size1].col = c;
        matrix1[size1].value = v;
        size1++;
    }

    // Input elements for the second sparse matrix
    printf("Enter non-zero elements for the second sparse matrix:\n");
    printf("Enter row, column and value (or enter 0 for end input):\n");
    while (1) {
        int r, c, v;
        printf("Row: ");
        scanf("%d", &r);
        if (r == 0) break;  // End input if row is 0
        printf("Column: ");
        scanf("%d", &c);
        printf("Value: ");
        scanf("%d", &v);

        matrix2[size2].row = r;
        matrix2[size2].col = c;
        matrix2[size2].value = v;
        size2++;
    }

    // Add the two sparse matrices
    addSparseMatrices(matrix1, size1, matrix2, size2, result, &sizeResult);

    // Print the result
    printSparseMatrix(result, sizeResult);

    return 0;
}
