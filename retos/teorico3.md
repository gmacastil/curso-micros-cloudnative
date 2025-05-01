# Reto Teórico 3: Kubernetes

1. ¿Qué es Kubernetes?
   - A) Un sistema operativo para contenedores.
   - B) Una plataforma de orquestación de contenedores. (Respuesta correcta)
   - C) Un proveedor de servicios en la nube.

   **Explicación**: Kubernetes (K8s) es una plataforma open-source diseñada para automatizar la implementación, el escalado y la gestión de aplicaciones contenerizadas. Orquesta contenedores permitiendo configurar cómo y dónde deben ejecutarse, escalarlos automáticamente, gestionar el almacenamiento persistente y administrar secretos, entre otras funcionalidades avanzadas.

   **Puntos**: 10

2. ¿Cuál es el propósito principal de Kubernetes?
   - A) Gestionar el almacenamiento en la nube.
   - B) Automatizar el despliegue, escalado y operaciones de aplicaciones en contenedores. (Respuesta correcta)
   - C) Proporcionar servicios de base de datos en la nube.

   **Explicación**: El propósito principal de Kubernetes es automatizar las tareas operativas relacionadas con las aplicaciones contenerizadas. Esto incluye la programación de contenedores en nodos del clúster, el mantenimiento del estado deseado de las aplicaciones, la gestión automática de la carga de trabajo, el auto-escalado y la recuperación automática ante fallos.

   **Puntos**: 10

3. ¿Qué es un Pod en Kubernetes?
   - A) Un grupo de contenedores que comparten recursos y espacio de red. (Respuesta correcta)
   - B) Una instancia de un contenedor en ejecución.
   - C) Un recurso de red utilizado para exponer servicios externamente.

   **Explicación**: Un Pod es la unidad de despliegue más pequeña en Kubernetes. Puede contener uno o varios contenedores que comparten el mismo espacio de red (dirección IP), almacenamiento y especificaciones de cómo ejecutarse. Los Pods están diseñados para ejecutar contenedores estrechamente acoplados que necesitan comunicarse entre sí como si estuvieran en la misma máquina.

   **Puntos**: 10

4. ¿Cuál es la función principal de un Deployment en Kubernetes?
   - A) Exponer servicios externamente.
   - B) Gestionar la implementación y actualización de aplicaciones. (Respuesta correcta)
   - C) Almacenar datos persistentes para aplicaciones.

   **Explicación**: Un Deployment es un recurso de Kubernetes que proporciona actualizaciones declarativas para Pods y ReplicaSets. Define el estado deseado de una aplicación, incluyendo qué imagen de contenedor usar y cuántas réplicas mantener. Kubernetes se encarga de hacer coincidir el estado actual con el deseado, facilitando las actualizaciones progresivas y reversiones automatizadas.

   **Puntos**: 10

5. ¿Qué es un Service en Kubernetes?
   - A) Una aplicación en contenedor.
   - B) Un recurso utilizado para almacenar datos persistentes.
   - C) Una recurso que conecta con un conjunto lógico de Pods y una política de acceso a ellos. (Respuesta correcta)

   **Explicación**: Un Service en Kubernetes es una abstracción que define un conjunto lógico de Pods y una política para acceder a ellos. Proporciona una dirección IP y DNS estables para un grupo de Pods, permitiendo el descubrimiento de servicios y balanceo de carga entre Pods relacionados, incluso cuando los Pods subyacentes cambian debido a escalado o actualizaciones.

   **Puntos**: 10

6. ¿Cuál es la diferencia principal entre un Deployment y un StatefulSet en Kubernetes?
   - A) Los Deployments son para aplicaciones de estado, mientras que los StatefulSets son para aplicaciones sin estado.
   - B) Los StatefulSets garantizan un orden específico de despliegue y nombres persistentes, mientras que los Deployments no lo hacen. (Respuesta correcta)
   - C) Los Deployments pueden escalar automáticamente, mientras que los StatefulSets requieren escalado manual.

   **Explicación**: StatefulSets están diseñados para aplicaciones con estado (stateful) que requieren identidades de red estables, almacenamiento persistente y orden garantizado en las operaciones de escalado, actualización y eliminación. A diferencia de los Deployments (idóneos para aplicaciones sin estado), los StatefulSets asignan identificadores secuenciales y predecibles a los Pods (como web-0, web-1), manteniendo una identidad persistente incluso tras rescheduling.

   **Puntos**: 10

7. ¿Qué es un Ingress en Kubernetes?
   - A) Un recurso de enrutamiento para el acceso a los servicios. (Respuesta correcta)
   - B) Un recurso utilizado para almacenar datos persistentes.
   - C) Un controlador de recursos para la gestión de almacenamiento.

   **Explicación**: Un Ingress es un recurso de API que gestiona el acceso externo a los servicios en un clúster, típicamente a través de HTTP/HTTPS. Actúa como una capa de entrada que proporciona enrutamiento basado en URL, terminación SSL/TLS, balanceo de carga y alojamiento virtual basado en nombres. Requiere un controlador Ingress (como Nginx, Traefik o HAProxy) para implementar sus reglas.

   **Puntos**: 10

