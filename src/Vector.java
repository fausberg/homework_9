import java.util.Random;
import java.util.Scanner;

public class Vector {
    public int[] arr;

    public Vector() {
    }

    public Vector(int n) {
        init(n);
    }

    public Vector(short n) {
        init(n);
    }




    public void init(int n) {//создание автозаполнения
        Random random = new Random();
        arr = new int[n];
        for (int i = 0; i < n; i++) {
            this.arr[i] = random.nextInt(10);
        }
    }

    public static void init(long n) {//статический метод
        Random random = new Random();
        Vector vector = new Vector();
        for (int i = 0; i < n; i++) {
            vector.arr[i] = random.nextInt(10);
        }
    }

    public void init(short n) {//создание вручную
        Scanner scanner = new Scanner(System.in);
        arr = new int[n];
        for (int i = 0; i < n; i++) {
            this.arr[i] = scanner.nextInt();
        }
    }

    public void opisProstranstva(){
        System.out.println("Это вектор " + arr.length + "-мерного пространства");
    }


    public void vectorLength(){
        double length = 0;
        for(int i = 0; i < arr.length; i++){
            length+=Math.pow(arr[i],2);
        }
        length = Math.sqrt(length);
        System.out.println("Длина вектора " + length);
    }

    public Vector vectorPow(Vector vector1, Vector vector2){
        if(vector1.arr.length != vector2.arr.length){
            System.out.println("пространства не совпадают");
            return vector1;
        }
        for(int i = 0; i < arr.length; i++){
            vector1.arr[i] = vector1.arr[i] * vector2.arr[i];
        }
        return vector1;
    }
    public Vector vectorPlus(Vector vector1, Vector vector2){
        if(vector1.arr.length != vector2.arr.length){
            System.out.println("пространства не совпадают");
            return vector1;
        }
        for(int i = 0; i < arr.length; i++){
            vector1.arr[i] = vector1.arr[i] + vector2.arr[i];
        }
        return vector1;
    }
    public Vector vectorMinus(Vector vector1, Vector vector2){
        if(vector1.arr.length != vector2.arr.length){
            return vector1;
        }
        for(int i = 0; i < arr.length; i++){
            vector1.arr[i] = vector1.arr[i] - vector2.arr[i];
        }
        return vector1;
    }


    public void info() {
        System.out.print("Значения вектора ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        vectorLength();
        opisProstranstva();
        System.out.println();
    }
}
