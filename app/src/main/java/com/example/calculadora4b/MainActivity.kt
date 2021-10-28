package com.example.calculadora4b

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener {

    var flag : Boolean = false
    var dot : Boolean = false
    var tmp : Double = 0.0
    var res : Double = 0.0
    var op : Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnAC.setOnClickListener(this)
        btnSigno.setOnClickListener(this)
        btnPorcentaje.setOnClickListener(this)
        btnDivision.setOnClickListener(this)
        btnMultiplicacion.setOnClickListener(this)
        btnSuma.setOnClickListener(this)
        btnResta.setOnClickListener(this)
        btnPunto.setOnClickListener(this)
        btnIgual.setOnClickListener(this)
        btn0.setOnClickListener(this)
        btn1.setOnClickListener(this)
        btn2.setOnClickListener(this)
        btn3.setOnClickListener(this)
        btn4.setOnClickListener(this)
        btn5.setOnClickListener(this)
        btn6.setOnClickListener(this)
        btn7.setOnClickListener(this)
        btn8.setOnClickListener(this)
        btn9.setOnClickListener(this)
    }

    override fun onClick(p0 : View?){
        when(p0?.id){
            R.id.btn0 -> {
                if(txtResultado.text == "0"){
                    txtResultado.text = "0"
                }else if(op != 0){
                    if(flag){
                        dot = false
                        txtResultado.text = "0"
                        flag = false
                    }else if(!flag){
                        txtResultado.text = txtResultado.text.toString() + "0"
                    }
                }else{
                    txtResultado.text = txtResultado.text.toString() + "0"
                }
            }
            R.id.btn1 -> {
                if(txtResultado.text == "0"){
                    txtResultado.text = "1"
                }else if(op != 0){
                    if(flag){
                        dot = false
                        txtResultado.text = "1"
                        flag = false
                    }else if(!flag){
                        txtResultado.text = txtResultado.text.toString() + "1"
                    }
                }else{
                    txtResultado.text = txtResultado.text.toString() + "1"
                }
            }
            R.id.btn2 -> {
                if(txtResultado.text == "0"){
                    txtResultado.text = "2"
                }else if(op != 0){
                    if(flag){
                        dot = false
                        txtResultado.text = "2"
                        flag = false
                    }else if(!flag){
                        txtResultado.text = txtResultado.text.toString() + "2"
                    }
                }else{
                    txtResultado.text = txtResultado.text.toString() + "2"
                }
            }
            R.id.btn3 -> {
                if(txtResultado.text == "0"){
                    txtResultado.text = "3"
                }else if(op != 0){
                    if(flag){
                        dot = false
                        txtResultado.text = "3"
                        flag = false
                    }else if(!flag){
                        txtResultado.text = txtResultado.text.toString() + "3"
                    }
                }else{
                    txtResultado.text = txtResultado.text.toString() + "3"
                }
            }
            R.id.btn4 -> {
                if(txtResultado.text == "0"){
                    txtResultado.text = "4"
                }else if(op != 0){
                    if(flag){
                        dot = false
                        txtResultado.text = "4"
                        flag = false
                    }else if(!flag){
                        txtResultado.text = txtResultado.text.toString() + "4"
                    }
                }else{
                    txtResultado.text = txtResultado.text.toString() + "4"
                }
            }
            R.id.btn5 -> {
                if(txtResultado.text == "0"){
                    txtResultado.text = "5"
                }else if(op != 0){
                    if(flag){
                        dot = false
                        txtResultado.text = "5"
                        flag = false
                    }else if(!flag){
                        txtResultado.text = txtResultado.text.toString() + "5"
                    }
                }else{
                    txtResultado.text = txtResultado.text.toString() + "5"
                }
            }
            R.id.btn6 -> {
                if(txtResultado.text == "0"){
                    txtResultado.text = "6"
                }else if(op != 0){
                    if(flag){
                        dot = false
                        txtResultado.text = "6"
                        flag = false
                    }else if(!flag){
                        txtResultado.text = txtResultado.text.toString() + "6"
                    }
                }else{
                    txtResultado.text = txtResultado.text.toString() + "6"
                }
            }
            R.id.btn7 -> {
                if(txtResultado.text == "0"){
                    txtResultado.text = "7"
                }else if(op != 0){
                    if(flag){
                        dot = false
                        txtResultado.text = "7"
                        flag = false
                    }else if(!flag){
                        txtResultado.text = txtResultado.text.toString() + "7"
                    }
                }else{
                    txtResultado.text = txtResultado.text.toString() + "7"
                }
            }
            R.id.btn8 -> {
                if(txtResultado.text == "0"){
                    txtResultado.text = "8"
                }else if(op != 0){
                    if(flag){
                        dot = false
                        txtResultado.text = "8"
                        flag = false
                    }else if(!flag){
                        txtResultado.text = txtResultado.text.toString() + "8"
                    }
                }else{
                    txtResultado.text = txtResultado.text.toString() + "8"
                }
            }
            R.id.btn9 -> {
                if(txtResultado.text == "0"){
                    txtResultado.text = "9"
                }else if(op != 0){
                    if(flag){
                        dot = false
                        txtResultado.text = "9"
                        flag = false
                    }else if(!flag){
                        txtResultado.text = txtResultado.text.toString() + "9"
                    }
                }else{
                    txtResultado.text = txtResultado.text.toString() + "9"
                }
            }

            R.id.btnAC -> {
                txtResultado.text = "0"
                tmp = 0.0
                op = 0
                res = 0.0
                dot = false
            }

            R.id.btnPorcentaje -> {
                if(tmp == 0.0){
                    txtResultado.text = (txtResultado.text.toString().toDouble() / 100).toString()
                }else{
                    txtResultado.text = ((txtResultado.text.toString().toDouble() / 100) * tmp).toString()
                }
            }

            R.id.btnSigno -> {
                if(txtResultado.text != "0"){
                    txtResultado.text = (txtResultado.text.toString().toDouble() * -1).toString()
                }
            }

            R.id.btnPunto -> {
                if(txtResultado.text != "0" && !dot){
                    txtResultado.text = txtResultado.text.toString() + "."
                    dot = true
                }else if(op != 0){
                    txtResultado.text = txtResultado.text.toString() + "."
                    dot = true
                }
            }

            R.id.btnIgual -> {
                dot = false
                when(op){
                    0 -> {
                        txtResultado.text = txtResultado.text.toString()
                    }
                    1 -> {
                        res = tmp + txtResultado.text.toString().toDouble()
                        txtResultado.text = res.toString()
                        tmp = 0.0
                        op = 0
                        res = 0.0
                    }
                    2 -> {
                        res = tmp - txtResultado.text.toString().toDouble()
                        txtResultado.text = res.toString()
                        tmp = 0.0
                        op = 0
                        res = 0.0
                    }
                    3 -> {
                        res = tmp * txtResultado.text.toString().toDouble()
                        txtResultado.text = res.toString()
                        tmp = 0.0
                        op = 0
                        res = 0.0
                    }
                    4 -> {
                        res = tmp / txtResultado.text.toString().toDouble()
                        txtResultado.text = res.toString()
                        tmp = 0.0
                        op = 0
                        res = 0.0
                    }
                }
            }

            R.id.btnSuma -> {
                flag = true
                if(op == 0){
                    tmp = txtResultado.text.toString().toDouble()
                    op = 1
                }else{
                    when(op){
                        1 -> {
                            tmp += txtResultado.text.toString().toDouble()
                            txtResultado.text = tmp.toString()
                            op = 1
                        }
                        2 -> {
                            tmp -= txtResultado.text.toString().toDouble()
                            txtResultado.text = tmp.toString()
                            op = 1
                        }
                        3 -> {
                            tmp *= txtResultado.text.toString().toDouble()
                            txtResultado.text = tmp.toString()
                            op = 1
                        }
                        4 -> {
                            tmp /= txtResultado.text.toString().toDouble()
                            txtResultado.text = tmp.toString()
                            op = 1
                        }
                    }
                }
            }
            R.id.btnResta -> {
                flag = true
                if(op == 0){
                    tmp = txtResultado.text.toString().toDouble()
                    op = 2
                }else{
                    when(op){
                        1 -> {
                            tmp += txtResultado.text.toString().toDouble()
                            txtResultado.text = tmp.toString()
                            op = 2
                        }
                        2 -> {
                            tmp -= txtResultado.text.toString().toDouble()
                            txtResultado.text = tmp.toString()
                            op = 2
                        }
                        3 -> {
                            tmp *= txtResultado.text.toString().toDouble()
                            txtResultado.text = tmp.toString()
                            op = 2
                        }
                        4 -> {
                            tmp /= txtResultado.text.toString().toDouble()
                            txtResultado.text = tmp.toString()
                            op = 2
                        }
                    }
                }
            }
            R.id.btnMultiplicacion -> {
                flag = true
                if(op == 0){
                    tmp = txtResultado.text.toString().toDouble()
                    op = 3
                }else{
                    when(op){
                        1 -> {
                            tmp += txtResultado.text.toString().toDouble()
                            txtResultado.text = tmp.toString()
                            op = 3
                        }
                        2 -> {
                            tmp -= txtResultado.text.toString().toDouble()
                            txtResultado.text = tmp.toString()
                            op = 3
                        }
                        3 -> {
                            tmp *= txtResultado.text.toString().toDouble()
                            txtResultado.text = tmp.toString()
                            op = 3
                        }
                        4 -> {
                            tmp /= txtResultado.text.toString().toDouble()
                            txtResultado.text = tmp.toString()
                            op = 3
                        }
                    }
                }
            }
            R.id.btnDivision -> {
                flag = true
                if(op == 0){
                    tmp = txtResultado.text.toString().toDouble()
                    op = 4
                }else{
                    when(op){
                        1 -> {
                            tmp += txtResultado.text.toString().toDouble()
                            txtResultado.text = tmp.toString()
                            op = 4
                        }
                        2 -> {
                            tmp -= txtResultado.text.toString().toDouble()
                            txtResultado.text = tmp.toString()
                            op = 4
                        }
                        3 -> {
                            tmp *= txtResultado.text.toString().toDouble()
                            txtResultado.text = tmp.toString()
                            op = 4
                        }
                        4 -> {
                            tmp /= txtResultado.text.toString().toDouble()
                            txtResultado.text = tmp.toString()
                            op = 4
                        }
                    }
                }
            }
        }
    }
}