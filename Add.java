class Add {

    int sum(int a, int b) {
        return a + b;
    }

    int sum(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String args[]) {
        Add obj = new Add();

        System.out.println("Sum of 2 numbers: " + obj.sum(10, 20));
        System.out.println("Sum of 3 numbers: " + obj.sum(10, 20, 30));
    }
}