import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String userChoice, restart;
    int guess;
    int max = 10;
    int min = 1;
    int range = max - min;
    int numGuess = 3;

    while (true) {
      System.out.println("");
      System.out.println("What would you like to do?");
      System.out.println("Start Game (Start)");
      System.out.println("Change Settings (Change)");
      System.out.println("End Program (End)");
      System.out.println("");
      userChoice = sc.nextLine();
      
      while (userChoice.equalsIgnoreCase("Start")) {
        int random = (int) Math.floor(Math.random()*range) + min;
        for (int i=0;i<numGuess;i++) {
          System.out.println("You have used " + i + "/" + numGuess + " of your guesses.");
          System.out.print("What is your guess? ");
  ;       guess = sc.nextInt();
          sc.nextLine();
          if (guess > random) {
            System.out.print("Your guess is higher than the number. ");
          }
  
          else if (guess < random) {
            System.out.print("Your guess is lower than the number. ");
          }
  
          else if (guess == random) {
            System.out.println("Congratulations you won! ");
            break;
          }  
        }

        System.out.println("");
        System.out.print("Do you want to play again (Y/N)? ");
        restart = sc.nextLine();
        if (restart.equalsIgnoreCase("Y")) {
          System.out.println("");
          continue;
        }

        else {
          break;
        }
      }
  
      while (userChoice.equalsIgnoreCase("Change")) {
        System.out.print("Maximum: ");
        max = sc.nextInt();
        sc.nextLine();
        System.out.print("Minimum: ");
        min = sc.nextInt();
        sc.nextLine();
        System.out.print("No. of Guesses: ");
        numGuess = sc.nextInt();
        sc.nextLine();
        break;
      }
  
      if (userChoice.equalsIgnoreCase("End")) {
        System.out.println("Successfully ended.");
        System.exit(0);
      }
    }
  }
}
