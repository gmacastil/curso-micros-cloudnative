# Reto Teórico 1: Conceptos Springboot API Rest


1. ¿Cuál es el propósito de la anotación '@RestController' en un microservicio Spring Boot?
   - A) Indicar que la clase es un controlador de vista
   - B) Indicar que la clase es un servicio de negocio
   - C) Indicar que la clase es un controlador REST (Respuesta correcta)
   - D) Indicar que la clase es un repositorio de datos

   **Explicación**: `@RestController` es una anotación especializada que combina `@Controller` y `@ResponseBody`. Indica que la clase maneja solicitudes HTTP y que todos sus métodos devuelven objetos de dominio en lugar de vistas. Estos objetos se serializan automáticamente a JSON/XML y se envían como cuerpo de la respuesta HTTP, lo que es fundamental para la creación de APIs RESTful.

   **Puntaje**: 10

2. ¿Cuál es el método HTTP adecuado para obtener un recurso específico en una API RESTful?
   - A) POST
   - B) GET (Respuesta correcta)
   - C) PUT
   - D) DELETE
   
   **Explicación**: GET es el método HTTP adecuado para solicitar y recuperar datos de un recurso específico. Es un método idempotente (múltiples solicitudes idénticas tienen el mismo efecto que una sola) y no debe alterar el estado del servidor. Sigue los principios de diseño REST donde cada operación debe usar el método HTTP apropiado según su propósito.

   **Puntaje**: 10

3. ¿Cuál es la anotación correcta para mapear una solicitud HTTP GET a un método en un controlador Spring Boot?
   - A) @PostMapping
   - B) @GetMapping (Respuesta correcta)
   - C) @PutMapping
   - D) @DeleteMapping
   
   **Explicación**: `@GetMapping` es una anotación compuesta que actúa como un atajo para `@RequestMapping(method = RequestMethod.GET)`. Indica que el método anotado maneja solicitudes HTTP GET para la ruta especificada. Spring Boot proporciona anotaciones específicas para cada método HTTP común, mejorando la legibilidad del código.

   **Puntaje**: 10

4. ¿Qué dependencia se debe agregar en 'pom.xml' para habilitar Spring Web en un proyecto Spring Boot?
   - A) spring-boot-starter-data-jpa
   - B) spring-boot-starter-security
   - C) spring-boot-starter-web (Respuesta correcta)
   - D) spring-boot-starter-test
   
   **Explicación**: `spring-boot-starter-web` es la dependencia que incluye todo lo necesario para desarrollar aplicaciones web y RESTful con Spring Boot. Incluye Spring MVC, un servidor Tomcat embebido, y soporte para JSON/XML, lo que permite crear rápidamente APIs web sin configuraciones adicionales complejas.

   **Puntaje**: 10

5. ¿Qué anotación se utiliza para manejar excepciones específicas en un controlador Spring Boot?
   - A) @ExceptionHandler (Respuesta correcta)
   - B) @RestController
   - C) @Autowired
   - D) @RequestMapping
   
   **Explicación**: `@ExceptionHandler` permite definir métodos que manejan excepciones específicas lanzadas durante la ejecución de los métodos del controlador. Esto permite personalizar las respuestas de error en lugar de depender del manejo predeterminado de excepciones, mejorando así la experiencia del usuario con mensajes de error más informativos y controlados.

   **Puntaje**: 10

6. ¿Cuál es el propósito de la anotación '@PathVariable' en Spring Boot?
   - A) Extraer variables de la ruta de la URL (Respuesta correcta)
   - B) Inyectar dependencias en el controlador
   - C) Extraer parámetros de la consulta
   - D) Definir la URL base del controlador
   
   **Explicación**: `@PathVariable` extrae valores de variables en la ruta de la URL y los mapea a parámetros del método. Por ejemplo, en una ruta como `/users/{id}`, la anotación `@PathVariable("id")` puede extraer el valor dinámico y usarlo en el método. Esto es fundamental para implementar APIs RESTful donde los recursos se identifican a menudo por su URI.

   **Puntaje**: 10

