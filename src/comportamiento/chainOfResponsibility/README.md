# Chain of Responsibility (Cadena de Responsabilidad)

## El problema
A veces tienes una tarea que puede ser resuelta por distintas clases. Si usas muchos condicionales (`if` y `else`) para averiguar cuál debe responder, el código se vuelve difícil de leer y mantener.

## La solución
Pasas la solicitud de un objeto a otro a lo largo de una cadena. Cada objeto revisa si puede resolverla: si puede, la procesa; si no, se la pasa al siguiente de la lista.

## Ventajas y desventajas
* **Ventajas:** 
  * El código queda más ordenado porque cada clase tiene una sola responsabilidad.
  * Es muy fácil agregar, quitar o cambiar el orden de los pasos en la cadena.
* **Desventajas:** 
  * Si ningún objeto de la cadena puede resolver la petición, esta puede quedar sin respuesta.