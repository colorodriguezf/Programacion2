Programación 2
Tecnicatura Universitaria en Desarrollo de Aplicaciones Informáticas
Práctica Nº 8 – 2022
Para cada uno de los siguientes problemas Implementarlos en Java. Identifique los patrones
de diseño aplicados en la solución.
1. Fútbol 5:
    Un club de fútbol 5 necesita un sistema que le permita llevar control de sus socios y
    alquileres de canchas. Cada socio posee un nombre y apellido, una edad, si tiene paga la
    última cuota y una lista que contiene información de los alquileres de canchas que ha
    realizado. Cuando un socio alquila una cancha, se registra la fecha, el ID de la cancha que
    alquiló y cuánto pagó por el alquiler.
    Cuando el dueño del club arriba al predio, le pide a los que administran el sistema, diferentes
    listados, para comprobar cómo está funcionando el club:
    a) Todas los socios con cuota impaga, ordenados alfabéticamente (primero por
    apellido, y si hay varios con el mismo apellido por nombre)
    b) Todos los socios menores de edad, ordenados por edad
    c) Todos los socios que alquilaron alguna vez la cancha N°13, ordenados cantidad
    total de alquileres de esa cancha.
    d) Todos los socios que pagaron más de $500 por algún alquiler de cancha, listando
    primero los que tienen las cuotas pagas, ordenados alfabéticamente y luego los
    morosos, también ordenados alfabéticamente.
e) Cualquier combinación lógica de búsquedas.

2. Sistema de Archivos:
    Un Sistema de Archivos debe organizar y manipular: archivos, directorios, links y archivos
    comprimidos. Los archivos se definen por un nombre, una fecha de creación y un tamaño.
    Los directorios tienen un nombre, una fecha de creación y además contienen un conjunto de
    archivos y un conjunto de subdirectorios. El tamaño de un directorio está dado por el tamaño
    de sus sub-directorios, sus archivos, sus links y sus archivos comprimidos. Los links son
    vínculos a otro archivo o directorio y tienen un nombre, una fecha de creación y su tamaño en
    disco es siempre igual a 1Kb. Los archivos comprimidos son un tipo particular de archivo el
    cual contiene otros archivos y/o directorios en formato comprimido según una tasa de
    compresión dada (El tamaño de un archivo comprimido es el tamaño de todo lo contenido
    dividido el factor de compresión), tiene un nombre y una fecha de creación.
    El sistema debe permitir realizar búsquedas de cualquiera de sus elementos según diferentes
    criterios (simples y compuestos ), por ejemplo: 1
    ● Todos los elementos cuyo nombre contenga la palabra “parcial”.
    ● Todos los elementos que se hayan modificado luego del 15-10-2020.
    ● Todos los elementos que fueron creados antes del 15-03-2020 y cuyo nombre sea
    igual a “parcial”.
    ● Cualquier combinación lógica (and, or y not) de búsquedas simples.
    Aclaración sobre las búsquedas. Un archivo comprimido será incluido en el resultado de la
    búsqueda, si alguno de los elementos que contiene en su interior cumple con el criterio de la
    búsqueda (se agrega el archivo comprimido al resultado, pero no los elementos que contiene).
    Un link cumple con el criterio de búsqueda por sí mismo, sin tener en cuenta el elemento que
    apunta.
    A la hora de realizar una búsqueda, el usuario puede especificar también un criterio de orden
    en el que quiere que se retornen los elementos resultantes. Por ejemplo, ordenados
    ascendentemente por fecha de creación y luego por nombre, ordenados descendentemente por
    tamaño, luego por fecha de creación y finalmente por nombre descendente, entre otros
    posibles criterios de ordenamiento.

3. Navidad:
    En esta Navidad Papá Noel quiere informatizar su sistema de pedidos y distribución de
    regalos. Para ello instaló un buzón en cada pueblo o ciudad, para que los niños del mundo
    puedan depositar sus cartas. Cada carta posee un remitente y una lista de regalos solicitados
    (un regalo es simplemente un String).
    Cada niño deposita su carta en el buzón correspondiente a su barrio. Cada buzón tiene
    asociado un conjunto de “niños buenos” que pueden dejar su carta en el mismo, identificados
    únicamente por su DNI. Los niños que no se encuentran en el listado de niños buenos de un
    buzón, se los considera “niños malos”. Si un “niño malo” intenta depositar una carta en el
    buzón, la lista de regalos correspondiente se vacía y se reemplaza el regalo por un “Trozo de
    carbón”. Si un niño deposita más de una carta en el buzón, solo se considera la primera.
    Los buzones se encuentran distribuidos en diferentes barrios, que a su vez se agrupan por
    localidad, provincia o estado y país. Adicionalmente, puede haber buzones especiales que no
    pertenezcan a un barrio, sino a la localidad, provincia o país directamente (por ejemplo en la
    embajada de un país en otro).
    Cuando un niño deposita su carta en un buzón, se debe controlar que el mismo se encuentre
    en el listado de niños buenos asociado al buzón. Si se cumple esta condición, se guarda la
    carta para que luego sea recolectada por Barney y entregada a Papá Noel.
    1 ojo con eso que cambia de como se vio en la clase
    Nota: Todas las cartas recibidas se guardan en el buzón, aunque sean de “niños malos” (en
    este caso se debe realizar el reemplazo de regalos como se mencionó anteriormente).
    Implementar los siguientes servicios:
    1. Dado un buzón, provincia o país, conocer el porcentaje de cartas recibidas que piden
    un determinado regalo.
    2. Dado un buzón, provincia o país, conocer la cantidad de cartas recibidas que piden un
    determinado regalo.
    3. Dado un buzón, provincia o país, conocer la cantidad de niños malos que enviaron
    una carta.
    4. Dado un buzón, provincia o país, conocer la cantidad de total de cartas recibidas.
    Aclaración, los porcentajes se calculan como la cantidad de cartas que cumple la condición
    dividido el total de cartas recibidas en el buzón, provincia o país, multiplicado por 100.

