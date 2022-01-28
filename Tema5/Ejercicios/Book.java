package Ejercicios;

/**
 * A class that maintains information on a book.
 * This might form part of a larger application such
 * as a library system, for instance.
 *
 * @author (Insert your name here.)
 * @version (Insert today's date here.)
 */
class Book
{
    // The fields.
    private String author;
    private String title;
    private int pages;
    private String refNumber = "";
    private int borrowed;
    private final boolean courseText; //Inmutables = final, no se puede modificar, 
    //solo una vez en el constructor. Aparte no tiene un setter y solo tiene un getter.

    /**
     * Set the author and title fields when this object
     * is constructed.
     */

    //3.Campo pages //4.Campo refNumber //5.Campo borrowed //6.Campo courseText
    //Se ponen diferentes nombres o puedes poner el mismo nombre pero con this.author por ejemplo.
    public Book(String bookAuthor, String bookTitle, int bookpages, boolean bookCourseText)
    {
        //Parámetros del constructor.
        author = bookAuthor;
        title = bookTitle;
        pages = bookpages;
        courseText = bookCourseText; 
    }
    
    // Add the methods here ...
    //No son métodos static porque son atributos y porque pueden haber muchos autores y muchos titulos.
    //1.Métodos getAuthor y getTitle.
    //Mutador = setter y Selector = getter.
    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    //2.Métodos printAuthor y printTitle.
    //Void porque solo imprime por consola.
    public void printAuthor(){
        System.out.println(author);
    }

    public void printTitle(){
        System.out.println(title);
    }

    //3.Método getPages.

    public int getPages(){
        return pages;
    }

    //4.Método setRefNumber y getRefNumber.

    public void setRefNumber(String ref){
            if (ref.length() > 3) {
                refNumber = ref;
            }else{
                System.out.println("Error");
            }
        }
    
    public String getRefNumber(){
        return refNumber;
    }

    //5.Método setBorrowed y getBorrowed.

    public void setBorrow(){
        this.borrowed++;
    }

    public int getBorrowed(){
        return this.borrowed;
    }

    //6.Método getIsCourseText.

    public boolean isCourseText(){
        return courseText;
    }

    //7.Método printDetails.

    public void prinDetails(){
        printAuthor();
        printTitle();
        System.out.println("Detalles:\n");
        System.out.println("Detalles:\n");
        System.out.println("Detalles:\n");
        System.out.println("Detalles:\n");
        System.out.println("Detalles:\n");
        System.out.println("Detalles:\n");
    }
}