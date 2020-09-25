package designPatterns.factory;

public class Test {
    public static void main(String[] args) {
        IService service=BeanFactory.getService("ser");
        service.applyService();
    }
}