8. ¿Cuál es la función principal de un Namespace en Kubernetes?
   - A) Limitar el acceso de los usuarios a los recursos del clúster.
   - B) Agrupar recursos en un entorno aislado dentro de un clúster. (Respuesta correcta)
   - C) Definir políticas de seguridad para aplicaciones desplegadas.

   **Explicación**: Los Namespaces proporcionan una forma de dividir los recursos del clúster entre múltiples usuarios, equipos o aplicaciones. Actúan como clusters virtuales dentro de un mismo cluster físico, permitiendo aislar recursos, aplicar cuotas, políticas y controles de acceso específicos. Son fundamentales para la multitenencia en Kubernetes, permitiendo que diferentes equipos compartan un clúster de forma segura.

   **Puntos**: 10
   
9. ¿Qué es un Nodo en Kubernetes?
   - A) Una unidad de cómputo que puede ser física o virtual, donde se ejecutan los Pods. (Respuesta correcta)
   - B) Una instancia de una aplicación en contenedor.
   - C) Un recurso utilizado para almacenar datos persistentes.

   **Explicación**: Un Nodo es una máquina de trabajo en Kubernetes que puede ser física o virtual. Cada nodo contiene los servicios necesarios para ejecutar Pods y es gestionado por el plano de control del clúster. Los componentes clave en cada nodo incluyen kubelet (agente que se comunica con el plano de control), kube-proxy (para redes) y el runtime de contenedores (como Docker o containerd).

   **Puntos**: 10

10. ¿Cuál es el comando utilizado para aplicar la configuración definida en un archivo YAML en Kubernetes?
    - A) `kubectl run`
    - B) `kubectl apply` (Respuesta correcta)
    - C) `kubectl create`

    **Explicación**: `kubectl apply` es el comando recomendado para aplicar configuraciones declarativas a recursos en un clúster Kubernetes. A diferencia de `kubectl create` (que solo crea recursos), `kubectl apply` puede crear y actualizar recursos existentes. Permite un enfoque GitOps donde los archivos YAML versionados en control de código fuente definen el estado deseado del sistema.

    **Puntos**: 10

11. ¿Qué es un ConfigMap en Kubernetes?
    - A) Un mapa de configuración de red para el clúster.
    - B) Un recurso para almacenar datos de configuración no confidenciales. (Respuesta correcta)
    - C) Una herramienta para mapear contenedores a nodos específicos.
    - D) Un tipo de almacenamiento persistente.
    
    **Explicación**: Un ConfigMap es un recurso de API utilizado para almacenar datos de configuración no confidenciales en pares clave-valor. Permite separar la configuración de los contenedores de la imagen, haciendo las aplicaciones más portables. Los ConfigMaps pueden ser montados como volúmenes o usados como variables de entorno en los Pods, facilitando la configuración dinámica.

    **Puntos**: 10

12. ¿Qué es un Secret en Kubernetes?
    - A) Un pod que ejecuta servicios de seguridad.
    - B) Un objeto para guardar información confidencial como contraseñas y tokens. (Respuesta correcta)
    - C) Un método de encriptación para comunicaciones entre pods.
    - D) Una clave de acceso para el panel de control de Kubernetes.
    
    **Explicación**: Un Secret es un recurso de Kubernetes diseñado para almacenar información sensible como contraseñas, tokens OAuth, claves SSH o TLS. A diferencia de ConfigMaps, los Secrets están codificados en base64 por defecto (aunque no encriptados a menos que se configure el cifrado en reposo). Los Secrets pueden ser montados como volúmenes o utilizados como variables de entorno.

    **Puntos**: 10

13. ¿Qué es un DaemonSet en Kubernetes?
    - A) Un conjunto de demonios del sistema operativo.
    - B) Un recurso que garantiza que una copia de un Pod se ejecute en todos o algunos nodos del clúster. (Respuesta correcta)
    - C) Un conjunto de procesos en segundo plano para el plano de control.
    - D) Un sistema para programar tareas periódicas.
    
    **Explicación**: Un DaemonSet garantiza que todos los nodos (o un subconjunto filtrado) ejecuten exactamente una copia de un Pod específico. Cuando se añaden nuevos nodos al clúster, los Pods se programan automáticamente en ellos, y cuando se eliminan nodos, los Pods se recolectan como basura. Es ideal para agentes de monitoreo, recolectores de logs y otros servicios que deben ejecutarse en cada nodo.

    **Puntos**: 10

14. ¿Qué es un PersistentVolume en Kubernetes?
    - A) Un volumen que contiene datos de aplicación que sobreviven a reinicios.
    - B) Un recurso de clúster que representa almacenamiento en la infraestructura. (Respuesta correcta)
    - C) Un volumen que persiste datos en memoria para acceso rápido.
    - D) Un volumen especial para logs del sistema.
    
    **Explicación**: Un PersistentVolume (PV) es un recurso de clúster que representa una pieza de almacenamiento aprovisionada por un administrador o dinámicamente mediante StorageClasses. Es un recurso a nivel de cluster independiente del ciclo de vida de cualquier Pod. Los PVs abstraen los detalles de cómo se proporciona el almacenamiento y cómo se consume, separando la provisión del almacenamiento de su uso.

    **Puntos**: 10

