package com.javalimos.CronosUN.constante;

public class RutasApi {
    
    public static final String CREAR_USUARIO = "/registro";
    public static final String INICIO_SESION = "/autenticacion";
    public static final String REGISTRO_OPCION_ASIGNATURA = "/asignaturaOpciones/registro";
    public static final String RESTABLECER_OPCION_ASIGNATURA = "/asignaturaOpciones/restablecer";
    public static final String OPCIONES_ASIGNATURAS = "/asignaturaOpciones";
    public static final String HORARIO_INSCRIPCION = "/horarioInscripcion";
    public static final String RECUPERACION_CLAVE = "/recuperacionClave";
    public static final String OPCION_ASIGNATURA = "/asignaturaOpcion";
    public static final String REGISTRO_DIARIO = "/entradasDiario/registro";
    public static final String ENTRADA_DIARIO = "/entradasDiario/{id}";
    public static final String FILTRO_ENTRADAS = "/entradasDiario";
    public static final String NUM_PAGINAS_DIARIO = "/entradasDiario/paginas";
    public static final String REGISTRO_PROYECTO = "/proyectos/registro";
    public static final String ACTUALIZACION_PROYECTO = "/proyectos/actualizacion";
    public static final String FILTRO_PROYECTOS = "/proyectos";
    public static final String PROYECTO = "/proyectos/{id}";
    public static final String CATEGORIAS_PORTAFOLIO = "/proyectos/categorias/{id}";
    public static final String NUM_PAGINAS_PORTAFOLIO = "/proyectos/paginas";
    public static final String CONSULTA_PORTAFOLIO_USUARIO = "/proyectos";
    public static final String COMENTARIOS_PROYECTO = "/proyectos/comentarios";
    public static final String REGISTRO_COMENTARIO = "/proyectos/comentarios/registro";
    public static final String COMENTARIO = "/proyectos/comentarios/{id}";
    public static final String INFORMACION_USUARIO = "/informacionUsuario";
    public static final String MODIFICAR_USUARIO = "/modificacionUsuario";
    public static final String ELIMINAR_USUARIO = "/EliminacionUsuario";
    private RutasApi() { }

}
