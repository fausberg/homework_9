
public class Main {
    public static void main(String[] args) {
        Vector[] vectors = new Vector[10];
        {
            vectors[0] = new Vector(4);
            vectors[1] = new Vector(4);
        }

        vectors[0].info();
        vectors[1].info();

        vectors[0].vectorPow(vectors[0], vectors[1]);
        vectors[0].info();

        vectors[0].vectorPlus(vectors[0], vectors[1]);
        vectors[0].info();

        vectors[0].vectorMinus(vectors[0], vectors[1]);
        vectors[0].info();

    }
}