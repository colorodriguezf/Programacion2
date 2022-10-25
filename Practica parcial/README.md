Parcial 28-10-2021
Defina las clases para implementar una solución orientada a objetos para el siguiente problema e implemente
en Java.
Una agencia de turismo quiere revitalizar sus ventas y planifica ofrecer distintos tipos de paquetes turísticos
dentro de sus ofertas, entre los mismos se encuentran:
● Vida en la naturaleza en familia, consiste de un viaje en avión o auto
rentado, a un destino estrechamente ligado a la naturaleza, se ofrece
alojamiento para la cantidad de miembros de la familia durante el
tiempo de estadía que la agencia estipule. Este paquete posee un
identificador, los datos del alojamiento, la ciudad de origen y destino,
una fecha de pago acordada y un costo.
● Viaje con amigos, este paquete consiste de un viaje en avión o auto
rentado, a un destino con gran vida nocturna, como puede ser por
ejemplo Lago Puelo o Centinela del Mar. El alojamiento ofrecido
depende de la cantidad de miembros del grupo de amigos y será
otorgado durante el tiempo consensuado entre los amigos. El paquete
es descrito por un identificador, un costo, fecha de pago, ciudad de origen y destino, y los datos del
alojamiento.
● Paquete Superviaje, consiste de un viaje de larga duración compuesto por diferentes combinaciones
de otros paquetes ofrecidos por la empresa, y cualquier otro tipo de paquete que pueda ofrecer en un
futuro. Poseen un identificador propio y la fecha de pago acordada se establece como la última fecha
de pago acordada de los paquetes que lo componen, siempre y cuando estén todas las fechas de pago
acordadas (si alguno no tienen una fecha acordada es null). Los paquetes intermedios son agregados
en orden, por lo tanto, la ciudad de origen de un nuevo paquete debe coincidir con la ciudad de destino
del último paquete incorporado, en caso de que esto no se cumpla no se incorpora el paquete que se
deseaba agregar. De esta forma, la ciudad origen del Paquete Superviaje será la ciudad origen de su
primer paquete y la ciudad destino del Paquete Superviaje será la ciudad destino del último. Como
condición fundamental todos los paquetes intermedios deben poseer la misma cantidad de pasajeros,
estipulada en el Paquete Superviaje en el momento de su creación. El costo de este paquete es la
suma de los costos de todos los paquetes que lo componen.
ACLARACIÓN: El primer paquete que se agrega a un paquete superviaje, obviamente se agrega de
forma incondicional (sin controlar origen y destino). Si se controla la cantidad de pasajeros.
● Paquete Promo Previaje, tiene un identificador propio, ciudad de origen y destino propio, un monto
propio, una fecha de pago acordada propia, los datos del alojamiento propio, y un porcentaje de
descuento. Cuando se quiere consultar el costo del
paquete, si la fecha de pago acordada se encuentra
entre dos fechas determinadas por la promoción, se
aplica el descuento al costo original. Si la fecha de pago
acordada no está informada o está fuera del rango de
fechas de la promoción, el descuento no aplica.
● Escapada romántica, consiste en un viaje en auto
rentado o avión, a un destino romántico como puede ser
por ejemplo Burzaco o Realicó, con alojamiento para 2
personas durante un fin de semana. Este paquete posee
un identificador, ciudad de origen y destino, un costo, una fecha de pago acordada y los datos del
alojamiento.
Nota: la fecha de pago acordada es inicialmente null y se establece en un momento posterior , cuando el
cliente realiza efectivamente la coordinación del pago.
Se desea brindar listados en los cuales se incluyan todos los paquetes que ofrezca la empresa y que
cumplan con determinado criterio. A continuación se listan algunos ejemplos.
a) Listar todos los paquetes cuyo destino sea “Cancún”, ordenados por ciudad de origen, y luego
por identificador, si hay más de un paquete con la misma ciudad de origen.
b) Listar todos los paquetes cuyo origen sea “Tandil” y cuyo destino sea “Bariloche” , ordenados por
costo del paquete.
c) Listar todos los paquetes con costo mayor a $100.000, ordenados por costo y, si hay dos
paquetes con el mismo costo, y luego por fecha acordada de pago (los que no tienen fecha
acordada deben ir a lo último).
d) Listar todos los paquetes con fecha acordada 25 de Mayo de 2022, ordenados por costo y, si hay
dos paquetes con el mismo costo, y luego por cantidad de pasajeros.
e) Se pueden agregar nuevos tipos de búsquedas así como también combinaciones lógicas de las
mismas. Los criterios de ordenamiento también pueden variar y deben poder combinarse de
cualquier manera.
NOTA: Si un paquete Súperviaje cumple con los requisitos de la búsqueda, se incluye él mismo en los
resultados y no los sub-paquetes que lo componen. En caso de que el paquete Súperviaje no cumpla
con el criterio se deben retornar los paquetes que lo componen que sí cumplan.