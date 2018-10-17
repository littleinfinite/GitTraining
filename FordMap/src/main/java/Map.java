
public class Map {
	private static final int NULL = 0;
	int size=0;
	int realsize=0;
	private int arraySize=5;
	
	public int[] key = new int[arraySize];	
	public int[] value = new int[arraySize];	
	
	public void put(int a, int b)
	{	
		
		if(size==getSize()-1)
		{	incSize();
			this.key[size] = a;
			this.value[size] = b;
			size++;
			realsize++;
		}
		
		else
		{	
		this.key[size] = a;
		this.value[size] = b;
		size++;
		realsize++;
	}
			
		
		
	}
	
    public void incSize() {
        arraySize= arraySize + 10;   
        int[] newKey= new int[arraySize];
        int[] newValue= new int[arraySize];
        
        for(int j=0;j<arraySize-10;j++) {
               newKey[j]= key[j];
               newValue[j]= value[j];
        }
        key= newKey;
        value= newValue;
 }

	
	
	
	public int getValue(int a)
	{  
		int index=0;
		for(int i=0; i<arraySize; i++)
		{	
		
		if(key[i]==a)
				{index=i; break; }
			
		else 
                System.out.println("Key not found");
		}
		
		return value[index];

	}

	public void delete(int a) {
		
		int index=0;
		for(int i=0; i<size; i++)
		{	
		
		if(key[i]==a)
				{index=i; break; }
			
		else 
                System.out.println("Key not found");
		}
		
		value[index]= 0;
		realsize--;
		
		
	}

	public int getSize()
	{
		return realsize;
		
	}

	
}
