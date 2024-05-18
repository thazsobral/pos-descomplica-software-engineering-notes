package operators;

public class OperatorsBitwise {
    public static void main(String[] args) {
        //AND
        int a1 = 23, a2 = 33;
        int a3 = a1 & a2;
        int a4 = a2 & a1;
        //OR
        int o1 = 23, o2 = 33;
        int o3 = a1 | o2;
        int o4 = a2 | o1;
        //XOR
        int x1 = 23, x2 = 33;
        int x3 = x1 ^ x2;
        int x4 = x2 ^ x1;

        boolean b1 = true, b2 = false;
        boolean b3 = b1 ^ b2;
        boolean b4 = b2 ^ b1;
        //NOT
        int n1 = 23, n2 = 33;
        int n3 = ~ n2;
        int n4 = ~ n1;
        //SHIT LEFT
        int sl1 = 23, sl2 = 33;
        int sl3 = sl1 << sl2;
        int sl4 = sl2 << sl1;
        //SHIT RIGHT
        int sr1 = 23, sr2 = 33;
        int sr3 = sr1 >> sr2;
        int sr4 = sr2 >> sr1;
        //SHIT RIGHT NOT SIGNAL
        int srn1 = 23, srn2 = 33;
        int srn3 = srn1 >>> srn2;
        int srn4 = srn2 >>> srn1;
    }
}
