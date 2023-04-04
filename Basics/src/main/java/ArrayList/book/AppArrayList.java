package ArrayList.book;


import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author angel campillo
 */
public class AppArrayList {

   /**
    * @param args the command line arguments
    */
   public static void main(String[] args) {
   //menu
   //invocamos el la clase listbook para invocar los metodos de esa clase
    ListBook obj = new ListBook();
    
    byte opcion;
    
    do{
        //como es byte debemos parsear porque vamos a ingresar un stream
       opcion = Byte.parseByte(JOptionPane.showInputDialog(
               "Menu Principal\n"
               +"1. Add Book\n"
               +"2. list Books\n"
               +"3. Clear List Book\n"
               +"4. Exit"));
       
       switch(opcion){
          case 1:
              obj.addBook();
             break;
          case 2:
             obj.getBooks();
             break; 
             
          case 3:
             obj.clearListBook();
             break;
          case 4:
             JOptionPane.showMessageDialog(null, "good bye");
             break;
             
          default:
             JOptionPane.showMessageDialog(null, "not found");
             break;
             
       }
       
       
    }while(opcion!=4);
   
   }
   
}
