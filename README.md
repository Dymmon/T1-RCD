# Web Service SOAP/REST 


## Web Service SOAP
Colocar "SOAP_Back.war" en la carpeta "webapps" que está dentro de "apache-tomcat-version". Abrir consola de comandos "cmd",
escribir "catalina start". Para detener el servicio escribir "catalina stop".

## Cliente Web SOAP
Colocar la carpeta "cliente SOAP" en la carpeta inetpub de iss. Abrir administrador de Internet Information Services,
en la sección de "Conexiones" hacer click derecho en "Sitios" y seleccionar la opción "Agregar sitio web". Establecer
un nombre para el sitio y en la sección de "Ruta de acceso física" seleccionar la carpeta "cliente SOAP" antes mencionada.
Escojer un puerto disponible para el usuario y dar click en aceptar.
Posterormente en su navegador al acceder a "localhost:puerto asignado" se debe ver el cliente ejecutandose.
## Web Service Rest
Ubicarse con la terminal en la carpeta Rest y ejecutar el comando "mvn compile"
y luego “mvn clean package spring-boot:repackage” esto generara la carpeta Target donde se encuentra el archivo .jar

## Cliente Web REST


### Requerimientos
### Abrir Sitio Web
