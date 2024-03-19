package ru.vaziev.secondTask;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * Состояния.
 */
@Getter
@AllArgsConstructor
enum State {

    STATE_A("stateA"),

    STATE_B("stateB"),

    STATE_C("stateC");

    private String stateName;

}
