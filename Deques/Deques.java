import java.util.*;
public class Deques
{
public static void main(String[]args)
{
Deque<String>deque=new ArrayDeque<String>();
deque.add("A");
deque.add("B");
deque.add("C");
deque.add("D");
deque.add("E");
deque.add("F");
deque.add("G");
System.out.println("\nElements in queue:");
for(String str:deque)
{
System.out.print(str+" ");
}
deque.addFirst("Z");
System.out.println("\n\nQueue after inserting at first: ");
for(String str:deque)
{
System.out.print(str+" ");
}
deque.addFirst("W");
System.out.println("\n\nQueue after inserting at first: ");
for(String str:deque)
{
System.out.print(str+" ");
}
deque.remove();
System.out.println("\n\nQueue after deleting at first: ");
for(String str:deque)
{
System.out.print(str+" ");
}
deque.addLast("X");
System.out.println("\n\nQueue after inserting at last: ");
for(String str:deque)
{
System.out.print(str+" ");
}
deque.clear();
deque.add("K\n\n"); 
System.out.println("\n\nQueue  after clearing and inserting a new element: ");
for(String str:deque)
{
System.out.print(str+" ");
}
}
}
