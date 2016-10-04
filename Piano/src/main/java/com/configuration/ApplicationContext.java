package com.configuration;

import java.util.Properties;

import javax.sql.DataSource;

import org.apache.tomcat.dbcp.dbcp2.BasicDataSource;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.hibernate4.HibernateTransactionManager;
import org.springframework.orm.hibernate4.LocalSessionFactoryBuilder;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.model.Product;
import com.model.User;


@Configuration
@ComponentScan("com.model")
@EnableTransactionManagement

public class ApplicationContext {
	
 
	@Bean(name = "dataSource")
	public DataSource getDataSource() {
	    BasicDataSource dataSource = new BasicDataSource();
	    dataSource.setDriverClassName("org.h2.Driver");
	    dataSource.setUrl("jdbc:h2:tcp://localhost/~/test");
	    dataSource.setUsername("sa");
	    dataSource.setPassword("");
	 
	    return dataSource;
	}
	@Autowired
	@Bean(name = "sessionFactory")
	public SessionFactory getSessionFactory(DataSource dataSource) {
	    LocalSessionFactoryBuilder sessionBuilder = new LocalSessionFactoryBuilder(dataSource);
	    sessionBuilder.addProperties(getHibernateProperties());
	 	    sessionBuilder.addAnnotatedClasses(User.class);
	 	   sessionBuilder.addAnnotatedClasses(Product.class);
		    return sessionBuilder.buildSessionFactory();
	    
	}
	private Properties getHibernateProperties()
	{
		Properties Properties = new Properties();
		Properties.put("hibernate.show_sql","true");
		Properties.put("hibernate.dialect","org.hibernate.dialect.H2Dialect");
		Properties.put("hibernate.hbm2ddl.auto","update");
		return Properties;
	}
	@Autowired
	@Bean(name = "transactionManager")
	public HibernateTransactionManager getTransactionManager(
	        SessionFactory sessionFactory) {
	    HibernateTransactionManager transactionManager = new HibernateTransactionManager(
	            sessionFactory);
	 
	    return transactionManager;
	}
}
	
	
	
	
	
	
	

