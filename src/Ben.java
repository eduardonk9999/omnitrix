public class Ben {
    public void escolherAlien (String situacao) {

        if (situacao.equals("fogo")) {
            System.out.println("Em Chamas !!!");
        } else if (situacao.equals("voar")) {
            System.out.println("Voando");
        } else if (situacao.equals("força")) {
            System.out.println("Usando 4 Braços");
        } else {
            System.out.println("Usando Xablau");
        }
    }

    public void escolhaAlienSwitch(String situacao) {
        switch (situacao) {
            case "fogo" -> System.out.println("Chama!");
            case "voar" -> System.out.println("Insectóide!");
            case "força" -> System.out.println("Quatro Braços!");
            default -> System.out.println("Xablau!");
        }
    }
}

