# TermoLogic — fabricante de sensores industriales de temperatura

## Contexto
TermoLogic instala sensores de temperatura en líneas de producción de fábricas. Cada vez que se instala un sensor nuevo, un técnico registra sus datos iniciales en el sistema de planta. Te piden escribir el programa que captura y muestra esos datos, respetando exactamente los tipos de dato que corresponden a cada magnitud y aplicando las conversiones que exige el resto del sistema.

## Problema
Escribí un programa (una sola clase con `public static void main`) que registre los datos iniciales de un sensor recién instalado y los muestre en pantalla, aplicando las conversiones de tipo que se detallan en los requerimientos.

## Datos concretos del sensor
* **Identificador del sensor:** `'A'` (letra de la línea de producción).
* **Lectura de temperatura capturada:** `23.78` grados Celsius (dato de alta precisión).
* **Código de lote de fabricación:** `200`.
* **Estado de calibración de fábrica:** `true`.
* **Turno en que se instaló:** `'M'` (mañana).

## Requerimientos
1. Declarar e inicializar el identificador, la lectura de temperatura, el código de lote y el estado de calibración, cada uno con el tipo primitivo que corresponde exactamente a la naturaleza del dato.
2. A partir de la lectura de temperatura, obtener una segunda variable con esa misma lectura truncada a un valor entero simple — así la necesita el panel de resumen, que solo muestra enteros.
3. El sistema legado de inventario de TermoLogic solo admite códigos de lote dentro del rango de un byte. A partir del código de lote original, obtené la variable que efectivamente quedaría almacenada en ese sistema legado, usando cast explícito.
4. Creá un bloque de código independiente (`{ }`, sin condicionales ni bucles) que represente el "reporte interno de planta". Dentro de ese bloque, declará una variable adicional con el turno de instalación. Esa variable no debe existir fuera del bloque.
5. Imprimí con `System.out.println` (una sola variable por línea, sin concatenar nada), en este orden: identificador, lectura original de temperatura, lectura truncada a entero, código de lote original, código de lote convertido a byte, estado de calibración, y — dentro del mismo bloque del punto 4 — el turno de instalación.

## Condiciones/Restricciones
* Todo el código va en una única clase con `public static void main`.
* No se permite usar `if`, bucles, arrays, `String`, ni operadores aritméticos (`+`, `-`, `*`, `/`, `%`) — ninguno de esos temas fue visto todavía.
* Cada variable debe tener el tipo mínimo correcto según lo enseñado hoy — no vale sobredimensionar un tipo (por ejemplo, usar `double` para el turno) para evitar pensar en el cast correspondiente.
* El bloque del punto 4 debe ser un bloque suelto, sin asociarlo a ninguna estructura de control.

## Criterio de éxito
No alcanza con que el programa compile y corra. Tiene que quedar claro que:
* Elegiste cada tipo primitivo por la razón correcta, no por costumbre.
* Usaste cast implícito donde Java lo hace solo, y cast explícito únicamente donde el lenguaje lo exige — sin casts de más "por las dudas".
* El scope del bloque está realmente delimitado: si la variable del turno se intentara usar fuera del bloque, el programa no debería compilar.
* Podés explicar, cuando lo pregunte en la Pasada 2, por qué el código de lote termina almacenado con un valor distinto al original una vez convertido a byte.