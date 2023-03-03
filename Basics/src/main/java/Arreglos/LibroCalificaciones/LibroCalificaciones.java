/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Arreglos.LibroCalificaciones;

/**
 *
 * @author francisco.reyes
 */
public class LibroCalificaciones {

    private String nombreDelCurso;
    private int[][] calificaciones;

    public LibroCalificaciones(String nombreDelCurso, int[][] calificaciones) {
        this.nombreDelCurso = nombreDelCurso;
        this.calificaciones = calificaciones;
    }

    public String getNombreDelCurso() {
        return nombreDelCurso;
    }

    public void setNombreDelCurso(String nombreDelCurso) {
        this.nombreDelCurso = nombreDelCurso;
    }

    //Realiza varias operaciones sobre los datos
    public void procesaCalifiaciones() {
        //Imprime el arreglo calificaciones
        imprimirCalificaciones();

        //LLama a los metodos obtenerMinima y ObtenerMáxima
        System.out.printf(
                "%n%s %d%n%s %d",
                "La calificación mas baja en el libro de calificaciones es: ",
                obtenerMinima(),
                "La calificación mas alta en el libro de calificaciones es: ",
                obtenerMaxima()
        );

        System.out.println("\n");

        /*imprime gráfico de distribución de todas las calificacones 
        para todas las pruebas*/
        imprimirGraficoBarras();
    }

    //Busca calificacion mas baja
    public int obtenerMinima() {
        /*Asume que el primer elemento del arreglo 
        calificaciones es el mas bajo*/
        int califBaja = calificaciones[0][0];

        //iteraa través de las filas del arreglo calificaciones
        for (int[] califEstudiantes : calificaciones) {

            //Itera a travez de las columnas de la fila actual
            for (int calificacion : califEstudiantes) {

                /*si la calificacion es mayor que califBaja, 
                le asignamos califBaja*/
                if (calificacion < califBaja) {
                    califBaja = calificacion;
                }
            }
        }
        return califBaja;
    }

    //Busca calificacion mas baja
    public int obtenerMaxima() {
        /*Asume que el primer elemento del arreglo 
        calificaciones es el mas bajo*/
        int califAlta = calificaciones[0][0];

        //iteraa través de las filas del arreglo calificaciones
        for (int[] califEstudiantes : calificaciones) {

            //Itera a travez de las columnas de la fila actual
            for (int calificacion : califEstudiantes) {

                /*si la calificacion es mayor que califBaja, 
                le asignamos califBaja*/
                if (calificacion > califAlta) {
                    califAlta = calificacion;
                }
            }
        }
        return califAlta;
    }

    //Imprime el contenido del arreglo calificaciones
    public void imprimirCalificaciones() {
        System.out.printf("Las calificaciones son: %n%n");

        System.out.printf("                  ");

        //Crea un encabezado de columna para cada una de las pruebas
        for (int prueba = 0; prueba < calificaciones[0].length; prueba++) {
            System.out.printf("Prueba %d ", prueba + 1);
        }

        //Encabezado de la columna promedio de estudiantes
        System.out.println("Promedio");

        /*crear filas/columnas de texto que se representan 
        en el arreglo calificaciones*/
        for (int estudiante = 0; estudiante < calificaciones.length; estudiante++) {
            System.out.printf("Estudiante %2d", estudiante + 1);

            //imprime las calificaciones del estudiante
            for (int prueba : calificaciones[estudiante]) {
                System.out.printf("%8d", prueba);

            }

            /*Llama al método obtenerPromedio para calcular la calificacion
            promedio del estudiante pas fila de calificaciones como argumento
            para obtener el promedio*/
            double promedio = obtenerPromedio(calificaciones[estudiante]);
            System.out.printf("%9.2f%n", promedio);

        }

    }

    public void imprimirGraficoBarras() {
        System.out.printf("Distribución de calificaciones en general: ");

        //almacena la frecuencia de las calificaciones en cada rango
        //de 10 calificaciones
        int[] frecuencia = new int[11];

        //Para cada calificación en Libro Calificaciones en cada rango de 10 
        //calificaciones
        for (int[] califEstudiantes : calificaciones) {
            for (int calificacion : califEstudiantes) {
                ++frecuencia[calificacion / 10];
            }
        }
        //para cada frecuencia de calificaciones, imprime una barra en el
        //gráfico
        for (int cuenta = 0; cuenta < frecuencia.length; cuenta++) {
            //Imprime etiquetas de las barras ("00-99:,...90-99:, 100:")
            if (cuenta == 10) {
                System.out.printf("%5d: ", 100);
            } else {
                System.out.printf("%02d-%02d: ",
                        cuenta * 10, cuenta * 10 + 9);
            }

            //imprime barras de asteriscos 
            for (int estrellas = 0; estrellas < frecuencia[cuenta]; estrellas++) {
                System.out.printf("*");
            }
            System.out.println("");
        }
    }

    //Determina la calificacion promedio para un conjunto
    //específico de calificaciones
    public double obtenerPromedio(int[] conjuntoDeCalif) {
        int total = 0;

        //suma las calificaciones para un estudiante 
        for (int calificacion : conjuntoDeCalif) {
            total += calificacion;
        }

        //vuelve el promedio de calificaciones
        return (double) total / conjuntoDeCalif.length;

    }

}
