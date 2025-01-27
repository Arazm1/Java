//Kirjoita while-toistorakennetta käyttävä ohjelma, joka tulostaa kolmella jaolliset luvut väliltä 1..1000.

public class FourOne {
    public static void main(String[] args) {
      int i = 1;
      while (i <=1000) {
        if (i % 3 == 0) {
          System.out.println(i);
        }
        i++;  
      }
      
    }
  }