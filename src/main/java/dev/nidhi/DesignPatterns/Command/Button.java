package dev.nidhi.DesignPatterns.Command;

import dev.nidhi.DesignPatterns.Command.Commands.Command;

public class Button {
    Command command;
    public Button(Command command){
        this.command = command;
    }

    public void click(){
        command.execute();
    }
}
