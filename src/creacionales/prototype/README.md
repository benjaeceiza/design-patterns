# Prototype — Programación de vuelos recurrentes

**Problema:** la empresa repite el mismo vuelo todas las semanas (misma ruta, misma configuración, misma tarifa base). Crear cada vuelo desde cero es repetitivo y propenso a errores.

**Solución:** el `Vuelo` sabe `clonar()` y se copia a sí mismo; después se cambia solo lo que varía (fecha, promoción).

- `Prototipo<T>`: interfaz con `clonar()`.
- `Vuelo` / `Tarifa`: prototipos concretos (copia profunda).
- `CatalogoVuelos`: plantillas por ruta que entregan copias.
- `MainPrototype`: demo.
