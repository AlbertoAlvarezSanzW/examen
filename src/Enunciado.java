
/*
vamos a simular una carrera de relevos en las olimpiadas.

36 corredores representando a los 9 paises que compiten en la olimpiada.
Cada hilo debe ser identifocado con el nombre del pais y un numero que le diferencie de sus compañeros

Empieza a correr un corredor por pais. Simulamos la carrera con un sleep entre 1 y 5 segundos. Cuando ha pasado ese tiemo, el corredor
encuentra un obstaculo. La probabilidad de qque el corredor supere el obstaculo es del 90%

* si el corredor supera el obstaculo, da paso al siguiente corredor de su grupo, el culo repite el mismo proceso hasta que todos los corredores
de su pais terminem.

* gana el paos cuyos participantes terminan primero.

* si el corredos no supera el obstaculo, la ambulancia debe entrar en accion (otro hilo)

* La ambulancia solo puede atender a un hilo a la vez, si la ambulancia estuviera ocupada, ese pais no continua en la carrera
* La ambulancia tarda 5 seg en curar al corredor herido. Cuando el corredor este curado, notifica al siguiente corredor que prosiga
la carrera. Si es el ultimo corredor de su pais terminara su carrera, puede quedar campeon
 */