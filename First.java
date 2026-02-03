class First{
  //First index find.
 static int SearchFirstIndex(int arr[],int key){
    for(int i=0;i<arr.length;i++){
      if(key==arr[i]){
        return i;
      }
    }
  }

  public static void main(String args[]){
    int arr[] = {20,25,30,40,50};
    int key = 30;
    System.out.print(SearchFirstIndex(arr,key));

  }
}