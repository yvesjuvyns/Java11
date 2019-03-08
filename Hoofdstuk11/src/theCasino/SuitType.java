package theCasino;

public enum SuitType {
	CLUBS(0),DIAMONDS(1),SPADES(2),HEARTS(3);
	int order;
	SuitType(int order){
		this.order = order;
	}
	public int getOrder() {
		return order;
	}
	
	public static SuitType crateASuitType(int pos) {
		SuitType st = SuitType.CLUBS;
		
		return st;
		
	}
	
	public int GetOrder(){return order;}
  
    public boolean Compare(int i){return order == i;}
    public static SuitType GetValue(int id)
    {
    	SuitType output = null;
    	SuitType[] As = SuitType.values();
        for(int i = 0; i < As.length; i++)
        {
            if(As[i].Compare( id))
            	output =  As[i];
        }
        return output;
    }
	

}
