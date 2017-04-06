package entidades;

/**
 * Created by 53638138e on 06/04/17.
 */
public class Matricula {

    private int num ;
    private String letras;


    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getLetras() {
        return letras;
    }

    public void setLetras(String letras) {
        this.letras = letras;
    }

    @Override
    public String toString() {

        return num + letras ;
    }
}
