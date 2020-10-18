# Web Service SOAP/REST 


### Web Service SOAP
Se debe descargar cualquier version de "apache-tomcat-8.0.X-windows-x64/x86.zip", una vez descargado se debe descomprimir el 
archivo, copie y pege la carpeta resultante en el disco "C:\". Luego debe colocar el archivo "SOAP_Back.war" que 
esta en T1-RCD/SOAP/SOAP_Back/dist, en la carpeta "webapps" que está dentro de "apache-tomcat-version". Despues debe ir a 
las variales de entorno del sistema, una vez dentro en "Variales del sistema" debe ver si estan creadas las variable 
JAVA_HOME y JRE_HOME, de no estar las debera crear dando click en el boton "nueva" de mas abajo, se dezplejara una pestaña 
nueva, donde le pedira un "Nombre de la variable", que son los ya antes mencionados, y un "Valor de la variable" en el valor 
debe poner la direcion de la carpeta de java a utilizar en este caso se esta trabajando con java 1.8.0_91, por lo cual la 
carpeta tendria que ser "C:\Program Files\Java\jre1.8.0_91", despues tendre que hacer click en la variable de sistema llamada 
"Path", una vez dentro de esta tendra que crear dos nuevas "variables  de entorno" una sera "%CATALINA_HOME%\bin" y la otra 
sera la carpeta bin del java utilizado que seria  "C:\Program Files\Java\jre1.8.0_91", una vez hecho esto podremos abrir 
consola de comandos "cmd" y escribir "catalina start" para iniciar el servidor tomcat, para finalizarlo se tendra que escribir 
"catalina stop".

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
#Para SOAP
  -ISS
  -Tomcat
### Abrir Sitio Web
