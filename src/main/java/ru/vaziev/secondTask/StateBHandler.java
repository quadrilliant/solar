package ru.vaziev.secondTask;

/**
 * Обработчик состояния B.
 */
class StateBHandler implements IStateHandler {

    ExternalInterface externalInterface;

    @Override
    public void handle(Context context) {
        externalInterface = new External();
        if (externalInterface.methodB().isSuccess()) {
            context.setStateHandler(new StateCHandler());
        }
    }

    @Override
    public String getStateName() {
        return State.STATE_B.getStateName();
    }

}
