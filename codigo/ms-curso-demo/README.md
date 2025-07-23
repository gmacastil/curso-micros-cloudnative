# Instalar docker Destop o docker engine

```url
https://docs.docker.com/desktop/install/windows-install/
```

## Opcional: Instalar Portainer

```sh
$ docker run -d -p 8000:8000 -p 9443:9443 --name portainer --restart=always -v /var/run/docker.sock:/var/run/docker.sock -v portainer_data:/data portainer/portainer-ce:latest
```

# Instalar database

Ejecutar un contenedor de DB

```sh
$ docker run --name mysql -e MYSQL_ROOT_PASSWORD=123456789 -p 3306:3306 -d mysql:8.4.1
```

## Crear database test y tabla

```sql
CREATE DATABASE `test`;
CREATE TABLE products (
    id BIGINT NOT NULL AUTO_INCREMENT,
    name VARCHAR(255) NOT NULL,
    price FLOAT NOT NULL,
    stock INT,
    PRIMARY KEY (id)
);
```


# Construir imagen

## Compilar codigo

```sh
$ mvn clean package
```

## Construir imagen y subir a registry

```sh
export REGISTRY="nombre del servicio de container registry: dockerhub, azure, aws, etc"
$ docker build . -t ms-curso-demo:1
$ docker tag ms-curso-demo:1 REGISTRY/ms-curso-demo:1
$ docker push REGISTRY/ms-curso-demo:1
```

## Ajustar nombre de imagen en docker-compose y subir container

```sh
$ docker compose up -d
```

## Testing k6

```sh
$ sudo k6 run --vus 10 --duration 15s test.js
```

## login registry externo ej: azure

```sh
$ docker login miregistrysabado.azurecr.io
```