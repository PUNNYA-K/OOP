import java.util.Scanner;
class Cpu{
int price=30000;
      class Processor{
      int noofcores=4;
      String manufacturer="Intel corp";
      void display()
      {
      System.out.println("no of cores="+noofcores);
      System.out.println("manufacturer="+manufacturer);
      }
      }
void display()
{
Processor p=new Processor();
p.display();
{
System.out.println("Price="+price);
}
}
static class Ram
{
int memory=8;
String manufacturer="Intel";
void display()
{
System.out.println("memory="+memory);
System.out.println("manufacturer="+manufacturer);
}
}
}
class Cpus
{
public static void main(String[] args) 
{
Cpu c1=new Cpu();
c1.display();
Cpu.Ram r1=new Cpu.Ram();
r1.display();
}
}     
