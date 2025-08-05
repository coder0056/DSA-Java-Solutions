
public class Main
{
	public static void main(String[] args) {
	   Stack stc = new Stack(10); 
	   stc.push(5);
	   stc.push(10);
	   stc.push(15);
	   System.out.println(stc.pop());
	   System.out.println(stc.pop());
	}
}

class Stack {
    int[] arr;
    int top;
    int size;
    
    Stack(int s) {
        size = s;
        arr = new int[size];
        top = 0;
    }
    
    public void push(int val) {
        if(top >= size-1) {
            System.out.println("Stack overflow");
            return;
        }
        arr[top++] = val;
    }
    
    public int pop() {
        if(top <= 0) {
            System.out.println("Stack underflow");
            return -1;
        }
        return arr[--top];
    }
    
    public int peek() {
        return arr[top];
    }
    
    public boolean isEmpty() {
        if(top < 1) return true;
        else return false;
    }
    
}
