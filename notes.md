# 20 Sep
Database schemas
ex: commerce

JPA - repository
Query methods - findBy<property.subProperty>
@Query, @Param
@NamedQuery
CreteriaQuery

# 19 Sep
Re-usability - DRY (Don't Repeat Yourself) - S/W dev principle
Inheritance (Is-A), Composition (Has-A)

Polymorphism

Parent (ex: Vehicle)
Car extends Vehicle
Bike extends Vehicle

Vehicle v1 = new Car()
Vehicle v2 = new Bike()
v1.someMethod()
v2.someMethod()

Engine

Car extends Engine
Bike extends Engine

Car {
  Engine engine
 engine.start()
}

Project Lombok

Inheritance - @MappedSuperclass
Composition - @Embeddable, @Embedded

# 18 Sep
@Autowired(required = false|true(default))
Constructor - Optional<T>
@Primary, @Qualifier

RESTful API - guidelines
Hypermedia - REST(REpresentational State Transfer)ful
Open API specification
  - swagger ui (REST API documentation tool)
GraphQL

Spring Data REST module - @RepositoryRestResource
Spring HATEOS  (Hypermedia HAL)

Spring Boot - conclude

-------------------------

### Associations (JPA) - Relationships (RDBMS - PK:FK)
OnetoOne, OneToMany, ManyToOne,
ManyToMany - create entities, update relationship

```shell
curl --location --request PUT 'http://localhost:8080/api/actors/4/movies' \
--header 'Content-Type: text/uri-list' \
--data-binary '@/C:/Users/rames/demo/spring/demo-app/uris.txt'
```

### uris.txt
```text
http://localhost:8080/api/movies/1
```

# 17 Sep
Spring Boot core
@Configuration
Factory method - @Bean

Externalized configuration - @Value
Profiles - 'default' profile is active by default
@Profile("<name>")
application.properties - spring.profiles.active=<csv>
Internationalization (i18n) / Localization

@SpringBootApplication - @EnableAutoConfiguration, @ComponentScan, @SpringBootConfiguration
@Import - importing bean configuration files (csv)


# 16 Sep
Validations
Spring - @Validated
@NotEmpty, @Valid, @NotBlank, @Size

Spring boot web - exception handling
@ControllerAdvice, @ExceptionHandler

ResponseEntity, HttpStatus.BAD_REQUEST

Logging
levels - error, info, debug, trace
logging.level.*
logging.level.org.hibernate=debug

java -jar target/application.jar --debug


# 15 Sep

Spring Boot
- structure
IoC container, DI

BE - layers

Business domain
Service Layer
Repository Layer

Stereotype annotations
@Component
@Service
@Repository

POJO - Plain Old Java Object

Programming paradigms / styles - Imperative vs Declarative

Static Code Analysis - tools 