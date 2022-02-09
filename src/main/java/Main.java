import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        IndexStorage indexStorage = new IndexStorage(10);

        System.out.println(indexStorage.size());
        System.out.println(indexStorage.get(0));
        System.out.println(indexStorage.get(9));
        System.out.println(Arrays.toString(indexStorage.reverse()));

        System.out.println();

        int[] mass = new int[]{1, 4, 6, 7, 20, -5, 11, 1309, 8, 13};
        ArrayIndexStorage arrayIndexStorage = new ArrayIndexStorage(mass);

        System.out.println(arrayIndexStorage.size());
        System.out.println(arrayIndexStorage.get(0));
        System.out.println(arrayIndexStorage.get(9));
        System.out.println(Arrays.toString(arrayIndexStorage.reverse()));
    }
}