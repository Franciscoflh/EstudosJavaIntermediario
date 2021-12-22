package ElementosBasicos.Anotacoes;

@interface InformacaoAula {
    String autor();

    int aulaNumero();

    String blog() default "http://github.com/Franciscoflh";

    String site() default "http://linkedin.com/francisco-remo";
}
