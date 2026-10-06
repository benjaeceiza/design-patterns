# Patrón de Diseño: Flyweight (Peso Mosca)

**Categoría:** Estructural

## 1. Problema que resuelve
Nuestra aplicación necesita crear cantidades masivas (millones) de objetos que son idénticos o muy similares (por ejemplo, renderizar todos los árboles de un bosque en un videojuego). Si cada objeto guarda en la memoria RAM su propia copia de toda su información pesada (texturas, modelos 3D, colores), la computadora se quedará sin memoria rápidamente.

## 2. Solución
El patrón sugiere dividir las propiedades del objeto en dos partes:
1. **Estado Intrínseco (Compartido):** La información pesada que es idéntica para muchos objetos (ej. la textura y color de un Pino). Se guarda en un único objeto reutilizable (el *Flyweight*).
2. **Estado Extrínseco (Único/Contexto):** La información que varía para cada instancia (ej. las coordenadas X e Y exactas de cada árbol). Este estado se almacena en el cliente y se pasa por parámetro al Flyweight cuando se necesita operar o dibujar.

Una "Fábrica" (*Factory*) se encarga de instanciar y guardar en caché los Flyweights, asegurando que solo exista uno de cada tipo.

## 3. Consecuencias
* **Positivas:** 
  * Se ahorra una cantidad gigantesca de memoria RAM al reutilizar objetos pesados.
* **Negativas:** 
  * El código se vuelve un poco más complejo por la separación de estados. 
  * Podría aumentar ligeramente el uso del procesador (CPU) si el estado extrínseco debe ser recalculado constantemente.