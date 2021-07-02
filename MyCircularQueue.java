public class MyCircularQueue {
    private final int[] ary;
    private int size;
    private int headIndex;
    private int tailIndex;
    public MyCircularQueue(int k) {
        ary = new int[k];
        size = 0;
        headIndex = 0;
        tailIndex = 0;
    }

    public boolean enQueue(int value) {
        if (size == ary.length) {
            return false;
        }
        ary[tailIndex] = value;
        size++;
        tailIndex++;
        if (tailIndex == ary.length) {
            tailIndex = 0;
        }
        return true;
    }

    public boolean deQueue() {
        if (size == 0) {
            return false;
        }
        size--;
        headIndex++;
        if (headIndex == ary.length) {
            headIndex = 0;
        }
        return true;
    }

    public int Front() {
        if (size == 0) {
            return -1;
        }
        return ary[headIndex];
    }

    public int Rear() {
        if (size == 0) {
            return -1;
        }
        int index = tailIndex-1;
        if (index == -1) {
            index = ary.length;
        }
        return ary[index];
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == ary.length;
    }
}
