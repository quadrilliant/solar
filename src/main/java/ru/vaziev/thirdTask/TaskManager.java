package ru.vaziev.thirdTask;

import java.util.HashMap;
import java.util.Map;

/**
 * Класс, реализующий управление задачами.
 */
class TaskManager implements ITaskManager {

    private Map<Long, ITask> tasks = new HashMap<>();

    @Override
    public void startTask(long taskId) {
        ITask task = tasks.get(taskId);
        if (task != null) {
            task.start();
        }
    }

    @Override
    public void pauseTask(long taskId) {
        ITask task = tasks.get(taskId);
        if (task != null) {
            task.pause();
        }
    }

    @Override
    public void stopTask(long taskId) {
        ITask task = tasks.get(taskId);
        if (task != null) {
            task.stop();
        }
    }

}
