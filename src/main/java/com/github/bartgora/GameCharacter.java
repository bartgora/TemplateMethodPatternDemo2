package com.github.bartgora;

public abstract class GameCharacter {

    public String render() {
        return sayHello() + " I have a " + getWeapon() + " And I can " + getAbility();
    }

    public String sayHello() {
        return "My name is " + getName();
    }

    protected abstract String getName();

    protected abstract String getWeapon();

    protected abstract String getAbility();
}
