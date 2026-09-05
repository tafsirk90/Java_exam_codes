public class MyClass {
    public static int objectCounter = 0;
    public MyClass(){
        objectCounter++;
        if(objectCounter > 100) {
            objectCounter = 0;
        }
    }
}
