package Line;

public class RingBuffer{
    int EMPTY_BUFFER = -2;
    private int readPos, writePos;
    private int size;
    private int[] buffer;


    public RingBuffer(int s){
        readPos = 0;
        writePos = 0;
        size = s;
        buffer = new int[size];
    }

    public void enqueue(int value) {
        if (writePos == readPos && buffer[readPos] != 0) {
            System.out.println("RB is full " + "readPos: " + readPos + " writePos: " + writePos);
            return;
        } else if (writePos == size && readPos != 0) {
            writePos = 0;
        }
        buffer[writePos++] = value;
    }

    public int dequeue(){
        if(readPos == writePos && buffer[readPos] == 0){
            System.out.println("RB is empty " + "readPos: " + readPos + " writePos: " + writePos);
            return EMPTY_BUFFER;
        }

        int data = buffer[readPos];
        buffer[readPos] = 0; //clear data

        if(readPos == size - 1 && writePos != 0){
            readPos = 0;
        } else {
            readPos++;
        }

        System.out.println(data);
        return data;
    }

    public void displayQueue(){
        for(int i : buffer){
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
