# Proxy

## Problema

A veces tenemos un objeto que es costoso de crear o de usar (por ejemplo, porque carga datos pesados desde el disco o la red), que necesita proteger su acceso, o que está en otro lugar (un servidor remoto). Si el cliente lo crea y lo usa directamente, se instancia aunque quizás nunca se necesite, y el cliente queda mezclado con tareas que no le corresponden: controlar permisos, guardar resultados en caché, registrar accesos, etc. No siempre podemos o conviene modificar la clase original para agregar eso.

## Solución

Crear una clase intermedia, el **Proxy**, que implementa la misma interfaz que el objeto real y actúa como su representante. El cliente le habla al proxy como si fuera el objeto real, y el proxy decide cuándo y cómo delegarle la llamada: puede crear el objeto real recién cuando hace falta, verificar permisos, guardar resultados o registrar lo que pasa, y recién después pasarle la petición.

### Participantes

- **Subject:** interfaz común que comparten el objeto real y el proxy.
- **RealSubject:** el objeto real que hace el trabajo verdadero.
- **Proxy:** tiene la misma interfaz que el RealSubject, guarda una referencia a él y controla el acceso.
- **Client:** usa los objetos solo a través del Subject, sin saber si habla con el proxy o con el real.


## Consecuencias

**Ventajas**
- Controla el acceso al objeto real sin que el cliente lo note, porque comparten interfaz.
- Permite crear objetos costosos solo cuando se necesitan (inicialización perezosa).
- Se pueden agregar permisos, caché o registro sin modificar la clase real (principio abierto/cerrado).
- El objeto real se concentra en su trabajo y el proxy en el control (responsabilidad única).

**Desventajas**
- Aumenta la cantidad de clases y la complejidad del código.
- Agrega una capa extra de indirección, por lo que la respuesta puede demorar un poco más.
- Si el proxy hace mucho trabajo, puede volverse difícil de mantener.