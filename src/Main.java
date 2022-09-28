
public class Main {
    public static void main(String[] args) {
        Vector vector = new Vector(2);
        Vector vector1 = new Vector(2);
        vector.info();
        vector1.info();
        vector.vectorPow(vector, vector1);
        vector.info();
        vector.vectorPlus(vector, vector1);
        vector.info();
        vector.vectorMinus(vector, vector1);
        vector.info();

    }
}