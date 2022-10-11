public class Main {
    public static void main(String[] args) {
        System.out.println("Домашнее задание.Объекты и классы.");
        System.out.println("Небольшой библиотечный каталог.");


        String[] title = {"War and Peace", "Garden of Cherry","Amphibian Man"};
        int[] yearPublication = { 2021, 1903, 1927};
        String[] name = {"Lev", "Anton", "Alexandr"};
        String[] surname = {"Tolstoy", "Chekhov", "Belyaev"};

        for (int i = 0; i < title.length; i++) {
            System.out.println("Название книги - " + title[i] + ",автор - " + name[i] + " " + surname[i] +
                    " дата издания - " + yearPublication[i] + ".");
        }
        System.out.println("================================================================================");
        Book book = new Book("War and Peace", 2021);
        Author author = new Author("Lev", "Tolstoy.");
        book.getYearPublication(1999);
        System.out.print("Название книги - " + book.getTitle() + " ,");
        System.out.print(" дата издания - " + book.getYearPublication() + "");
        System.out.print(" , автор : " + author.getName() + " " + author.getSurname() + " ");
        System.out.println();

        Book gardenOfCherry = new Book("Garden of Cherry", 1903);
        Author anton = new Author("Anton", "Chekhov.");
        System.out.print("Название книги - " + gardenOfCherry.getTitle() + " ,");
        System.out.print(" дата издания - " + gardenOfCherry.getYearPublication() + "");
        System.out.print(" , автор : " + anton.getName() + " " + anton.getSurname() + " ");
        System.out.println();

        Book amphibianMan = new Book("Amphibian Man", 1927);
        Author alexandr = new Author("Alexandr", "Belyaev.");
        System.out.print("Название книги - " + amphibianMan.getTitle() + " ,");
        System.out.print(" дата издания - " + amphibianMan.getYearPublication() + "");
        System.out.print(" , автор : " + alexandr.getName() + " " + alexandr.getSurname() + " ");


    }
}