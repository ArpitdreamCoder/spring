package Construct;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import lifecycle.Pepsi;

public class App 
{
    public static void main( String[] args )
    {
     ApplicationContext context = new ClassPathXmlApplicationContext("Construct/config.xml");
     Cons con = (Cons) context.getBean("cons1");
     System.out.println(con);
     con.add();
    }
}
