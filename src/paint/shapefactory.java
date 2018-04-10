
package paint;

/**
 *
 * @author Mostafa
 */
public  class shapefactory extends abstractfactory{
    private static shapefactory sf;

    public shapefactory() {
    }
     public static shapefactory getInstance() {
        if (sf == null) {
            sf = new shapefactory();
        }
        return sf;
    }


    
    public Shapes getshape(String shapetype)
    {
        if(shapetype==null){
            return null;}
        if(shapetype.equalsIgnoreCase("oval"))
        {
            return new Oval();
            
        }
        else if(shapetype.equalsIgnoreCase("Rect"))
        {
            return new Rect();
           }
         else if(shapetype.equalsIgnoreCase("triangle"))
        {
            return new Triangle();
            
           }
         else if(shapetype.equalsIgnoreCase("line"))
        {
            return new Line();
            
           } else if(shapetype.equalsIgnoreCase("circle"))
        {
            return new circle();
            
           }
        else if(shapetype.equalsIgnoreCase("Square"))
        {
            return new Square();
            
           }
        return null;
}
}
