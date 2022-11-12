package Personas.tipos;

public enum tipoDocumento {
    CEDULA("Cedula", "C.C"),
    TARJETA_IDENTIDAD("Tarjeta_Identidad", "T.I"),
    CEDULA_EXTRANJERIA("Cedula_Extranjeria", "C.E"),
    PASAPORTE("Pasaporte", "P.S");


    public String nombreLargo;
    public String nombreCorto;


    tipoDocumento(String nombreLargo, String nombreCorto) {
        this.nombreLargo = nombreLargo;
        this.nombreCorto = nombreCorto;
    }
}