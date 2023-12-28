package Custom.Stacks;

public class CustomStack {
    protected int[] data;
    private static final int DEFAULT_SIZE = 10;
    private boolean DEFAULT = false;

    int index = -1;

    public CustomStack() {
        this(DEFAULT_SIZE);
    }

    public CustomStack(int size) {
        this.data = new int[size];
        DEFAULT = true; // if this constructor is called then size is fixed
    }

    public boolean push(int value) {
        if (index == data.length - 1 && DEFAULT == false) {
            int[] temp = new int[data.length * 2];
            for (int i = 0; i < data.length; i++) {
                temp[i] = data[i];
            }
            data = temp;
            index += 1;
            data[index] = value;
            return true;
        } else if (index == data.length - 1 && DEFAULT == true) {
            System.out.println("Stack is Full");
            return false;
        }
        index += 1;
        data[index] = value;
        return true;
    }

    public boolean pop() {
        if (index == -1) {
            System.out.println("Stack is empty");
            return false;
        }
        System.out.println(data[index]);
        index -= 1;
        return true;

    }

    public int peek() {
        if (index == -1) {
            return -1;
        }
        return data[index];
    }

    public int size() {
        return index + 1;
    }

    public void display() {
        for (int i = 0; i <= index; i++) {
            System.out.print(data[i] + " ");
        }
    }
}