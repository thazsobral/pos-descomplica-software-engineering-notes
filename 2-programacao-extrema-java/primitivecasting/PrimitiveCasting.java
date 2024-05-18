package primitivecasting;

public class PrimitiveCasting {
    public static void main(String[] args) {
        int a = 200; // a = 127 or a = 129
        byte v = (byte) a;
        System.out.println(v); // v = 127 or v = -127

    }
}
