package works.hop.jenkins;

public class HelloJenkins {

    public String greeting(){
        return "Hello there";
    }
    
    public static void main(String[] args) {
        HelloJenkins hello = new HelloJenkins();
        System.out.println(hello.greeting());
    }
}
