package instructionswitch;

public class InstructionSwitch {
    public static void main(String[] args) {
        int op = 1;
        switch (op) {
            case 1:
                System.out.println("1 externo");
                int opi = 2;
                switch (opi) {
                    case 1:
                        System.out.println("1 interno");
                        op = 2;
                        break;
                    case 2:
                        System.out.println("2 interno");
                        break;
                    default:
                        break;
                }
                break;
            case 2:
                System.out.println("2 externo");
                break;
            default:
                break;
        }
    }
}
