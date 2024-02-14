# Gestión de nómina con archivos txt

Este programa es una aplicación de gestión de archivos que permite abrir, leer y guardar archivos de texto. También proporciona funcionalidades básicas para crear, renombrar y eliminar archivos.

## Descripción

El programa consta de tres clases principales:

- **`gestiona`**: Esta clase se encarga de la gestión de archivos. Contiene métodos para abrir un archivo de texto (`abrirarchtexto`) y guardar un archivo de texto (`guardararchtexto`). Utiliza objetos de tipo `FileInputStream` y `FileOutputStream` para leer y escribir en archivos respectivamente.

- **`empleados`**: Esta clase representa un objeto empleado con tres atributos: nombre, RFC y número de empleado. Proporciona métodos getter y setter para acceder y modificar estos atributos.

- **`metodosnom`**: Esta clase contiene métodos para guardar empleados en un archivo de texto y listar los empleados guardados en una tabla. Utiliza un objeto de la clase `empleados` para representar a cada empleado y un vector para almacenar la información de los empleados.

## Funcionalidades

- Abrir un archivo de texto.
- Leer el contenido de un archivo de texto.
- Guardar un archivo de texto con contenido proporcionado por el usuario.
- Crear, renombrar y eliminar archivos.
- Mostrar una lista de empleados guardados en una tabla.

## Uso

1. Ejecuta la aplicación.
2. Utiliza los botones y campos de texto de la interfaz gráfica para realizar las acciones deseadas.
3. Para guardar un empleado, ingresa su nombre, RFC y número de empleado en los campos correspondientes y haz clic en el botón "Guardar".

## Requisitos

- Java Development Kit (JDK)
- Ambiente de desarrollo integrado (IDE) compatible con Java, como NetBeans o IntelliJ IDEA.