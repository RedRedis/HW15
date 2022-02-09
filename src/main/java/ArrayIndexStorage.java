public class ArrayIndexStorage extends IndexStorage {

    private int[] mass;

    public ArrayIndexStorage(int[] mass) {
        super(mass.length);
        this.mass = mass;
    }

    @Override
    public int get(int index) {
        if (index < 0 || index >= size) {
            throw new IllegalArgumentException("Указанный индекс выходит за рамки массива:" + index);
        }
        return mass[index];
    }
}