15. ¿Qué componente de Kubernetes es responsable de programar Pods en Nodos?
    - A) kubelet
    - B) kube-proxy
    - C) kube-scheduler (Respuesta correcta)
    - D) etcd
    
    **Explicación**: El kube-scheduler es el componente del plano de control responsable de decidir en qué nodo debe ejecutarse cada Pod nuevo. Toma decisiones de programación basadas en recursos disponibles, restricciones definidas por el usuario (como afinidad/anti-afinidad), políticas y otros factores como la localidad de datos y la interferencia entre cargas de trabajo.

    **Puntos**: 10

16. ¿Cuál es el propósito de una etiqueta (label) en Kubernetes?
    - A) Documentar recursos para los administradores.
    - B) Identificar y seleccionar grupos de objetos con características comunes. (Respuesta correcta)
    - C) Categorizar nodos por capacidad de hardware.
    - D) Marcar recursos para eliminación automática.
    
    **Explicación**: Las etiquetas (labels) son pares clave-valor asociados a objetos Kubernetes que permiten identificar, organizar y seleccionar subconjuntos de objetos. Son fundamentales para la asociación entre recursos (como Pods y Services), la implementación de estrategias de despliegue basadas en selectores, y para aplicar operaciones a grupos específicos de recursos mediante selectores de etiquetas.

    **Puntos**: 10

17. ¿Qué es un Helm Chart?
    - A) Una herramienta para diagramar la topología del clúster.
    - B) Un paquete predefinido de recursos Kubernetes listos para desplegar. (Respuesta correcta)
    - C) Un gráfico de rendimiento para monitorear el clúster.
    - D) Una interfaz gráfica para Kubernetes.
    
    **Explicación**: Helm Charts son paquetes de recursos Kubernetes preconfigurados que facilitan la definición, instalación y actualización de aplicaciones. Funcionan como sistemas de empaquetado para Kubernetes, similar a lo que son apt/yum para Linux. Incluyen plantillas, valores por defecto y documentación, permitiendo despliegues complejos con comandos simples y gestión del ciclo de vida de la aplicación.

    **Puntos**: 10

18. ¿Qué es un Job en Kubernetes?
    - A) Un Pod que ejecuta una tarea específica y finaliza. (Respuesta correcta)
    - B) Un proceso para asignar cargas de trabajo a los nodos.
    - C) Un controlador para gestionar actualizaciones de aplicaciones.
    - D) Un sistema de monitoreo de recursos del clúster.
    
    **Explicación**: Un Job crea uno o más Pods para realizar una tarea y asegura que un número específico de ellos terminen con éxito. A diferencia de otros controladores diseñados para mantener procesos en ejecución continuamente, los Jobs están diseñados para tareas que finalizan (como procesamiento por lotes). Cuando los Pods completan su trabajo, el Job rastrea las terminaciones exitosas y la tarea se considera completada.

    **Puntos**: 10

19. ¿Qué es el contexto actual en `kubectl`?
    - A) El estado actual de todos los recursos en el clúster.
    - B) La configuración que determina a qué clúster y con qué credenciales se conecta kubectl. (Respuesta correcta)
    - C) El espacio de nombres activo para los comandos.
    - D) La documentación contextual disponible para comandos.
    
    **Explicación**: El contexto actual de kubectl define el clúster, el usuario y el namespace para las operaciones de kubectl. Permite a los administradores cambiar rápidamente entre diferentes clústeres o espacios de nombres sin especificar estos detalles en cada comando. Los contextos se configuran en el archivo kubeconfig (~/.kube/config) y se pueden alternar con comandos como `kubectl config use-context`.

    **Puntos**: 10

20. ¿Cuál es la diferencia entre un ClusterIP, NodePort y LoadBalancer Service?
    - A) ClusterIP es interno al clúster, NodePort expone en puertos de nodo, LoadBalancer utiliza balanceadores externos. (Respuesta correcta)
    - B) ClusterIP es para APIs, NodePort para aplicaciones web, LoadBalancer para bases de datos.
    - C) ClusterIP es más rápido, NodePort más seguro, LoadBalancer más escalable.
    - D) ClusterIP es para clústeres pequeños, NodePort para medianos, LoadBalancer para grandes.
    
    **Explicación**: Estos son tres tipos de Services en Kubernetes: ClusterIP expone el servicio en una IP interna del clúster (accesible solo desde dentro); NodePort expone el servicio en un puerto estático en cada nodo del clúster (accesible externamente a través de <NodeIP>:<NodePort>); y LoadBalancer aprovisiona un balanceador de carga externo en nubes compatibles que dirige el tráfico hacia los nodos, ofreciendo una solución completa para exposición externa.
