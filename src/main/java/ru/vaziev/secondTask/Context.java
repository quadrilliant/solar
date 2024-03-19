package ru.vaziev.secondTask;

import lombok.Getter;
import lombok.Setter;

/**
 * Контекст приложения.
 */
@Getter
@Setter
class Context {

    private IStateHandler stateHandler;

    String getStateName() {
        return stateHandler.getStateName();
    }

    void handleContextState() {
        stateHandler.handle(this);
    }

}
