package com.springjdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        ApplicationContext context=new ClassPathXmlApplicationContext("com/springjdbc/config.xml");
        JdbcTemplate template=(JdbcTemplate) context.getBean("jdbc");
        
        String q="insert into student(id,name,city) values(?,?,?)";
        
        int x=template.update(q,123,"ram","mumbai");
        System.out.println("no of  record inserted.."+x);
        
    }
}
