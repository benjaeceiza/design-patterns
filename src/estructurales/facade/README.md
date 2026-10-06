# Facade (Fachada)

## El problema
Un sistema puede tener muchas clases y pasos complejos para realizar una acción. Si el cliente tiene que comunicarse con cada clase por separado, el proceso se vuelve muy enredado.

## La solución
Creas una clase "Fachada" que funciona como un acceso simplificado. El cliente solo llama a un método sencillo (por ejemplo, `verPelicula()`), y por detrás la Fachada se encarga de coordinar todas las herramientas necesarias.

## Ventajas y desventajas
* **Ventajas:** 
  * Es fácil de usar y evita repetir código.
  * No necesitas conocer la complejidad interna de todo el sistema.
* **Desventajas:** 
  * Si la fachada intenta abarcar demasiadas funciones, puede convertirse en una clase muy grande y difícil de manejar.