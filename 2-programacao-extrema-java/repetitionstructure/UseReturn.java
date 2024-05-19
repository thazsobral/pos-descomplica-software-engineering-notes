package repetitionstructure;

public class UseReturn {
    public static void main(String[]args){
		for(int k =25; k<31; k++){
			new UseReturn().checaPar(k);
		}
	}
	
	public boolean checaPar(int a){
		if(a%2==0){
			System.out.println(a +" é par");
			return true;
		}
		System.out.println(a +" é ímpar");
        return false;
	}
}
