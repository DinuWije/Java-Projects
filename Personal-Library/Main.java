/* A personal library program which shows which books are completely read and which ones are not.
Author: Dinu  Wijetunga
*/

import java.util.HashMap;

class Main {
  public static class Library{
    public Library(){

    }
    
    public void getFinishedBooks(HashMap<String, Boolean> library){
      if (library.size() < 1){
        System.out.println("Sorry, that HashMap is empty.");
      }else{
        System.out.println("Finished Books: ");
        for(String book : library.keySet()){
          if (library.get(book) == true){
            System.out.println(book);
          }
        }
      }
    }

    public void getUnfinishedBooks(HashMap<String, Boolean> library){
      if (library.size() < 1){
        System.out.println("Sorry, that HashMap is empty.");
      }else{
        System.out.println("Unfinished Books: ");
        for(String book : library.keySet()){
          if (library.get(book) == false){
            System.out.println(book);
          }
        }
      }
    }
  }
  public static void main(String[] args) {
    HashMap<String, Boolean> myBooks = new HashMap<String, Boolean>();

    myBooks.put("Road Down The Funnel", true);
    myBooks.put("Rat: A Biology", false);
    myBooks.put("TimeIn", true);
    myBooks.put("3D Food Printing", false);

    Library myLibrary = new Library();
    System.out.println("");
    myLibrary.getFinishedBooks(myBooks);
    System.out.println("");
    myLibrary.getUnfinishedBooks(myBooks);
  }
}