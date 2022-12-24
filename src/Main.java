import com.kennedfer.dio.desafio.dominio.Curso;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso de Java");
        curso1.setDescricao("The Best curso de Java");
        curso1.setCargaHoraria(200);
        System.out.println(curso1.toString());
    }
}
