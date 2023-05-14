class Shape
{
    void rec()
    {
        System.out.println("this is rectangular shape");
    }
    void circle()
    {
        System.out.println("this is circle shape");
    }

}

class Rectangle1 extends Shape{
  void Rec1()
  {
    super.rec();
  }
 
}
class circle extends Shape

{
    void cir1()
    {
      super.circle();
    }

}

public class Inherishape {
    public static void main(String args[])
    {
        
        Rectangle1 r=new Rectangle1();
        r.Rec1();
        circle c=new circle();
        c.cir1();
       
    }
}
