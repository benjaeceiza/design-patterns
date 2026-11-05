# Abstract Factory — Experiencia según la clase de cabina

**Problema:** según la clase que compra el pasajero (económica o business), el asiento y el servicio a bordo tienen que ser de la misma familia. Sin el patrón, el código se llena de `if (clase == ...)` y se puede mezclar un asiento económico con un servicio business por error.

**Solución:** una fábrica abstracta con un método por producto y una fábrica concreta por cada clase.

- `Asiento`, `ServicioAbordo`: productos abstractos.
- `AsientoEconomico/Business`, `ServicioAbordoEconomico/Business`: productos concretos.
- `FabricaClase`: fábrica abstracta.
- `FabricaEconomica`, `FabricaBusiness`: fábricas concretas.
- `ExperienciaDeVuelo`: cliente.
- `MainAbstractFactory`: demo.


## Ventajas y desventajas
* **Ventajas:**
  * Garantiza que los productos de una familia sean compatibles entre sí: no se puede mezclar un asiento económico con un servicio business.
  * El cliente (`ExperienciaDeVuelo`) depende solo de interfaces, no de clases concretas.
  * Cambiar de familia es cambiar de fábrica: se agrega una clase nueva (por ejemplo, primera clase) sin tocar el código existente (principio abierto/cerrado).
  * Centraliza la creación de los productos en un solo lugar.
* **Desventajas:**
  * Aumenta mucho la cantidad de clases e interfaces: dos productos y dos clases ya implican 7 clases más la fábrica abstracta.
  * Agregar un producto nuevo a la familia (por ejemplo, `Comida`) obliga a modificar `FabricaClase` y todas las fábricas concretas.
  * Puede ser excesivo si solo hay una familia de productos o si los productos no se relacionan entre sí.