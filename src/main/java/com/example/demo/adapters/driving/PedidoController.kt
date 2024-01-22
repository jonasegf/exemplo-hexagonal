package com.example.demo.adapters.driving

import com.example.demo.adapters.driven.CartaoPaymentAdapter
import com.example.demo.adapters.driven.PixPaymentAdapter
import com.example.demo.core.Pedido
import com.example.demo.core.ServicoPagamento

class PedidoController {
    fun receberEProcessarPedido(pedido: Pedido, formaDePagamento: String) {
        println("Recebendo pedido e forma de pagamento: $pedido - $formaDePagamento")

        val servicoPagamento: ServicoPagamento = when (formaDePagamento) {
            "cartão" -> CartaoPaymentAdapter()
            "pix" -> PixPaymentAdapter()
            else -> throw Exception("Forma de pagamento não encontrada")
        }
        servicoPagamento.realizarCobranca(pedido)
    }
}

