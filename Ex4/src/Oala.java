import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Oala
{
    Oala(int capacitateOala, int nrSalbatici)
    {
        CapacitateOala = capacitateOala;
        CantitateCurenta = 0;
        lock = new ReentrantLock();
        oalaPlina = lock.newCondition();
        oalaGoala = lock.newCondition();
        this.nrSalbatici = nrSalbatici;
    }

    private final Lock lock;

    private final Condition oalaPlina;

    private final Condition oalaGoala;

    private final int nrSalbatici;

    private int nrPortiiDate = 0;

    private final int CapacitateOala;

    private int CantitateCurenta;

    public Boolean eGoala()
    {
        return CantitateCurenta == 0;
    }

    public Boolean totiSalbaticiiAuTerminatDeMancat()
    {
        return nrPortiiDate >= nrSalbatici;
    }

    public boolean iaPortie(int id)
    {
        if(eGoala())
        {
            System.out.println("Salbaticul_" + id + " nu si-a putut lua portia deoarece oala este complet goala. CapacitateCurenta = " + CantitateCurenta);
            return false;
        }

        CantitateCurenta = CantitateCurenta - 1;

        nrPortiiDate += 1;

        System.out.println("Salbaticul_" + id + " a luat o portie. CantitateCurenta = " + CantitateCurenta);
        return true;
    }

    public void umplereOala()
    {
        if(!eGoala())
        {
            System.out.println("Oala nu fost umpluta fiindca ea inca nu era complet goala. CapacitateCurenta = " + CantitateCurenta);
            return;
        }

        CantitateCurenta = CapacitateOala;

        System.out.println("Oala a fost umpluta. CantitateCurenta = " + CantitateCurenta);
    }

    public Lock getLock()
    {
        return lock;
    }

    public Condition getOalaGoala()
    {
        return oalaGoala;
    }

    public Condition getOalaPlina()
    {
        return oalaPlina;
    }
}
