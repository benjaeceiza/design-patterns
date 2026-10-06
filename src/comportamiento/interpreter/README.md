# Patrón de Diseño: Interpreter (Intérprete)

**Categoría:** Comportamiento

## 1. Problema que resuelve
A veces necesitamos que nuestro programa entienda un "lenguaje" particular, procese reglas gramaticales, resuelva fórmulas matemáticas o comandos de búsqueda. Si intentamos resolver la lógica de ese lenguaje utilizando demasiadas sentencias `if/else` anidadas o expresiones regulares gigantes, el código se vuelve frágil, inmanejable y muy difícil de mantener o extender en el futuro.

## 2. Solución
El patrón Interpreter sugiere convertir cada regla gramatical o instrucción de ese lenguaje en una **Clase**. 
Luego, esas clases se unen formando un "árbol de sintaxis". Cuando se necesita evaluar una frase, se le pide al "tronco" (la raíz del árbol) que se interprete, y este va propagando el mensaje por sus ramas hasta llegar a las hojas (valores finales), resolviendo la frase completa de forma recursiva.

## 3. Consecuencias
* **Positivas:** 
  * Es muy fácil cambiar o extender la gramática: para añadir una regla nueva, simplemente se crea una clase nueva en lugar de modificar un bloque de código gigante.
* **Negativas:** 
  * Si el lenguaje a interpretar es complejo, terminarás creando cientos de clases (una por cada regla). Es un patrón útil solamente para lenguajes o gramáticas sencillas y específicas.