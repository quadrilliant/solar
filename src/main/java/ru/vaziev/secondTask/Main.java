package ru.vaziev.secondTask;

/**
 * Запуск.
 */
public class Main {

    public static void main(String[] args) {
        Context context = new Context();
        context.setStateHandler(new StateAHandler());
        context.handleContextState();
        System.out.println(context.getStateName());
        context.setStateHandler(new StateBHandler());
        context.handleContextState();
        System.out.println(context.getStateName());
        context.setStateHandler(new StateCHandler());
        context.handleContextState();
        System.out.println(context.getStateName());
    }

}
