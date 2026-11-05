# Prototype — Programación de vuelos recurrentes

**Problema:** la empresa repite el mismo vuelo todas las semanas (misma ruta, misma configuración, misma tarifa base). Crear cada vuelo desde cero es repetitivo y propenso a errores.

**Solución:** el `Vuelo` sabe `clonar()` y se copia a sí mismo; después se cambia solo lo que varía (fecha, promoción).

- `Prototipo<T>`: interfaz con `clonar()`.
- `Vuelo` / `Tarifa`: prototipos concretos (copia profunda).
- `CatalogoVuelos`: plantillas por ruta que entregan copias.
- `MainPrototype`: demo.


## Ventajas y desventajas
* **Ventajas:**
  * El cliente trata igual a un pasaje, un extra o un paquete completo, sin `if (esPaquete)`.
  * Permite armar estructuras de cualquier profundidad (un paquete dentro de otro, como una reserva familiar con un paquete por pasajero).
  * Agregar un tipo de ítem nuevo no obliga a modificar el código existente (principio abierto/cerrado).
  * Cálculos como `getPrecio()` se resuelven de forma recursiva, delegando en los hijos.
* **Desventajas:**
  * Es difícil restringir qué se puede agregar a un paquete: como todo es un `ItemReserva`, no se puede impedir (por ejemplo) un paquete dentro de otro si no se quiere.
  * Si se pone `agregar`/`eliminar` en la interfaz común, las hojas heredan métodos que no tienen sentido; si solo está en `PaqueteViaje`, el cliente debe distinguir tipos.
  * El diseño puede quedar demasiado general y complicar la lectura cuando la estructura es muy simple.