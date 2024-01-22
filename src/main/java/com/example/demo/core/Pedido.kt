package com.example.demo.core

//NUCLEO
data class Pedido(val id: Long, val detalhes: String)

//PORT
interface ServicoPagamento{
    fun realizarCobranca(pedido: Pedido)
}
