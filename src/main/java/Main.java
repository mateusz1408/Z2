// import static org.junit.jupiter.api.Assertions.assertEquals;

// import org.junit.jupiter.api.Test;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Wczytaj 5 liczb");
    int najmniejsza = Integer.MAX_VALUE;
    for(int i = 0; i < 5; i++){
      System.out.println((i+1) + ". liczba: ");
    
      int liczba=scanner.nextInt();
    if(liczba<najmniejsza){
      najmniejsza=liczba;
    }
    }

    System.out.println("Najmniejsza liczba to: " + najmniejsza);
    
    
  }

  // @Test
  // void addition() {
  //     assertEquals(2, 1 + 1);
  // }
}