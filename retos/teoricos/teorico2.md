# Reto Teórico 2: Contenerización

1. ¿Qué es la contenerización?
   - A) Una técnica para transportar carga en contenedores físicos.
   - B) Una forma de empaquetar una aplicación junto con sus dependencias y configuraciones. (Respuesta correcta)
   - C) Un proceso para almacenar archivos en contenedores de almacenamiento en la nube.

   **Explicación**: La contenerización es una tecnología de virtualización a nivel de sistema operativo que permite empaquetar aplicaciones junto con todas sus dependencias, bibliotecas y archivos de configuración en una unidad estandarizada llamada contenedor. Esto garantiza que la aplicación se ejecute de manera consistente en cualquier entorno, resolviendo el problema de "funciona en mi máquina".

   **Puntos**: 10

2. ¿Cuál de los siguientes no es un beneficio de la contenerización?
   - A) Portabilidad.
   - B) Aislamiento.
   - C) Mayor consumo de recursos. (Respuesta correcta)
   
   **Explicación**: Los contenedores son conocidos por su eficiencia en el uso de recursos, no por consumir más. A diferencia de las máquinas virtuales, los contenedores comparten el kernel del sistema operativo, lo que los hace ligeros y eficientes. La portabilidad (ejecutar en cualquier entorno) y el aislamiento (separación de procesos) son beneficios reales de la contenerización.

   **Puntos**: 10
   
3. ¿Qué tecnología es comúnmente utilizada para contenerizar aplicaciones?
   - A) Docker. (Respuesta correcta)
   - B) Kubernetes.
   - C) VMWare.
   
   **Explicación**: Docker es la plataforma de contenerización más popular que permite crear, distribuir y ejecutar contenedores. Kubernetes es una plataforma de orquestación de contenedores, mientras que VMWare es una plataforma de virtualización tradicional basada en hypervisors. Docker revolucionó la contenerización haciendo que fuera accesible para desarrolladores.

   **Puntos**: 10

4. ¿Cuál de las siguientes afirmaciones sobre los contenedores es verdadera?
   - A) Los contenedores virtualizan el sistema operativo subyacente.
   - B) Los contenedores comparten el kernel del sistema operativo subyacente. (Respuesta correcta)
   - C) Los contenedores no tienen acceso a recursos del sistema operativo.
   
   **Explicación**: Los contenedores comparten el kernel del sistema operativo anfitrión, lo que los hace más ligeros que las máquinas virtuales. No virtualizan todo el sistema operativo (como lo hacen las VMs), sino que utilizan características de aislamiento del kernel para crear entornos separados. Además, los contenedores sí tienen acceso controlado a los recursos del sistema operativo.

   **Puntos**: 10

5. ¿Cuál es el formato de archivo utilizado para construir imágenes de contenedor?
   - A) .tar
   - B) .zip
   - C) Dockerfile (Respuesta correcta)
   
   **Explicación**: Un Dockerfile es un archivo de texto que contiene una serie de instrucciones que Docker utiliza para construir automáticamente una imagen de contenedor. Estas instrucciones especifican la imagen base, los comandos a ejecutar, archivos a copiar, variables de entorno, puertos a exponer y el comando de inicio, proporcionando un enfoque declarativo para la creación de imágenes.

   **Puntos**: 10

6. ¿Qué es un container registry?
   - A) Un repositorio para almacenar y gestionar imágenes de contenedores. (Respuesta correcta)
   - B) Una herramienta para orquestar contenedores en producción.
   - C) Un tipo de contenedor especializado en almacenar registros de eventos.
   
   **Explicación**: Un container registry es un repositorio centralizado para almacenar, gestionar y distribuir imágenes de contenedores. Ejemplos incluyen Docker Hub, Google Container Registry, Amazon ECR y GitHub Container Registry. Facilitan el almacenamiento versionado de imágenes y permiten a los equipos compartir y desplegar imágenes de manera consistente.

   **Puntos**: 10

7. ¿Qué es Kubernetes?
   - A) Un proveedor de servicios en la nube.
   - B) Una plataforma de orquestación de contenedores. (Respuesta correcta)
   - C) Un lenguaje de programación para contenedores.
   
   **Explicación**: Kubernetes es una plataforma open-source de orquestación de contenedores que automatiza el despliegue, escalado y gestión de aplicaciones contenerizadas. Proporciona funcionalidades como balanceo de carga, almacenamiento, autoescalado, y recuperación automática, permitiendo gestionar clústeres de contenedores a gran escala de manera eficiente.

   **Puntos**: 10

