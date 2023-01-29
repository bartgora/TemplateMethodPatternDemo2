package com.github.bartgora

abstract class GameCharacter {

    fun render(): String {
        return sayHello() + " I have a " + weapon + " And I can " + ability
    }

    fun sayHello(): String {
        return "My name is $name"
    }

    protected abstract val name: String
    protected abstract val weapon: String
    protected abstract val ability: String
}
