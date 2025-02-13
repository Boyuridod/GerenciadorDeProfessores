package br.com.yuriduarte.gerenciadordeprofessores

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import br.com.yuriduarte.gerenciadordeprofessores.ui.theme.GerenciadorDeProfessoresTheme

class TelaInicial : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //enableEdgeToEdge()
        setContent {
            GerenciadorDeProfessoresTheme {
                PrimeiraTela()
            }
        }
    }

    @Composable
    fun PrimeiraTela(){

        Column (
            Modifier.fillMaxWidth().fillMaxHeight(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.SpaceEvenly
        ){
            Button(
                onClick = (
                    {
                        //TODO
                    }
                ),
                Modifier.height(100.dp),
                shape = RoundedCornerShape(8.dp),
            ) {
                Text("Gerenciador de Matérias")
            }

            Button(
                onClick = (
                    {
                        //TODO
                    }
                ),
                Modifier.height(100.dp),
                shape = RoundedCornerShape(8.dp)
            ) {
                Text("Gerenciador de Professores")
            }
        }
    }

    @Composable
    @Preview
    fun PreviewPrimeiraTela(){

        PrimeiraTela()

    }
}