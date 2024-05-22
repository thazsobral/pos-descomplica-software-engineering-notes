package string;

public class CompareString {
    public static void main(String[] args) {
        String name1 = "thalles";
        String name2 = "thalles";
        String name3 = new String("thalles");
        String name4 = new String("thalles");
        System.out.println(name1 == name2); // name1 and name2 point to the same allocation space in memory (even though the contents are the same)
        System.out.println(name2 == name3); // name 2 and name 3 point to different allocation spaces in memory (even if the contents are the same)
        System.out.println(name3 == name4); // name 3 and name 4 point to different allocation spaces in memory (even if the contents are the same)
    }
}
