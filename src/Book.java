public class Book {
    private final String title;
    private int  yearPublication;

    public Book(String title, int  yearPublication) {
        this.title = title;
        this. yearPublication =  yearPublication;
    }

    public String getTitle() {
        return title;
    }

    public int getYearPublication() {
        return yearPublication;
    }
    public void setYearPublication(int yearPublication ) {
        this.yearPublication = yearPublication;
    }
}



