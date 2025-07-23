# Reto Práctico 3

**Nombre:** Construcción y Despliegue de una Imagen Personalizada en un Docker Registry

---

## Objetivo

Construir una **imagen personalizada de NGINX** que incluya un archivo HTML modificado y publicarla en el **Docker Registry de Azure**.
Posteriormente, desplegar un contenedor desde esa imagen en una **máquina virtual de Azure**.

---

## Instrucciones

### 1. Crear el `Dockerfile`

En tu máquina local, crea un directorio para el proyecto y dentro de él crea un archivo llamado `Dockerfile` con el siguiente contenido:

```dockerfile
FROM nginx
COPY index.html /usr/share/nginx/html/index.html
```

**Puntaje:** 10

---

### 2. Crear el archivo `index.html`

En el mismo directorio donde está el `Dockerfile`, crea un archivo `index.html` con el siguiente contenido:

```html
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Reto 2</title>
</head>
<body>
    <h1>Reto 2</h1>
    <p>Bienvenido al segundo reto de despliegue con Docker y Registry.</p>
</body>
</html>
```

**Puntaje:** 10

---

### 3. Abrir terminal y navegar al directorio

Abre una terminal en tu equipo y navega hasta el directorio del proyecto.

**Puntaje:** 10

---

### 4. Construir la imagen personalizada

Ejecuta el siguiente comando para construir la imagen Docker:

```bash
docker build -t registry_azure/nginx-personalizado .
```

> **Nota:** Reemplaza `registry_azure` con el nombre real de tu **Azure Container Registry**.

**Puntaje:** 10

---

### 5. Iniciar sesión en Azure Container Registry

Desde la terminal, autentícate en tu registry:

```bash
docker login registry_azure
```

**Puntaje:** 10

---

### 6. Subir la imagen personalizada al Registry

Ejecuta el siguiente comando para hacer *push* de la imagen al registry:

```bash
docker push registry_azure/nginx-personalizado
```

**Puntaje:** 10

---

### 7. Desplegar en la VM de Azure

En tu máquina virtual de Azure, crea o ajusta un archivo `docker-compose.yml` que utilice la imagen personalizada. Luego, ejecuta:

```bash
docker compose up -d
```

**Puntaje:** 20

---

### 8. Verificar despliegue en navegador

Accede desde tu navegador a la **IP pública de la VM de Azure**.
Deberías ver el título **"Reto 2"** y el mensaje de bienvenida definido en tu `index.html`.

**Puntaje:** 20

