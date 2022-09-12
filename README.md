# Libreta de contactos

En esta aplicación es posible guardar, editar y borrar contactos.

### <strong>Tecnologías usadas, instalación de dependencias y ejecución del programa:</strong><a name="id13"></a>

- <strong>Tecnologías: </strong>
    - Java
    - Spring Boot
    - MySQL
    - JavaScript vanilla

- <strong>Creación de la base de datos: </strong> 

    Es posible usar la base de datos de dos maneras, la primera es la configuración default del proyecto el cual esta conectado a una base de datos en la nube. La segunda manera es mediante una base de datos local para lo cual se necesita <a href="https://www.mysql.com" target="_blank"><strong> MySQL</strong></a> para realizar los siguientes pasos:

    Reemplazar el código del archivo

        \contact-book\src\main\resources\application.properties

    Las lineas 5, 8 y 11 correspondientes a 

        5| spring.datasource.url=jdbc:mysql://aws-sa-east-1.connect.psdb.cloud/contact-book?    sslMode=VERIFY_IDENTITY

        8| spring.datasource.username=mmmtu8kgmrs7l5ja16z8

        11| spring.datasource.password=pscale_pw_BqLzCvPRBcArY7GEY301D7WoMAUFp3U19bNg7c6axrD

    deben ser reemplazadas por las siguientes lineas:

        5| spring.datasource.url=jdbc:mysql://localhost/contactBook?useSSL=false&serverTimezone=UTC&allowPublicKeyRetrival=true

        8| spring.datasource.username=root

        11| spring.datasource.password=pscale_pw_BqLzCvPRBcArY7GEY301D7WoMAUFp3U19bNg7c6axrD

    Ejecutar el script SQL: El script crea la base de datos y se encuentra en la dirección

        /contact-book/database.sql

    Se debe ejecutar todo el contenido del archivo 

        database.sql

- <strong>Dependencias maven:</strong> La instalación de las dependencias usadas por java estará gestionada por el archivo

        pom.xlm

    existente en la dirección:

        /5_creacion-crud/contact-book/pom.xml

    Para lograr ejecutar la aplicación en IntelliJ es necesario abrir la carpeta 'contact-book' que se encuentra en la dirección

        /5_creacion-crud/contact-book/

    La aplicación fue hosteada en el puerto 8080 y su dirección raíz es 
        
        localhost:8080/

### <strong>Experiencia de usuario:</strong> <a name="id14"></a>

La aplicaron dispone de varios módulos con los cuales el usuario puede interactuar.

> Ingreso de jugadores:
    ![Pantalla inicial, ingreso de contactos](https://github.com/Delacrobix/Sofka-Canteras-2/blob/doc/DOC/images/5/2022-08-07_20h51_11.png)

Aquí el usuario puede ingresar los datos del contacto que desea guardar.

> Error en el ingreso de los datos:
    ![Notificacion de error en el ingreso de un contacto](https://github.com/Delacrobix/Sofka-Canteras-2/blob/doc/DOC/images/5/2022-08-07_20h53_11.png)

Si, por alguna razón el usuario ingresa un dato que el sistema no acepta, se le notificara. En el caso de la imagen anterior, el problema se dio por los espacios entre el numero.

> Notificación de guardado al usuario:
    ![Guardado del contacto en el sistema](https://github.com/Delacrobix/Sofka-Canteras-2/blob/doc/DOC/images/5/2022-08-07_20h53_43.png)

En en caso que toda la información este correcta, el contacto sera guardado en la lista de contactos y podrá ser visualizado en la sección 'lista de contactos'.

> Menu:
    ![Menu de navegacion](https://github.com/Delacrobix/Sofka-Canteras-2/blob/doc/DOC/images/5/2022-08-07_20h51_31.png)

Se encuentra ubicado en la esquina superior izquierda y tiene dos direcciones, la primera 'crear contacto nuevo' dirige a la sección 'crear un contacto', la segunda 'ver listado de contactos' nos lleva a la lista de contactos que el usuario tiene guardado en el sistema.

> Listado de contactos:
    ![Lista de contactos](https://github.com/Delacrobix/Sofka-Canteras-2/blob/doc/DOC/images/5/2022-08-07_20h54_02.png)

En esta sección aparecerán los contactos que el usuario haya guardado en el sistema con un resumen de la información, en caso de que el usuario quiera ver la totalidad de la información debe presionar el botón 'ver detalles' en el contacto respectivo que quiere consultar.

> Detalle del contacto:
    ![Detalle](https://github.com/Delacrobix/Sofka-Canteras-2/blob/doc/DOC/images/5/2022-08-07_20h54_18.png)

Si se presiona el botón 'ver detalles' en la sección lista de contactos el usuario recibirá la información detallada del contacto que quiere consultar.

> Interacción con el sistema:
    ![Botones](https://github.com/Delacrobix/Sofka-Canteras-2/blob/doc/DOC/images/5/2022-08-07_20h54_41.png)

En la sección de detalle, el usuario, aparte de los datos del contacto, tendrá a disposición 3 botones: borrar, editar y regresar. Como es de intuir el botón 'regresar' lleva al usuario a la sección 'lista de contactos', el botón borrar, borra el contacto notificándoselo al usuario y el botón editar carga la sección de editar donde es posible cambiar datos del contacto.

> Borrado:
    ![Botones](https://github.com/Delacrobix/Sofka-Canteras-2/blob/doc/DOC/images/5/2022-08-07_20h55_27.png)

> Sección de editado:
    ![Botones](https://github.com/Delacrobix/Sofka-Canteras-2/blob/doc/DOC/images/5/2022-08-07_20h54_56.png)

> Edición satisfactoria:
    ![edición de contacto](https://github.com/Delacrobix/Sofka-Canteras-2/blob/doc/DOC/images/5/2022-08-07_20h55_05.png)

