package ru.vaziev.thirdTask;

import java.util.Queue;

/**
 * Пример реализации задачи.
 */
class Task implements ITask {

    private Queue<ISubtask> subtasks;

    private volatile boolean isPaused;

    public Task(Queue<ISubtask> subtasks) {
        this.subtasks = subtasks;
        this.isPaused = false;
    }

    @Override
    public void start() {
        while (!subtasks.isEmpty()) {
            var subtask = subtasks.poll();
            subtask.start();
        }
    }

    @Override
    public void pause() {
        isPaused = true;
    }

    @Override
    public void stop() {
        if (subtasks.isEmpty()) {
            System.out.println("Задача выполнена");
        }
    }
}
