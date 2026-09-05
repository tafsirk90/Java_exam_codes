public class Main {
    public static void main(String[] args) {
        //Difference between == and .equals() is == means s1 and s2 refers to the same
        //objects in the memory , and equals check the actual content . To initialize s2
        //we use new String() to make a new objects in the memory but for s3 we just point
        //where s1 is the memory that's why s1 == s3 returns true but s1 == s2 returns false
        String s1 = "This is ICT 2201 Java";
        String s2 = new String("This is ICT 2201 Java");
        String s3 = s1;
        System.out.println(s2);
        System.out.println(s1.equals(s2));
        System.out.println(s1 == s2);
        System.out.println(s1 == s3);
    }
}