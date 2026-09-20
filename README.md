# Sistema de Control de Acceso para Gimnasio (Membresías en Java)

Cuarta tarea de la EE de Diseño y Programación Orientada a Objetos. 

* IMPORTANTE: Accede al diagrama UML y evidencia de ejecución a través del siguiente enlace: 

## Instrucciones: 
Lee atentamente la problemática del negocio y desarrolla la arquitectura de clases en Java aplicando los conceptos de abstracción, herencia, encapsulamiento y polimorfismo.

## El problema del negocio:

Un gimnasio local necesita un software para controlar el acceso en sus torniquetes de entrada. El gimnasio ofrece diferentes tipos de membresías, y cada una tiene reglas distintas para autorizar el ingreso:

### Membresía Básica (MembresiaBasica): 
Tiene un número limitado de visitas al mes (por ejemplo, 10 visitas). Cada vez que el usuario ingresa, se le debe restar una visita. Si le quedan 0 visitas, se le niega el acceso.

### Membresía Premium (MembresiaPremium):
Tiene visitas ilimitadas, pero cuenta con un pase de invitado especial. Si el usuario ingresa con un invitado, se consume el pase de invitado. Si ya no tiene pases de invitado, igualmente puede entrar él solo, pero no el invitado.

## Requerimientos técnicos:

### Clase Abstracta Membresia:
Debe usar la palabra clave `abstract`.

Atributos protegidos: `idMiembro (String)` y `nombreUsuario (String)`. Usa el modificador `protected`.
* Constructor: Un constructor que inicialice ambos atributos.
* Método abstracto: `public abstract boolean verificarAcceso();`. Debe retornar `true` si el acceso es concedido o `false` si es denegado, imprimiendo un mensaje en pantalla con el resultado.
* Método concreto: `public void mostrarDatos()`. Debe imprimir el ID y el nombre del usuario (común para todas las membresías).
  
### Clase Hija MembresiaBasica:
Hereda de Membresia usando `extends`.

* Atributo propio privado: `visitasRestantes (int)`.
* Constructor: Debe recibir los parámetros del padre y las visitas iniciales, invocando a `super()`.
* Implementación de verificarAcceso: Si `visitasRestantes > 0`, resta 1 a las visitas, imprime un mensaje de bienvenida mostrando cuántas le quedan y retorna `true`. Si es 0, imprime un mensaje de rechazo y retorna `false`.

### Clase Hija MembresiaPremium:
Hereda de Membresia usando `extends`.

* Atributo propio privado: `pasesInvitado (int)`.
* Constructor: Debe invocar a `super()` e inicializar los pases de invitado.
* Implementación de `verificarAcceso`}: Siempre otorga acceso al miembro (retorna `true` e imprime un mensaje de bienvenida Premium).
* Método propio: `public boolean ingresarConInvitado()`. Verifica si `pasesInvitado > 0`; si quedan, resta 1, avisa que ambos pueden pasar y retorna `true`. Si no, avisa que el invitado no puede pasar y retorna false.
  
### Clase Principal (Main):
Debe contener el método `public static void main(String[] args)`.

Debe demostrar el polimorfismo creando un arreglo o un `ArrayList` de tipo `Membresia` que guarde objetos de ambas clases hijas.
Debe recorrer la estructura con un ciclo para simular accesos consecutivos.
Nota mental para el alumno: Intenta escribir la línea `Membresia m = new Membresia("000", "Error");` y observa cómo el compilador de Java genera un error inmediatamente.

