# ParkSmart — estacionamiento de aeropuerto

## Contexto
ParkSmart gestiona el estacionamiento de un aeropuerto. Cada vez que un vehículo ingresa, el sistema genera un ticket con los datos iniciales del registro.

## Problema
Escribí un programa (una sola clase con `public static void main`) que registre los datos iniciales de un ticket de estacionamiento y los muestre en pantalla, aplicando las conversiones de tipo que exige el resto del sistema.

## Datos concretos del ticket
- Categoría del vehículo: `'C'` (carro).
- Tiempo de permanencia registrado por el sensor de entrada: `4.85` horas (dato de alta precisión).
- Número de espacio asignado: `300`.
- Estado del sistema de pago automático: `true`.
- Turno del operador que registró el ingreso: `'T'` (tarde).

## Requerimientos
1. Declarar e inicializar la categoría del vehículo, el tiempo de permanencia, el número de espacio y el estado del pago automático, cada uno con el tipo primitivo que corresponde exactamente a la naturaleza del dato.
2. A partir del tiempo de permanencia, obtener una segunda variable con ese tiempo truncado a un valor entero simple — así lo necesita el reporte de facturación, que solo cuenta horas completas.
3. El sistema legado de impresión de tickets de ParkSmart solo admite números de espacio dentro del rango de un `byte`. A partir del número de espacio original, obtené la variable que efectivamente quedaría impresa en ese sistema legado, usando cast explícito.
4. Creá un bloque de código independiente (`{ }`, sin condicionales ni bucles) que represente el "reporte de cierre de turno". Dentro de ese bloque, declará una variable adicional con el turno del operador. Esa variable no debe existir fuera del bloque.
5. Imprimí con `System.out.println` (una sola variable por línea, sin concatenar nada), en este orden: categoría del vehículo, tiempo original de permanencia, tiempo truncado, número de espacio original, número de espacio convertido a `byte`, estado del pago automático, y — dentro del mismo bloque del punto 4 — el turno del operador.

## Condiciones/Restricciones
- Todo el código va en una única clase con `public static void main`, con nombre de clase acorde a la convención de nomenclatura.
- No se permite usar `if`, bucles, arrays, `String`, ni operadores aritméticos (`+`, `-`, `*`, `/`, `%`).
- Cada variable debe tener el tipo mínimo correcto según lo enseñado en Tema 1 — no vale sobredimensionar un tipo para evitar pensar en el cast correspondiente.
- El bloque del punto 4 debe ser un bloque suelto, sin asociarlo a ninguna estructura de control.

## Criterio de éxito
- Elegiste cada tipo primitivo por la razón correcta, no por costumbre.
- Usaste cast implícito donde Java lo hace solo, y cast explícito únicamente donde el lenguaje lo exige.
- El scope del bloque está realmente delimitado.
- Podés explicar, sin huecos, por qué el número de espacio termina almacenado con un valor distinto al original una vez convertido a `byte`.