package ru.vaziev.secondTask;

/**
 * Обработчик состояния A.
 */
class StateAHandler implements IStateHandler {

    ExternalInterface externalInterface;

    @Override
    public void handle(Context context) {
        externalInterface = new External();
        if (externalInterface.methodA().isSuccess()) {
            context.setStateHandler(new StateBHandler());
        }
    }

    @Override
    public String getStateName() {
        return State.STATE_A.getStateName();
    }

}
