# Task Manager

Aplicación backend desarrollada en Java con Spring Boot para gestionar tareas, contactos y tipos de tareas (internas o facturables).

---

## Tecnologías

- Java 17+
- Spring Boot 3.5.0
- Spring Data JPA (Hibernate)
- MySQL (base de datos)
- Maven
- HikariCP (pool de conexiones)
- Postman (para probar API)

---

## Estructura de carpetas

- `com.example.taskmanager`
    - `controller` → Controladores REST
    - `model` → Entidades JPA
    - `repository` → Interfaces JPA para acceso a datos
    - `service` → Lógica de negocio (opcional)
    - `TaskmanagerApplication.java` → Clase principal de Spring Boot

---

## Configuración

Configura la conexión a la base de datos MySQL en `src/main/resources/application.properties`:

## Cómo ejecutar
- Clona el repositorio
- Abre el proyecto en IntelliJ IDEA
- Configura la base de datos en application.properties
- Ejecuta la clase TaskmanagerApplication
- La API estará disponible en http://localhost:8080

---

## Endpoints disponibles
- GET /tasks - Lista todas las tareas
- POST /tasks - Crea una nueva tarea
- GET /tasks/{id} - Obtiene tarea por id
- PUT /tasks/{id} - Actualiza tarea
- DELETE /tasks/{id} - Elimina tarea
- Y similares para contacts, internal_tasks, billable_tasks (depende de tu implementación).

---

## Uso con Postman

- Puedes importar una colección de Postman (si la tienes) para probar los endpoints de manera sencilla.