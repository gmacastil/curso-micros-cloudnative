
### Sesión 1: Fundamentos de Arquitectura y Microservicios

#### Objetivo: Comprender los fundamentos de la arquitectura de software y cómo los microservicios se integran en ella.

**1.Patrones de Arquitectura**
   - **Descripción**: Los patrones de arquitectura proporcionan soluciones reutilizables a problemas comunes en el diseño de software. En el contexto de los microservicios, algunos patrones relevantes incluyen:
     - **Microkernel**: Útil para sistemas donde la extensibilidad es clave. La funcionalidad básica está en el núcleo, y los módulos pueden conectarse y desconectarse dinámicamente.
     - **SOA (Service-Oriented Architecture)**: Arquitectura que comparte principios con los microservicios, enfocándose en la reusabilidad de servicios.
     - **Event-Driven Architecture**: Arquitectura en la que los componentes se comunican mediante eventos, lo que es útil en sistemas desacoplados y escalables.
   - **Referencias**:
     - [Patterns of Enterprise Application Architecture (Martin Fowler)](https://martinfowler.com/eaaCatalog/)
     - [Microservices Patterns (Chris Richardson)](https://microservices.io/patterns/)
   - **Ejemplo**:
     - Patrones de Arquitectura: [Definiciones de Patrones](https://medium.com/@maniakhitoccori/los-10-patrones-comunes-de-arquitectura-de-software-d8b9047edf0b)
     
**2. Patrones de Diseño**
   - **Descripción**: Los patrones de diseño son soluciones reutilizables a problemas recurrentes en el diseño de software. En el desarrollo de microservicios, los patrones más relevantes incluyen:
     - **Circuit Breaker**: Previene el fallo en cascada en caso de que un microservicio falle.
     - **API Gateway**: Centraliza las solicitudes hacia diferentes microservicios.
     - **Saga**: Manejo de transacciones distribuidas sin la necesidad de un coordinador central.
   - **Referencias**:
     - [Design Patterns: Elements of Reusable Object-Oriented Software (Erich Gamma, et al.)](https://www.oreilly.com/library/view/design-patterns-elements/0201633612/)
     - [Designing Data-Intensive Applications (Martin Kleppmann)](https://dataintensive.net/)
   - **Código Ejemplo**:
     - Implementación de patrón Circuit Breaker con Resilience4j: [GitHub - resilience4j](https://github.com/resilience4j/resilience4j)

**3. Atributos de Calidad**
   - **Descripción**: Los microservicios impactan directamente atributos de calidad como:
     - **Escalabilidad**: Facilidad para escalar componentes individualmente según la demanda.
     - **Disponibilidad**: Resiliencia ante fallos gracias a la arquitectura distribuida.
     - **Mantenibilidad**: Modularidad que facilita actualizaciones y despliegues continuos.
   - **Referencias**:
     - [Building Microservices: Designing Fine-Grained Systems (Sam Newman)](https://www.oreilly.com/library/view/building-microservices/9781491950340/)
     - [The Twelve-Factor App](https://12factor.net/)
   - **Ejemplo**:
     - Atributos de Calidad Cloud Native: [Principios Cloud Native]([https://github.com/kubernetes/examples](https://www.aplyca.com/blog/cloud-native-principios-aplicaciones-y-desafios))

**4. Conceptos de Microservicios**
   - **Descripción**: Los microservicios son un estilo arquitectónico donde una aplicación se construye como un conjunto de servicios pequeños e independientes que se ejecutan en sus propios procesos y se comunican entre sí a través de interfaces bien definidas (generalmente HTTP/REST o mensajes).
   - **Referencias**:
     - [Microservices (Martin Fowler)](https://martinfowler.com/articles/microservices.html)
     - [What are Microservices? (AWS)](https://aws.amazon.com/microservices/)
   - **Código Ejemplo**:
     - Ejemplo de aplicación Spring Boot basada en microservicios: [GitHub - spring-microservices-example](https://github.com/TechPrimers/learning-path-spring-boot-microservices)
     - Definiciones de Microservicios: [Arquitectura Orientada a Microservicios](https://www.redhat.com/es/topics/microservices/what-are-microservices)


![Alt text](https://github.com/gmacastil/curso-micros-cloudnative/blob/main/images/int-eda.png)

**5. De Monolito a Microservicios**
   - **Descripción**: La transición de una arquitectura monolítica a una basada en microservicios es un proceso complejo que implica dividir el monolito en servicios más pequeños y autónomos, manteniendo la funcionalidad existente mientras se mejoran aspectos como la escalabilidad y la flexibilidad.
   - **Referencias**:
     - [Refactoring: Improving the Design of Existing Code (Martin Fowler)](https://martinfowler.com/books/refactoring.html)
     - [Monolithic to Microservices Architecture (Google Cloud)](https://cloud.google.com/architecture/microservices-architecture-introduction)
   - **Ejemplo**:
     - Ejemplo de migración de monolito a microservicios: [GitHub - monolith-to-microservices](https://github.com/SaraLerma/Monolith-To-Microservices)


![Alt text](https://github.com/gmacastil/curso-micros-cloudnative/blob/main/images/monolito1.png)
![Alt text](https://github.com/gmacastil/curso-micros-cloudnative/blob/main/images/distibuida1.png)


**6. De Microservicios a una Aplicación Distribuida**
   - **Descripción**: Una aplicación distribuida basada en microservicios escala más allá de un conjunto básico de servicios, integrando características como gestión de transacciones distribuidas, comunicación asíncrona, y la gestión avanzada de estado.
   - **Referencias**:
     - [Build cloud-native applications in Azure](https://azure.microsoft.com/en-us/solutions/cloud-native-apps/)
     - [Distributed Systems (Maarten van Steen, Andrew S. Tanenbaum)](https://www.distributed-systems.net/index.php/books/ds3/)
   - **Código Ejemplo**:
     - Ejemplo de sistema distribuido usando Kubernetes y microservicios: [GitHub - k8s-distributed](https://github.com/kubernetes/kubernetes)

![Alt text](https://github.com/gmacastil/curso-micros-cloudnative/blob/main/images/monolito2.png)

**7. Microservicios en On-premises y Cloud**
   - **Descripción**: Implementar microservicios en entornos on-premises y en la nube presenta desafíos diferentes. En la nube, se aprovechan servicios gestionados que facilitan el escalado y la resiliencia, mientras que on-premises puede requerir una mayor inversión en infraestructura y herramientas.
   - **Referencias**:
     - [Migrating to Cloud-Native Application Architectures (Matt Stine)](https://tanzu.vmware.com/content/ebooks/migrating-to-cloud-native-application-architectures)
     - [Hybrid Cloud Strategy (Microsoft Azure)](https://azure.microsoft.com/en-us/resources/cloud-computing-dictionary/what-are-private-public-hybrid-clouds/))
   - **Código Ejemplo**:
     - Ejemplo de despliegue de microservicios en AWS: [GitHub - aws-microservices](https://github.com/aws-samples/aws-microservices-deploy-options)

![Alt text](https://github.com/gmacastil/curso-micros-cloudnative/blob/main/images/onpremises1.png)

![Alt text](https://github.com/gmacastil/curso-micros-cloudnative/blob/main/images/cloud1.png)


### Sesión 2: Desarrollo de Microservicios con Spring Boot

#### Objetivo: Aprender a desarrollar microservicios utilizando Spring Boot 3 y aplicar buenas prácticas en su construcción.

**1. Microservicios en Spring Boot 3**
   - **Descripción**: Spring Boot 3 ofrece un conjunto de herramientas y bibliotecas optimizadas para el desarrollo de microservicios. Con soporte mejorado para Java 17 y GraalVM, Spring Boot 3 permite construir aplicaciones más rápidas y eficientes.
   - **Referencias**:
     - [Spring Boot 3 Documentation](https://docs.spring.io/spring-boot/docs/current/reference/htmlsingle/)
     - [Migrating to Spring Boot 3](https://github.com/spring-projects/spring-boot/wiki/Spring-Boot-3.0-Migration-Guide)
   - **Código Ejemplo**:
     - Ejemplo básico de microservicio con Spring Boot 3: [GitHub - spring-boot-3-example](https://github.com/spring-guides/gs-spring-boot)

![Alt text](https://github.com/gmacastil/curso-micros-cloudnative/blob/main/images/micro-rest.png)

**2. Framework Spring Boot**
   - **Spring Boot Initializr**:
     - **Descripción**: Spring Initializr es una herramienta que simplifica la configuración inicial de proyectos Spring Boot, permitiendo a los desarrolladores seleccionar dependencias y versiones de Java adecuadas para comenzar rápidamente.
     - **Referencias**:
       - [Spring Initializr](https://start.spring.io/)
     - **Código Ejemplo**:
       - Generación de un proyecto básico de microservicios: [GitHub - spring-initializr-example](https://github.com/spring-guides/gs-spring-boot)

   - **Arquetipos**:
     - **Descripción**: Los arquetipos en Spring Boot ayudan a estructurar proyectos de manera consistente y eficiente, promoviendo la reutilización de componentes y patrones de diseño comunes.
     - **Referencias**:
       - [Maven Archetypes](https://maven.apache.org/archetypes/)
       - [Spring Boot Maven Plugin](https://docs.spring.io/spring-boot/maven-plugin/index.html)
     - **Código Ejemplo**:
       - Ejemplo de uso de arquetipos en un proyecto Spring Boot: [GitHub - spring-archetype-example](https://github.com/netyjq/spring-boot-archetype)

![Alt text](https://github.com/gmacastil/curso-micros-cloudnative/blob/main/images/artifact-lib.png)


![Alt text](https://github.com/gmacastil/curso-micros-cloudnative/blob/main/images/microfront.png)

**3. Buenas Prácticas de Construcción de Microservicios**
   - **Frameworks**:
     - **Descripción**: Selección de frameworks adecuados como Spring Cloud para gestionar la comunicación entre microservicios y resiliencia, y Spring Security para la gestión de autenticación y autorización.
     - **Referencias**:
       - [Spring Cloud Documentation](https://spring.io/projects/spring-cloud)
       - [Spring Security Documentation](https://spring.io/projects/spring-security)
     - **Código Ejemplo**:
       - Configuración de un microservicio con Spring Cloud y Spring Security: [GitHub - spring-cloud-security-example](https://medium.com/@tericcabrel/implement-jwt-authentication-in-a-spring-boot-3-application-5839e4fd8fac)

   - **Logging**:
     - **Descripción**: Implementación de logs eficaces utilizando frameworks como Logback o SLF4J, y técnicas para la centralización y análisis de logs en entornos distribuidos.
     - **Referencias**:
       - [Spring Boot Logging Documentation](https://docs.spring.io/spring-boot/docs/current/reference/html/features.html#features.logging)
       - [Logback Project](https://logback.qos.ch/)
     - **Código Ejemplo**:
       - Configuración de Logback en Spring Boot: [Spring-logging-example](https://www.baeldung.com/spring-boot-logging)

   - **Variables de Ambiente**:
     - **Descripción**: Gestión de configuraciones dinámicas mediante perfiles de Spring y la inyección de variables de entorno para la adaptación de la aplicación a diferentes entornos (desarrollo, staging, producción).
     - **Referencias**:
       - [Spring Boot External Configuration](https://docs.spring.io/spring-boot/docs/current/reference/html/features.html#features.external-config)
     - **Código Ejemplo**:
       - Uso de perfiles en Spring Boot: [GitHub - spring-profiles-example](https://docs.spring.io/spring-boot/reference/features/profiles.html)

   - **Testing**:
     - **Descripción**: Pruebas unitarias y de integración utilizando frameworks como JUnit 5, Mockito, y Spring Test, asegurando la calidad y fiabilidad de los microservicios.
     - **Referencias**:
       - [Testing in Spring Boot](https://docs.spring.io/spring-boot/docs/current/reference/html/features.html#features.testing)
       - [JUnit 5 Documentation](https://junit.org/junit5/docs/current/user-guide/)
     - **Código Ejemplo**:
       - Pruebas unitarias y de integración en un microservicio: [GitHub - spring-testing-example](https://github.com/eugenp/tutorials/tree/master/spring-boot-modules/spring-boot-testing)

   - **Gobierno**:
     - **Descripción**: Gestión y control de microservicios en producción utilizando herramientas como Spring Boot Admin para el monitoreo y Zipkin para el rastreo de llamadas distribuidas.
     - **Referencias**:
       - [Spring Boot Admin Documentation](https://codecentric.github.io/spring-boot-admin/current/)
       - [Zipkin Documentation](https://zipkin.io/)
     - **Código Ejemplo**:
       - Implementación de monitoreo y rastreo: [GitHub - spring-monitoring-example](https://docs.spring.io/spring-boot/reference/actuator/monitoring.html)

   - **Calidad de Código**:
     - **Descripción**: Herramientas y técnicas para mantener código limpio y mantenible, como SonarQube para análisis estático y Checkstyle para seguir normas de estilo de código.
     - **Referencias**:
       - [SonarQube Documentation](https://docs.sonarqube.org/latest/)
       - [Checkstyle Documentation](https://checkstyle.sourceforge.io/)
     - **Código Ejemplo**:
       - Integración de SonarQube en un proyecto Spring Boot: [Spring-sonarqube-example](https://www.baeldung.com/sonar-qube)

**4. Conceptos de Contenerización**
   - **Descripción**: Contenerizar aplicaciones permite empaquetar software en contenedores portables, asegurando que se ejecuten de manera consistente en cualquier entorno. Esto es clave en microservicios para facilitar el despliegue y la escalabilidad.
   - **Referencias**:
     - [Docker for Java Developers](https://docs.docker.com/language/java/develop/)
     - [Introduction to Containerization](https://www.redhat.com/en/topics/cloud-native-apps/what-is-containerization)
   - **Código Ejemplo**:
     - Contenerización básica de una aplicación Spring Boot: [GitHub - spring-boot-docker](https://github.com/spring-guides/gs-spring-boot-docker)

**5. Docker, Imágenes y Contenedores**
   - **Descripción**: Docker es una plataforma que permite crear, desplegar y ejecutar aplicaciones en contenedores. Los contenedores son ligeros y se ejecutan en cualquier entorno que tenga Docker instalado, lo que es ideal para microservicios.
   - **Referencias**:
     - [Docker Documentation](https://docs.docker.com/)
     - [Dockerfile Reference](https://docs.docker.com/engine/reference/builder/)
   - **Código Ejemplo**:
     - Creación de una imagen Docker para un microservicio Spring Boot: [GitHub - docker-spring-boot-example](https://github.com/spring-guides/gs-spring-boot-docker)


![Alt text](https://github.com/gmacastil/curso-micros-cloudnative/blob/main/images/custom-img.png)

![Alt text](https://github.com/gmacastil/curso-micros-cloudnative/blob/main/images/img-container.png)

### Sesión 3: Construcción y Testing de Microservicios

#### Objetivo: Desarrollar y probar un microservicio completo con acceso a datos, aplicando buenas prácticas en la construcción de imágenes Docker.

**1. Paso a Paso: Construcción de un Microservicio con Acceso a Datos**
   - **Descripción**: Esta sección se enfoca en guiar a los participantes en la creación de un microservicio desde cero que interactúe con una base de datos, utilizando Spring Data JPA para la gestión de datos.
     - **Conexión a la Base de Datos**: Configuración de la conexión a una base de datos relacional (como MySQL o PostgreSQL) utilizando Spring Data JPA.
     - **Operaciones CRUD**: Implementación de operaciones básicas (Crear, Leer, Actualizar, Eliminar) en el microservicio.
     - **Controladores y Servicios**: Creación de controladores REST y servicios para gestionar la lógica de negocio y exposición de datos.
   - **Referencias**:
     - [Spring Data JPA Documentation](https://docs.spring.io/spring-data/jpa/docs/current/reference/html/)
     - [RESTful Web Services with Spring Boot](https://spring.io/guides/gs/rest-service/)
   - **Código Ejemplo**:
     - Ejemplo de microservicio con acceso a base de datos: [GitHub - spring-data-example](https://github.com/spring-guides/gs-accessing-data-mysql)

![Alt text](https://github.com/gmacastil/curso-micros-cloudnative/blob/main/images/micro-rest.png)

**2. Construcción de un Test en Postman**
   - **Descripción**: Postman es una herramienta popular para el desarrollo y pruebas de API. Esta sección cubre cómo crear y ejecutar pruebas para el microservicio desarrollado.
     - **Colecciones de Postman**: Creación de colecciones que agrupen las solicitudes relacionadas y permiten pruebas organizadas y repetibles.
     - **Pruebas Automatizadas**: Configuración de pruebas automatizadas en Postman, incluyendo validación de respuestas, tiempos de respuesta, y pruebas de escenarios negativos.
   - **Referencias**:
     - [Postman Documentation](https://learning.postman.com/docs/getting-started/introduction/)
     - [API Testing with Postman](https://www.postman.com/api-platform/api-testing)
   - **Código Ejemplo**:
     - Ejemplo de colección Postman para pruebas de un microservicio: [GitHub - postman-api-tests](https://github.com/postmanlabs/newman/blob/develop/examples/sample-collection.json)

**3. Construcción de Test en k6**
   - **Descripción**: k6 es una herramienta moderna para pruebas de carga y rendimiento de APIs. En esta sección, aprenderás a escribir y ejecutar pruebas de rendimiento contra el microservicio.
     - **Script de k6**: Creación de scripts de prueba de carga con k6 utilizando JavaScript.
     - **Ejecución de Pruebas de Carga**: Simulación de múltiples usuarios concurrentes y análisis del rendimiento del microservicio.
   - **Referencias**:
     - [k6 Documentation](https://k6.io/docs/)
     - [Load Testing with k6](https://grafana.com/docs/k6/latest/examples/)
   - **Código Ejemplo**:
     - Ejemplo de script de k6 para pruebas de carga: [GitHub - k6-load-test](https://github.com/grafana/awesome-k6)

**4. Construcción de Imágenes Docker (Dockerfile)**
   - **Descripción**: Un Dockerfile es un script que contiene una serie de instrucciones para construir una imagen Docker. En esta sección, se detalla cómo crear un Dockerfile eficiente para empaquetar el microservicio.
     - **Instrucciones Básicas**: Uso de comandos como `FROM`, `COPY`, `RUN`, `EXPOSE`, y `CMD` para crear un Dockerfile básico.
     - **Multistage Builds**: Optimización del Dockerfile utilizando construcciones de múltiples etapas para reducir el tamaño de la imagen final.
   - **Referencias**:
     - [Dockerfile Reference](https://docs.docker.com/engine/reference/builder/)
     - [Docker Best Practices](https://docs.docker.com/develop/develop-images/dockerfile_best-practices/)
   - **Código Ejemplo**:
     - Ejemplo de Dockerfile para un microservicio Spring Boot: [Spring-boot-dockerfile](https://spring.io/guides/gs/spring-boot-docker)

**5. Buenas Prácticas de Construcción de Imágenes**
   - **Descripción**: La eficiencia y seguridad de las imágenes Docker son fundamentales. Esta sección explora técnicas para optimizar Dockerfiles y reducir el tamaño y vulnerabilidades de las imágenes.
     - **Reducir Tamaño de Imágenes**: Uso de imágenes base ligeras como `alpine`, eliminación de capas innecesarias y limpieza de cachés.
     - **Seguridad**: Integración de herramientas para escaneo de vulnerabilidades en imágenes Docker.
   - **Referencias**:
     - [Docker Security Best Practices](https://docs.docker.com/engine/security/security/)

   - **Código Ejemplo**:
     - Ejemplo de Dockerfile optimizado: [GitHub - optimized-dockerfile](https://github.com/GoogleContainerTools/distroless)

![Alt text](https://github.com/gmacastil/curso-micros-cloudnative/blob/main/images/push.png)

**6. Ejecución de Contenedores con Docker Run**
   - **Descripción**: `docker run` es el comando principal para ejecutar contenedores Docker. Esta sección cubre cómo iniciar y gestionar contenedores utilizando este comando.
     - **Comandos Básicos**: Uso de opciones como `-d` (detached), `-p` (puerto), `--env` (variables de entorno) para ejecutar contenedores.
     - **Volúmenes y Redes**: Configuración de volúmenes para persistencia de datos y redes para la comunicación entre contenedores.
   - **Referencias**:
     - [Docker Run Reference](https://docs.docker.com/engine/reference/run/)
     - [Docker Networking](https://docs.docker.com/network/)
   - **Código Ejemplo**:
     - Ejemplo de ejecución de un contenedor con Docker Run: [GitHub - docker-run-examples](https://github.com/docker/labs/tree/master)

![Alt text](https://github.com/gmacastil/curso-micros-cloudnative/blob/main/images/desa1.png)

![Alt text](https://github.com/gmacastil/curso-micros-cloudnative/blob/main/images/desa2.png)

![Alt text](https://github.com/gmacastil/curso-micros-cloudnative/blob/main/images/desa3.png)

### Sesión 4: Gestión y Despliegue de Contenedores

#### Objetivo: Profundizar en la gestión de contenedores y en su despliegue en diferentes entornos.

**1. Ejecución de Contenedores con Docker-Compose**
   - **Descripción**: Docker Compose es una herramienta que permite definir y gestionar aplicaciones multicontenedor. En esta sección, aprenderás a orquestar múltiples contenedores, configurando redes, volúmenes, y dependencias entre servicios.
     - **Definición de Servicios**: Uso del archivo `docker-compose.yml` para definir servicios, redes y volúmenes.
     - **Comandos Básicos**: Ejecución de comandos como `docker-compose up`, `docker-compose down`, y `docker-compose logs` para gestionar el ciclo de vida de los contenedores.
   - **Referencias**:
     - [Docker Compose Documentation](https://docs.docker.com/compose/)
     - [Get Started with Docker Compose](https://docs.docker.com/compose/gettingstarted/)
   - **Código Ejemplo**:
     - Ejemplo de configuración con Docker Compose: [GitHub - docker-compose-example](https://github.com/docker/awesome-compose)

![Alt text](https://github.com/gmacastil/curso-micros-cloudnative/blob/main/images/portabilidad.png)

**2. Sizing de Contenerización**
   - **Descripción**: El dimensionamiento de contenedores es crucial para optimizar el uso de recursos y mejorar la eficiencia. Esta sección cubre cómo asignar CPU, memoria y otras restricciones de recursos de manera óptima.
     - **Configuración de Recursos**: Uso de opciones como `--memory`, `--cpus`, y `--cpu-shares` para limitar y gestionar los recursos asignados a contenedores.
     - **Monitoreo y Ajuste**: Herramientas y técnicas para monitorear el uso de recursos y ajustar la configuración de contenedores para un rendimiento óptimo.
   - **Referencias**:
     - [Resource Constraints in Docker](https://docs.docker.com/config/containers/resource_constraints/)
     - [Monitoring Docker Performance](https://lumigo.io/container-monitoring/docker-monitoring-9-tools-to-know-metrics-and-best-practices/))
   - **Código Ejemplo**:
     - Ejemplo de limitación de recursos en un Dockerfile: [Docker-resource-limits](https://docs.docker.com/engine/containers/resource_constraints/)

**3. Herramientas de Gestión de Contenedores**
   - **Descripción**: Existen diversas herramientas para la administración de contenedores que facilitan el monitoreo, escalado y gestión de aplicaciones en producción. Esta sección presenta algunas de las más utilizadas.
     - **Portainer**: Una interfaz gráfica para gestionar contenedores Docker, permitiendo la gestión de stacks, imágenes, volúmenes y redes de manera visual.
     - **Rancher**: Una plataforma para la gestión de Kubernetes que simplifica la implementación y operación de clústeres de contenedores.
   - **Referencias**:
     - [Portainer Documentation](https://www.portainer.io/documentation)
     - [Rancher Documentation](https://rancher.com/docs/rancher/v2.x/en/)
   - **Código Ejemplo**:
     - Integración de Portainer en un entorno Docker: [GitHub - portainer-docker-example](https://github.com/portainer/portainer)

**4. Ejecución en Ambientes On-premises y Cloud/Serverless**
   - **Descripción**: El despliegue de contenedores en diferentes entornos presenta desafíos únicos. Esta sección explora las diferencias clave y las mejores prácticas para implementar contenedores tanto en entornos locales (on-premises) como en la nube o plataformas serverless.
     - **On-premises**: Configuración de entornos locales utilizando soluciones como Docker Swarm o Kubernetes.
     - **Cloud**: Uso de servicios como Amazon ECS, Google Kubernetes Engine (GKE), y Azure Kubernetes Service (AKS) para el despliegue en la nube.
     - **Serverless**: Implementación de contenedores en plataformas serverless como AWS Fargate o Google Cloud Run.
   - **Referencias**:
     - [Docker Swarm vs Kubernetes](https://www.ibm.com/think/topics/docker-swarm-vs-kubernetes#:~:text=Kubernetes%20offers%20an%20efficient%20means,deploy%20and%20easy%20to%20manage.)
     - [Serverless Containers with AWS Fargate](https://aws.amazon.com/fargate/)
     - [Deploying Docker on GCP](https://cloud.google.com/compute/docs/containers/deploying-containers)
   - **Código Ejemplo**:
     - Ejemplo de despliegue en AWS Fargate: [GitHub - aws-fargate-example](https://github.com/aws-samples/amazon-ecs-fargate-consul-connect-example)


### Sesión 5: Gobierno y Documentación de Microservicios

#### Objetivo: Implementar estrategias de gobierno, documentación y monitorización de microservicios.

**1. Gobierno de Microservicios**
   - **Descripción**: El gobierno de microservicios es esencial para mantener la cohesión, seguridad y eficiencia de un sistema distribuido. Esta sección aborda prácticas y herramientas clave para la gobernanza, incluyendo políticas de versionado, descubrimiento de servicios, y autenticación/autorización.
     - **Versionado de APIs**: Estrategias para gestionar versiones de APIs y asegurar compatibilidad entre servicios.
     - **Service Mesh**: Introducción a Service Meshes como Istio o Linkerd para gestionar la comunicación, seguridad y monitoreo de microservicios.
     - **Autenticación y Autorización**: Implementación de OAuth2 y OpenID Connect para gestionar la autenticación en microservicios.
   - **Referencias**:
     - [Building Evolutionary Architectures](https://www.thoughtworks.com/insights/books/building-evolutionary-architectures)
     - [Istio Service Mesh Documentation](https://istio.io/latest/docs/)
     - [OAuth 2.0 and OpenID Connect](https://oauth.net/2/)
   - **Código Ejemplo**:
     - Ejemplo de implementación de Service Mesh con Istio: [GitHub - istio-example](https://github.com/istio/istio)

**2. Documentación con Spring Doc-OpenAPI y Markdown**
   - **Descripción**: La documentación es clave para la mantenibilidad y colaboración en proyectos de microservicios. Esta sección explora cómo generar documentación de APIs automáticamente con Spring Doc-OpenAPI y cómo utilizar Markdown para mantener documentación técnica.
     - **Spring Doc-OpenAPI**: Integración de Spring Doc-OpenAPI en microservicios Spring Boot para generar documentación de API en formato OpenAPI.
     - **Markdown**: Uso de Markdown para escribir y mantener documentación técnica, incluyendo la estructura de archivos y mejores prácticas.
   - **Referencias**:
     - [Spring Doc-OpenAPI Documentation](https://springdoc.org/)
     - [Markdown Guide](https://www.markdownguide.org/)
   - **Código Ejemplo**:
     - Ejemplo de proyecto con Spring Doc-OpenAPI: [GitHub - springdoc-openapi-example](https://github.com/springdoc/springdoc-openapi-demos)

**3. Healthcheck de Contenedores con Spring Boot Actuator**
   - **Descripción**: Los healthchecks permiten monitorear el estado de los microservicios y contenedores. En esta sección, aprenderás a utilizar Spring Boot Actuator para exponer endpoints de healthcheck y monitorear el estado de las aplicaciones.
     - **Endpoints de Actuator**: Configuración de endpoints de salud (`/actuator/health`) y personalización de verificaciones de estado.
     - **Integración con Kubernetes**: Configuración de liveness y readiness probes en Kubernetes utilizando los endpoints de Actuator.
   - **Referencias**:
     - [Spring Boot Actuator Documentation](https://docs.spring.io/spring-boot/docs/current/reference/html/actuator.html)
     - [Kubernetes Probes](https://kubernetes.io/docs/tasks/configure-pod-container/configure-liveness-readiness-startup-probes/)
   - **Código Ejemplo**:
     - Ejemplo de uso de Spring Boot Actuator con Kubernetes: [GitHub - actuator-kubernetes-example](https://github.com/spring-guides/gs-actuator-service)

### Sesión 6: Kubernetes

#### Objetivo: Implementar aplicaciones en Kubernetes.

**1. Arquitecturas On-premises vs Cloud**
   - **Descripción**: Esta sección proporciona una comparativa detallada entre la implementación de microservicios en entornos on-premises y en la nube, destacando las diferencias en términos de infraestructura, escalabilidad, costos, y mantenimiento.
     - **On-premises**: Ventajas y desventajas de mantener la infraestructura en local, incluyendo control total y costos fijos.
     - **Cloud**: Beneficios de la escalabilidad automática, modelos de pago por uso, y alta disponibilidad en la nube.
   - **Referencias**:
     - [Cloud vs On-Premises: The Pros and Cons](https://www.redhat.com/architect/cloud-vs-on-premises)
     - [Understanding Cloud Native Applications](https://www.cncf.io/online-programs/understanding-cloud-native-application-bundles/)
   - **Código Ejemplo**:
     - No se requiere código para esta sección, enfoque en comparativas y decisiones estratégicas.

**2. Conceptos de Kubernetes: Arquitectura e Implementación On-premises**
   - **Descripción**: Kubernetes es la plataforma de orquestación de contenedores más popular. Esta sección introduce su arquitectura básica, componentes principales, y cómo desplegar un clúster en un entorno on-premises.
     - **Componentes de Kubernetes**: Explicación de componentes clave como el API Server, etcd, Controller Manager, y kubelet.
     - **Despliegue On-premises**: Instalación y configuración de un clúster Kubernetes en un entorno local utilizando herramientas como kubeadm o k3s.
   - **Referencias**:
     - [Kubernetes Documentation](https://kubernetes.io/docs/concepts/overview/components/)
     - [k3s Documentation for Lightweight Kubernetes](https://rancher.com/docs/k3s/latest/en/)
   - **Código Ejemplo**:
     - Ejemplo de despliegue de un clúster con k3s: [GitHub - k3s-example](https://github.com/k3s-io/k3s)

**3. Arquitectura e Implementación Kubernetes en Cloud**
   - **Descripción**: Kubernetes es una plataforma de orquestación de contenedores ampliamente utilizada en entornos cloud. En esta sección, aprenderás cómo desplegar un clúster Kubernetes en proveedores cloud como AWS, Azure, o Google Cloud.
     - **Provisión de Clúster en Cloud**: Uso de herramientas como EKS (AWS), AKS (Azure), o GKE (Google Cloud) para desplegar Kubernetes.
     - **Configuración y Escalabilidad**: Configuración de nodos, networking, y almacenamiento. Estrategias para escalar automáticamente en función de la demanda.
   - **Referencias**:
     - [Amazon EKS Documentation](https://docs.aws.amazon.com/eks/index.html)
     - [Azure Kubernetes Service Documentation](https://docs.microsoft.com/en-us/azure/aks/)
     - [Google Kubernetes Engine Documentation](https://cloud.google.com/kubernetes-engine/docs)
   - **Código Ejemplo**:
     - Ejemplo de despliegue de un clúster en AWS EKS usando Terraform: [GitHub - eks-terraform-example](https://github.com/terraform-aws-modules/terraform-aws-eks)

**4. Manifiestos de Despliegue en Kubernetes**
   - **Descripción**: Los manifiestos de Kubernetes son archivos YAML que definen la configuración de recursos como Pods, Services, y Deployments. Esta sección detalla cómo crear y gestionar estos manifiestos para desplegar y escalar aplicaciones en Kubernetes.
     - **Creación de Manifiestos**: Guía para escribir manifiestos básicos de Kubernetes, incluyendo Pods, Services, y Deployments.
     - **Gestión y Actualización**: Uso de herramientas como `kubectl` para aplicar, actualizar y gestionar recursos en un clúster Kubernetes.
   - **Referencias**:
     - [Kubernetes Deployment Documentation](https://kubernetes.io/docs/concepts/workloads/controllers/deployment/)
     - [Kubernetes Production Best Practices](https://learnk8s.io/production-best-practices))
   - **Código Ejemplo**:
     - Ejemplo de manifiestos YAML para Kubernetes: [GitHub - kubernetes-yaml-example](https://github.com/Java-Techie-jt/springboot-k8s-example)

![Alt text](https://github.com/gmacastil/curso-micros-cloudnative/blob/main/images/yaml.png)

### Sesión 7: DevSecOps

#### Objetivo: Comprender los conceptos y prácticas de automatización y control en el ciclo de vida de desarrollo.


**1. Conceptos de DevSecOps**
   - **Descripción**: DevSecOps es una práctica que integra la seguridad en cada fase del ciclo de vida del desarrollo. Esta sección explora cómo incluir controles de seguridad en pipelines CI/CD.
     - **Integración de Seguridad**: Uso de herramientas como Snyk, Aqua Security, y Trivy para análisis de vulnerabilidades en contenedores e imágenes Docker.
     - **Compliance y Policies**: Implementación de políticas de seguridad y cumplimiento en pipelines.
   - **Referencias**:
     - [DevSecOps Practices and Tools](https://www.redhat.com/en/topics/devops/what-is-devsecops)
     - [Snyk Documentation](https://snyk.io/docs/)
   - **Código Ejemplo**:
     - Pipeline de Jenkins con integración de seguridad usando Sonarqube: [Jenkins-Sonarqube-example](https://callmezydd.medium.com/unlocking-code-quality-integrating-jenkins-pipeline-with-sonarqube-and-github-7f450f1c90ab))

**2. Pipelines de CI/CD**
   - **Descripción**: La integración continua y el despliegue continuo son fundamentales para la entrega rápida y confiable de software. Aquí aprenderás a construir pipelines CI/CD optimizados para Kubernetes.
     - **Configuración de Pipelines**: Creación de pipelines utilizando herramientas como Jenkins, GitLab CI/CD, y GitHub Actions.
     - **Despliegue en Kubernetes**: Automatización del despliegue de aplicaciones en Kubernetes directamente desde el pipeline.
   - **Referencias**:
     - [Jenkins Pipeline Documentation](https://www.jenkins.io/doc/book/pipeline/)
     - [GitLab CI/CD Documentation](https://docs.gitlab.com/ee/ci/)
     - [GitHub Actions Documentation](https://docs.github.com/en/actions)
     - [Azure DevOps Documentation](https://learn.microsoft.com/en-us/azure/devops/?view=azure-devops)
   - **Código Ejemplo**:
     - Ejemplo de pipeline CI/CD para despliegue en Kubernetes: [GitHub - kubernetes-cicd-pipeline-example](https://github.com/Akshit8/ci-cd-k8s)

**3. Logging**
   - **Uso de Suite ELK para Gestión de Logs**
     - **Descripción**: ELK (Elasticsearch, Logstash, Kibana) es una solución completa para la centralización, búsqueda, y visualización de logs. Aquí aprenderás a implementar la suite ELK en un clúster Kubernetes.
       - **Elasticsearch y Logstash**: Configuración para recoger y almacenar logs de aplicaciones y sistemas.
       - **Kibana**: Configuración para visualización de logs y generación de dashboards.
     - **Referencias**:
       - [Elastic Stack Documentation](https://www.elastic.co/guide/index.html)
       - [ELK Stack on Kubernetes](https://www.elastic.co/guide/en/cloud-on-k8s/current/index.html)
     - **Código Ejemplo**:
       - Ejemplo de despliegue de ELK Stack en Kubernetes: [GitHub - elk-stack-kubernetes-example](https://github.com/deviantony/docker-elk)
   
   - **Ajuste de Logging en Spring Boot con Logback**
     - **Descripción**: Logback es el framework de logging por defecto en Spring Boot. Esta sección detalla cómo ajustar la configuración de Logback para optimizar la captura y almacenamiento de logs en aplicaciones Spring Boot.
       - **Configuración de Logback**: Personalización de `logback-spring.xml` para definir appender, logger, y patrones de logging.
       - **Integración con ELK**: Cómo enviar logs de Spring Boot a Logstash para su posterior almacenamiento en Elasticsearch.
     - **Referencias**:
       - [Logback Project](http://logback.qos.ch/)
       - [Spring Boot Logging Documentation](https://docs.spring.io/spring-boot/docs/current/reference/html/features.html#features.logging)
     - **Código Ejemplo**:
       - Ejemplo de configuración avanzada de Logback: [GitHub - spring-boot-logback-example](https://github.com/rfding/spring-boot-elk-sample)

**4. Estrategias de Despliegue en Kubernetes con GitOps**
   - **Descripción**: GitOps es un enfoque que utiliza repositorios Git como fuente única de verdad para la automatización de despliegues en Kubernetes. Aquí explorarás cómo implementar GitOps para despliegues continuos y confiables.
     - **Herramientas GitOps**: Uso de herramientas como ArgoCD y Flux para automatizar el despliegue y la gestión del ciclo de vida de aplicaciones en Kubernetes.
     - **Flujos de Trabajo GitOps**: Implementación de pipelines GitOps para aplicar cambios automáticamente a través de repositorios Git.
   - **Referencias**:
     - [What is GitOps?](https://www.redhat.com/es/topics/devops/what-is-gitops)
     - [ArgoCD Documentation](https://argo-cd.readthedocs.io/en/stable/)
     - [Flux CD Documentation](https://fluxcd.io/docs/)
   - **Código Ejemplo**:
     - Ejemplo de despliegue de aplicaciones con GitOps usando ArgoCD: [GitHub - argocd-gitops-example](https://github.com/argoproj/argocd-example-apps)

![Alt text](https://github.com/gmacastil/curso-micros-cloudnative/blob/main/images/password1.png)

![Alt text](https://github.com/gmacastil/curso-micros-cloudnative/blob/main/images/secretos1.png)

![Alt text](https://github.com/gmacastil/curso-micros-cloudnative/blob/main/images/secretos2.png)

### Sesión 8: Observabilidad en Microservicios

#### Objetivo: Integrar la observabilidad sobre arquitecturas orientadas a microservicios

**1. Observabilidad**
   - **Collectores de OpenTelemetry**
     - **Descripción**: OpenTelemetry es una plataforma de código abierto para la observabilidad, que proporciona APIs y herramientas para la recopilación y monitorización de trazas, métricas, y logs. En esta sección, aprenderás a integrar OpenTelemetry en tus microservicios para obtener visibilidad completa del sistema.
       - **Configuración de Collectores**: Configurar collectores para capturar y exportar trazas y métricas a sistemas de almacenamiento o análisis.
       - **Integración con Microservicios**: Instrumentación de microservicios para generar trazas y métricas utilizando OpenTelemetry.
     - **Referencias**:
       - [OpenTelemetry Documentation](https://opentelemetry.io/docs/)
       - [Spring Boot and OpenTelemetry Integration](https://opentelemetry.io/docs/instrumentation/java/)
     - **Código Ejemplo**:
       - Ejemplo de integración de OpenTelemetry en una aplicación Spring Boot: [GitHub - opentelemetry-spring-boot-example](https://github.com/open-telemetry/opentelemetry-java-examples#java-opentelemetry-examples)
   
   - **Grafana y Prometheus**
     - **Descripción**: Grafana y Prometheus son herramientas populares para la visualización y monitoreo de sistemas. Prometheus actúa como un sistema de monitoreo y almacenamiento de series temporales, mientras que Grafana se usa para la visualización de datos.
       - **Configuración de Prometheus**: Implementación de Prometheus para recopilar métricas desde aplicaciones y sistemas.
       - **Dashboards en Grafana**: Creación de dashboards personalizados en Grafana para visualizar métricas y trazas recolectadas.
     - **Referencias**:
       - [Prometheus Documentation](https://prometheus.io/docs/introduction/overview/)
       - [Grafana Documentation](https://grafana.com/docs/)
     - **Código Ejemplo**:
       - Ejemplo de configuración de Prometheus y Grafana para monitorear un clúster Kubernetes: [GitHub - prometheus-grafana-k8s-example](https://github.com/prometheus-operator/kube-prometheus)

### Sesión 9: Arquitecturas EDA

#### Objetivo: Comprender los conceptos de las arquitecturas orientadas a eventos

**1. Arquitecturas EDA (Event-Driven Architecture)**
   - **Implementación de Arquitecturas Orientadas a Eventos**
     - **Descripción**: Las arquitecturas orientadas a eventos (EDA) permiten la construcción de sistemas reactivos y desacoplados mediante la emisión y consumo de eventos. En esta sección, exploraremos cómo implementar EDA en microservicios.
       - **Diseño de EDA**: Principios básicos del diseño de sistemas orientados a eventos, incluyendo la modelación de eventos y flujos de datos.
       - **Integración de Microservicios en EDA**: Cómo los microservicios pueden interactuar mediante eventos en una arquitectura distribuida.
     - **Referencias**:
       - [Event-Driven Architecture Overview](https://docs.microsoft.com/en-us/azure/architecture/guide/architecture-styles/event-driven)
       - [Spring Boot Event-Driven Microservices](https://spring.io/event-driven)
   
   - **Broker de Mensajería RabbitMQ**
     - **Descripción**: RabbitMQ es un broker de mensajería ampliamente utilizado en arquitecturas orientadas a eventos. Facilita la comunicación entre microservicios mediante el intercambio de mensajes asíncronos.
       - **Configuración de RabbitMQ**: Instalación y configuración de RabbitMQ para gestionar colas y enrutamiento de mensajes.
       - **Integración con Microservicios**: Uso de RabbitMQ como broker de mensajería para enviar y recibir mensajes entre microservicios.
     - **Referencias**:
       - [RabbitMQ Documentation](https://www.rabbitmq.com/documentation.html)
       - [Spring AMQP with RabbitMQ](https://spring.io/projects/spring-amqp)
     - **Código Ejemplo**:
       - Ejemplo de implementación de RabbitMQ en microservicios Spring Boot: [GitHub - spring-rabbitmq-example](https://github.com/spring-projects/spring-amqp-samples)

   - **Message-Driven Beans (MDB)**
     - **Descripción**: Message-Driven Beans (MDB) son un componente de la arquitectura Java EE para recibir mensajes de forma asíncrona. En este contexto, se integran con brokers como RabbitMQ para manejar la lógica de procesamiento de eventos.
       - **Configuración de MDB**: Configuración de beans que manejan mensajes asíncronos en aplicaciones Java EE.
       - **Integración con RabbitMQ**: Uso de MDB en conjunto con RabbitMQ para procesar mensajes en una arquitectura orientada a eventos.
     - **Referencias**:
       - [Using MDB with RabbitMQ](https://www.rabbitmq.com/jms-client.html)
     - **Código Ejemplo**:
       - Ejemplo de implementación de MDB con RabbitMQ: [GitHub - rabbitmq-mdb-example](https://github.com/rabbitmq/rabbitmq-java-client)



