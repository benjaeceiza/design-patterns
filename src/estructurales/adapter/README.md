## Adapter

## Problema

A veces necesitamos usar una clase que ya existe (una librería externa, código legado o un servicio de terceros) pero su interfaz no coincide con la que espera nuestro sistema. No podemos o no conviene modificarla, y si el cliente la usa directamente, queda acoplado a ella: cualquier cambio en esa clase obliga a modificar el cliente.

## Solución

Crear una clase intermedia, el **Adapter**, que implementa la interfaz que el cliente espera y adentro usa la clase incompatible. El cliente le pide cosas al adapter como si fuera cualquier otro objeto de su interfaz, y el adapter traduce esas llamadas a las de la clase existente, convirtiendo datos o formatos si hace falta.

### Participantes

- **Target:** interfaz que el cliente espera usar.
- **Adaptee:** clase existente con una interfaz incompatible.
- **Adapter:** implementa el Target y traduce las llamadas al Adaptee.
- **Client:** usa los objetos solo a través del Target.

## Consecuencias

**Ventajas**
- Desacopla al cliente de la clase incompatible.
- Permite reutilizar código existente sin modificarlo (principio abierto/cerrado).
- Concentra la lógica de conversión en un solo lugar (responsabilidad única).
- Se pueden agregar nuevos adapters sin tocar el cliente.

**Desventajas**
- Aumenta la cantidad de clases e interfaces, y con eso la complejidad.
- Si las interfaces son muy distintas, el adapter puede volverse grande.
- Agrega una capa extra de indirección en cada llamada.