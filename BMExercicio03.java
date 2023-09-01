import java.text.DecimalFormat;

public class BMExercicio03 {
    static final float taxa = 0.0825f;
    public static void main(String...args){
      float bolacha = 2.95f;
      float biscoito = 3.50f;
      float vt = bolacha + biscoito;
      float taxaCalculada = vt * taxa;
      float novoCusto = bolacha + taxaCalculada + biscoito + taxaCalculada;
      boolean muitoCaro = novoCusto > 10;
      
      System.out.println("A bolacha custa R$" + bolacha + " e o biscoito custa R$" + biscoito);
      System.out.println("O valor total é R$" + vt);
      System.out.println("O valor da taxa é R$" + new DecimalFormat("0.00").format(taxaCalculada));
      System.out.println("Muito caro: " + muitoCaro);

    }
  
}
