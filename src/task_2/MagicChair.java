package task_2;

public class MagicChair implements Chair
{
    public void doMagic()
    {
        System.out.println("MagiC");
    }

    @Override
    public String toString()
    {
        return "MagicChair";
    }

    @Override
    public void sit()
    {
        System.out.println("Можно и присесть");
        doMagic();
    }
}