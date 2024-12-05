<h1>:tv: Frases Aleatorias de Series :tv:</h1>

![Portada](https://github.com/user-attachments/assets/5155f508-628f-485f-96fb-48bf888e6c5d)

# Insignias

<div align="center">
    <img src="https://img.shields.io/badge/Estado-Concluido-green">
    <img src="https://img.shields.io/badge/Java-v21-blue">
    <img src="https://img.shields.io/badge/Base de Datos-PostreSQL-blue">
    <img src="https://img.shields.io/badge/Framework-Spring Boot-blue">
    <img src="https://img.shields.io/badge/version-v1.0.0-green">
</div>

# Índice

- [Insignias](#insignias)

- [Descripción del proyecto](#descripción-del-proyecto)

- [Estado del proyecto](#estado-del-proyecto)

- [Demostración de funcionalidades](#demostración-de-funcionalidades)

    - [Funcionalidades del proyecto](#funcionalidades-del-proyecto)

    - [Uso del proyecto](#uso-del-proyecto)

- [Acceso al proyecto](#acceso-al-proyecto)

- [Teconologías utilizadas](#teconologías-utilizadas)

- [Personas Desarrolladoras del Proyecto](#personas-desarrolladoras-del-proyecto)

# Descripción del proyecto

Es una aplicación web ya que están conectadas la aplicación Back-End y la aplicación Front-End, donde muestra información sobre una serie y una frase que mencionó un personaje de dicha serie. También, usando el botón "Ver otras frases..." muestra (de manera aleatoria) información de otra serie con otra frase. La aplicación Front-End lo proporcionó Alura Latam y fue creada por la Instructora Monica Hillman.

Toda la información de las series con su frase están almacenadas en una base de datos de PostgreSQL.

# Estado del proyecto

:white_check_mark: Proyecto compleado

# Demostración de funcionalidades

## Funcionalidades del proyecto

- `Funcionalidad 1`: Tiene una conexión con una base de datos de PostgreSQL, su configuración de conexión en la aplicación está estructurado diferente para proteger de los datos reales. La ruta de dicha configuración es la siguiente: `src/main/resources/application.properties`.

Sólo es sustituir las siguientes variables por los datos que tengas:
```
spring.datasource.url=jdbc:postgresql://${DB_HOST}/${DB_NAME}
spring.datasource.username=${DB_USER}
spring.datasource.password=${DB_PASSWORD}
spring.datasource.driver-class-name=org.postgresql.Driver
hibernate.dialect=org.hibernate.dialect.HSQLDialect

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.format-sql=true
```
- ${DB_HOST}: Es la ruta donde está alojada el proyecto. La ruta por defecto es 'localhost'.
- ${DB_NAME}: Es el nombre de la base de datos.
- ${DB_USER}: Es el nombre de usuario que tienes en la base de datos como PostgreSQL. Por defecto es postgres en caso de que sea con esa base de datos.
- ${DB_PASSWORD}: Es la contraseña que tienes para acceder a una base de datos.

<br>

- `Funcionalidad 2`: Al iniciar la aplicación Back-End y la aplicación Front-End, muestra una serie con la siguiente información: Portada, título, frase y nombre del personaje quien dijo dicha frase.

- `Funcionalidad 3`: Tiene un botón que dice "Ver otras frases...", el cual, al dar click refresca la página y muestra otra serie con la información mencionada anteriormente de forma aleatoria.

# Teconologías utilizadas

- Java 21
- Hibernate
- Spring Boot
- Spring Web
- Maven
- PostgreSQL

# Persona Desarrolladora del Proyecto

[<img src="https://avatars.githubusercontent.com/u/107082359?v=4" width=115><br><sub>Sergio Zuñiga Fraga</sub>](https://github.com/SergioZF09)
