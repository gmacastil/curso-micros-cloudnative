# Reto Práctico 1

**Nombre:** Construcción de un Microservicio RESTful con Spring Boot 3 y Java 21

---

## Objetivo

Construir un microservicio RESTful en Java 21 utilizando Spring Boot 3 que gestione una lista de productos.
El microservicio debe permitir realizar operaciones **CRUD** (Crear, Leer, Actualizar, Eliminar) sobre los productos.

---

## Pasos Detallados

### 1. Crear un nuevo proyecto Spring Boot

* Ir a [Spring Initializr](https://start.spring.io/).
* Seleccionar las siguientes opciones:

  * **Project:** Maven Project
  * **Language:** Java
  * **Spring Boot:** 3.x.x (Última versión disponible)
  * **Group:** `com.example`
  * **Artifact:** `demo`
  * **Dependencies:** Spring Web, Spring Data JPA, H2 Database, Lombok
  * **Java:** 21
* Descargar el proyecto generado y descomprimirlo.

**Puntaje:** 10

---

### 2. Configurar `application.properties`

Editar el archivo `src/main/resources/application.properties` y agregar las siguientes configuraciones:

```properties
spring.datasource.url=jdbc:h2:mem:testdb
spring.datasource.driver-class-name=org.h2.Driver
spring.datasource.username=sa
spring.datasource.password=password
spring.jpa.database-platform=org.hibernate.dialect.H2Dialect
spring.h2.console.enabled=true
```

**Puntaje:** 10

---

### 3. Crear la entidad `Product`

```java
package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private Double price;
    private Integer quantity;

    // Getters and Setters
}
```

**Puntaje:** 10

---

### 4. Crear el repositorio `ProductRepository`

```java
package com.example.demo.repository;

import com.example.demo.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
```

**Puntaje:** 10

---

### 5. Crear el controlador REST `ProductController`

```java
package com.example.demo.controller;

import com.example.demo.model.Product;
import com.example.demo.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired
    private ProductRepository productRepository;

    @GetMapping
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    @GetMapping("/{id}")
    public Product getProductById(@PathVariable Long id) {
        return productRepository.findById(id).orElseThrow(() -> new ProductNotFoundException(id));
    }

    @PostMapping
    public Product createProduct(@RequestBody Product product) {
        return productRepository.save(product);
    }

    @PutMapping("/{id}")
    public Product updateProduct(@PathVariable Long id, @RequestBody Product productDetails) {
        Product product = productRepository.findById(id)
                .orElseThrow(() -> new ProductNotFoundException(id));

        product.setName(productDetails.getName());
        product.setPrice(productDetails.getPrice());
        product.setQuantity(productDetails.getQuantity());

        return productRepository.save(product);
    }

    @DeleteMapping("/{id}")
    public String deleteProduct(@PathVariable Long id) {
        Product product = productRepository.findById(id).orElseThrow(() -> new ProductNotFoundException(id));
        productRepository.delete(product);
        return "Product " + id + " deleted successfully!";
    }
}
```

**Puntaje:** 10

---

### 6. Manejar excepciones

#### Clase `GlobalExceptionHandler`:

```java
package com.example.demo.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(ProductNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public String handleProductNotFoundException(ProductNotFoundException ex) {
        return ex.getMessage();
    }
}
```

#### Clase `ProductNotFoundException`:

```java
package com.example.demo.exception;

public class ProductNotFoundException extends RuntimeException {
    public ProductNotFoundException(Long id) {
        super("Product not found with id: " + id);
    }
}
```

**Puntaje:** 10

---

### 7. Probar el microservicio

* Ejecutar la aplicación Spring Boot.
* Usar **Postman** para enviar solicitudes HTTP a las siguientes URLs:

  * `GET /products`
  * `GET /products/{id}`
  * `POST /products`
  * `PUT /products/{id}`
  * `DELETE /products/{id}`
* Verificar que las operaciones funcionan correctamente.
* **NOTA:** importar la colección de Postman adjunta: `reto.postman_collection.json`

**Puntaje:** 10

---

### 8. Empaquetar el microservicio

* Usar el siguiente comando Maven:

```bash
mvn package
```

**Puntaje:** 10

---

### 9. Lanzar el microservicio desde línea de comando

* Por fuera del IDE, ejecutar la aplicación con:

```bash
java -jar target/NOMBRE_APP.jar
```

**Puntaje:** 10

---

### 10. Probar la aplicación y subir un pantallazo de los resultados

**Puntaje:** 10

