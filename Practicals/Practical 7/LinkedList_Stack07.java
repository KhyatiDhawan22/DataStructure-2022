void Push(int d) {
        Node n = new Node();
        if (top == null) {
            top = n;
            n.setData(d);
            System.out.println("\nElement added");
        } else {
            n.setData(d);
            n.setNext(top);
            top = n;
            System.out.println("\nElement added");
        }
        size++;
    }
void Pop() {
        if (top == null) {
            System.out.println("\nUNDERFLOW");
        } else if (size == 1) {
            top = null;
            System.out.println("\nElement Removed");
        } else {
            top = top.getNext();
            System.out.println("\nElement Removed");
            size--;
        }
    }
void Peek() {
        if (top == null) {
            System.out.println("\nEMPTY STACK");
        } else {
            System.out.println("\nTOP: " + top.getData());
        }
    }
