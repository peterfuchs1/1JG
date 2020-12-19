package hamster;


public enum Richtung {
	OSTEN, NORDEN, WESTEN, SUEDEN;
	
	
    private static Richtung[] vals = values();
    /**
     * which is the next day from today?
     * @return the next day
     */
    public Richtung next()
    {
        return vals[(this.ordinal()+1) % vals.length];
    }
    /**
     * which is the previous day from today?
     * @return the previous day
     */
    public Richtung previous()
    {
        return vals[(this.ordinal()+vals.length-1) % vals.length];
    }
}
