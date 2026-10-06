# Strategy

## Problema

A veces una clase puede realizar una misma tarea de varias maneras (por ejemplo, calcular un descuento, ordenar datos o calcular una ruta). Si todas las variantes se programan dentro de la misma clase con `if` o `switch`, el código se vuelve largo y difícil de mantener, y cada vez que aparece una variante nueva hay que modificar la clase existente. Además, la clase termina conociendo detalles de todos los algoritmos.

## Solución

Definir una familia de algoritmos, ponerlos cada uno en su propia clase y hacerlos intercambiables mediante una interfaz común. La clase que los usa, el **Context**, guarda una referencia a la estrategia y le delega el trabajo. Para cambiar el comportamiento alcanza con darle otra estrategia, incluso en tiempo de ejecución, sin tocar el Context.

### Participantes

- **Strategy:** interfaz común a todos los algoritmos.
- **ConcreteStrategy:** cada implementación concreta del algoritmo.
- **Context:** usa una estrategia a través de la interfaz y le delega el trabajo.
- **Client:** elige qué estrategia usar y se la pasa al Context.

## Consecuencias

**Ventajas**
- Elimina los condicionales largos (`if`/`switch`) para elegir el algoritmo.
- Se puede cambiar el comportamiento en tiempo de ejecución.
- Se agregan estrategias nuevas sin modificar el Context (principio abierto/cerrado).
- Cada algoritmo queda aislado en su clase y se puede probar por separado.

**Desventajas**
- Aumenta la cantidad de clases.
- El cliente tiene que conocer las estrategias para poder elegir la adecuada.
- Si hay pocas variantes que casi nunca cambian, puede ser demasiado para el problema.