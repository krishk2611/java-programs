abstract class ClassA {
    abstract void display();
    
    void show() {
        System.out.println("show");
    }
}

class Interface extends ClassA {
    void display() {
        System.out.println("Abstract method display");
    }

    public static void main(String args[]) {
       Interface  c = new Interface ();
        c.display();
        c.show();
    }
}