8. ¿Cuál es la función principal de un Dockerfile?
   - A) Definir las dependencias de la aplicación.
   - B) Especificar cómo construir una imagen de contenedor. (Respuesta correcta)
   - C) Gestionar el ciclo de vida de un contenedor en producción.
   
   **Explicación**: La función principal de un Dockerfile es proporcionar instrucciones paso a paso para construir una imagen de contenedor. Incluye comandos como FROM (imagen base), RUN (ejecutar comandos), COPY (copiar archivos), ENV (variables de entorno), EXPOSE (puertos), y CMD (comando de inicio). Este enfoque "infraestructura como código" permite la creación reproducible de imágenes.

   **Puntos**: 10

9. ¿Qué es un volumen de Docker?
   - A) Una herramienta para escalar contenedores.
   - B) Una forma de almacenar datos persistentes fuera de un contenedor. (Respuesta correcta)
   - C) Una interfaz de línea de comandos para interactuar con Docker.
   
   **Explicación**: Los volúmenes de Docker son mecanismos para persistir datos generados y utilizados por los contenedores. A diferencia del sistema de archivos efímero del contenedor, los volúmenes persisten incluso cuando el contenedor se elimina, permitiendo el almacenamiento persistente y el intercambio de datos entre contenedores, lo cual es crucial para aplicaciones con estado.

   **Puntos**: 10

10. ¿Cuál es el propósito de Docker Compose?
    - A) Orquestar múltiples contenedores como una aplicación única. (Respuesta correcta)
    - B) Especificar la infraestructura subyacente para los contenedores.
    - C) Construir imágenes de contenedor utilizando recetas predefinidas.
    
    **Explicación**: Docker Compose es una herramienta para definir y ejecutar aplicaciones Docker multi-contenedor con un único archivo YAML. Permite especificar servicios, redes, volúmenes y dependencias entre contenedores, simplificando significativamente la gestión de aplicaciones complejas compuestas por múltiples servicios interconectados.

    **Puntos**: 10

11. ¿Qué significa la "I" en la arquitectura de contenedores OCI?
    - A) Integrada
    - B) Imagen
    - C) Iniciativa (Respuesta correcta)
    - D) Infraestructura
    
    **Explicación**: OCI significa Open Container Initiative (Iniciativa de Contenedores Abiertos). Es un proyecto de la Linux Foundation que establece estándares abiertos para los formatos de contenedores y su ejecución, asegurando la interoperabilidad entre diferentes implementaciones de contenedores como Docker, CRI-O y containerd.

    **Puntos**: 10

12. ¿Cuál es la diferencia entre una imagen Docker y un contenedor Docker?
    - A) Las imágenes son para producción y los contenedores para desarrollo
    - B) Las imágenes son plantillas de solo lectura, los contenedores son instancias en ejecución (Respuesta correcta)
    - C) Las imágenes son más grandes que los contenedores
    - D) No hay diferencia técnica entre ambos
    
    **Explicación**: Una imagen Docker es una plantilla de solo lectura que contiene el sistema de archivos y la configuración para crear contenedores. Un contenedor es una instancia en ejecución de una imagen con su propio espacio de procesos, sistema de archivos y red. Es similar a la relación entre una clase (imagen) y un objeto (contenedor) en programación orientada a objetos.

    **Puntos**: 10

13. ¿Qué comando se utiliza para iniciar un contenedor Docker?
    - A) docker build
    - B) docker start
    - C) docker run (Respuesta correcta)
    - D) docker exec
    
    **Explicación**: `docker run` crea e inicia un nuevo contenedor basado en una imagen especificada. Combina las funcionalidades de `docker create` y `docker start` en un solo comando. Permite configurar volúmenes, puertos, variables de entorno y otras opciones al momento de iniciar el contenedor.

    **Puntos**: 10

14. ¿Qué es Docker Hub?
    - A) Un IDE para desarrollar aplicaciones Docker
    - B) Un registry público de imágenes Docker (Respuesta correcta)
    - C) Una herramienta para monitorizar contenedores
    - D) Un servicio de orquestación de contenedores
    
    **Explicación**: Docker Hub es el registry público oficial de Docker para compartir y encontrar imágenes de contenedores. Proporciona repositorios gratuitos y de pago, integración continua, y funciones de colaboración. Es similar a GitHub pero para imágenes Docker, permitiendo a desarrolladores y organizaciones publicar imágenes para uso público o privado.

    **Puntos**: 10

