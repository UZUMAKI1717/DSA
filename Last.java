class Last{
  //Finding last index in this array.
  static int LinearSearch(int arr[],int key){
    for(int i = arr.length-1;i>=0;i++){
      if(key == arr[i]){
        return i;
      }
    }
    return -1;

  }
  public static void main(String args[]){
    int arr[] = {10,20,30,40,50};
    int key = 50;
    System.out.print(LinearSearch(arr,key));
  }
}