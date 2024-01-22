package com.example.demo

import com.example.demo.adapters.driving.PedidoController
import com.example.demo.core.Pedido

fun main() {
    val controller = PedidoController()
    val pedido = Pedido(1, "Exemplo")

    controller.receberEProcessarPedido(pedido, "pix")
    controller.receberEProcessarPedido(pedido, "cartão")
}


