## Responde brevemente a las siguientes cuestiones:
`1. ¿Por qué ItemBiblioteca se ha definido como clase abstracta?`
   Para que sea una plantilla base para las clases hijas de Libro y Revista. 
`2. Explica por qué la relación entre Libro y Autor es composición y no herencia.`
   Porque Libro y Autor son clases distintas que se complemetan, sumado a que un libro
   puede que no tenga autores. 
`3. Indica dos ventajas de usar encapsulación en las clases del ejercicio.`
   Permiten que se no se modifiquen atributos, clases y metodos del programa.   
`4. ¿Por qué ConfiguracionSistema podría declararse como final?`
   Porque son las configuraciones basicas del sistema, siendo estás inmodificables
   para otros usuarios.
`5. ¿Qué ocurriría si el atributo contador de ContadorItems no fuera estático?`
   Pues que se incrementaría de forma regular, sumado a que se tendría que mencionar en el 
   constructor.
`6. En qué situaciones es más adecuado utilizar herencia en lugar de composición.`
En situaciones donde queramos crear una clase padre abstracta o cuando tengamos 
una clase estandar como plantilla.
`7. ¿Qué métodos importantes heredan todas las clases de Object? Menciona al menos
tres.` toString(), hashcode y Object.
`8. Explica brevemente el polimorfismo y cómo aparece en este ejercicio.`
El polimorfismo es la cualidad de que una clase puede obtener varias características,
aparece en el ejercicio con las clases Libro, Revista e ItemBiblioteca
`9. Observa el siguiente método:`
public static void modificarTitulo(String titulo) {
titulo = "Nuevo título";
}
y la llamada:
String t = "Java";
modificarTitulo(t);
System.out.println(t);
`1. ¿Qué se imprimirá?`
   Imprimiría Java
`2. Explica por qué ocurre esto en Java.`
  Ocurre en Java, ya que estamos machacando un parámetro anterior
  creado por uno nuevo. 
