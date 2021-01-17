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
public class Member extends Account{
    
    private static int memberID;
    private String lastName;
    private String posta;

    public Member(int id, String name, String lastName, String username, String posta, String password) {
        super(id, name, username, password);
        this.lastName = lastName;
        this.posta = posta;
    }

    public Member() {
    }
    
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPosta() {
        return posta;
    }

    public void setPosta(String posta) {
        this.posta = posta;
    }

    public int getMemberID() {
        return memberID;
    }

    public void setMemberID(int memberID) {
        Member.memberID = memberID;
    }
  
}