package com.eoi.pattern.behavior.command;

/**
 * @author lemon
 */
public class ConcreteCommand implements Command {
    private Receiver receiver;

    ConcreteCommand() {
        this.receiver = new Receiver();
    }

    @Override
    public void execute() {
        receiver.action();
    }
}
