# Sistema de Restaurante con Consultas SQL

Este es un sistema de restaurante desarrollado en Java que permite realizar consultas SQL a una base de datos relacional. A continuación se detallan las diferentes funcionalidades del sistema:

## 1. Inventarios

### Alta de Productos

Permite ingresar un nuevo producto al inventario, incluyendo código (autoincremental), nombre, sucursal de almacenaje, existencias y marca.

### Baja de Productos

Permite buscar y eliminar un producto del inventario mediante su código.

### Modificar Productos

Permite buscar y modificar la información de un producto existente en el inventario.

## 2. Recursos Humanos

### Alta de Sucursales

Permite registrar una nueva sucursal en la base de datos.

### Alta de Personal

Permite ingresar la información de un nuevo empleado, incluyendo id, nombre, apellido paterno, apellido materno, CURP, RFC, fecha de nacimiento, fecha de ingreso, sucursal asignada, puesto y área.

### Baja de Personal

Permite buscar y eliminar un empleado de la base de datos mediante su id.

## 3. Nóminas

Permite registrar la nómina de un empleado, incluyendo desempeño, salario, incentivos, días trabajados y descuentos. Calcula automáticamente el total de la nómina.

## 4. Tablas

Muestra las tablas de inventarios, personal, nóminas y sucursales almacenadas en la base de datos.

## 5. Consultas

Permite consultar las nóminas de los empleados mediante su id y generar un reporte en formato PDF utilizando Jasper Reports.

## Requisitos

- Java 8 o superior.
- Base de datos relacional (MySQL, PostgreSQL, etc.).
- Conexión JDBC a la base de datos.
- Plugins: Jasper reports, jcalendar

## Configuración

1. Clona este repositorio en tu máquina local.
2. Importa el proyecto en tu IDE Java preferido.
3. Configura la conexión JDBC.
4. Importa la estructura de la base de datos utilizando el script proporcionado en `bd/sistemarestaurante.sql`.

## Uso

1. Ejecuta la aplicación desde tu IDE o utilizando el archivo JAR generado.
2. Utiliza la interfaz de usuario para acceder a las diferentes funcionalidades del sistema.

## Contacto

Si tienes alguna pregunta o sugerencia, no dudes en ponerte en contacto con el equipo de desarrollo en [correo electrónico](mailto:isaacnabortorres@gmail.com).