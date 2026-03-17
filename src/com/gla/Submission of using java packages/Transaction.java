package library.transactions;

import library.books.Book;
import library.members.Member;

public class Transaction {

    public void issueBook(Book book, Member member) {
        book.issueBook();
        System.out.println("Book issued successfully!");
        System.out.println("Issued to: ");
        member.displayMember();
    }
}