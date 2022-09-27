package ch21;
/*
    *
    * 객체까지 다르게 복사하는 방법 예시
    * 깊은 복사
    * 각각의 객체를 생성하여 그 객체의 값을 복사하여 배열이 서로 다른 객체를 가리키도록 함
    *
 */
public class ObjectCopy2 {
    public static void main(String[] args) {

        Book[] library = new Book[5];
        Book[] copyLibrary = new Book[5];

        library[0] = new Book("태백산맥 1", "조정래");
        library[1] = new Book("태백산맥 2", "조정래");
        library[2] = new Book("태백산맥 3", "조정래");
        library[3] = new Book("태백산맥 4", "조정래");
        library[4] = new Book("태백산맥 5", "조정래");

        copyLibrary[0] = new Book();
        copyLibrary[1] = new Book();
        copyLibrary[2] = new Book();
        copyLibrary[3] = new Book();
        copyLibrary[4] = new Book();

        for (int i = 0; i < library.length; i++) {
            copyLibrary[i].setAuthor(library[i].getAuthor());
            copyLibrary[i].setTitle(library[i].getTitle());

        }

//            System.arraycopy(library, 0, copyLibrary, 0, 5);
//
//            System.out.println("===== library =====");
//            for (Book book : library) {
//                System.out.println(book);
//                book.showInfo();
//            }
//
//            System.out.println("===== copy library =====");
//            for (Book book : copyLibrary) {
//                System.out.println(book);
//                book.showInfo();
//            }

        library[0].setAuthor("박완서");
        library[0].setTitle("그 여자네 집");

        System.out.println("===== test library =====");
        for (Book book : library) {
            System.out.println(book);
            book.showInfo();
        }

        System.out.println("===== test copy library =====");
        for (Book book : copyLibrary) {
            System.out.println(book);
            book.showInfo();
        }
    }
}