4. Sistema Electoral:
    Un sistema de recuento automático de votos para una elección registra los votos recibidos por
    los diferentes candidatos. Los candidatos poseen un nombre, un partido político y una
    agrupación.
    Cada votante registra su voto en una mesa. Cada mesa tiene asociado un conjunto de personas
    que pueden votar en la misma (padrón), identificadas únicamente por su DNI. Las mesas se
    encuentran distribuidas en diferentes establecimientos educativos, que a su vez se agrupan
    por barrio y localidad. Adicionalmente, puede haber mesas especiales que no pertenezcan a
    un establecimiento educativo sino al barrio o localidad directamente.
    Cuando un votante se presenta a emitir su voto, se debe controlar que el mismo se encuentre
    en el padrón correspondiente. Si se cumple esta condición, se registra el voto de la persona,
    que puede contener una referencia a un candidato o ser un voto en blanco (sin referencia a
    ningún candidato). Adicionalmente el voto guarda la hora en que se emitió el mismo (el
    momento en el que se crea el voto).
    Nota: Todos los votos emitidos se guardan en la mesa, aunque sean en blanco (es decir,
    siempre existe el voto, es lo mismo que sucede con un sobre en una elección real)
    Programación 2
    Tecnicatura Universitaria en Desarrollo de Aplicaciones Informáticas
    Práctica Nº 8 – 2022
    Implementar los siguientes servicios:
    Dada una mesa, un establecimiento educativo, un barrio o una localidad, conocer el
    porcentaje de votos recibidos por un candidato particular.
    Dada una mesa, un establecimiento educativo, un barrio o una localidad, conocer el
    porcentaje de votos en blanco recibidos.
    Dada una mesa, un establecimiento educativo, un barrio o una localidad, conocer el
    porcentaje de votos que se emitieron entre las 10:00 y las 11:00. (La clase LocalDate
    implementa la interface Comparable)
    Dada una mesa, un establecimiento educativo, un barrio o una localidad, conocer la
    cantidad total de votos que se emitieron.
    Obtener un listado de todos los candidatos que se presentan a la elección, ordenado
    por partido político si son del mismo partido ordenarlos por agrupación; y si son de la
    misma agrupación ordenarlos por nombre.
    Aclaración, los porcentajes se calculan como la cantidad de votos que cumplen la condición
    dividido el total de votos emitidos en la mesa, establecimiento, barrio o localidad
    multiplicado por 100.

5 - Árbol binario de búsqueda:
    Un árbol binario es una estructura de datos formada por
    nodos que contienen un determinado valor. El primer
    elemento agregado a la estructura se conoce con el nombre
    de “raíz” y es el único punto de acceso a la misma. Cada
    nodo, puede tener un nodo “hijo” a su izquierda y un nodo
    hijo a su derecha cumpliendo con la restricción que los
    valores a su izquierda son valores menores que su propio
    valor, y los valores a su derecha son valores mayores (no se
    almacenan valores repetidos). Los nodos sin hijos se conocen como “hojas”. Normalmente,
    para facilitar el recorrido de la estructura, cada nodo tiene una referencia a su nodo “padre”.
    ● Implementar la funcionalidad para agregar un nuevo objeto a la estructura.
    Para poder trabajar con cualquier objeto es necesario que el mismo pueda ser
    comparable, es decir, implementar la interfaz Comparable de Java.
    ● Implementar un método que permita recorrer la estructura en orden, es decir,
    todos los elementos a la izquierda, luego la raíz y después todos los elementos
    a la derecha. Al recorrer los elementos es necesario que se defina una acción
    la cual se va a ejecutar. Para poder trabajar de forma transparente y que se
    Programación 2
    Tecnicatura Universitaria en Desarrollo de Aplicaciones Informáticas
    Práctica Nº 8 – 2022
    pueda extender la funcionalidad definir una interfaz AccionEjecutable. La
    misma posee un método public void ejecutarNodo(Object nodo). Una posible
    implementación sería:
    public class ImprimirEnPantalla implements AccionEjecutable {
    public void ejecutarNodo(Object nodo) {
    System.out.println(nodo.toString());
    }
    }
    ● Crear una acción que permita incorporar los elementos de forma ordenada
    ascendentemente a un Vector.
    ● Crear una acción que permita incorporar los elementos de forma ordenada
    descendentemente a un Vector.
    ● Crear una acción que cuente la cantidad de elementos visitados.