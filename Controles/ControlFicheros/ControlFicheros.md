Crea una aplicacion con las siguientes caracteristicas:

- Una clase Persona con los atributos: nif, nombre y apellidos. Esos atributos deben ser accesibles para las clases hijas y no accesibles para el resto de clases. El acceso de esos atributos se hacen mediante getters y setters adecuados.

- Una clase Cliente que hereda de Persona con los atributos id, nif, nombre, apellidos e email. Dichos atributos no deben ser accesibles fuera de la clase. El accesos de esos atributos se hacen mediante getters y setters adecuados.

- Sobreescribe el metodo toString para mostrar los atributos de forma tabulada.

- Crea una clase PersisstenciaCliente, con un metodo write, que recibe un arrayList de clientes de tal forma que escribe en un fichero (clientes.dat) todos los clientes recibidos en el arrayList. Cada cliente se escribe en una linea con los atributos separados por comas
Ejemplo: 1, 12345678a, Antonio, puf puf, email. Crea un metodo read que recibe el nombre del fichero a leer y devuelve un arrayList con los clientes que ha conseguido leer.