Programación 2
Tecnicatura Universitaria en Desarrollo de Aplicaciones Informáticas
Práctica Nº 7a – 2022
Para cada uno de los siguientes problemas Implementarlos en Java.
1. Agroquímicos:
    Se debe diseñar e implementar un sistema para una empresa agrícola que se dedica a la
    fabricación y venta de productos químicos. Un producto químico tiene asociado un nombre,
    un conjunto cultivos donde se desaconseja su uso (por ejemplo girasol, lino, maíz), y un
    conjunto de estados patológicos que pueden observarse sobre los cultivos, y que es capaz de
    tratar (por ejemplo hojas amarillas, caída prematura de frutos, hojas mordidas, entre otros).
    El sistema está pensado para ayudar a las agrícolas a decidir qué agroquímico se puede
    utilizar para tratar ciertas enfermedades de los cultivos. Una enfermedad tiene un nombre
    asociado y un conjunto de estados patológicos que deben ser tratados. Por ejemplo:
    Cochinilla (estados patológicos: deshidratación, hojas amarillas). Aclaración: los estado
    patológicos de una enfermedad se corresponden con los estados patológicos que los
    productos son capaces de tratar.
    Un cultivo, tiene un nombre y una colección de enfermedades frecuentes que lo pueden
    afectar. Asimismo dado un producto químico, los cultivos son capaces de decir si en algún
    momento puede serle de utilidad o no, es decir si el agroquímico puede tratar una de sus
    enfermedades frecuentes y no se desaconseja su uso en el cultivo. Se considera que el
    agroquímico trata una enfermedad si todos los estados patológicos de la enfermedad están
    contenidos por las acciones del producto químico.
    Se debe proveer los siguientes servicios:
    ● Proveer un listado de agroquímicos que puedan tratar una enfermedad determinada.
    ● Dado un cultivo y una enfermedad devolver el listado de agroquímicos con los
    pueden tratar. Tener en cuenta que ciertos agroquímicos no pueden aplicarse sobre
    determinados cultivos.
2. Búsqueda de documentos:
    Un historiador desea digitalizar sus documentos y organizarlos de acuerdo a palabras clave.
    Un documento tiene un título, una lista de autores, un contenido textual y una lista de
    palabras clave. El historiador necesita poder encontrar fácilmente documentos en su
    colección de acuerdo a diferentes criterios, por ejemplo:
    a) Todos los documentos cuyo título sea exactamente igual a un título dado.
    b) Todos los documentos cuyo título contenga una palabra o frase dada.
    c) Todos los documentos que contengan una palabra clave dada.
    d) Todos los documentos que no contengan ninguna palabra clave.
    e) Todos los documentos de un autor determinado.
    f) Todos los documentos cuyo contenido tenga una palabra o frase dada.
    g) Todos los documentos cuyo contenido tenga al menos 20 palabras.
    h) Cualquier combinación lógica de las formas anteriores.

3 - Vivero:
    Un vivero necesita un sistema que le permita cargar fichas de las diferentes plantas que
    vende. Cada planta posee un nombre científico, una lista de nombres vulgares, una
    clasificación superior, una familia y una clase. Las plantas pueden prosperar mejor en interior
    o en exterior, tienen un requerimiento de sol que se indica con un número entero del 1 al 10
    (1 para sombra, hasta 10 para sol pleno) y un requerimiento de agua que se indica de la
    misma manera (1 para riesgo escaso y 10 para riego abundante).
    Por ejemplo:
    Nombre Científico: Epipremnum aureum
    Nombres vulgares: potus, pothos o potos
    Clasificación superior: Epipremnum
    Familia: Araceae
    Clase: Monocotyledoneae
    Planta de interior
    Riego: 3
    Sol: 4
    El sistema debe ser útil para los administradores del vivero para, por ejemplo, cuando llega
    un cliente poder ofrecerle las plantas que cumplen con sus requerimientos:
    a) Todas las plantas cuyo nombre científico incluya la palabra “auereum”
    b) Todas las plantas a las que se conozca vulgarmente como “lengua de suegra”
    c) Todas las plantas cuya clasificación sea “Crassula”
    d) Todas las plantas que requieran un nivel de sol superior a 5 y riego inferior a 3
    e) Todas las plantas que requieran un nivel de sol inferior a 4 y riego superior a 4
    f) Todas las plantas de interior que necesiten poco riego (inferior a 3)
    g) Cualquier combinación lógica de las formas anteriores

