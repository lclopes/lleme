
package uff.ic.lleme.tcc00328.trabalhos.s20192.Trabalho_PedroBazilio_VictorBrandao_Felipeesser.visor;

import java.util.ArrayList;
public class Estoque  {
    private ArrayList<Produto> produtos = new ArrayList<Produto>();
    public void setproduto(Produto p1){
    this.produtos.add(p1);
    }
    public Produto getproduto(int i){
    return this.produtos.get(i);
    }
    public int contagem(){
        return this.produtos.size();
    }
   }