7. ¿Cuál es la mejor práctica para estructurar un proyecto de microservicios en Spring Boot?
   - A) Monolítico
   - B) Modular y desacoplado (Respuesta correcta)
   - C) Compacto y único
   - D) Sin capas
   
   **Explicación**: La estructura modular y desacoplada permite que cada microservicio sea independiente, con su propia base de código, base de datos y lógica de negocio. Esto facilita el desarrollo paralelo por equipos diferentes, mejora la escalabilidad, permite actualizaciones parciales, y aísla fallos, cumpliendo así con los principios fundamentales de la arquitectura de microservicios.

   **Puntaje**: 10

8. ¿Cuál es el propósito del archivo 'application.properties' en un proyecto Spring Boot?
   - A) Definir las dependencias del proyecto
   - B) Configurar propiedades de la aplicación (Respuesta correcta)
   - C) Especificar la versión de Java
   - D) Configurar el balanceo de carga
   
   **Explicación**: El archivo `application.properties` (o su equivalente `application.yml`) permite configurar diversos aspectos de la aplicación Spring Boot sin modificar el código. Esto incluye propiedades como el puerto del servidor, la URL de la base de datos, nivel de logging, perfiles activos, entre muchas otras configuraciones. Sigue el principio de "convención sobre configuración" de Spring Boot.

   **Puntaje**: 10

9. ¿Qué comando de Maven se utiliza para empaquetar una aplicación Spring Boot en un archivo JAR?
   - A) mvn clean compile
   - B) mvn package (Respuesta correcta)
   - C) mvn install
   - D) mvn clean install
   
   **Explicación**: `mvn package` compila el código fuente del proyecto y lo empaqueta en un formato distribuible, como un JAR. En el caso de Spring Boot, crea un "fat JAR" o "uber JAR" que incluye todas las dependencias, lo que permite ejecutar la aplicación sin necesidad de instalaciones adicionales mediante el comando `java -jar`.

   **Puntaje**: 10

10. ¿Cuál es el comando para ejecutar una aplicación Spring Boot desde la línea de comandos?
    - A) mvn clean install
    - B) java -jar nombre-del-archivo.jar (Respuesta correcta)
    - C) mvn compile
    - D) mvn package
    
    **Explicación**: `java -jar nombre-del-archivo.jar` ejecuta una aplicación Spring Boot empaquetada como JAR. Spring Boot incluye un servidor web embebido (como Tomcat) dentro del JAR, por lo que no se necesitan servidores de aplicaciones externos para ejecutar la aplicación, facilitando significativamente el despliegue.

    **Puntaje**: 10

11. ¿Qué anotación se utiliza para inyectar dependencias en Spring Boot?
    - A) @Component
    - B) @Inject
    - C) @Autowired (Respuesta correcta)
    - D) @Bean
   
    **Explicación**: `@Autowired` es la anotación principal en Spring para implementar la inyección de dependencias. Permite que Spring resuelva e inyecte automáticamente los beans colaboradores en tu bean. Esto fomenta el bajo acoplamiento y facilita las pruebas unitarias al permitir la sustitución de implementaciones.

    **Puntaje**: 10

12. ¿Cuál es el propósito de la anotación '@RequestBody' en un controlador Spring Boot?
    - A) Indicar que el método devuelve un cuerpo de respuesta
    - B) Extraer datos del cuerpo de la solicitud HTTP y convertirlos a un objeto (Respuesta correcta)
    - C) Validar el cuerpo de la solicitud
    - D) Requerir una autenticación para el cuerpo de la solicitud
   
    **Explicación**: `@RequestBody` indica que un parámetro del método debe estar vinculado al cuerpo de la solicitud HTTP. Spring utiliza HttpMessageConverters para convertir automáticamente el cuerpo de la solicitud (generalmente JSON) en el objeto Java especificado. Es esencial para APIs RESTful cuando se envían datos complejos en operaciones como POST o PUT.

    **Puntaje**: 10

13. ¿Cuál es el método HTTP más adecuado para actualizar completamente un recurso existente en una API RESTful?
    - A) PATCH
    - B) POST
    - C) PUT (Respuesta correcta)
    - D) DELETE
   
    **Explicación**: PUT es el método HTTP adecuado para actualizar un recurso completamente, reemplazando toda su representación actual. A diferencia de PATCH (que realiza actualizaciones parciales) o POST (que crea recursos), PUT es idempotente y sigue los principios RESTful para operaciones de actualización completas.

    **Puntaje**: 10

