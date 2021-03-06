package task_2;

public interface AbstractChairFactory
{
    VictorianChair createVictorianChair();
    MagicChair createMagicalChair();
    FunctionalChair createFunctionChair();
}