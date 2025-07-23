# Reto Práctico 4

**Nombre:** Contenerización y Despliegue de un Microservicio Spring Boot en Kubernetes

---

## Objetivo

Contenerizar el microservicio previamente desarrollado y desplegarlo en un clúster de **Kubernetes**, utilizando un archivo de manifiesto para definir los recursos necesarios.

---

## Pasos Detallados

### 1. Crear un `Dockerfile` para el microservicio

En la raíz del proyecto Spring Boot, crear un archivo llamado `Dockerfile` con el siguiente contenido:

```dockerfile
FROM openjdk:21-jdk-slim
WORKDIR /app
COPY target/demo-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java", "-jar", "app.jar"]
```

**Puntaje:** 10

---

### 2. Construir y etiquetar la imagen Docker

Ejecutar los siguientes comandos desde la raíz del proyecto:

```bash
mvn clean package
docker build -t nombre_usuario/demo-microservice:1.0 .
```

**Puntaje:** 10

---

### 3. Probar la imagen Docker localmente

Ejecutar el contenedor Docker para verificar el funcionamiento:

```bash
docker run -p 8080:8080 nombre_usuario/demo-microservice:1.0
```

Acceder a: [http://localhost:8080/products](http://localhost:8080/products)

**Puntaje:** 10

---

### 4. Subir la imagen a un registro de contenedores

Iniciar sesión en el Docker Hub o Azure Container Registry:

```bash
docker login
```

Subir la imagen:

```bash
docker push nombre_usuario/demo-microservice:1.0
```

**Puntaje:** 10

---

### 5. Crear el manifiesto de despliegue de Kubernetes

Crear un archivo `deployment.yaml` en el proyecto con el siguiente contenido:

```yaml
apiVersion: apps/v1
kind: Deployment
metadata:
  name: demo-microservice
  namespace: nombre_usuario
  labels:
    app: demo-microservice
spec:
  replicas: 2
  selector:
    matchLabels:
      app: demo-microservice
  template:
    metadata:
      labels:
        app: demo-microservice
    spec:
      containers:
      - name: demo-microservice
        image: nombre_usuario/demo-microservice:1.0
        ports:
        - containerPort: 8080
---
apiVersion: v1
kind: Service
metadata:
  name: demo-microservice
  namespace: nombre_usuario
spec:
  selector:
    app: demo-microservice
  ports:
  - protocol: TCP
    port: 8080
    targetPort: 8080
  type: LoadBalancer
```

**Puntaje:** 30

---

### 6. Desplegar el microservicio en Kubernetes

* Asegúrate de estar conectado a un clúster de Kubernetes.
* Ejecutar el despliegue:

```bash
kubectl apply -f deployment.yaml
```

**Puntaje:** 10

---

### 7. Verificar el despliegue

Comprobar que el pod esté en ejecución:

```bash
kubectl get pods -n nombre_usuario
```

Ver el estado del servicio:

```bash
kubectl get svc -n nombre_usuario
```

**Puntaje:** 10

---

### 8. Probar el microservicio en Kubernetes

Accede a la **IP externa** del servicio (obtenida con `kubectl get svc`) y prueba las operaciones CRUD en:

```
http://<EXTERNAL_IP>:8080/products
```

**Puntaje:** 10

