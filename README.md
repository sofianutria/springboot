#  Mi primer proyecto Spring Boot

Creación de mi primera API que consiste en un CRUD, en SpringBoot, con una máquina de hacer textos con frases que me insipran al día a día.

## 🎯 Objetivo
Desarrollar conocimientos suficientes para el uso de SpringBoot, usando un patrón arquitectónico MVC de 3 capas, estilo cliente - servidor, tipo APIRest.

## ⚙️ Características Principales
### Funcionalidades Básicas
- **CRUD Completo** de frases
- Visualización de frases
- Búsqueda por ID

### 🔧 Estructura Técnica
- **Arquitectura MVC de 3 capas**
- Conexión segura a MySQL usando JDBC

## 📦 Estructura del Proyecto
```plaintext
src/
├── main/
│   ├── java/org/biblioteca/
│   │   ├── controller/      # Peticiones de clientes (PhraseController)
│   │   ├── model/           # Entidades de datos (Phrase)
│   │   ├── repository/      # Acceso a datos (PhraseRepository)
│   │   ├── service/         # Lógica de negocio (PhraseService)
│   │   └── Main.java        # Punto de entrada
│   └── resources/           # Conexión con base de datos
└── test/                    # Pruebas unitarias (JUnit 5)
```
## 🛠 Requisitos Técnicos
Java JDK 21+

MySQL Server 8.0+

Intellij IDEA

SpringBoot

Postman

## 🚀 Instalación
Clonar repositorio:

bash
git clone https://github.com/sofianutria/springboot.git
Importar proyecto en Intellij como proyecto Maven

Configurar credenciales en application.properties:
private static final String URL = "jdbc:mysql://localhost:3306/phrase";
private static final String USER = "tu_usuario";
private static final String PASSWORD = "tu_contraseña";
Ejecutar aplicación desde Main.java

## 🖥️ Uso
Desde Postman se pueden introducir las peticiones del usuario:

**Opción 1: ver listado de frases**
- Introduciendo un GET con el localhost:XXXX/phrases

**Opción 2: buscar frase por ID**
- Introduciendo un GET con el localhost:XXXX/phrase?id=Y (siendo Y el id que se quiere buscar)

**Opción 3: añadir una frase**
- Introduciendo un POST con el localhost:XXXX/phrase

**Opción 4: eliminar una frase**
- Introduciendo un DELETE con el localhost:XXXX/phrase)id=Y (siendo Y el id que se quiere eliminar)

**Opción 5: editar una frase**
- Introduciendo un PUT con el localhost:XXXX/phrase/Y (siendo Y el id que se quiere editar)


## Equipo de Desarrollo:

Sofia Santos - Developer