package flyweight;

public class JavaPlatform implements IPlatform {

    public JavaPlatform(){
        System.out.println("JavaPlatform object created");
    }

    @Override
    public void execute(Code code) {
        System.out.println("Compiling and executing Java code");
    }

}
