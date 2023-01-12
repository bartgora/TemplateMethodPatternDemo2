package com.github.bartgora;


import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class GameCharacterTest {

    @Test
    void shouldDisplayGandalf(){
        //given
        GameCharacter characterTemplate = new WizardCharacter();
        //then
        var rendered = characterTemplate.render();
        assertThat(rendered).isEqualTo("My name is Gandalf I have a Stick And I can Fly");
    }
}