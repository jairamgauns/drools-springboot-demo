package com.example.demopep.enums;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonValue;

@JsonFormat(shape = JsonFormat.Shape.OBJECT)
public enum State {
    /*CREATE,
    PROCESSING,
    COMPLETED;*/

    CREATE("create"),
    PROCESSING("processing"),
    COMPLETED("completed"),
    REJECTED("rejected");

    private final String state;

    //default constructor
    State(String state) {
        this.state = state;
    }

    @JsonCreator
    public static State forState(String state) {
        return State.valueOf(state.toUpperCase());
    }

    @JsonValue
    public String getState() {
        return state;
    }
}
