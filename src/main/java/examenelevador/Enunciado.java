/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examenelevador;

/**
    * La clase Elevador. Todos los elevadores tienen un número de serie de 8 dígitos, 
    * un fabricante, una capacidad máxima de personas, un peso máximo que 
    * no se puede superar para que pueda funcionar, fecha de fabricación y 
    * fecha de última revisión. A lo largo del desarrollo del enunciado debes 
    * identificar atributos adicionales.

    * A la hora de crear un Elevador hay que tener en cuenta que el número 
    * de serie se establece de forma aleatoria, no se pueden crear objetos 
    * Elevador con capacidad máxima inferior a 0 y superior a 10 personas ni 
    * con pesos soportados inferiores a cero o superiores a 800kg. 
    * La fecha de fabricación y fecha de última revisión, durante la 
    * creación del objeto, será la fecha actual del sistema. Todos los 
    * elevadores se crean en la planta baja y su estado inicial es null. 
    * Si algún parámetro, durante la construcción del objeto, no está 
    * correctamente establecido entonces se dejará con sus valores por defecto. 

    * Una vez creado el ascensor, sólo se podrá cambiar su fecha de última 
    * revisión, el estado y la planta en la que se encuentra, por lo tanto el 
    * resto de atributos serán inmutables. 
    * Incluye los getters y setters necesarios y el método toString. 
    * En este caso no hay constructor por defecto.

    * Para simplificar, supondremos que los ascensores de nuestra aplicación 
    * viajan entre la planta baja o planta cero y la planta 8. 
    * En cada viaje es necesario indicar al ascensor el número de viajeros , 
    * el peso total de los mismos y la planta a la que se desea mover. 
    * El ascensor debe comprobar si se puede realizar el viaje, moviéndose a 
    * la planta indicada. Como es evidente, hay que controlar la planta en la 
    * que está y la planta a la que se desea mover, antes de realizar el 
    * trayecto. El método mover de los elevadores debe devolver un booleano 
    * que indique si el viaje es posible. Si el viaje es factible, se debe 
    * actualizar el estado del ascensor en función de si está 
    * "subiendo" o "bajando".

    * Crea una clase Edificio, que contenga el método main(). 
    * Añade un método de clase que reciba un objeto de tipo Elevador y devuelva 
    * la fecha de la próxima revisión, teniendo en cuenta que deben pasar 
    * 6 meses desde la fecha de la última revisión.

    * Dentro del main, crea dos ascensores con los datos que tú quieras, 
    * uno con parámetros correctos y otro con parámetros incorrectos. 
    * Realiza las pruebas de mover el ascensor con distinto número de viajeros, 
    * pesos y plantas, en el ascensor creado con parámetros apropiados. 
    * Ve imprimiendo por pantalla la información del ascensor para comprobar 
    * si se están realizando correctamente las subidas y bajadas, planta en la 
    * que se ecuentra y estado del último viaje (si fue "subiendo" o "bajando"). 
    * Imprime por pantalla la fecha de la próxima revisión del ascensor.

    * OPCIONAL - Considera realizar una mejora sobre la práctica, creando un 
    * Enum para el estado del ascensor (subiendo, bajando, parado, averiado). 
    * Si el ascensor está averiado, no puede realizar ningún viaje.
 * 
 */
public class Enunciado {
    
}
