class Calci{
    int add (int a, int b){
        return a+b;
    }
    double add(double a, double b){
        return a+b;
    }
public static void main(String [] args){
    Calci c=new Calci();
    System.out.println(c.add(10,20));             //30
    System.out.println(c.add(10.5,20.5));        //31.0
}
}
