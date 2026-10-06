# Object Pool (Piscina de Objetos)

## El problema
Crear y destruir objetos muy pesados todo el tiempo (como conexiones a bases de datos) consume muchos recursos y hace que el programa funcione lento.

## La solución
Mantienes un grupo de objetos ya creados y listos para usar. Cuando necesitas uno, lo pides prestado, lo usas y luego **lo devuelves** para que otro proceso lo pueda reutilizar en lugar de borrarlo.

## Ventajas y desventajas
* **Ventajas:** 
  * Mejora el rendimiento del programa al reutilizar recursos.
  * Evita sobrecargar el sistema estableciendo un límite máximo de objetos creados.
* **Desventajas:** 
  * Hay que asegurarse de limpiar o reiniciar el estado del objeto antes de devolverlo para no dejar datos viejos.