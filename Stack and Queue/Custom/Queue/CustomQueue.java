package Custom.Queue;

public class CustomQueue{
    protected int[] data;
    private static final int DEFAULT_SIZE =10;

    int ptr = 0; // can also be -1 like stack

    public CustomQueue(){
        this(DEFAULT_SIZE); 
    }

    public CustomQueue(int size){
        this.data = new int[size];
    }

        public boolean add(int value){
            if(ptr==data.length){
                System.out.println("Stack is Full");
                return false;
            }
            data[ptr] = value;
            ptr+=1;
            return true;
        }

        public boolean remove(){
            if(ptr==0){
                System.out.println("Stack is empty");
                return false;
            }
            System.out.println("removed item -> "+data[0]);
            for(int i=0;i<ptr;i++){
                data[i] = data[i+1];
            }
            ptr-=1;
            return true;
        }

        public void display(){
            for(int i=0;i<ptr;i++){
                System.out.print(data[i]+" ");
            }
        }
}