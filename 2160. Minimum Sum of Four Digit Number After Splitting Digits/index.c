int minimumSum(int num) {
      int arr[4];
      int index=0;
      while(num>0){
        arr[index++]=num%10;
        num/=10;
      }
      for(int i=0;i<3;i++){
        for(int j=i+1;j<4;j++){
            if(arr[i]>arr[j]){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
      }
      int num1=0,num2=0;
      for(int i=0;i<4;i++){
        if(i%2==0){
            num1=num1*10+arr[i];
        }
        else
            num2=num2*10+arr[i];
        printf("%d ",arr[i]);
      }
      return num1+num2;
}