import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    double[] salaries;
    double[] salaries2;

    double[][] matrix;
    double[][] matrixT;
    @BeforeEach
    void setUp() {
        salaries = new double[]{2340, 1720, 2350, 1890, 1100, 3900};
        salaries2 = new double[]{1200, 1500, 900, 1900, 2100};


    }

    @Test
    void getSalaryMean() {
        assertEquals(Main.getSalaryMean(salaries), 2216.6666666666665);
        assertEquals(Main.getSalaryMean(salaries2), 1520.0);

    }

    @Test
    void getSalaryMedian() {
        assertEquals(Main.getSalaryMedian(salaries), 2120);
        assertEquals(Main.getSalaryMedian(salaries2), 900);
    }

    @Test
    void getPayroll() {
        assertEquals(Main.getPayroll(2200, 1, 17, false), 1848);
        assertEquals(Main.getPayroll(3000, 3, 20, true), 3050);
        assertEquals(Main.getPayroll(5000, 4, 22, false), 4300);

    }

    @Test
    void transposeMatrix() {
        matrix = new double[][]{{1,2,3},{4,5,6},{7,8,9}};
        matrixT = new double[][]{{1,4,7},{2,5,8},{3,6,9}};
        Assertions.assertArrayEquals(Main.transposeMatrix(matrix), matrixT);
    }
}