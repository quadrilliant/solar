package ru.vaziev.secondTask;

/**
 * Интерфейс обработки состояний.
 */
interface IStateHandler {

    void handle(Context context);

    String getStateName();

}