15. ¿Cuál es el propósito de la instrucción ENTRYPOINT en un Dockerfile?
    - A) Especificar el punto de entrada a la red para el contenedor
    - B) Definir el comando principal que se ejecutará al iniciar el contenedor (Respuesta correcta)
    - C) Establecer el usuario con el que se ejecutará el contenedor
    - D) Definir los puertos de entrada que están abiertos
    
    **Explicación**: ENTRYPOINT define el ejecutable que se invoca cuando se inicia el contenedor. A diferencia de CMD, es más difícil de sobrescribir al ejecutar el contenedor, lo que lo hace ideal para definir contenedores como ejecutables. Cuando se usa con CMD, ENTRYPOINT define el comando fijo mientras CMD proporciona argumentos predeterminados que pueden ser reemplazados.

    **Puntos**: 10

16. ¿Qué enfoque de red permite que un contenedor use la pila de red del host directamente?
    - A) Bridge network
    - B) Overlay network
    - C) Host network (Respuesta correcta)
    - D) None network
    
    **Explicación**: El modo "host network" permite que un contenedor comparta la pila de red del host, eliminando el aislamiento de red entre el contenedor y el host. Esto significa que el contenedor usa directamente los puertos del host sin necesidad de mapeo. Ofrece mejor rendimiento pero reduce el aislamiento y puede causar conflictos de puertos.

    **Puntos**: 10

17. ¿Qué tecnología subyacente usa Docker para aislar procesos en Linux?
    - A) Hypervisors
    - B) Namespaces (Respuesta correcta)
    - C) Virtual Machines
    - D) Chroot
    
    **Explicación**: Docker utiliza namespaces del kernel de Linux para proporcionar aislamiento entre contenedores. Los namespaces crean espacios separados para procesos, red, montajes, usuarios y otros recursos del sistema, permitiendo que procesos en diferentes namespaces operen independientemente sin verse entre sí, aunque comparten el mismo kernel.

    **Puntos**: 10

18. ¿Qué estrategia de implementación permite actualizar contenedores sin tiempo de inactividad?
    - A) Big bang deployment
    - B) Blue-green deployment (Respuesta correcta)
    - C) Waterfall deployment
    - D) Shadow deployment
    
    **Explicación**: La implementación Blue-Green mantiene dos entornos de producción idénticos (Blue y Green). Mientras uno está activo, el otro se actualiza. Una vez verificada la nueva versión, el tráfico se redirige del entorno activo al actualizado. Esto permite actualizar sin tiempo de inactividad y proporciona una rápida reversión en caso de problemas.

    **Puntos**: 10

19. ¿Cuál es la ventaja principal de los contenedores sobre las máquinas virtuales tradicionales?
    - A) Mayor seguridad y aislamiento
    - B) Menor consumo de recursos y mayor velocidad (Respuesta correcta)
    - C) Mejor soporte para aplicaciones GUI
    - D) Capacidad para ejecutar diferentes sistemas operativos
    
    **Explicación**: Los contenedores consumen menos recursos y ofrecen mayor velocidad porque comparten el kernel del sistema operativo anfitrión en lugar de virtualizar un sistema operativo completo por instancia. Esto resulta en una huella de memoria más pequeña, un inicio más rápido (segundos vs minutos) y una mayor densidad de aplicaciones por servidor físico.

    **Puntos**: 10

20. ¿Qué es un multi-stage build en Docker?
    - A) Construir múltiples imágenes en paralelo
    - B) Usar múltiples etapas en un Dockerfile para crear imágenes más pequeñas (Respuesta correcta)
    - C) Construir una imagen para múltiples arquitecturas
    - D) Combinar múltiples Dockerfiles en uno solo
    
    **Explicación**: Un multi-stage build utiliza múltiples instrucciones FROM en un único Dockerfile, donde cada instrucción FROM comienza una nueva etapa de construcción. Esto permite copiar solo los artefactos necesarios de una etapa a otra, dejando atrás herramientas de compilación y dependencias temporales. El resultado es una imagen final más pequeña y segura sin los artefactos innecesarios del proceso de construcción.

    **Puntos**: 10
