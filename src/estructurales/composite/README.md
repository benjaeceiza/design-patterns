# Composite — Reservas y paquetes de viaje

**Problema:** una reserva puede ser un pasaje suelto, un pasaje con extras, o un grupo familiar con varios pasajeros (cada uno con sus propios extras). Calcular el total sin Composite obliga a llenar el código de `if (esPaquete) ... else ...`.

**Solución:** pasajes, extras y paquetes implementan la misma interfaz, y el paquete delega en sus hijos.

- `ItemReserva`: componente común.
- `Pasaje`, `ServicioExtra`: hojas.
- `PaqueteViaje`: compuesto (guarda una lista de `ItemReserva`).
- `MainComposite`: demo.

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