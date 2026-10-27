# Template Method # Patrón Template Method - Proceso de Check-in

## Problema
En el sistema de la aerolínea, el proceso de Check-in tiene una serie de pasos secuenciales estrictos (verificar documentos, pesar equipaje, emitir boarding pass). Sin embargo, ciertos pasos varían dependiendo de si el vuelo es Nacional (requiere DNI) o Internacional (requiere Pasaporte y Visa). Si repetimos todo el código del proceso para cada tipo de vuelo, generamos duplicidad y es difícil mantener el mismo orden estricto en todos lados.

## Solución
Se aplicó el patrón **Template Method**. Se creó una clase abstracta (`ProcesoCheckIn`) que define un método plantilla `realizarCheckIn()` declarado como `final`. Este método dicta el esqueleto y el orden de los pasos. 
Los pasos comunes se implementaron ahí mismo, mientras que el paso que varía (`verificarDocumentos()`) se declaró como abstracto, obligando a las subclases (`CheckInNacional` y `CheckInInternacional`) a proporcionar su propia implementación.

## Consecuencias
- **Ventajas:** Evita la duplicación de código en pasos que son idénticos. Fuerza a que el algoritmo siga siempre la misma estructura, dando control total a la clase base (Hollywood Principle: "No nos llames, nosotros te llamaremos").
- **Desventajas:** Las subclases están atadas rígidamente al esqueleto definido en la clase base. Si el algoritmo general necesita cambiar de estructura dinámicamente, este patrón resulta inflexible.