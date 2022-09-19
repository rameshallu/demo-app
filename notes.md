# 18 Sep
@Autowired(required = false|true(default))
Constructor - Optional<T>

RESTful API - guidelines
Hypermedia - REST(REpresentational State Transfer)ful
Open API specification
  - swagger ui (REST API documentation tool)
GraphQL

Spring Data REST module - @RepositoryRestResource
Spring HATEOS  (Hypermedia HAL)

Spring Boot - conclude



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