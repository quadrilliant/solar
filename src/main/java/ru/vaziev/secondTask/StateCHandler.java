package ru.vaziev.secondTask;

/**
 * Обработчик состояния C.
 */
class StateCHandler implements IStateHandler {

    ExternalInterface externalInterface;

    @Override
    public void handle(Context context) {
        externalInterface = new External();
        if (externalInterface.methodC().isSuccess()) {
            context.setStateHandler(new StateAHandler());
        }
    }

    @Override
    public String getStateName() {
        return State.STATE_C.getStateName();
    }

}
