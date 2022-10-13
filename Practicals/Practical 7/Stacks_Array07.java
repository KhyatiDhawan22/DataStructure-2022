void Push(int arr[], int d, int s) {
        if (top == s - 1) {
            System.out.println("OVERFLOW");
        } else {
            top = top + 1;
            arr[top] = d;
        }
    }
void Pop(int arr[]) {
        if (top == -1) {
            System.out.println("UNDERFLOW");
        } else {
            System.out.println("Element removed:" + arr[top]);
            top--;
        }
    }
void Peek(int arr[]){
        if(top == -1){
            System.out.println("EMPTY STACK");
        }
        System.out.println("TOP: " + arr[top]);
    }

