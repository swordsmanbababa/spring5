package designPatterns.factory;

public class ServiceImpl implements IService {
    @Override
    public void applyService() {
        System.out.println("service call");
    }
}
