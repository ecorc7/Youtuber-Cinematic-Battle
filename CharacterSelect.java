import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class CharacterSelect extends World
{
    public boolean bChosen1 = false;
    public boolean bChosen2 = false;
    public int iPlayer1;
    public int iPlayer2;
    public boolean bPlayMusic = true;
    GreenfootSound mainMusic = new GreenfootSound("menuTheme.mp3");
    public ChoosePlayers cs;
    public Start s;
    public boolean bAddObjects = false;
    public MatPatMan mpm;
    public Hulkiplier h;
    public IronJaiden ij;
    public JennaMarvel jm;
    public KingPewds kp;
    public Antisepticeye a;
    public OddFather of;
    public DrV dv;
    public Player1Score health1;
    public Player2Score health2;
    public int iMatPHealth = 200;
    public int iHulkHealth = 200;
    public int iIronHealth = 200;
    public int iJennHealth = 200;
    public int iKingHealth = 200;
    public int iAntiHealth = 200;
    public int iOddyHealth = 200;
    public int iDocVHealth = 200;
    public boolean bHealthOne = false;
    public boolean bHealthTwo = false;
    public CharacterSelect()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(725, 400, 1);
        
        if(bPlayMusic == true)
        {
            //mainMusic.playLoop();
            //bPlayMusic = false;
        }
        s = new Start();
        addObject(s, getWidth()/2, getHeight()/2 + 125);
        
        cs = new ChoosePlayers();
        addObject(cs, 0, 0);
    }
    
    public void act()
    {
        if(bAddObjects == true)
        {
            setBackground("recycpap.jpg");

            addObject(new Platform(), getWidth()/2, getHeight()/2 + 150);

            choosePlayers();
            bAddObjects = false;
        }
        
        addHealth();
        setHealth();
        winOrLose();
    }
    
    public void choosePlayers()
    {
        if(iPlayer1 == 1)
        {
            mpm = new MatPatMan();
            addObject(mpm, getWidth()/2 - 150, getHeight()/2);
            health1.setHealth1(iMatPHealth);
        }
            
        if(iPlayer1 == 2)
        {
            h = new Hulkiplier();
            addObject(h, getWidth()/2 - 150, getHeight()/2);
            health1.setHealth1(iHulkHealth);
        }
        
        if(iPlayer1 == 3)
        {
            ij = new IronJaiden();
            addObject(ij, getWidth()/2 - 150, getHeight()/2);
            health1.setHealth1(iIronHealth);
        }
        
        if(iPlayer1 == 4)
        {
            jm = new JennaMarvel();
            addObject(jm, getWidth()/2 - 150, getHeight()/2);
            health1.setHealth1(iJennHealth);
        }
            
        if(iPlayer2 == 1)
        {
            kp = new KingPewds();
            addObject(kp, getWidth()/2 + 150, getHeight()/2);
            health2.setHealth2(iKingHealth);
        }
            
        if(iPlayer2 == 2)
        {
            a = new Antisepticeye();
            addObject(a, getWidth()/2 + 150, getHeight()/2);
            health2.setHealth2(iAntiHealth);
        }
        
        if(iPlayer2 == 3)
        {
            of = new OddFather();
            addObject(of, getWidth()/2 + 150, getHeight()/2);
            health2.setHealth2(iOddyHealth);
        }
        
        if(iPlayer2 == 4)
        {
            dv = new DrV();
            addObject(dv, getWidth()/2 + 150, getHeight()/2);
            health2.setHealth2(iDocVHealth);
        }
    }
    
    public void addHealth()
    {
        if(bHealthOne == false)
        {
            health1 = new Player1Score();
            addObject(health1, getWidth()/2 - 300, getHeight()/2 - 200);
            bHealthOne = true;
        }
        
        if(bHealthTwo == false)
        {
            health2 = new Player2Score();
            addObject(health2, getWidth()/2 + 300, getHeight()/2 - 200);
            bHealthTwo = true;
        }
    }
    
    public void setHealth()
    {
        if(iPlayer1 == 1)
        {
            health1.setHealth1(iMatPHealth);
        }
        
        if(iPlayer1 == 2)
        {
            health1.setHealth1(iHulkHealth);
        }
        
        if(iPlayer1 == 3)
        {
            health1.setHealth1(iIronHealth);
        }
        
        if(iPlayer1 == 4)
        {
            health1.setHealth1(iJennHealth);
        }
        
        if(iPlayer2 == 1)
        {
            health2.setHealth2(iKingHealth);
        }
        
        if(iPlayer2 == 2)
        {
            health2.setHealth2(iAntiHealth);
        }
        
        if(iPlayer2 == 3)
        {
            health2.setHealth2(iOddyHealth);
        }
        
        if(iPlayer2 == 4)
        {
            health2.setHealth2(iDocVHealth);
        }
    }
    
    public void winOrLose()
    {
        if(iMatPHealth <= 0 || iHulkHealth <= 0 || iIronHealth <= 0 || iJennHealth <= 0)
        {
            addObject(new Player2Win(), getWidth()/2, getHeight()/2);
            mainMusic.stop();
            Greenfoot.delay(200);
            Greenfoot.setWorld(new CharacterSelect());
        }
        
        if(iKingHealth <= 0 || iAntiHealth <= 0 || iOddyHealth <= 0 || iDocVHealth <= 0)
        {
            addObject(new Player1Win(), getWidth()/2, getHeight()/2);
            mainMusic.stop();
            Greenfoot.delay(200);
            Greenfoot.setWorld(new CharacterSelect());
        }
    }
}
