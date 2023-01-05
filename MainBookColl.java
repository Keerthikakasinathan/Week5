
import java.util.*;
import java.io.*;
class Book implements Comparator,Serializable   
  {
      String bookname, authorname ;
      int isbc_no ;
      public int compare(Book b1 , Book b2){
      return b1.bookname.compareTo(b2.bookname);
      }
      Book(){
      }
      Book(String bookname,String authorname , int isbcno ){
            this.bookname = bookname ;
            this.authorname= authorname ;
            this.isbc_no = isbc_no ;
        }
      public String toString(){
             return "Book Name : "+bookname+" Author Name : "+ authorname +" ISBC NO : "+isbc_no;
         }
       }
class MainBookColl{
     public static void main(String... args)throws IOException,ClassNotFoundException{
           LinkedList a = new LinkedList();
           Book b1 = new Book ("Believe in Yourself " , "Joseph", 0);
           Book b2 = new Book ( "Harry Potter " , " Rowling " , 0);
           Book b3 = new Book ("The Bravest Fish" , "Hendry " ,0);
           a.add(b1);
           a.add(b2);
           a.add(b3);
           Collections.sort(a,new Book ());
           Iterator it = a.iterator();
           while(it.hasNext()){
           System.out.println(it.next());
           }
       }
    }

