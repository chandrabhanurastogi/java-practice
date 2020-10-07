package java8.udemy.junit;

public class GreetingImpl implements Greeting{

    @Override
    public String greet(String name){
        if (name==null || name.isEmpty()){
            throw new IllegalArgumentException("name must be present");
        }
        return "Hello "+name;
    }
}
