package firstSpring;

import org.apache.log4j.Logger;
import org.apache.log4j.spi.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        //创建工厂
        ApplicationContext ctx=new ClassPathXmlApplicationContext("/firstSpringproperties.xml");
        //获取对象
        Person person= (Person) ctx.getBean("Person");
        Person person1 = ctx.getBean("Person", person.getClass());
        Person person2 = ctx.getBean(Person.class);
        System.out.println(person.toString());
        //获取bean标签中id的值
        String[] beanDefinitionNames = ctx.getBeanDefinitionNames();
        String[] beanNamesForType = ctx.getBeanNamesForType(Person.class);

        //判断配置文件中是否含有指定id值的bean
        boolean exist = ctx.containsBean("Person");
        boolean exist1 = ctx.containsBeanDefinition("Person");
        Logger logger  =  Logger.getLogger(Test. class );
        logger.debug( " debug " );
        logger.error( " error " );
    }


}
