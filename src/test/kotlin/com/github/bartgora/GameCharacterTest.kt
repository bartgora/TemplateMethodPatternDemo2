package com.github.bartgora

import io.kotest.matchers.shouldBe
import org.junit.jupiter.api.Test

class GameCharacterTest {

    @Test
    fun shouldDisplayGandalf() {
        //given
        val characterTemplate: GameCharacter = WizardCharacter()
        //then
        val rendered = characterTemplate.render()
        rendered shouldBe "My name is Gandalf I have a Stick And I can Fly"
    }
}