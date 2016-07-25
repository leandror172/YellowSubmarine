package com.leandro.submarine.submarine.impl;

import com.leandro.submarine.submarine.interfaces.Direction;

public class NorthDirection implements Direction {

    private static final String value = "NORTE";

    @Override
    public String getValue() {
	return value;
    }

}
