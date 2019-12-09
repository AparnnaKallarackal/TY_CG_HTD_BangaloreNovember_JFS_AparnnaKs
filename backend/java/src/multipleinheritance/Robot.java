package multipleinheritance;

public class Robot implements Movement,Sound{
public void move()
{
System.out.println("robot moving");
}
public void talk()
{
System.out.println("robot talking");
}
}
