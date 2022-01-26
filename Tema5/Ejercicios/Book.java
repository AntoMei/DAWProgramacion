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
    private String refNumber;
    private int borrowed;
    private boolean courseText;

    /**
     * Set the author and title fields when this object
     * is constructed.
     */

    //3.Campo pages //4.Campo refNumber //5.Campo borrowed //6.Campo courseText
    public Book(String bookAuthor, String bookTitle, int bookpages, boolean bookCourseText)
    {
        author = bookAuthor;
        title = bookTitle;
        pages = bookpages;
        refNumber = (""); 
        courseText = bookCourseText; 
        borrowed++;
    }
    
    // Add the methods here ...

    //1.Métodos getAuthor y getTitle.
    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    //2.Métodos printAuthor y printTitle.
    
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
        ref = refNumber;
        for (int i = 0; i < refNumber.length(); i++) {

            if (refNumber.length() < 3) {
                System.out.println("Error");
            }
        }  
    }  

    public void getRefNumber(){
        setRefNumber(refNumber);
    }

    //5.Método setBorrowed y getBorrowed.

    public void setBorrow(){
        borrowed++;
    }

    public void getBorrowed(){
        setBorrow();
    }

    //6.Método setIsCourseText.

    public boolean isCourseText(){
        return courseText;
    }

    //7.Método printDetails.

    public void prinDetails(){
        System.out.println("Detalles:\n");
    }

    public void getRefNumber(String string) {
    }





}