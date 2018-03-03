/*
 * jacinth valera
 * Hack Ridge 2018
 * Found it questions
 */
import java.util.Scanner; 

public class FoundIt{
  public static void main(String [] args)
  {
  
    Scanner scan =new Scanner(System.in);
    
    String name="";
    int lostItem=0;
    int location=0;
    
    System.out.println("What is your name?");
    name=scan.nextLine();
    
    System.out.println("Welcome "+name+ "!");
    
    //Start of Finding
    System.out.println("What have you lost?");

    System.out.println("1.)Common Items");
    System.out.println("2.)Significant Items");
    System.out.println("3.)QUIT");
    
    lostItem=scan.nextInt();
   
    if(lostItem==1)
    {
       
    System.out.println("Where are you?");
    System.out.println("1.Home \n 2.School \n 3.Work \n 4.Public Place");
    location=scan.nextInt();
    
      if(location==1)
      {
        System.out.println("Searched the couch");
        System.out.println("Have you seen it?");
        String answer1=scan.nextLine();
        
        if(answer1=="yes")
        {
          System.out.println("Congrats!");
          System.exit(0);
        }
        else
        {
          System.out.println("Look at your pockets or what you wore yesterday");
          System.out.println("Have you seen it?");
          String answer2=scan.nextLine();
          
          if(answer2=="yes")
          {
            System.out.println("Congrats!");
            System.exit(0);
          }
          else
          {
             System.out.println("Look at the Kitchen!");
          System.out.println("Have you seen it?");
          answer2=scan.nextLine();
          
          if(answer2=="yes")
          {
            System.out.println("Congrats!");
            System.exit(0);
          }
          else
          {
            System.out.println("Look at your Bed");
          System.out.println("Have you seen it?");
          answer2=scan.nextLine();
          
          if(answer2=="yes")
          {
            System.out.println("Congrats!");
            System.exit(0);
          }
          else
          {
            System.out.println("Look Drawer/Cabinet");
          System.out.println("Have you seen it?");
          answer2=scan.nextLine();
          
          if(answer2=="yes")
          {
            System.out.println("Congrats!");
            System.exit(0);
          }
          else
          {System.out.println("Look in your Car");
          System.out.println("Have you seen it?");
          answer2=scan.nextLine();
          
          if(answer2=="yes")
          {
            System.out.println("Congrats!");
            System.exit(0);
          }
          else
          {
            System.out.println("Look at your bag");
          System.out.println("Have you seen it?");
          answer2=scan.nextLine();
          
          if(answer2=="yes")
          {
            System.out.println("Congrats!");
            System.exit(0);
          }
          else
          {
            System.out.println("Look at table?");
          System.out.println("Have you seen it?");
          answer2=scan.nextLine();
          
          if(answer2=="yes")
          {
            System.out.println("Congrats!");
            System.exit(0);
          }
          else
          {
            System.out.println("RAN OUT OF IDEAS!");
          }
          }
          }
          }
          }
          }
          }
        }
        }
      else if(location==2)
      {
        System.out.println("Look at BackPack");
          System.out.println("Have you seen it?");
          String answer2=scan.nextLine();
          
          if(answer2=="yes")
          {
            System.out.println("Congrats!");
            System.exit(0);
          }
          else
          {
          System.out.println("Look at your locoker");
          System.out.println("Have you seen it?");
          answer2=scan.nextLine();
          
          if(answer2=="yes")
          {
            System.out.println("Congrats!");
            System.exit(0);
          }
          else
          {
          System.out.println("Look at your previous or current class");
          System.out.println("Have you seen it?");
          answer2=scan.nextLine();
          
          if(answer2=="yes")
          {
            System.out.println("Congrats!");
            System.exit(0);
          }
          else
          {
          System.out.println("Did you ask the teacher?");
          System.out.println("Have you seen it?");
          answer2=scan.nextLine();
          
          if(answer2=="yes")
          {
            System.out.println("Congrats!");
            System.exit(0);
          }
          else
          {
            System.out.println("did you ask your classmates");
          System.out.println("Have you seen it?");
          answer2=scan.nextLine();
          
          if(answer2=="yes")
          {
            System.out.println("Congrats!");
            System.exit(0);
          }
          else
          {
            System.out.println("Go tell the lost and found... You are screwed!");
          }
          }
          }
          }
          }
      }
      else if(location==3)
      {
        System.out.println("Look at your desk");
          System.out.println("Have you seen it?");
          String answer2=scan.nextLine();
          
          if(answer2=="yes")
          {
            System.out.println("Congrats!");
            System.exit(0);
          }
          else
          {
            System.out.println("Search your Clothes ");
          System.out.println("Have you seen it?");
          answer2=scan.nextLine();
          
          if(answer2=="yes")
          {
            System.out.println("Congrats!");
            System.exit(0);
          }
          else
          {
            System.out.println("Ask your coWorker");
          System.out.println("Have you seen it?");
          answer2=scan.nextLine();
          
          if(answer2=="yes")
          {
            System.out.println("Congrats!");
            System.exit(0);
          }
          else
          {
            System.out.println("Look at the cafeteria (if you have one)");
          System.out.println("Have you seen it?");
          answer2=scan.nextLine();
          
          if(answer2=="yes")
          {
            System.out.println("Congrats!");
            System.exit(0);
          }
          else
            System.out.println("Sorry you are screwed!");
          }
          }
          }
      }
    }
    else if(lostItem==2)
      
    {
     
      System.out.println("Here are some dating sites!");
      System.out.println("www.Match.com");
      System.out.println("TINDER");
      System.out.println("farmersonly.com");
    }
  }
}
     
  


   
            
      
            
            
                         
    
  
    
