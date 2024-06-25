Desafío - JEE y Java Server Pages (I)
-

En este desafío validaremos nuestros conocimientos en la utilización de Java Server Pages
(JSP) en conjunto con el IDE Eclipse. Para este desafío necesitarás aplicar todo lo aprendido
en los bloques 1,2 y 3 de esta unidad, te aconsejamos mantener a mano dicho material en
caso de cualquier duda.

Lee todo el documento antes de comenzar el desarrollo individual de este desafío, para
asegurarte de tener el máximo puntaje y enfocar bien los esfuerzos.
Tiempo asociado: 1 hora cronológica.


Descripción
-

En este desafío vamos a desarrollar un nuevo proyecto Java Web Dinámico, en donde como
característica principal vamos a seleccionar un número por pantalla, para que luego nuestro
proyecto por medio de la utilización de servlet, responda con las siguientes acciones
asociadas al número seleccionado.
1. Retorno de factorial del número.
2. Retorno si el número es par o impar.

Para esto nos apoyaremos tanto de la utilización de JSP como elemento de visualización de
información, como así también los Servlets de Java para la captura de información y retorno
de valores respecto de la selección de usuario.


![image](https://github.com/TomasAguileraCastillo/Desafio-JEE-y-Java-Server-Pages-I-/assets/136927556/73182110-e7d4-4fd9-8e21-fdd7c42506fa)




Aplicando los conceptos y herramientas aprendidas hasta ahora, generamos lo siguiente:

	 1. Un proyecto Java Web Dinámico desde el IDE Eclipse.
	 2. 1 archivo JSP de presentación para captura de valor de número seleccionado (del 1 al 10).
	 3. Vinculación con Servlet para toma de request y posterior proceso de evaluación con entrega de
	 información asociada al mes.
	 4. Generación de respuesta con valores de acuerdo al mes seleccionado 
	 
	 

¡Vamos que se puede!



Requerimientos
-


Mediante la utilización del IDE de desarrollo Eclipse, se debe crear un nuevo proyecto Web
Dinámico llamado “DesafíoJSP”, este proyecto debe ser desplegado bajo el servidor Web
Apache Tomcat 9.


Una vez creado el proyecto, se debe crear la página “index.jsp”, la cual es el JSP de entrada
en donde se debe visualizar por pantalla el listado de números desde el 1 al 10. Estos números
a su vez tendrán asociado el vínculo, que será enviado como parámetro al servlet respectivo:
	
			ej <a href=”servlet?num=1”>Número 1</a>.
			
Se debe crear un servlet, que sea capaz de recoger la información entregada desde el JSP
(request del día), para luego procesar dicho dato y según corresponda, entregar la salida con
la información requerida, vale decir los 2 procesos indicados.

		1. Retorno de factorial del número.
		2. Retorno si el número es par o impar.

Finalmente, este servlet debe ser capaz de desplegar la salida de información por pantalla,
para la visualización del usuario que consulta.

		1. Requerimiento 1 (Crear un nuevo proyecto Java Web Dinámico de Nombre “DesafioJsp”.)
		(1 Puntos)
		
		2. Requerimiento 2 (Crear la estructura JSP correspondiente a la vista requerida,considerando la salida
		de información y vínculos requeridos (llamado a servlet con parámetro de número para retorno de factorial
		/ fibonacci y si es par / impar).
		(3 Puntos)
		
		3. Requerimiento 3 (Crear y vincular a los servlets necesarios para el despliegue de la información requerida.
		 (2 servlets)) (3 Puntos)
		 
		 4. Requerimiento 3 (Mostrar la salida de información de acuerdo a los 2 procesos requeridos, factorial y es par/impar.)
		 (3 Puntos)
		 
		 ¡Mucho éxito!
		 
		 


Consideraciones y recomendaciones
-


	1. Se puede apoyar de los ejercicios anteriores a modo de consulta
	2. Recuerde tener previamente configurado su servidor tomcat dentro del IDE Eclipse
	
	¡Vamos con todo!
	
	
	
Imagenes del Proyecto

![image](https://github.com/TomasAguileraCastillo/Desafio-JEE-y-Java-Server-Pages-I-/assets/136927556/efeca00f-1d99-4957-a18e-de946e446242)

![image](https://github.com/TomasAguileraCastillo/Desafio-JEE-y-Java-Server-Pages-I-/assets/136927556/59ced81f-91eb-4a15-9769-f9c654042cda)

![image](https://github.com/TomasAguileraCastillo/Desafio-JEE-y-Java-Server-Pages-I-/assets/136927556/0da54a3c-2412-40f7-a7cd-1dfaabbddc84)

![image](https://github.com/TomasAguileraCastillo/Desafio-JEE-y-Java-Server-Pages-I-/assets/136927556/105b91d9-eee6-4470-b767-60e52bf1a530)


