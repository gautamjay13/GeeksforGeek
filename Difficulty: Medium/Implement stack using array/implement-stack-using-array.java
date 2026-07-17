class myStack {

    int[] arr;
    int idx;
    int capacity;

    public myStack(int n) {
        arr = new int[n];
        capacity = n;
        idx = 0;
    }

    public boolean isEmpty() {
        return idx == 0;
    }

    public boolean isFull() {
        return idx == capacity;
    }

    public void push(int x) {
        if (isFull()) {
            return; // Stack Overflow
        }
        arr[idx] = x;
        idx++;
    }

    public void pop() {
        if (isEmpty()) {
            return; // Stack Underflow
        }
        arr[idx - 1] = 0;
        idx--;
    }

    public int peek() {
        if (isEmpty()) {
            return -1;
        }
        return arr[idx - 1];
    }
}