class Main {
    public static void main(String[] args) {
        int d,x;
        d = 0;
        x = 314;

        while (x > 1) {
            x = x/2; d = d + 1;
        }

        System.out.println(x);
        System.out.println(d);
    }
}
