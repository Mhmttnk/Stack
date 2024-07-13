//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args)
    {
        Stack stack=new Stack(5);

        stack.Push(27);
        stack.Push(54);
        stack.Push(81);
        stack.Push(108);
        stack.Push(135);

        stack.Pop();
        stack.Pop();
        stack.TopGoster();

        stack.Print();

    }
}