# Reto Práctico 2

**Nombre:** Despliegue de una Aplicación con Docker Compose en Azure VM

---

## Objetivo

Desplegar una aplicación web simple utilizando **Docker Compose** en una **máquina virtual de Azure**, empleando una imagen **NGINX** y un volumen para cargar un archivo HTML personalizado.

---

## Instrucciones

### 1. Accede a la máquina virtual de Azure

Accede a la VM donde deseas desplegar la aplicación.

**Puntaje:** 10

---

### 2. Verifica instalación de Docker y Docker Compose

Asegúrate de que tanto **Docker** como **Docker Compose** estén instalados en la VM.

**Puntaje:** 10

---

### 3. Crea el archivo `docker-compose.yml`

En la VM, crea un archivo llamado `docker-compose.yml` con el siguiente contenido:

```yaml
version: '3'
services:
  nginx:
    image: nginx
    ports:
      - "7000:80"  # Puedes usar cualquier puerto entre 7000 y 7020
    volumes:
      - ./html:/usr/share/nginx/html
```

> **Nota:** Cambia el puerto `7000` por uno disponible dentro del rango **7000 a 7020**.

**Puntaje:** 10

---

### 4. Crea el directorio `html`

En el mismo directorio donde se encuentra `docker-compose.yml`, crea una carpeta llamada `html`.

**Puntaje:** 10

---

### 5. Crea el archivo `index.html`

Dentro del directorio `html`, crea un archivo llamado `index.html` con el siguiente contenido:

```html
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Reto 1</title>
</head>
<body>
    <h1>Reto 1</h1>
    <p>Bienvenido al primer reto de despliegue con Docker Compose en Azure.</p>
</body>
</html>
```

Al acceder a la aplicación desde tu navegador usando la **IP pública** de tu VM, verás el título **"Reto 1"** y el mensaje de bienvenida.

**Puntaje:** 10

---

### 6. Despliega la aplicación

Ejecuta el siguiente comando en el mismo directorio que contiene el `docker-compose.yml`:

```bash
docker-compose up -d
```

**Puntaje:** 10

---

### 7. Accede a la aplicación en el navegador

Una vez desplegada, abre tu navegador y accede a la IP pública de tu VM en el puerto configurado (por ejemplo: `http://<IP_PUBLICA>:7000`).

**Puntaje:** 20

---

### 8. Verifica el contenido personalizado

Asegúrate de que se muestre correctamente el contenido HTML definido en el paso anterior.

**Puntaje:** 10

---

### 9. Modifica el contenido si es necesario

Si necesitas cambiar el contenido, edita el archivo `index.html` en el directorio `html`.
Los cambios se verán reflejados automáticamente.

**Puntaje:** 10


