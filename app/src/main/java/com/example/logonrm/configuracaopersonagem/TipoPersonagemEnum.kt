package com.example.logonrm.configuracaopersonagem

import java.util.*

/**
 * Created by logonrm on 16/03/2018.
 */


enum class TipoPersonagemEnum constructor(val id: Int) {

    MAGO(0),
    MUSICO(1),
    PINTOR(2),
    POETA(3),
    BAILARINO(4);


    companion object {
        fun from(findValue: Int): TipoPersonagemEnum=
                TipoPersonagemEnum.values().first { it.id == findValue }
    }


}