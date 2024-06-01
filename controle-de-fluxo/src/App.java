public class App {
    public static void main(String[] args) {
       String sigla = "A";

       switch (sigla) {
        case "A": {

            String array [] = {"Nome1", "Nome2", "Nome3"};

            for (String a : array) {
                
                if(a.equals("Nome2")) {
                    continue;
                }

                System.out.println(a);
            }

            break;
        }

        case "B": {
            System.out.println("B");
            break;
        }
            
        default:
            break;
       }
    }
}
