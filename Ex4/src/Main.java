import java.util.ArrayList;
import java.util.List;

public class Main
{
    public static void main(String[] args) throws InterruptedException
    {
        List<Salbatic> salbatici = new ArrayList<>();

        int numarSalbatici = 16;
        Oala oala = new Oala(5, numarSalbatici);

        Bucatar bucatar = new Bucatar(oala);

        for(int i=0;i<numarSalbatici;i++)
            salbatici.add(new Salbatic(oala, i));

        bucatar.start();

        for(int i=0;i<numarSalbatici;i++)
            salbatici.get(i).start();

        for(int i=0;i<numarSalbatici;i++)
            salbatici.get(i).join();
    }
}