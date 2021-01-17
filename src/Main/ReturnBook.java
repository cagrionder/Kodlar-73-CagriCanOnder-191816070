/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Main;

/**
 *
 * @author Çağrı
 */
public class ReturnBook extends BorrowBook{

    
    private String returnDate;

    public ReturnBook(String returnDate, int memberID, String firstName, String lastName, String issueDate, String bookID, String bookTitle, String bookAuthor, String bookISBN, String bookPublisher, String bookPage) {
        super(memberID, firstName, lastName, issueDate, bookID, bookTitle, bookAuthor, bookISBN, bookPublisher, bookPage);
        this.returnDate = returnDate;
    }

  
    public String getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(String returnDate) {
        this.returnDate = returnDate;
    }
 
}