public class Combo
{
    burguer burguer;
    sobremesa sobremesa;
    bebida bebida;
        public void CriarCombo(int tipo)
        {
            switch(tipo){
                case 1:
                {
                    burguer = new burguer(150,"hamburguer de carne de vaca",10.20);
                    sobremesa = new sobremesa(150,"ovo doce azul",88.20);
                    bebida = new bebida(150,"pinga pura",40.20);
                }
                case 2:
                {
                    burguer = new burguer(150,"hamburguer de carne de galinha",10.20);
                    sobremesa = new sobremesa(150,"ovo doce amarelo",88.20);
                    bebida = new bebida(150,"pinga nao pura",40.20);

                }
            }
        }
       public void Mostrar_Combo(){
           System.out.println(burguer.getInfo());
           System.out.println(bebida.getInfo());
           System.out.println(sobremesa.getInfo());
       }
}

