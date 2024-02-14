# Manejo de Archivos

Este programa es una aplicación de interfaz gráfica que permite crear, abrir, editar, renombrar y eliminar archivos de texto en el sistema de archivos del usuario. La aplicación está escrita en Java y utiliza componentes de la biblioteca Swing para la interfaz gráfica de usuario (GUI).

## Descripción

El programa consta de las siguientes clases principales:

- **`Manejoarchivos`**: Esta clase contiene el método `main`, que es el punto de entrada del programa. Crea una instancia de la clase `manejoArchivo`, que representa la interfaz gráfica de la aplicación, y la hace visible al usuario.

- **`manejoArchivo`**: Esta clase representa la interfaz gráfica de usuario (GUI) de la aplicación. Proporciona campos de texto, áreas de texto y botones para que el usuario interactúe con la aplicación y realice operaciones en archivos de texto.

- **`abrirArchivos`**: Esta clase contiene métodos para abrir y guardar archivos de texto. Utiliza objetos de las clases `FileInputStream` y `FileOutputStream` para leer y escribir en archivos respectivamente.

## Funcionalidades

- Crear un nuevo archivo de texto especificando su nombre y contenido.
- Abrir un archivo de texto existente para ver y editar su contenido.
- Renombrar un archivo de texto existente.
- Eliminar un archivo de texto existente.

## Uso

1. Ejecuta la aplicación.
2. Utiliza los campos de texto y botones de la interfaz gráfica para realizar las operaciones deseadas en los archivos de texto.
3. Para crear un nuevo archivo, ingresa un nombre en el campo correspondiente y escribe el contenido en el área de texto. Luego, haz clic en el botón "Crear".
4. Para abrir un archivo existente, haz clic en el botón "Leer", selecciona el archivo deseado en el explorador de archivos y haz clic en "Aceptar".
5. Para renombrar un archivo existente, haz clic en el botón "Seleccionar", elige el archivo a renombrar, ingresa el nuevo nombre en el campo correspondiente y haz clic en el botón "Renombrar".
6. Para eliminar un archivo existente, haz clic en el botón "Eliminar", selecciona el archivo a eliminar en el explorador de archivos y haz clic en "Aceptar".

## Requisitos

- Java Development Kit (JDK)
- Ambiente de desarrollo integrado (IDE) compatible con Java, como NetBeans o IntelliJ IDEA.