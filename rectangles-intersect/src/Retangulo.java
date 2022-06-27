public class Retangulo {

    private Integer verticeX1;
    private Integer verticeX2;
    private Integer verticeY1;
    private Integer verticeY2;
    private Boolean[][] area = new Boolean[16][14];

    public Retangulo(Integer verticeX1, Integer verticeY1,Integer verticeX2, Integer verticeY2) {
        inicializandoMatriz();
        this.verticeX1 = verticeX1;
        this.verticeX2 = verticeX2;
        this.verticeY1 = verticeY1;
        this.verticeY2 = verticeY2;
        preenchendoArea();
    }

    public Integer getVerticeX1() {
        return verticeX1;
    }

    public Integer getVerticeX2() {
        return verticeX2;
    }

    public Integer getVerticeY1() {
        return verticeY1;
    }

    public Integer getVerticeY2() {
        return verticeY2;
    }

    public Boolean[][] getArea() {
        return area;
    }

    public void inicializandoMatriz(){
        for(int i = 0; i < area.length; i++){
            for (int j = 0; j < area[0].length; j++){
                area[i][j] = false;
            }
        }
    }

    public void preenchendoArea(){
        for(int i = verticeX1; i <= verticeX2; i++){
            for (int j = verticeY1; j <= verticeY2; j++){
                area[i][j] = true;
            }
        }
    }
}
