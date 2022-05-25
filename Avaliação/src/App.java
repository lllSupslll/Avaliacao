import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        String nomeProf, nomeTurma, nomeAluno = "", nomeDisciplina, novoAluno = "";
        int qtdAlunos, qtdAvaliacao, qtdNotas = 1;
        Double notas = 0.0, media = 0.0, notaAluno = 0.0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe o nome do Professor: ");
        nomeProf = sc.next();
        System.out.println("Informe a turma: ");
        nomeTurma = sc.next();
        System.out.println("Informe a disciplina: ");
        nomeDisciplina = sc.next();
        System.out.println("Informe a quantidade de alunos: ");
        qtdAlunos = sc.nextInt();
        System.out.println("Informe a quantidade de avaliações: ");
        qtdAvaliacao = sc.nextInt();
        for (int i = 1; i <= qtdAlunos; i++) {
            System.out.println("Informe o nome do Aluno: ");
            novoAluno = sc.next();
            for (int j = 1; j <= qtdAvaliacao; j++) {
                System.out.println("Informe a nota do aluno");
                notaAluno = sc.nextDouble();
                notas= notas + notaAluno;
            }
        }
        System.out.println("------------------------------------------------------------------");
        System.out.println("Nota do Aluno: " + novoAluno + "Foi: " + notas / qtdAvaliacao);

    }
}