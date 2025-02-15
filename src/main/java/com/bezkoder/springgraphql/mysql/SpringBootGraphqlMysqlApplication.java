package com.bezkoder.springgraphql.mysql;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SpringBootApplication
public class SpringBootGraphqlMysqlApplication {
	private static final Logger logger = LoggerFactory.getLogger(SpringBootGraphqlMysqlApplication.class);

	public static void main(String[] args) {
		logger.info("Starting up SpringBootGraphqlMysqlApplication");
		SpringApplication.run(SpringBootGraphqlMysqlApplication.class, args);
	}

	@Bean
	public graphql.schema.GraphQLScalarType extendedScalarLong() {
		logger.info("Returning GraphQLLong");
	    return graphql.scalars.ExtendedScalars.GraphQLLong;
	}
}
