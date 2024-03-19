package ru.vaziev.secondTask;

/**
 * Реализация внешнего интерфейса.
 */
class External implements ExternalInterface {

    @Override
    public Result methodA() {
        return new Result(true);
    }

    @Override
    public Result methodB() {
        return new Result(false);
    }

    @Override
    public Result methodC() {
        return new Result(true);
    }

}
