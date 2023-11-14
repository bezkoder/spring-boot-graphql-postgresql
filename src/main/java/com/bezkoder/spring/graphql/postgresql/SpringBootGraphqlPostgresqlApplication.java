package com.bezkoder.spring.graphql.postgresql;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringBootGraphqlPostgresqlApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootGraphqlPostgresqlApplication.class, args);
	}
	
	@Bean
  public graphql.schema.GraphQLScalarType extendedScalarLong() {
    return graphql.scalars.ExtendedScalars.GraphQLLong;
  }

}
