package edu.manaure.javaInitial;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class MyClass {
    // Metodo principal da classe.
    public static void main(String[] args) {
        //class.saida.printarNaTela(algo) => a class System tem varios comandos de saida de entrada.
        //System.out.println("Hello word");
        String first_name = "Manaure";
        String last_name = "Vasconcelos";

        String fullName = fullName(first_name, last_name);
        System.out.println(fullName);

        Exercise smartTv = new Exercise(); // intancia classe

        smartTv.decreaseVolume(); // chama metodos
    }

    public static String fullName (String first_name, String last_name) {
       return first_name.concat(" ").concat(last_name);
    }
}