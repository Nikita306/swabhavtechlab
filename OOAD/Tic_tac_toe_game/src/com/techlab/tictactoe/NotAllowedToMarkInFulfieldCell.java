package com.techlab.tictactoe;

public class NotAllowedToMarkInFulfieldCell extends RuntimeException {

@Override
public String getMessage() {
	return String.format("Not allowed to mark in fulfield cell");
}
}
