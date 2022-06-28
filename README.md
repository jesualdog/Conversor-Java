## Bienvenido al repositorio del Conversor-Java
En esta oportunidad, se nos solicitó crear un conversor de unidades utilizando el lenguaje Java. Las características solicitadas por nuestro cliente son las siguientes:
- Conversor de Monedas
- Conversor de Tiempo
- Conversor de Longitud
### Descripción
#### Menu  Principal
Muestra un cuadro de dialogo que permite al usuario escoger entre las diferentes opciones de conversión.

![](https://i.postimg.cc/QxkVv6d3/Menu-Principal.jpg)
- Se utilizó la clase **JOptionPane** de la biblioteca Javax.
- Se utilizó el método **showInputDialog** como un objeto para presentar más de una opción.
#### Conversor de Monedas
EL *conversor de monedas* te permite convertir el valor o la cantidad de una moneda a los valores relativos o las cantidades de otras monedas. En el siguiente menu puedes ver las diferentes opciones que tiene nuestro programa.

![](https://i.postimg.cc/gcyY0xFy/Opciones-Monedas.jpg)

- Se utilizó la clase **JOptionPane** de la biblioteca Javax.
- Se utilizó el método **showInputDialog** como un objeto para presentar más de una opción para la conversion.
#### Conversor de Tiempo
El *conversor de tiempo* te permite convertir una unidad de tiempo a otra unidad de tiempo. En el siguiente menu puedes ver las diferentes opciones que tiene nuestro programa.

![](https://i.postimg.cc/x1pjSBrW/Opciones-de-Tiempo.jpg)

- Se utilizó la clase **JOptionPane** de la biblioteca Javax.
- Se utilizó el método **showInputDialog** como un objeto para presentar más de una opción para la conversion.
#### Conversor de Longitud
El *conversor de longitud* te permite convertir una unidad de longitud a otra unidad de longitud. En el siguiente menu puedes ver las diferentes opciones que tiene nuestro programa.

![](https://i.postimg.cc/8kLCryW6/Opciones-de-Longitud.jpg)

- Utilice la clase **JOptionPane** de la biblioteca Javax;
- Utilice el método **showInputDialog** como un objeto para presentar más de una opción para la conversión;
#### Entrada de valor
Este cuadro de diálogo permite al usuario ingresar el valor que desea convertir dependiendo del conversor utilizado.
- Este input esta validado y no acepta otro tipo de caracter que no sea del tipo numérico.
- Se utilizó el método **showInputDialog** para que el usuario inserte un valor.

![](https://i.postimg.cc/KcCnmsb3/Ingresar-Valor.jpg)
#### Resultado de la conversión
Muestra al usuário el valor de la conversión realizada.
- Se utilizó el método **showMessageDialog** para mostrar el resultado de la conversión.

![](https://i.postimg.cc/ry9kk7xQ/Resultado.jpg)
#### Manejo de errores
Como se especificó en el item **Entrada de valor** no se permite otro tipo de caracteres que no sean números, ahora si el usuario introduce letras o caracteres especiales y presiona **ok** debe ser mostrado un mensaje apuntando que el valor no es válido.
- Se utilizó el método **showMessageDialog** para validar la entrada para que no se acepten caracteres no numéricos.

![](https://i.postimg.cc/6QQ7rdwN/Mensaje-Error.jpg)
#### Finalizar programa
El programa le pregunta al usuario si desea seguir trabajando - **¿Desea realizar otra conversión?**
-  Se utilizó el método **showConfirmDialog** para preguntar al usuario si desea continuar usando el programa.

![](https://i.postimg.cc/bJHKq2Ds/Seleccione-Opci-n.jpg)
- Si el usuario selecciona la opción **Yes** debe llevar nuevamente a nuestro usuario a menu principal para escoger una opción de conversión.
- Si el usuario selecciona la opción **No** o **Cancel** se utilizó **showMessageDialog** para cerrar el programa con el mensaje **Programa Terminado.**

![](https://i.postimg.cc/SxRqVVXV/Programa-Terminado.jpg)
