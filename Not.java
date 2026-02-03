class Not{
  static void Linear(int arr[],int key){
    boolean a = false;
    for(int i = arr.length-1;i>=0;i--){
      if(key==arr[i]){
        System.out.println(i);
        a = true;
      }
    }
    if(!a){
      System.out.println("-1");
    }

  }
  public static void main(String args[]){
    int arr[] = {10,20,30,40,50};
    int key = 400;
    Linear(arr,key);

  }
}