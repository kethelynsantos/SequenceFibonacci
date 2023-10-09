public class Fibonacci {

    public static void main(String[] args) {
        int element1 = 1;
        int element2 = 0;
        int aux;

        for(int i = 0; i < 20; i++){
            System.out.println(element1);
            aux = element1;
            element1 = element1 + element2;
            element2 = aux;
        }
    }
}
