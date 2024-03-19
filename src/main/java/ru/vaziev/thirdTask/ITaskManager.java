package ru.vaziev.thirdTask;

/**
 * Интерфейс для управления задачами.
 */
interface ITaskManager {

    void startTask(long taskId);

    void pauseTask(long taskId);

    void stopTask(long taskId);

}
