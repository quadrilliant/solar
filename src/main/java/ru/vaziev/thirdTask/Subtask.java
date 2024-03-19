package ru.vaziev.thirdTask;

import lombok.RequiredArgsConstructor;

/**
 * Пример реализации подзадачи.
 */
@RequiredArgsConstructor
class Subtask implements ISubtask {

    private final long executionTime;

    private volatile boolean isPaused;

    @Override
    public void start() {
        if (!isPaused) {
            try {
                Thread.sleep(executionTime);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            } finally {
                stop();
            }
        }
    }

    @Override
    public void pause() {
        isPaused = true;
    }

    @Override
    public void stop() {
        System.out.println("Подзадача выполнена");
    }

}
