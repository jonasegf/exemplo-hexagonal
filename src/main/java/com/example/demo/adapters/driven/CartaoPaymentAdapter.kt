package com.example.demo.adapters.driven

import com.example.demo.core.Pedido
import com.example.demo.core.ServicoPagamento

class CartaoPaymentAdapter: ServicoPagamento {
    override fun realizarCobranca(pedido: Pedido) {
        println("Cobrando via Cartão")
        //implementação de cobrança via cartão
    }
}


