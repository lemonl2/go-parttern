package com.eoi.pattern.behavior.mediator;

/**
 * @author lemon
 */
public abstract class Mediator {
   public abstract void register(Colleague colleague);
   public abstract void relay(Colleague colleague);
}
