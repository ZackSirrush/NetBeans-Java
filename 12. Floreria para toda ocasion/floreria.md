# Floreria para toda ocasión

Este repositorio contiene el código fuente de un sistema de gestión para una floreria ficticia; el sistema permite generar reportes de empleados y pedidos, así como exportarlos en formato PDF, incluye métodos de inicio de sesión cifrados con HASH MD5, registro de usuarios, arreglos florales, asignar y registrar pedidos, catálogos, lista de pedidos pendientes, tiempo de trabajo sobre pedidos, y demás consultas SQL sobre la base de datos.

## Características

- Generación de reportes de empleados.
- Selección de empleado para generar reporte individual.
- Filtrado de reportes por fechas.
- Visualización de pedidos realizados por cada empleado.
- Exportación de reportes en formato PDF.
- Envío de reportes por correo electrónico al administrador.
- Guardado de reportes en la base de datos.

## Tecnologías Utilizadas

- Java
- MySQL
- JasperReports
- Swing (GUI)
- iReport

## Requisitos

- JDK 8 o superior
- MySQL Server
- iReport (opcional, para modificar los reportes)

## Instrucciones de Uso

1. Clona este repositorio en tu máquina local.
2. Descraga la base de datos alojada en este repositorio `bd/floreriaparatodaocasionbd.sql`
2. Configura la conexión a tu base de datos MySQL en el archivo `conexion.java`.
3. Abre el proyecto en tu entorno de desarrollo Java (por ejemplo, NetBeans, Eclipse).
4. Compila y ejecuta la aplicación.
5. Interactúa con la interfaz para generar, filtrar y exportar reportes.
6. Las contraseñas de pruebas serán: Administrador - admin, SupervisorPV1 - 9876, Disenador1 - 1234
