package Ninjas;

public class ninjasDesafio {
    public static void main(String[] args) {

        String[] nomesNinjas = {"Uzumaki Naruto", "Haruno Sakura", "Hatake Kakashi"};
        int[] idadesNinjas = {17,16,31};
        char[] nivelMissoesNinjas = {'A', 'B', 'S'};
        String[] missoesNinjas ={"Resgate do Kazekage", "Missão de Reconhecimento na Ponte Tenchi", "Luta com os 6 caminhos"};
        String[] statusMissoes ={"Sucesso", "Fracasso", "Fracasso"};



        for (int i=0; i <nomesNinjas.length; i ++){
            System.out.println("Nome do Ninja: " + nomesNinjas[i]);
            System.out.println("A idade do Ninja é: " + idadesNinjas[i]);
            System.out.println("O nível da missão é: " + nivelMissoesNinjas[i]);
            System.out.println("O nome da missão é: " + missoesNinjas[i]);
            System.out.println("O status da missão é: " + statusMissoes[i]);

            // Verifica se a idade é maior que 17 e se a missão foi um sucesso ou falhou
            if (idadesNinjas[i] >= 17 || (statusMissoes[i].equals("Sucesso") && statusMissoes[i].equals("Falhou"))) {
                System.out.println("O(A) ninja " + nomesNinjas[i] + " tem 17 anos ou mais e a missão foi um " + statusMissoes[i] + ".");
            } else {
                System.out.println("O(A) ninja " + nomesNinjas[i] + " não tem idade para missão, e a missão falhou automaticamente.");
            }

            System.out.println(); // Adiciona uma linha em branco para separar as informações de cada ninja
        }
    }
}

