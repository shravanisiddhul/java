interface A
{   
    void add();
}
interface B
{
    void sub();
}
interface E extends A,B
{
    void mod();
}
interface C
{
    void mul();
}
interface D
{
    void div();
}
interface F extends C,D
{
    void display();
}
class G implements E,F
{

    @Override
    public void display() {
        // TODO Auto-generated method stub
        System.out.println("Display class");
    }

    @Override
    public void mod() {
        // TODO Auto-generated method stub
        System.out.println("Mod Class");
    }

    @Override
    public void add() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Add Class");
    }

    @Override
    public void sub() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Sub class");
    }

    @Override
    public void mul() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Mul Class");
    }

    @Override
    public void div() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Div Class");
    }
    
}
    public class MulipleInheritanceUsingInterfaces {
    
        G obj = new G();
        obj.display();
        obj.mod();
        obj.div();
        obj.mul();
        obj.sub();
        obj.add();
        
}
