package pe.gyarlequej.sesion6.abstraccion;

public abstract class FiguraGeometrica {

    protected String tipoFigura;

    public FiguraGeometrica(String tipoFigura) {
        this.tipoFigura = tipoFigura;
    }

    public String getTipoFigura() {
        return tipoFigura;
    }

    public void setTipoFigura(String tipoFigura) {
        this.tipoFigura = tipoFigura;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("FiguraGeometrica{");
        sb.append("tipoFigura='").append(tipoFigura).append('\'');
        sb.append('}');
        return sb.toString();
    }

    public void saludame() {
        System.out.println("Hello World");
    }

    public abstract void dibujar();
    public abstract void calcularArea();
}
