package com.halo.seed.dao;

import junit.framework.TestCase;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.sql.DataSource;

public class IndexDAOImplTest extends TestCase {
    private ApplicationContext context = null;
    {
        context = new ClassPathXmlApplicationContext("spring-context.xml");
    }


    public void test(){
        DataSource dataSource = (DataSource) context.getBean(DataSource.class);
        System.out.println(dataSource);
    }

    public void testAdd() throws Exception {
    }

    public void testQuerySingle() throws Exception {
    }

}