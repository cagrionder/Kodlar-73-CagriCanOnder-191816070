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
public class BorrowBook extends Book{
    
    private int memberID;
    private String firstName;
    private String lastName;
    private String issueDate;

    public BorrowBook(int memberID, String firstName, String lastName, String issueDate, String bookID, String bookTitle, String bookAuthor, String bookISBN, String bookPublisher, String bookPage) {
        super(bookID, bookTitle, bookAuthor, bookISBN, bookPublisher, bookPage);
        this.memberID = memberID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.issueDate = issueDate;
    }

    public int getMemberID() {
        return memberID;
    }

    public void setMemberID(int memberID) {
        this.memberID = memberID;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getIssueDate() {
        return issueDate;
    }

    public void setIssueDate(String issueDate) {
        this.issueDate = issueDate;
    }
    
}
 
