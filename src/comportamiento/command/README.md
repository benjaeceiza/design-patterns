# Command# Patrón Command - Sistema de Operadores de Aerolínea

## Problema
En el sistema de la aerolínea, los operadores de atención al cliente realizan acciones críticas (como confirmar o cancelar vuelos). Si acoplamos la interfaz del operador directamente a la lógica del sistema, perdemos flexibilidad y, sobre todo, es muy difícil implementar funcionalidades como el historial de acciones o el "Deshacer" (Undo) si el operador comete un error.

## Solución
Se aplicó el patrón **Command** para encapsular las peticiones de los operadores en objetos independientes (`ComandoConfirmar`). 
- **Command (Comando):** Interfaz que declara `ejecutar()` y `deshacer()`.
- **Receiver (SistemaReservas):** Quien realmente sabe cómo confirmar o cancelar en la base de datos.
- **Invoker (Operador):** Quien pide que se ejecute la acción y guarda un historial (Stack) de los comandos ejecutados.

## Consecuencias
- **Ventajas:** Desacopla al objeto que invoca la operación del que sabe cómo realizarla. Permite crear un sistema de "Deshacer/Rehacer" muy fácilmente apilando los comandos.
- **Desventajas:** El código puede volverse más extenso ya que hay que crear una clase nueva por cada acción diferente que se quiera realizar en el sistema.