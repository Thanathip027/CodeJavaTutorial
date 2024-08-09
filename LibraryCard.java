public class LibraryCard {
    private Student1 owner;
    private int borrowcht;
    public LibraryCard(){
        owner = null;
        borrowcht = 0;
    }
    public void checkOut(int numOfBooks){
        borrowcht = borrowcht + numOfBooks;
    }
    public void setOwnerName(Student1 student_1){
        /*เมธอดกำหนดผู้ยืม โดยจะรับข้อมูล */
        owner = student_1;
    }
    public int getNumberOfBooks(){
        return borrowcht;
    }
    public String getOwneName(){
        return owner.getName();
    }
    public String toString(){
        return ("Owner Name : " + owner.getName() + "\n"+"Email : " + owner.getEmail() + "\n" + "Books Borrowner : " + borrowcht);
    }
}
