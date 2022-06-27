public class Principal {

    public static void main(String[] args) {
        //Apenas para tirar do contexto estatico.
        Principal principal = new Principal();
        principal.execute();
    }

    public void execute() {
        Retangulo a = new Retangulo(3,5,11,11);
        Retangulo b = new Retangulo(7,2,13,7);
        Retangulo c = new Retangulo(11,11,15,13);
        System.out.println("Retangulos Existentes:");
        System.out.println("Retangulo A(3,5; 11,11)");
        System.out.println("Retangulo B(7,2; 13,7)");
        System.out.println("Retangulo C(11,11; 15,13)");
        System.out.println();
        System.out.println("Area de intersects entre A e B é de: " + calculandoArea(a,b));
        System.out.println("Area de intersects entre A e C é de: " + calculandoArea(a,c));

    }

    public int calculandoArea(Retangulo x, Retangulo y){
        boolean resultado = false;
        int contador = 0;

        for(int i = 0; i < 16; i++){
            for (int j = 0; j < 14; j++){
                if((x.getArea()[i][j].equals(Boolean.TRUE)) && (y.getArea()[i][j].equals(Boolean.TRUE))){
                    resultado = true;
                    contador++;
                }
            }
        }

        return contador;
    }

}