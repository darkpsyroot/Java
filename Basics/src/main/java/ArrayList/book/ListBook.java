package ArrayList.book;


import java.util.ArrayList;
import javax.swing.JOptionPane;

public class ListBook {

    //Almacenamos objetos de la clase book
    ArrayList<Book> listbook = new ArrayList();

    public String Input(String text) {
        return JOptionPane.showInputDialog(text);
    }

    //metodo para ingresar valores al atributo del objeto
    public void addBook() {
        //Obtener valores ingresados 
        String name = Input("Name Book ");
        String edition = Input("Edition Book ");
        //instanciamos la clase book
        Book book = new Book();
        //llenamos el arr con el metodo set de la clase book
        book.setName(name);
        book.setEdition(edition);
        //Pasamos los valores ingresados a la lista
        listbook.add(book);
        
    }
    
    //metodo para mostrar onformación de esa lista

    public void getBooks() {
        //Para poder sacar todos los valores de la lista
        //hacemos un recorrido
        //valiable cadena para almacenar los datos recorridos
        String string = "";
        for (int i = 0; i < listbook.size(); i++) {
            //por cada recorrido voy a almacenar la info
            string += "Book" + (i + 1) + "\n";
            //concatenamos lo que tiene la lista
            string += "Name: " + listbook.get(i).getName() + "\n";
            string += "Edition: " + listbook.get(i).getEdition() + "\n";
        }

        //mostar arraly
        JOptionPane.showMessageDialog(null, string);
    }

    public void clearListBook() {
        //metodo para limpiar lista
        listbook.clear();
    }

}
