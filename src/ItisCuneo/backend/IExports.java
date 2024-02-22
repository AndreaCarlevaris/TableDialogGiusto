package ItisCuneo.backend;

public interface IExports {
    public static final String PATH = "data/";
    public static final String NAME_CSV = "cespiti.csv";
    public static final String NAME_JSON= "cespiti.json";

    public void scriviCsv();
    public void scriviJson();
}
