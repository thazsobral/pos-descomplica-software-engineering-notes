package repetitionstructure;

public class UseFor {
    public static void main(String[] args) {
        int j = 100, z = 90;
        for(int i = 0 ;i<10;++i,j+=i,--z,z-=j) {
            System.out.println("i: "+i+" - j: "+j+" - z: "+z);
        }
    }
}
