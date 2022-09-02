package com.accolite.arrays;

public class _Problem26_DivideAndSubtractGame {
	public static void main(String[] args) {
		String name=divAndSub(3);
		System.out.println(name);
		System.out.println(divAndSub(6));
		System.out.println(divAndSub(7));
	}

	private static String divAndSub(int n) { 
		if(n==1)
			return "Arya";
		if(n<=5)
			return "Jon";
		
		int[] arr=new int[n+1];
		for(int i=1;i<=5;i++)
			arr[i]=1; //setting like if arr ele is 1, then jon wins
		
		int[] keys= {2,3,4,5};
		
		for(int i=6;i<=n;i++) {
			for(int j=0;j<4;j++) {
				if(arr[i/keys[j]]==0 || arr[i-keys[j]]==0)
					arr[i]=1;
			}
		}
		if(arr[n]==1)
			return "Jon";
		else
			return "Arya";
					
	}

}

/*
 if(N == 1)
          return "Arya";
       if(N<5) return "Jon";
      int a[]=new int[N+1];
      
      for(int i=1; i<=5; i++)
          a[i] = 1;
          
      for(int i=6; i<=N; i++)
      {
          if (a[i/2] == 0)
              a[i] = 1;
          else if (a[i-2] == 0)
              a[i] = 1;
              
          if (a[i/3] == 0)
              a[i] = 1;
          else if (a[i-3] == 0)
              a[i] = 1;
          
          if (a[i/4] == 0)
              a[i] = 1;
          else if (a[i-4] == 0)
              a[i] = 1;
              
          if (a[i/5] == 0)
              a[i] = 1;
          else if (a[i-5] == 0)
              a[i] = 1;
      }
      
      if (a[N] == 1)
          return "Jon";
      else
          return "Arya";
  
   }
   
   
   
   
   
   
    if N==1:
            return "Arya"
        if N<5:
            return "Jon"
        result=[0]*(N+1)
        for idx in range(6):
            result[idx]=1
        keys=[2,3,4,5]
        for i in range(6,N+1):
            for key in keys:
                if result[i//key]==0 or result[i-key]==0:
                    result[i]=1
        if result[N]==1:
            return "Jon"
        else:
            return "Arya"
   
*/