package cn.debug.aop2.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.TransactionDefinition;
import org.springframework.transaction.TransactionException;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.annotation.EnableTransactionManagement;



@ComponentScan("cn.debug.aop2")
@EnableTransactionManagement
public class Config {


	@Bean(name = "transactionManager")
	public PlatformTransactionManager transactionManager() {
		return new PlatformTransactionManager() {
			public TransactionStatus getTransaction(TransactionDefinition definition) throws TransactionException {
				return null;
			}

			public void commit(TransactionStatus status) throws TransactionException {

			}

			public void rollback(TransactionStatus status) throws TransactionException {

			}
		};

	}
}
