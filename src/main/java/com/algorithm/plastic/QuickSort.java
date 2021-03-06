package com.algorithm.plastic;

/**
 * 快排的思想是  找一个数作为比较数，然后遍历数组  把小于这个数的数放左边，大于选定的数放右边
 */
public class QuickSort {

    //left lt right rt
    public static void sort(int[] arr,int lt,int rt){
        if(lt < rt){
            int value = arr[lt];
            int tmpLt = lt;
            int tmpRt = rt;
            while(tmpLt < tmpRt){
                while(tmpLt < tmpRt && arr[tmpRt] > value){
                    tmpRt--;
                }
                //如果跳出wile 说明找到比 value小的数了
                if(tmpLt < tmpRt){
                    arr[tmpLt] = arr[tmpRt];
                    tmpLt++;
                }
                while(tmpLt < tmpRt && arr[tmpLt] < value){
                    tmpLt++;
                }
                if(tmpLt < tmpRt){
                    arr[tmpRt] = arr[tmpLt];
                    tmpRt--;
                }
            }
            arr[tmpLt] = value;
            sort(arr,lt,tmpLt - 1);
            sort(arr,tmpLt + 1,rt);
        }
    }

    public static void main(String[] args) {
        int[] arr = {23,55,48,89,23,33};
        int len = arr.length;
        sort(arr,0,len-1);
        for(int a : arr){
            System.out.println(a);
        }
    }

    public void plasticSort(int[] arr,int left,int right){
        if(left < right){
            int baseVal = arr[left];

            int l = left;
            int r = right;

            while(l < r){
                while(l < r && arr[r] > baseVal){
                    r--;
                }
                if(l < r){//比l 小的值已经放到l上了。l 需要++
                    arr[l] = arr[r];
                    l++;
                }
                while(l < r && arr[l] < baseVal){
                    l++;
                }
                if(l < r){
                   arr[r] = arr[l];
                   r--;
                }
            }
            arr[l] = baseVal;
            plasticSort(arr,l,l -1);
            plasticSort(arr,l+1,right);
        }
    }


}
