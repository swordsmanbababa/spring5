package designPatterns.factory;



public class BeanFactory {
     public  static  IService getService(String name){
         Class serviceClass= null;
         try {
             serviceClass = Class.forName("designPatterns.factory.ServiceImpl");
         } catch (ClassNotFoundException e) {
             e.printStackTrace();
         }
         ServiceImpl service=null;
         try {
              service=(ServiceImpl)serviceClass.newInstance();
         } catch (InstantiationException e) {
             e.printStackTrace();
         } catch (IllegalAccessException e) {
             e.printStackTrace();
         }
         return service;
     }
}
