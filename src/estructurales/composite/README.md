# Composite — Reservas y paquetes de viaje

**Problema:** una reserva puede ser un pasaje suelto, un pasaje con extras, o un grupo familiar con varios pasajeros (cada uno con sus propios extras). Calcular el total sin Composite obliga a llenar el código de `if (esPaquete) ... else ...`.

**Solución:** pasajes, extras y paquetes implementan la misma interfaz, y el paquete delega en sus hijos.

- `ItemReserva`: componente común.
- `Pasaje`, `ServicioExtra`: hojas.
- `PaqueteViaje`: compuesto (guarda una lista de `ItemReserva`).
- `MainComposite`: demo.
