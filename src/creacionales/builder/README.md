# Builder

### Problema
Para el sistema de nuestra aerolínea, nos dimos cuenta de que armar el objeto ReservaDeVuelo se estaba volviendo un dolor de cabeza. Una reserva no tiene solo origen y destino, sino un montón de cosas opcionales: el tipo de asiento (Turista o Business), si el pasajero lleva equipaje extra, si pidió un menú especial, etc.

Si queríamos resolver esto usando constructores tradicionales, se nos armaba el famoso antipatrón del "constructor telescópico" (un constructor gigante donde a cada rato hay que pasarle null o false a lo que no se usa). Esto dejaba un código súper difícil de leer, desprolijo y donde es muy fácil equivocarse al pasar los parámetros.

### Solución
Para resolverlo, implementamos el patrón Builder. Lo que hicimos fue sacar toda esa lógica pesada de creación fuera del objeto principal y pasarla a una clase dedicada llamada ReservaBuilder. Esto nos deja ir construyendo la reserva paso a paso, seteando solo lo que el pasajero realmente necesita.

Además, sumamos una clase AgenciaDeVuelos que actúa como el Director del patrón. Esta clase ya conoce las "recetas" para armar los combos típicos de la aerolínea (como un Paquete Económico o uno Premium), lo que nos automatiza el uso del builder sin tener que configurar todo a mano cada vez.

### Consecuencias
* **Ventajas:** El código de creación queda mucho más limpio y fácil de leer. Nos sacamos de encima el constructor gigante y ahora podemos crear distintas combinaciones de reservas reutilizando el mismo proceso. Además, la lógica de cómo se crea el objeto queda totalmente separada de la lógica de negocio.

* **Desventajas:** La contra principal es que tuvimos que agregar más clases al proyecto (la interfaz Builder, el builder concreto y el Director). Esto le suma un poco más de complejidad a la estructura general del código, pero se justifica por la flexibilidad que ganamos.