14. ¿Qué anotación se utiliza para crear una clase de configuración en Spring Boot?
    - A) @Service
    - B) @Component
    - C) @Configuration (Respuesta correcta)
    - D) @Repository
   
    **Explicación**: `@Configuration` indica que una clase declara uno o más métodos `@Bean` y puede ser procesada por el contenedor Spring para generar definiciones de beans y solicitudes de servicio. Permite centralizar la configuración de la aplicación y definir beans mediante código Java en lugar de XML.

    **Puntaje**: 10

15. ¿Qué código de estado HTTP debe devolver una operación de creación exitosa en una API RESTful?
    - A) 200 OK
    - B) 201 Created (Respuesta correcta)
    - C) 204 No Content
    - D) 400 Bad Request
   
    **Explicación**: 201 Created es el código de estado HTTP adecuado cuando se ha creado exitosamente un nuevo recurso. Además de indicar éxito, comunica específicamente que se creó un nuevo recurso, a diferencia de 200 OK (éxito genérico) o 204 No Content (éxito sin contenido en la respuesta).

    **Puntaje**: 10

16. ¿Cuál es el propósito de la anotación '@RequestParam' en Spring Boot?
    - A) Extraer parámetros de la consulta URL (Respuesta correcta)
    - B) Extraer variables de la ruta URL
    - C) Validar los parámetros de entrada
    - D) Definir los parámetros requeridos para el método
   
    **Explicación**: `@RequestParam` extrae los parámetros de consulta de la URL (query parameters), por ejemplo en `/users?name=john`. Permite acceder a estos valores como parámetros del método y facilita la definición de valores predeterminados y si son obligatorios o no.

    **Puntaje**: 10

17. ¿Qué es Spring Data JPA?
    - A) Un ORM completo para manejar bases de datos relacionales
    - B) Una extensión de JPA que facilita la implementación de repositorios de datos (Respuesta correcta)
    - C) Un conector para bases de datos NoSQL
    - D) Una herramienta para migración de datos
   
    **Explicación**: Spring Data JPA es una capa de abstracción que simplifica la implementación de repositorios de acceso a datos basados en JPA. Reduce significativamente el código repetitivo de CRUD mediante la generación automática de implementaciones de repositorio a partir de interfaces, permitiendo centrarse en la lógica de negocio en lugar de en el acceso a datos.

    **Puntaje**: 10

18. ¿Qué anotación se utiliza para validar los campos de un objeto en Spring Boot?
    - A) @Validate
    - B) @Check
    - C) @Valid (Respuesta correcta)
    - D) @Constraint
   
    **Explicación**: `@Valid` activa la validación de Bean Validation para el objeto anotado. Cuando se usa en parámetros de métodos de controlador, Spring validará automáticamente el objeto contra las restricciones definidas (como @NotNull, @Size, etc.) antes de ejecutar el método, simplificando la validación de entrada.

    **Puntaje**: 10

19. ¿Qué es un actuator en Spring Boot?
    - A) Un componente para iniciar automáticamente la aplicación
    - B) Una herramienta para monitorear y administrar la aplicación (Respuesta correcta)
    - C) Un servicio para comunicarse con otros microservicios
    - D) Un mecanismo para gestionar transacciones
   
    **Explicación**: Spring Boot Actuator proporciona características de monitoreo y gestión para aplicaciones Spring Boot en producción. Ofrece endpoints HTTP o JMX para verificar la salud de la aplicación, métricas, información del entorno, etc., lo que es crucial para operaciones y mantenimiento de microservicios.

    **Puntaje**: 10

20. ¿Cuál es la diferencia entre @Component, @Service, @Repository y @Controller en Spring Boot?
    - A) No hay diferencia, son intercambiables
    - B) Tienen diferentes alcances (scopes) en el contenedor
    - C) Indican distintos roles o capas en la aplicación (Respuesta correcta)
    - D) Afectan el orden de inicialización de los beans
   
    **Explicación**: Aunque técnicamente todas son anotaciones de componente (@Component), cada una indica un rol específico en la arquitectura: @Repository para acceso a datos, @Service para servicios de negocio, @Controller/@RestController para controladores web. Esto mejora la legibilidad del código y permite un tratamiento específico (como la traducción de excepciones en @Repository).

    **Puntaje**: 10
