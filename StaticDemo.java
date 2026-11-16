class StaticDemo {
    static int count = 0; 
    int objNo;            

    StaticDemo() {
        count++;
        objNo = count;
    }

    void show() {
        System.out.println("Object number = " + objNo);
        System.out.println("Static count = " + count);
        System.out.println("--------------------");
    }

    public static void main(String[] args) {
        StaticDemo c1 = new StaticDemo();
        StaticDemo c2 = new StaticDemo();
        StaticDemo c3 = new StaticDemo();

        c1.show();
        c2.show();
        c3.show();
    }
}
