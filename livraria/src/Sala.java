public class Sala {

    int nLugares;
    int nLugaresOcup;

    public Sala(int nLugares, int nLugaresOcup) {
        this.nLugares = nLugares;
        this.nLugaresOcup = nLugaresOcup;
    }

    public int getnLugares() {
        return nLugares;
    }

    public void setnLugares(int nLugares) {
        this.nLugares = nLugares;
    }

    public int getnLugaresOcup() {
        return nLugaresOcup;
    }

    public void setnLugaresOcup(int nLugaresOcup) {
        this.nLugaresOcup = nLugaresOcup;
    }
}
