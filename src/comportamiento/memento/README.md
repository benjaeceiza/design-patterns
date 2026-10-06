# Patrón de Diseño: Memento

**Categoría:** Comportamiento

## 1. Problema que resuelve
En muchas aplicaciones es necesario guardar el estado interno de un objeto para poder deshacer acciones (como el clásico "Ctrl+Z") o restaurar un punto de control previo. El problema surge al intentar guardar este estado desde fuera del objeto: para hacerlo, normalmente tendríamos que romper el principio de encapsulamiento, haciendo públicos atributos que deberían ser estrictamente privados.

## 2. Solución
El patrón Memento soluciona esto delegando la creación de las copias (los "estados") al propio objeto que tiene la información original. 
Este objeto (el *Originator*) crea un objeto especial llamado *Memento* que funciona como una "caja fuerte" o fotografía. Contiene el estado, pero ningún otro objeto externo puede ver o modificar su contenido; el Memento solo puede ser leído y restaurado por el objeto que lo creó.

## 3. Consecuencias
* **Positivas:** 
  * Se mantiene intacto el principio de encapsulamiento. 
  * Se simplifica el código del objeto principal, ya que delega la gestión del historial a otro componente (el *Caretaker*).
* **Negativas:** 
  * Puede consumir mucha memoria RAM si se guardan estados muy pesados o si se guarda el estado con demasiada frecuencia, dado que cada Memento es una copia de los datos en ese instante.