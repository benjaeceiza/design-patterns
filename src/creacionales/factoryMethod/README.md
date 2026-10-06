# Factory Method (Método Fábrica)

## El problema
Si usas `new` para crear objetos directamente en varias partes del código, quedas atado a esa clase específica. Si en el futuro necesitas agregar un nuevo tipo de objeto, tendrás que modificar el código en muchos lugares.

## La solución
En lugar de crear los objetos a mano, le pides a una "fábrica" que los cree. La fábrica se encarga de decidir qué tipo de objeto instanciar según lo que necesites.

## Ventajas y desventajas
* **Ventajas:** 
  * Permite agregar nuevos tipos de objetos sin modificar ni romper el código existente.
  * Centraliza la creación de objetos en un solo lugar.
* **Desventajas:** 
  * Puede aumentar la cantidad de clases y archivos en el proyecto para tareas simples.