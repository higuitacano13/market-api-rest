# 🛒 Market API REST
**Market API REST** es un servicio RESTful construido en Java con Spring Boot, basado en una **arquitectura multicapa orientada al dominio (DDD).** Está diseñado para gestionar la operación básica de un mercado, incluyendo clientes, productos, compras y categorías.

El proyecto utiliza Spring Data JPA para la persistencia con PostgreSQL, y MapStruct para separar las entidades del dominio de los DTO expuestos en la API.

# 🚀 Tecnologías utilizadas
- Spring Boot.
- Spring Data JPA.
- Spring Security.
- MapStruct.
- PostgreSQL.

# ⚙️ Funcionalidades

**1. Consultar Productos Disponibles.** 

- Devuelve una lista de todos los productos registrados en formato JSON.
- Los resultados están ordenados alfabéticamente por nombre (ascendente).
- Retorna HTTP 200 (OK).

**2. Consultar Productos por Id.**

- Devuelve la información del producto correspondiente al id proporcionado.
- Si el producto no existe, retorna HTTP 404 (Not Found).
- En caso exitoso, retorna HTTP 200 (OK).

**3. Consultar Productos por IdCategoria.**

- Devuelve la información de los productos asociados a una categoría determinada.
- Si los productos no existen, retorna HTTP 404 (Not Found).
- En caso exitoso, retorna HTTP 200 (OK).

**4. Crear Nuevo Producto**

- Permite registrar un nuevo producto.
- En caso exitoso, retorna HTTP 201 (Created).

**5. Eliminar Compra**

- Si el producto a eliminar no existen, retorna HTTP 404 (Not Found).
- En caso exitoso, retorna HTTP 200 (OK).

**6. Consultar Todas las Compras** 

- Devuelve una lista de todos los productos registrados en formato JSON.
- Los resultados están ordenados alfabéticamente por nombre (ascendente).
- Retorna HTTP 200 (OK).

**7. Consultar Compras por Cliente** 

- Devuelve una lista de todas las compras realizadas por un cliente en formato JSON.
- Si el cliente no ha realizado ninguna compra, retorna HTTP 404 (Not Found).
- Retorna HTTP 200 (OK).

**8. Crear una Compra** 

- Permite registrar una nueva compra.
- En caso exitoso, retorna HTTP 201 (Created).

# ✅ Requisitos del entorno
Java 17+
Gradle
PostgreSQL 13+
IDE compatible (IntelliJ, Eclipse, VSCode)
