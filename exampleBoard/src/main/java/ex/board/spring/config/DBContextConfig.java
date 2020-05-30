package ex.board.spring.config;

import java.io.IOException;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableTransactionManagement
@Import(PropertyPlaceholderConfig.class)
public class DBContextConfig {
	
	@Value("${JDBC.Driver}")
	private String driverClassName;

	@Value("${JDBC.ConnectionURL}")
	private String url;
	
	@Value("${JDBC.Username}")
	private String username;
	
	@Value("${JDBC.Password}")
	private String password;
	
	@Bean
	public DataSource dataSource() {

		final DriverManagerDataSource dataSource = new DriverManagerDataSource();
		
		dataSource.setDriverClassName(driverClassName);
		dataSource.setUrl(url);
		dataSource.setUsername(username);
		dataSource.setPassword(password);
		
		return dataSource;
	
	}

	@Bean
	public PlatformTransactionManager transactionManager() {
		return new DataSourceTransactionManager(this.dataSource());
	}

	@Bean
	public SqlSessionFactoryBean sqlSessionFactoryBean(DataSource dataSource, 
			ApplicationContext applicationContext) throws IOException {
	
		final SqlSessionFactoryBean factoryBean = new SqlSessionFactoryBean();
		
		factoryBean.setDataSource(dataSource);
		factoryBean.setConfigLocation(applicationContext.getResource("classpath:sql/sql-mapping-config.xml"));
		factoryBean.setMapperLocations(applicationContext.getResources("classpath:sql/mappers/*.xml"));
		
		return factoryBean;
	}
	
	@Bean
	public SqlSessionTemplate sqlSessionTemplate(SqlSessionFactory sqlSessionFactory) {
		return new SqlSessionTemplate(sqlSessionFactory);
	}

}