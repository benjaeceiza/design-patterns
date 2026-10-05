# Patrón Observer

Define una dependencia uno-a-muchos: cuando el sujeto cambia de estado,
notifica automáticamente a todos sus observadores.

## Diagrama UML

![UML del patrón Observer](observer-uml.png)

## Clases

- Observador: interfaz con el método actualizar.
- EstacionMeteorologica: sujeto, guarda el estado y la lista de observadores.
- PantallaActual: observador que muestra los datos.
- AlertaCalor: observador que avisa si la temperatura supera un umbral.