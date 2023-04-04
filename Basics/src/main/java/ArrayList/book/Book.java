package ArrayList.book;


public class Book {

    //Atributos de la clase
    private String name;
    private String edition;

    //constructor
    public Book() {
        //inicializa atributos en un string vacio
        name = "";
        edition = "";
    }
    //llamar metodos get y set
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEdition() {
        return edition;
    }

    public void setEdition(String edition) {
        this.edition = edition;
    }

}
