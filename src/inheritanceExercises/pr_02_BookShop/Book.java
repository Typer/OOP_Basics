package pr_02_BookShop;

/**
 * Created by Typer on 11/10/2016.
 */
public class Book {
    private String author;
    private String title;
    private double price;

    public Book(String author, String title, double price) {
        this.setAuthor(author);
        this.setTitle(title);
        this.setPrice(price);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        if (title.length() < 3) {
            throw new IllegalArgumentException("Title not valid!");
        }
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        if (author.length() > 1) {
            String[] authorName = author.trim().split("\\s+");
            if (authorName.length > 1){

                if (authorName[1].charAt(0) > 47 && authorName[1].charAt(0) < 58){
                    throw new IllegalArgumentException("Author not valid!");
                }
                this.author = author;

            }else{

                if (authorName[0].charAt(0) > 47 && authorName[0].charAt(0) < 58){
                    throw new IllegalArgumentException("Author not valid!");
                }
                this.author = author;
            }
        }
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price < 1) {
            throw new IllegalArgumentException("Price not valid!");
        }
        this.price = price;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("Type: ").append(this.getClass().getSimpleName())
                .append(System.lineSeparator())
                .append("Title: ").append(this.getTitle())
                .append(System.lineSeparator())
                .append("Author: ").append(this.getAuthor())
                .append(System.lineSeparator())
                .append("Price: ").append(this.getPrice())
                .append(System.lineSeparator());
        return sb.toString();
    }
}
