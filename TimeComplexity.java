//1 O(n)

int i = 1;  
do  java cod
  {  
      i++;  
  }while(i<=n);  

//2 O(logn)
int i=1;  
do  
{  
  i = i*c;  
 }while(i<=n);   

//3 O(n^2)
int i=0;  
do{  
      do{  
               int j =0;  
                    j++;  
           }while(j<=i);  
       i++;  
      }while(i<=n-1); 

//4 More than 1 Loop 
// O(m)+O(n)

int i=1;  
do{  
       i++;  
     }while(i<=m);  
  
int j=1;  
do{  
       j++;  
     }while(j<=n);  