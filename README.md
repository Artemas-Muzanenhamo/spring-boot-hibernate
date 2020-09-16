# Spring Boot Hibernate

- Application playing with Spring Boot and Hibernate.

## API Docs
http://localhost:8080/swagger-ui-custom.html

## Replicate Hibernate Issues

### StaleStateException
- add user
- delete all users
- delete user (that is non existent)

`"trace": "org.springframework.orm.ObjectOptimisticLockingFailureException: Batch update returned unexpected row count from update [0]; actual row count: 0;` 
