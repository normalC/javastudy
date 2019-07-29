package Singleton;

class ShapeFactory extends AbstractFactory {
	  
	   @Override
	   public Shape getShape(String shapeType){
	      if(shapeType == null){
	         return null;
	      }    
	      if(shapeType.equalsIgnoreCase("CIRCLE")){
	         return new Circle();
	      } else if(shapeType.equalsIgnoreCase("RECTANGLE")){
	         return new Rectangle();
	      } else if(shapeType.equalsIgnoreCase("SQUARE")){
	         return new Square();
	      }
	      return null;
	   }
	   
	   @Override
	   Printer getPrinter(String type) {
	      return null;
	   }
	}
	class PrinterFactory extends AbstractFactory {
	  
	   @Override
	   public Shape getShape(String shapeType){
	      return null;
	   }
	   
	   @Override
	   Printer getPrinter(String type) {
	   if(type == null){
	      return null;
	    }    
	  if(type.equalsIgnoreCase("paper")){
	      return new PaperPrinter();
	  } else if(type.equalsIgnoreCase("web")){
	      return new WebPrinter();
	  } else if(type.equalsIgnoreCase("Screen")){
	      return new ScreenPrinter();
	  }
	  return null;
	 }
	}
	
	class FactoryProducer {
		   public static AbstractFactory getFactory(String choice){
		      if(choice.equalsIgnoreCase("SHAPE")){
		         return new ShapeFactory();
		      } else if(choice.equalsIgnoreCase("Printer")){
		         return new PrinterFactory();
		      }
		      return null;
		   }
		}
