public class IndexStorage {

    protected int size;

    public IndexStorage(int size) {
        if (size < 0) {
            throw new IllegalArgumentException("Нельзя создать массив с отрицтельным размером:" + size);
        }
        this.size = size;
    }

    public int size() {
        return size;
    }

    public int get(int index) {
        if (index < 0 || index >= size) {
            throw new IllegalArgumentException("Указанный индекс выходит за рамки массива:" + index);
        }
        return index % 2 == 0 ? index : -index;
    }

    public int[] reverse() {
        int[] mass = new int[size];
        for (int i = size - 1; i >= 0; i--) {
            mass[size - 1 - i] = get(i);
        }
        return mass;
    }
}