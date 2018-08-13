## Sinopsis

El proyecto es una aplicacion JavaServer Faces version 2.0.

## Motivacion

Quiero tener ejemplos sencillos que abarquen la mayoria de los temas del examen de certificacion:

Oracle Certified Expert, Java EE 6 JavaServer Faces Developer

Exam Number: 1Z0-896

Exam Title: Java EE 6 JavaServer Faces Developer Certified Expert

## REQUERIMIENTOS
1)	Una IDE de desarrollo o simplemente el bloc de notas. Utilice Eclipse.

2)	Instalar o tener instalado el Java Development Kit (JDK). Utilice la version 1.6.0_45

3)	Un servidor de aplicaciones o un contenedor web. Utilice GlassFish 3.1.2.2

## Tests

Abre un navegador con la siguiente URL:
http://localhost:8080/jsf/faces/index.xhtml

## Notas
Para que todas las peticiones pasen por el Servlet de JSF (FacesServlet) es necesario incluir el prefijo /faces 
como lo especifique en el archivo de configuracion web.xml:
	<servlet-mapping>
		<servlet-name>Faces Servlet</servlet-name>
		<url-pattern>/faces/*</url-pattern>
	</servlet-mapping>

En caso de no hacerlo, simplemente los tags de JSF no seran considerados.

Por esta razon tambien agregue en el archivo de configuracion web.xml, lo siguiente:
	<welcome-file-list>
		<welcome-file>faces/index.xhtml</welcome-file>
	</welcome-file-list>

De esta forma si solo escribes la URL: http://localhost:8080/jsfLogin
En automatico se traduce a: http://localhost:8080/jsfLogin/faces/index.xhtml

De no haber puesto lo anterior, se tendria que escribir lo siguiente: http://localhost:8080/jsf/faces/index.xhtml
En caso contrario, los tags de JSF no aparecerian. 


## License

Todo el trabajo esta bajo Apache 2.0 license
