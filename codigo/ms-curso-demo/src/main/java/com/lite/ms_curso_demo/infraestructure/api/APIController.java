package com.lite.ms_curso_demo.infraestructure.api;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


import com.lite.ms_curso_demo.application.ProductApplication;
import com.lite.ms_curso_demo.domain.Product;
import com.lite.ms_curso_demo.exception.ProductNotFoundException;


import org.slf4j.Logger;



@RestController()
@RequestMapping("/products")
public class APIController {

    private static final Logger log = LoggerFactory.getLogger(APIController.class);

    @Autowired
    public ProductApplication productApplication;

    // GET es para leer

    @GetMapping("")
    public List<Product> getAllProducts() {
        log.info("Obteniendo todos los productos");
        return productApplication.findAll();
    }

    @GetMapping("/{id}")
    public Product getProductById(@PathVariable Long id) {
        log.info("Obteniendo producto por id: " + id);
        return productApplication.findById(id).orElseThrow(() -> new ProductNotFoundException(id));
    }

    @GetMapping("/name")
    public List<Product> getProductsByName(@RequestParam String name) {
        List<Product> products = productApplication.findByNameContaining(name);
        if (products.isEmpty()) {
            throw new ProductNotFoundException(name);
        }
        return products;
    }

    // POST es para crear

    @PostMapping("")
    public Product createProduct(@RequestBody Product product) {
        return productApplication.save(product);
    }

    // PUt es para update

    @PutMapping("/update/{id}")
    public Product updateProduct(@PathVariable Long id, @RequestBody Product product) {

        Product productToUpdate = productApplication.findById(id).orElseThrow(() -> new ProductNotFoundException(id));
        productToUpdate.setName(product.getName());
        productToUpdate.setPrice(product.getPrice());
        productToUpdate.setStock(product.getStock());

        return productApplication.save(productToUpdate);
    }


    @PutMapping("/update")
    public Product updateProductv2(@RequestBody Product product) {
        return productApplication.save(product);
    }


    // DELETE es para borrar
    @DeleteMapping("/{id}")
    public Map<String, String> deleteProduct(@PathVariable Long id) {
        Product product = productApplication.findById(id).orElseThrow(() -> new ProductNotFoundException(id));
        productApplication.delete(product);
        Map<String, String> response = new HashMap<>();
        response.put("message", "Producto eliminado: " + id);
        return response;

    }   
}