4 - Candy Crush:
    Se desea implementar el control de tableros de un juego de Golosinas (similar al Candy
    Crush). Cada ficha del tablero posee una fortaleza (golpes necesarios para destruirla), ocupa
    un espacio del tablero (medido en cantidad de casilleros), y tiene un poder de destrucción.
    Por ejemplo el “chocolate” tiene una fortaleza de 1, ocupa 1 casillero del tablero y tiene
    poder de destrucción 0; la “piedra” tiene fortaleza 6, ocupa 1 casillero de tablero y tiene
    poder de destrucción 0; el “caramelo a rayas” ocupa 1 casillero del tablero, tiene fortaleza 1,
    y un poder de destrucción de 10; la “torta” ocupa 4 casilleros, tiene fortaleza 8 y poder de
    destrucción 4, y así con cada una de las distintas fichas. También existen fichas especiales
    cuyo poder de destrucción se calcula como la fortaleza de la ficha, dividido el espacio que
    ocupan.
    Un tablero posee un puntaje mínimo que es necesario alcanzar para pasar al siguiente
    nivel, una lista de fichas, la dificultad del mismo (se calcula como la sumatoria de todas las
    fortalezas de las fichas, dividido la sumatoria del poder de destrucción de todas las fichas).
    En cada tablero, se debe poder buscar:
    ● Todas las fichas que posean un poder de destrucción mayor a 2
    ● Todas las fichas que ocupen más de 4 lugares
    ● Todas las fichas que tengan una fortaleza mayor a 5
    ● Combinaciones lógicas de los anteriores

5 - Streaming:
    Una plataforma de streaming de video permite a sus usuarios consultar su catálogo de
    películas disponibles. De cada película se guarda el título, la sinopsis, los géneros (“acción”,
    “terror”, “drama”, etc), el director, los actores, el año de estreno, la duración de la película
    (en minutos), y la edad mínima requerida para ver la película.
    La plataforma debe permitir realizar búsquedas de películas según diversos criterios, por
    ejemplo:
    ● Buscar todas las películas que en el título contenga la palabra “luna”.
    ● Buscar todas las películas que contengan un género específico (por ejemplo,
    “terror”).
    ● Buscar todas las películas en las que haya actuado Will Smith y cuyo director
    NO haya sido Martin Scorsese.
    ● Buscar todas las películas que se hayan grabado antes del 2015 y cuya
    duración sea menor a 95 minutos.
    A su vez, dado que algunas películas son más exitosas que otras, a la hora de analizar si
    adquirir la licencia de una nueva película, la plataforma analiza si la película resultará
    rentable o no. Una película será rentable si cumple con ciertos criterios que hace que los
    usuarios prefieran verla. Por ejemplo, el CEO de la plataforma observó que los usuarios
    suelen ver:
    ● Películas cuya duración sea menor a 120 minutos, que no sean del género
    “comedia”.
    ● Películas posteriores del 2017, a no ser que se trate de películas del género
    “infantil” o “documental”.
    Dado que las preferencias de los clientes cambian con el tiempo, el CEO de la plataforma de
    streaming desea poder cambiar en tiempo de ejecución las políticas de adquisición de
    licencias de películas, en caso de ser necesario. Proveer un servicio que le permita a la
    plataforma determinar si una película resultará rentable o no



    Programación 2
Tecnicatura Universitaria en Desarrollo de Aplicaciones Informáticas
Práctica Nº 7b – 2022
Para cada uno de los siguientes problemas Implementarlos en Java.

1 - Sistema de Archivos:
    Un Sistema de Archivos debe organizar y manipular los siguientes elementos: archivos,
    directorios, links y archivos comprimidos. Los archivos se definen por un nombre, una fecha
    de creación, una fecha de última modificación y un tamaño. Los directorios tienen un
    nombre, una fecha de creación y además contienen un conjunto de archivos y un conjunto de
    sub-directorios. El tamaño de un directorio está dado por el tamaño de sus sub-directorios,
    sus archivos, sus links y sus archivos comprimidos. Los links son vínculos a otro archivo o
    directorio y tienen un nombre, una fecha de creación y su tamaño en disco es siempre igual a
    1Kb. Los archivos comprimidos son un tipo particular de archivo que contienen otros
    archivos y/o directorios en formato comprimido según una tasa de compresión dada, tienen
    un nombre y una fecha de creación.
    Implementar una solución orientada a objetos para este problema que permita determinar
    ● la cantidad de elementos que posee un directorio particular,
    ● el tamaño total de un directorio particular.
    
2 - Compañía de envíos:
    Una compañía de envíos posee distintos tipos de servicios de envíos, entre los mismos se
    encuentran:
    ● Envío de paquetes y cartas, una carta/paquete posee un destinatario con su dirección,
    un remitente con su dirección, si la retiran en la sucursal de destino o la envían a
    domicilio, y su peso.
    ● Combo Postal, es una modalidad por la cual se agrupa un conjunto de envíos
    (cualquier tipo de envío). Todos los envíos incluidos en un combo postal deben tener
    la misma ciudad de destino.
    Todos los envíos poseen un único número de tracking que permite hacer su seguimiento. En
    los combos el tracking es el mismo para todos los elementos que contiene, y cuando un
    elemento se agrega a un combo se le cambia el tracking del elemento poniendo el del combo.
    Si el elemento agregado era un combo, este debe cambiar también el tracking de todos sus
    elementos para adecuarse al nuevo valor.
    El peso de los combos es la suma de todos los elementos que este contiene. El destinatario,
    remitente y la dirección de un combo es el valor del primer elemento que ellos poseen (no se
    tiene en cuenta el resto de los elementos)