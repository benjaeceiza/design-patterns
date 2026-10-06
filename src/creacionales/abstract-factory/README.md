# Abstract Factory — Experiencia según la clase de cabina

**Problema:** según la clase que compra el pasajero (económica o business), el asiento y el servicio a bordo tienen que ser de la misma familia. Sin el patrón, el código se llena de `if (clase == ...)` y se puede mezclar un asiento económico con un servicio business por error.

**Solución:** una fábrica abstracta con un método por producto y una fábrica concreta por cada clase.

- `Asiento`, `ServicioAbordo`: productos abstractos.
- `AsientoEconomico/Business`, `ServicioAbordoEconomico/Business`: productos concretos.
- `FabricaClase`: fábrica abstracta.
- `FabricaEconomica`, `FabricaBusiness`: fábricas concretas.
- `ExperienciaDeVuelo`: cliente.
- `MainAbstractFactory`: demo.
