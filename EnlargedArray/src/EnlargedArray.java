
/*
BOOOOOOOOOOOOO
lento
não gastomas
 */
public class EnlargedArray {
    private int size;
    private int[] theArray;
    public EnlargedArray() {
        this.size = 1;
        this.theArray = new int[this.size];
    }

    public void set(int key, int value) {

        if(key >= this.size) {
            int[] newArray = new int[key+1];
            for(int i = 0; i < this.size; i++) {
                newArray[i] = this.theArray[i];
            }
            this.theArray = newArray;
            this.size = key+1;
        }
        theArray[key] = value;
    }

    public int get(int key) {
        return theArray[key];
    }
}
