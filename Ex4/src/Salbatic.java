public class Salbatic extends Thread
{
    Salbatic(Oala oala, int id)
    {
        this.oala = oala;
        this.aLuatPortia = false;
        this.id = id;
    }

    Oala oala;

    Boolean aLuatPortia;

    int id;

    @Override
    public void run()
    {

        do
        {
            oala.getLock().lock();

            try
            {
                if (!oala.iaPortie(id))
                {
                    oala.getOalaGoala().signal(); //doar un singur bucatar avem. In cazul mai multor bucatari, punem notify All

                    oala.getOalaPlina().await();
                }
                else
                    aLuatPortia = true;

                if(oala.totiSalbaticiiAuTerminatDeMancat())
                    oala.getOalaGoala().signal();
            }
            catch (InterruptedException e)
            {
                throw new RuntimeException(e);
            }
            finally
            {
                oala.getLock().unlock();
            }

            //repeta pana ce ia o singura portie
        } while(!aLuatPortia);
    }
}
