package lab5.composition;

class BookTest {

  public static void main(String[] args) {
    Author author1 = new Author("Tan Ah Teck", "ahteck@somewhere.com");

    Book book1 = new Book("12345", "Java for dummies", author1, 8.8, 88);
    System.out.println(book1);

    book1.setPrice(9.9);
    book1.setQty(99);
    System.out.println(book1);
    System.out.println("isbn is: " + book1.getIsbn());
    System.out.println("name is: " + book1.getName());
    System.out.println("price is: " + book1.getPrice());
    System.out.println("author is: " + book1.getAuthor());
    System.out.println("author's name: " + book1.getAuthorName());
    System.out.println("author's email: " + book1.getAuthor().getEmail());
  }
}
