package com.example.demo.adapters.driven

import com.example.demo.core.Pedido
import com.example.demo.core.ServicoPagamento

class PixPaymentAdapter : ServicoPagamento {
    override fun realizarCobranca(pedido: Pedido) {
        println("Cobrando via PIX")
        //implementação de cobrança via pix
    }


}

