class Shapes{
//Area of square
int area(int l){
return l*l;
}

//Area of rectangle
int area(int l,int b){
return l*b;
}

//Area of cuboid
int area(int l,int b,int h){
return((2*l*b)+(2*l*h)+(2*b*h));
}
public static void main(String[] args)
{
Shapes s = new Shapes();
System.out.println("Area of square=" + s.area(8));
System.out.println("Area of rectangle=" + s.area(5,4));
System.out.println("Area of cuboid=" + s.area(5,4,2));
}
}
