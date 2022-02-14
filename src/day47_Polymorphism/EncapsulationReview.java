package day47_Polymorphism;

public class EncapsulationReview {

    private String bookTitle;
    private final String PublishedDate;

    public EncapsulationReview(String bookTitle, String publishedDate) {
        // this.bookTitle = bookTitle;
        setBookTitle(bookTitle);
        PublishedDate = publishedDate;
    }

    public String getBookTitle() {
        if(bookTitle == null){
            return "";
        }
        return bookTitle;
    }

    public void setBookTitle(String bookTitle) {
        if(bookTitle == null || bookTitle.isEmpty()){
            throw new RuntimeException("Invalid Data");
        }
        this.bookTitle = bookTitle;
    }

    public String getPublishedDate() {
        return PublishedDate;
    }
}
