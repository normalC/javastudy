package Singleton;

class MainWindow {
	   //create an object of MainWindow
	   private static MainWindow instance = new MainWindow();

	   //make the constructor private so that this class cannot be
	   //instantiated by other class
	   private MainWindow(){}

	   //Get the only object available
	   public static MainWindow getInstance(){
	      return instance;
	   }

	   public void showMessage(){
	      System.out.println("Hello World!");
	   }
	}
public class Main {
		   public static void main(String[] args) {
		      //Get the only object available
		      MainWindow object = MainWindow.getInstance();

		      //show the message
		      object.showMessage();
		   }
		}


