

class Rectangle

  {

    int length;

    int breadth;

    public void calculateArea(int l,int b)

    {

      length=l;

      breadth=b;

      System.out.println("the area is "+(length*breadth));

    }


    public static void main(String args[])

    {

      //anonymou object 

      new Rectangle().calculateArea(23,4);


    }

  }
