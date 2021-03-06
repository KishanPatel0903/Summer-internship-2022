/*Java program to show multiple
 type parameters in Java Generics */
  
class Test<T, U>
{
    T obj1;  // An object of type T
    U obj2;  
  
    // constructor
    Test(T obj1, U obj2)
    {
        this.obj1 = obj1;
        this.obj2 = obj2;
    }
  
    // To print objects of T and U
    public void print()
    {
        System.out.println(obj1);
        System.out.println(obj2);
    }
}
  
class Main
{
    public static void main (String[] args)
    {
        Test <String, Integer> obj = new Test<String, Integer>("JavaGeneric4", 33);
        obj.print();
    }
}