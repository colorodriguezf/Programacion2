Programación 2
Tecnicatura Universitaria en Desarrollo de Aplicaciones Informáticas
Práctica Nº 3 – 2022
Para cada una de los siguientes problemas identificar los objetos que intervienen, su
estado y su comportamiento. Implemente en JAVA
1 Sistema de encuestas:
    Una empresa consultora desea desarrollar un sistema el cual le permita informatizar su
    mecanismo de encuestas. La compañía se encarga de realizar encuestas para empresas
    de terceros o para el gobierno. Una encuesta se compone de un conjunto de preguntas,
    una persona encuestada y el empleado que realizo la encuesta. La compañía guarda
    todas las encuestas realizadas. Los empleados cobran un plus por cantidad de encuestas
    realizadas, con lo cual la empresa desea conocer el número de encuestas que realizó
    cada empleado. Para evitar falsificación de datos, en la encuesta figura el número de
    documento de la persona. Una misma persona no puede llenar dos veces la misma
    encuesta, pero si una encuesta diferente.
    Consejo: Diferenciar entre formulario a responder y formulario respondido.
    Extra: ¿Qué cambiaría el eliminar la restricción de solo una encuesta por persona?.

2 Fábrica de muebles:
    Una fábrica de muebles desea organizar su manufactura de manera electrónica. La
    fábrica solo produce sillas, mesas y bancos. De cada uno de los productos guarda su
    peso, su costo de fabricación, el valor de venta, el tipo de madera y el color. La fábrica
    también posee un stock de productos disponibles. Se debe poder calcular el costo de
    todos los productos en stock, ya sea precio de fabricación o precio de venta. El precio
    de Venta es el precio de costo más un 35%
    Consejo: Analizar Clase Vs Instancia
    Extra: ¿Qué sucede si se agrega un producto cuyo precio de venta es el 10% más del
    costo de fabricación?.

3 Juego de Personajes:
    Se desea modelar un juego el cual se compone de héroes y villanos. Cada personaje del
    juego posee un nombre real, un nombre de super héroe y un conjunto de cualidades o
    características, que son visión nocturna, velocidad, fuerza peso, altura y edad. Cada una
    de estas posee un nivel asociado, por ejemplo velocidad 500, fuerza 700, edad 33.
    El mecanismo de juego se basa en enfrentar un personaje con otro y decidir cuál de
    ellos es el ganador. Para decidir quién es el ganador se utiliza el valor de una de las
    características, por ejemplo fuerza, velocidad. En caso de empate se decide por el valor
    de otra característica dada.
    Consejo: Identificar las reglas del juego y en dónde deben estar. Ver Jugador.
    Extra: ¿Cómo se modela el mazo de cartas? ¿Qué ocurre con más jugadores?.

4 Contactos de un celular:
    Se desean modelar los contactos de un celular. Para cada contacto se guarda su nombre
    y apellido, fecha de nacimiento, número de teléfono, dirección y dirección de mail. El
    celular muestra los contactos con su apellido y nombre, su edad y su número de
    teléfono. También muestra la ciudad a la que pertenece el contacto. El celular muestra
    información a modo de resumen donde se lista la totalidad de contactos, los contactos
    repetidos y el promedio de edad de los contactos. Se considera un contacto repetido el
    que posee mismo apellido y nombre, y número de teléfono. Asimismo, se debe poder
    incorporar un listado de los contactos que poseen el mismo número de teléfono.
    Consejo: Ver agenda personal e identificar similitudes y diferencias
    Extra: ¿Quién se encarga de decidir si dos contactos son iguales?