public class Bucatar extends Thread
{
    Bucatar(Oala oala)
    {
        this.oala = oala;
    }

    Oala oala;

    @Override
    public synchronized void run()
    {
        while(true)
        {
            oala.getLock().lock();
            try
            {
                oala.getOalaGoala().await();

                if(oala.totiSalbaticiiAuTerminatDeMancat())
                    break;

                oala.umplereOala();

                oala.getOalaPlina().signalAll();
            }
            catch (InterruptedException e)
            {
                throw new RuntimeException(e);
            }
            finally
            {
                oala.getLock().unlock();
            }
        }

        System.out.println("Bucatarul a servit intreg tribul de salbatici");
    }
}
