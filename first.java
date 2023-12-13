class first
{
    int a =10,b =20;
    private int c = a+b;
    class inner
    {
        void out()
        {
            System.out.println("the addition of equation is :");
            System.out.print(c);   
        }
   
    }
    public static void main (String args[]) 
    {
        first obj1 = new first();
        first.inner x = obj1.new inner(); 
        x.out();
    }

}