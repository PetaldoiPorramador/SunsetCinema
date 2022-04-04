# Betebeharrak
Zinema areto baten aste osoko (astelehenetik - ingadera) programazioa gorde eta kudeatu dezakeen programa diseinatu eta programatu beharko dugu. Egun bakoitzak eduki ordu kopuru maximo bat izango du.
Egun guztiak 16:00-etan hasiko dira igortzen.
### Eguneko ordu maximoak
#### Astelehena: 5
#### Asteartena: 5
#### Asteazkena: 5
#### Osteguna: 6
#### Ostirala: 6
#### Larunbata: 8
#### Igandea: 8
TODO RESUMIR TRADUCIR
## Erabiltzaileen erabilera
Erabiltzaileak zinemako langileak izango dira eta erabiltzaile pasahitza bidez logetuko dira sisteman lan egiteko.
Zinemako langileei askoz eroso eta errazago egiteko lan egitea interfaze grafiko egokiak diseinatu eta programan ezarri.
### 1.	BIENVENIDA. El primer caso será el del saludo de bienvenida. En esta primera interfaz tendrá que aparecer el logo de la empresa y un saludo de bienvenida. Para pasar a la siguiente pantalla, el usuario hará un click sobre cualquier punto de la interfaz y se nos mostrará la interfaz de LOGIN. 

### 2.	LOGIN. En esta interfaz se nos pedirá el nombre de usuario y contraseña correctos.
a.	Botón inicio: al pulsarlo, volveremos a la pantalla de BIENVENIDA y todos los parámetros introducidos (de haberlos) se reiniciaran.
b.	Botón login: Se comprobará si el usuario y contraseña introducidas son correctos; de serlo, se avanzará a la pantalla de SELECCIÓN DE DÍA. En caso contrario, se permitirá volver a intentar el proceso de login.
c.	Botón registro: al pulsarlo, accederemos a la pantalla de REGISTRO.

### 3.	REGISTRO. Esta interfaz deberá permitir registrar un nuevo usuario. Del usuario queremos saber el nombre, apellidos, login, password, fecha de nacimiento y cargo de la empresa {Empleado, Director Local, Director Provincial}. Se deberá comprobar que el usuario no existe previamente en el sistema, y se verificará que ha introducido la clave dos veces para evitar errores. 
a.	Botón registro: Registrará al usuario en nuestro sistema.
b.	Botón login: al pulsarlo, volveremos a la pantalla de LOGIN y todos los parámetros introducidos (de haberlos) se reiniciaran.

### 4.	SELECCIÓN DE DÍA: En esta pantalla seleccionaremos el día de la semana para el que queremos programar la cartelera. Para cada día se nos mostrará, si ya tiene contenidos asignados previamente, el número de dichos contenidos y su duración media; así como el tiempo restante disponible para ese día.

a.	Botón inicio: podremos volver a la pantalla de BIENVENIDA y todos los parámetros (de haberlos) se reiniciaran.
b.	Cartelera: Confirmamos la selección de día y pasamos a la lista de selección de CONTENIDOS.
c.	Resumen Semanal: Botón que permite visualizar el RESUMEN SEMANAL de todos los contenidos que estarán en cartelera durante la semana
d.	Confirmar: Botón que permite visualizar la interfaz de CONFIRMACIÓN.

### 5.	CONTENIDOS: Esta interfaz mostrará un listado de contenidos elegibles para ser asignados al día previamente seleccionado en la interfaz SELECCIÓN DE DÍA. Se podrán escoger contenidos de un listado de contenidos disponibles. A la hora de escoger contenidos disponibles, se mostrarán como elegibles únicamente aquellos que, por duración, puedan emitirse en el tiempo restante de proyección de ese día. 



La interfaz ofrecerá las siguientes opciones:
a.	Edición de Contenidos: De escogerse un contenido del listado, podremos hacer las siguientes acciones con ellas: 
i.	Editar: Permite cambiar el título y la duración de un contenido. 
ii.	Borrar: Elimina un contenido del sistema. 
iii.	Nuevo: Nos aparecerá una nueva fila en el listado con un par de cajas de texto editables para introducir todos los datos de la misma. 
iv.	Cancelar: Revertirá los cambios. 
v.	Confirmar. Guardará los cambios y volver a la cartelera del día

b.	Añadir: Al seleccionar un contenido y darle a añadir, éste se colocará automáticamente en el horario de ese día en el primer hueco disponible (al final). Cada vez que se añade un contenido, se actualizará el tiempo restante disponible para ese día.

c.	Resumen del día: Una vez completado todo el tiempo disponible para el día, se accederá a la interfaz de RESUMEN DEL DÍA. Habrá que rellenar todas las horas disponibles del día para poder acceder a esta interfaz.

### 6.	RESUMEN DEL DÍA: En esta interfaz se mostrarán los contenidos seleccionados para la emisión de ese día, marcando la hora de inicio y fin de los mismos.
a.	Contenido: Al hacer click en un contenido, se mostrará toda la información relacionada con el mismo.

b.	Confirmar: Si confirmas la cartelera del día, se accederá a la interfaz de SELECCIÓN DEL DÍA

### 7.	RESUMEN SEMANAL: Se mostrarán los contenidos que se emitirán a lo largo de toda la semana, indicando hora de inicio, final y su título
a.	Película: Al hacer click en un contenido, se mostrará toda la información relacionada con el mismo.

b.	Botón selección de día: podremos volver a la pantalla de SELECCIÓN DE DÍA.

### 8.	CONFIRMACIÓN. En esta pantalla mostraremos un mensaje especificando que se han registrado correctamente los cambios en la cartelera, y permitirá volver a la pantalla de login. Obviamente, se guardarán todos los cambios realizados (si no se ha hecho ya)

## Datuen kudeaketa
Datuak irauteko fitxategietan gordeko ditugu. Beren idazkera, egitura eta irakurketa programatu eta diseinatu beharko dugu.